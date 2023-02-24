package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//공넣기
public class B_10810 {
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    
    int[] arr = new int[N];
    
    for(int i=0; i<M; i++) {
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      int num = Integer.parseInt(st.nextToken());
      
      for(int j = start-1; j < end; j++) {
        arr[j] = num;
      }
    }
    
    StringBuilder Builder = new StringBuilder();
    for(int i=0; i<arr.length; i++) {
      Builder.append(arr[i]).append(" ");
    }
    
    System.out.println(Builder);
  }

}
