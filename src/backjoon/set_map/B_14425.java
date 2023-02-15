package backjoon.set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//문자열 집합
public class B_14425 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    
    Set<String> set = new HashSet<>();
    for(int i=0; i<N; i++) {
      set.add(br.readLine());
    }
    
    int count = 0;
    for(int i=0; i<M; i++) {
      if(set.contains(br.readLine())) count ++;
    }
    
    System.out.println(count);
  }

}
