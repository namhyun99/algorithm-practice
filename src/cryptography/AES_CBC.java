package cryptography;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES_CBC {
  
  private static final String key = "aesEncryptionKey";  // 16byte == 128bit 
  private static final String initVector = "encryptionIntVec"; // 16Byte
  
  //인코더 생성
  private static final Base64.Encoder enc = Base64.getEncoder();
  //디코더 생성
  private static final Base64.Decoder dec = Base64.getDecoder();
  
  
  //Encrypt 암호화
  public static String encrypt(String value) {
    try {
      //1.초기화벡터 byte로 변경
      IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8")); 
      //2.key를 byte로 변경
      SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES"); 
      
      //3. cipher를 만듬
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING"); //AES, CBC 모드, partial block 채우기
      cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv); //ENCRYPT_MODE
      
      //4.실제로 암호화 하는 부분
      byte[] encrypted = cipher.doFinal(value.getBytes());
      return enc.encodeToString(encrypted); //암호문을 base64로 인코딩하여 출력 해줌.

    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
  
  
  //Decrypt 복호화
  public static String decrypt(String encrypted) {
    try {
      IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8")); 
      SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES"); 
      
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING"); 
      cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv); //DECRYPT_MODE
      
      //복호화 진행
      byte[] original = cipher.doFinal(dec.decode(encrypted));
      
      return new String(original);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
  
  
  // 테스트 메인 실행 메소드
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    while(true) {
      System.out.print("암호화(encrypt), 복호화(decrypt), 종료(exit) 입력해주세요 : ");
      String mode = br.readLine();
      
      if(mode.equals("encrypt")) {
        System.out.print("암호화할 문자를 입력해주세요 : ");
        String originalStr = br.readLine();
        System.out.println("-------------------------");
        System.out.println(">> 암호화 결과 : " + encrypt(originalStr));
        System.out.println("-------------------------");
      
      } else if(mode.equals("decrypt")) {
        System.out.print("복호화할 문자를 입력해주세요 : ");
        String encryptedStr = br.readLine();
        System.out.println("-------------------------");
        System.out.println(">> 복호화 결과 : " + decrypt(encryptedStr));
        System.out.println("-------------------------");
        
      } else if(mode.equals("exit")) {
        System.out.println("프로세스 종료...");
        break;
        
      } else {
        System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요.");
      }
    }
  }
}
