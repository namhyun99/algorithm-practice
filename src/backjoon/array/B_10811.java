package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//바구니 뒤집기
public class B_10811 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];

    //바구니에 번호 매기기
    for (int i = 0; i < N; i++) {
      arr[i] = i + 1;
    }

    //해당 범위만 역순으로 바꾸기
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int start = Integer.parseInt(st.nextToken()) - 1;
      int end = Integer.parseInt(st.nextToken()) - 1;
      int temp = 0;

      while(start < end) {
        temp = arr[start];
        arr[start++] = arr[end];
        arr[end--] = temp;
      }
    }
    
    //출력 하기
    StringBuilder Builder = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      Builder.append(arr[i]).append(" ");
    }
    System.out.println(Builder);
  }
}
