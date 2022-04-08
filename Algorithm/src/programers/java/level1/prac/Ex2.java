package programers.java.level1.prac;

import java.util.Arrays;

public class Ex2 {

	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = (long)(i+1) * x;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Ex2 ex = new Ex2();
		
		long[] arr = ex.solution(2, 5);
		System.out.println(Arrays.toString(arr));
		
	}

}
