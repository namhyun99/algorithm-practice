package backjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//블랙책
public class B_2798 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), "");

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];

    st = new StringTokenizer(br.readLine(), " ");

    for (int i = 0; i < N; i++) { //배열에 입력값 넣기
      arr[i] = Integer.parseInt(st.nextToken());
    }
    System.out.println(maxSerch(N, M, arr));
  }

  static int maxSerch(int N, int M, int[] arr) throws IOException {
    int result = 0;

    for (int i = 0; i < N - 2; i++) {
      for (int j = i + 1; j < N - 1; j++) {
        for (int k = j + 1; k < N; k++) {
          int tmp = arr[i] + arr[j] + arr[k];
          if (M == tmp) return tmp; 
          if (result < tmp && tmp < M) result = tmp;
        }
      }
    }

    return result;
  }

}
