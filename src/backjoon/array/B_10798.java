package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//세로읽기
public class B_10798 {

  public static void main(String[] args) throws IOException {
    
    int row = 5;
    int col = 15;
    char[][] arr = new char[row][col];
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int max = 0;
    // 값 입력
    for(int i=0; i<row; i++) {
       String str = br.readLine();
       if(max < str.length()) max = str.length();
       for(int j=0; j<str.length(); j++) {
           arr[i][j] = str.charAt(j);
       }
    }

    //출력
    StringBuilder builder = new StringBuilder();
    for(int i=0; i<max; i++) {
      for(int j=0; j<row; j++) {
        if(arr[j][i] == 0) {
          continue;
        } else {
          builder.append(arr[j][i]);
        }
      }
    }
    System.out.println(builder);
  }
}
