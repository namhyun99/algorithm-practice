package backjoon.set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//숫자카드
public class B_10815 {
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());
    int[] nArr = new int[N];
    
    st = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<N; i++) {
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(nArr); //중간값을 차기 위해 오름차순 정렬
    
    int M = Integer.parseInt(br.readLine());
    StringBuilder Builder = new StringBuilder();
    st = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<M; i++) {
      int num  = Integer.parseInt(st.nextToken());
      Builder.append(binarySearch(nArr, num)).append(" ");
    }
    System.out.println(Builder);
  }

  private static Object binarySearch(int[] nArr, int num) {
    int start = 0;
    int end = nArr.length-1;
    int mid = 0;
    
    while (start <= end) {
      mid = (start+end)/2;
      
      if(nArr[mid] < num) start = mid +1;
      else if (nArr[mid] > num) end = mid -1;
      else return 1;
    }
    return 0;
  }
  
}
