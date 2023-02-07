package backjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//덩치
public class B_7568 {

  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int[][] arr = new int[N][2];

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }

    compare(N, arr);

  }

  public static void compare(int N, int[][] arr) {

    StringBuilder Builder = new StringBuilder();
    
    for (int i = 0; i < N; i++) {
      int rank = 1;
      
      for (int j = 0; j < N; j++) {
        if (i == j) continue;
        if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
          rank++;
        }
      }
      Builder.append(rank).append(" ");
    }
    
    System.out.println(Builder.toString());
  }

}
