package backjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문자열
public class B_9086 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int testCaseCount = Integer.parseInt(br.readLine());
    
    StringBuilder builder = new StringBuilder();
    for(int i=0; i< testCaseCount; i++) {
      String s = br.readLine();
      int end = s.length()-1;
      builder.append(s.charAt(0)).append(s.charAt(end)).append("\n");
    }
    System.out.println(builder);
  }
}
