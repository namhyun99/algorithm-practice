package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//공 바꾸기
public class B_10813 {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    
    int[] arr = new int[N];
    int num = 1;
    for(int i=0; i<N; i++) {
      arr[i] = num;
      num++;
    }
    
    for(int i=0; i<M; i++) {
      st = new StringTokenizer(br.readLine());
      int iBasket = Integer.parseInt(st.nextToken())-1;
      int jBasket = Integer.parseInt(st.nextToken())-1;
      int tmp = 0;
      
      tmp = arr[iBasket];
      arr[iBasket] = arr[jBasket];
      arr[jBasket] = tmp;
    }
    
    StringBuilder Builder = new StringBuilder();
    for(int i=0; i<arr.length; i++) {
      Builder.append(arr[i]).append(" ");
    }
    System.out.println(Builder);
  }
}
