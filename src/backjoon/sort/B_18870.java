package backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//좌표압축
public class B_18870 {
  
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    int [] tempArr = arr.clone();
    Arrays.sort(tempArr);
    
    Map<Integer, Integer> map = new HashMap<>(); //중복값을 거르기 위해 map 사용.
    int cnt = 0;
    for(int i : tempArr) {
      if(!map.containsKey(i)) { //키값이 
        map.put(i, cnt++);
      }
    }
    
    StringBuilder Builder = new StringBuilder();
    for(int i : arr) {
      Builder.append(map.get(i)).append(" ");
    }
    System.out.println(Builder);
  }
}
