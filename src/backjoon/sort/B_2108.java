package backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//통계학
public class B_2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int sum = 0; //합계
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i]; 
		}
		Arrays.sort(arr);
		
		//산술평균
		int avg = (int)Math.round((double)sum / N);

		//중앙값
		int mid = arr[N/2];
		
		//최빈값
		boolean flag = false;
		int mode_max = 0;
		int mode = 10000;
		
		for(int i=0; i<N; i++) {
		  int jump = 0;
		  int count = 1;
		  
		  for(int j=i+1; j<N; j++) {
		    if(arr[i] != arr[j]) {
		      break;
		    }
		    count++;
		    jump++;
		  }
		  
		  if(count > mode_max) {
		    mode_max = count;
		    mode = arr[i];
		    flag = true;
		  }
		  else if(count == mode_max && flag == true) {
		    mode = arr[i];
		    flag = false;
		  }
		  
		  i += jump;
		}
		
		//범위
		int range = arr[N-1] - arr[0];
		
		
		//출력
		StringBuilder Builder = new StringBuilder();
		Builder.append(avg).append("\n");
		Builder.append(mid).append("\n");
		Builder.append(mode).append("\n");
		Builder.append(range).append("\n");
		System.out.println(Builder);
		
	}
	
}
