package backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//통계학
public class B_2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		int sum = 0; //합계
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			list.add(num);
			sum += num;
		}
		
		Collections.sort(list); //중앙값을 위해 리스트 오름차순 정렬
		
		int avg = (int) Math.round((double)sum/N); //산술평균
		int median = list.get(N/2); //중앙값
		int range = list.get(list.size()-1) - list.get(0); //범위
		
		int mode = 0; //최빈값
		boolean flag = false;
		
		for(int i=0; i<list.size(); i++) {
			
		}
		
		System.out.println(list.toString());
		
		StringBuilder Builder = new StringBuilder();
		Builder.append(avg).append("\n");
		Builder.append(median).append("\n");
		Builder.append(mode).append("\n");
		Builder.append(range).append("\n");
		
		System.out.println(Builder);
		
	}
	
}
