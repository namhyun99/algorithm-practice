package backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//수 정렬하기 2
public class B_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> sort = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			sort.add(Integer.parseInt(br.readLine()));
		}
		
		//Arrays.sort는 dual-pivot Quicksort 알고리즘 사용.
		//Arrays.sort는 시간복잡도가 O(nlogn)이고 매우 빠르나, 최악의 경우 시간복잡도는 O(n²)
		//Arrays.sort로 풀면 시간 초과..
		
		//Collections.sort 는 Timsort. 합병 및 삽입정렬 알고리즘을 사용.
		//Timsort(팀 정렬)은 Tim Peter에 의해 고안된 하이브리드 정렬 알고리즘.
		//실제로 파이썬이나 기타 정렬 알고리즘에 가장 많이 사용됨.
		//합병정렬의 최악의 경우 시간복잡도  O(n)~삽입정렬의 최선의 경우 시간 복잡도 O(nlogn)을 보장하는 장점.
		
		Collections.sort(sort); 
		
		StringBuilder sb = new StringBuilder();
		for(int result : sort) {
			sb.append(result).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
