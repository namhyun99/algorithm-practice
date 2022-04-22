package javaprac.level1;

import java.util.Arrays;

public class Ex02 {
	// x만큼 간격이 있는 n개의 숫자
	
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for(int i = 0; i < n; i++) {
			answer[i] = (long)(i+1) * 2;
		}
		return answer;
	}
	
	//출력 테스트 
	public static void main(String[] args) {
		
		Ex02 ex2 = new Ex02();
		long[] result = ex2.solution(2, 5);
		System.out.println(Arrays.toString(result));

	}

}
