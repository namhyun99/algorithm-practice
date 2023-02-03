package backjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//분해합
public class B_2231 {
  
  public static int decomposition(int N) {
    int result = 0;
    
    for(int i=0; i<N; i++) {
      int num = i;
      int sum = 0; 
      
      while(num != 0) {
        sum += num % 10; // 각 자리수 더하기
        num /= 10;
      }
      
      if(sum + i == N) {
        result = i;
        break;
      }
    }

    return result;
  }
  
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    System.out.println(decomposition(N));
    
  } 

}
