package javaprac.level1;

import java.util.Arrays;

public class Ex08 {

	// 최대공약수와 최대공배수 구하기
	// 유클리드 호제법 사용하기
	public int[] solution(int n, int m) {

		int max = Math.max(n, m); // 12
		int min = Math.min(n, m); // 3

		// 최대공약수
		while (min != 0) {
			int r = max % min; // 0
			max = min; // max 3
			min = r; // min 0

		}

		// 최소공배수 = 두수의 곱 / 최대공약수
		int gcd = n * m / max;

		int[] answer = { max, gcd };
		return answer;
	}

	// 출력 테스트
	public static void main(String[] args) {

		Ex08 ex8 = new Ex08();

		int[] arr1 = ex8.solution(3, 12);
		int[] arr2 = ex8.solution(2, 5);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
