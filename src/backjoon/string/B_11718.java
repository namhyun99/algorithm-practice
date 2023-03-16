package backjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//그대로 출력하기
public class B_11718 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringBuffer buffer = new StringBuffer();
    
    int i=0;
    while(i < 100) {
      String str = br.readLine();
      if(str == null || str.isEmpty()) break;
      buffer.append(str).append("\n");
      i++;
    }
    
    System.out.println(buffer);
  }
}
