package backjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 코딩은 체육과목 입니다.
public class B_25314 {
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder Builder = new StringBuilder();
    for(int i=0 ; i<N/4; i++) {
      Builder.append("long ");
    }
    Builder.append("int");
    
    System.out.println(Builder);
  }
}
