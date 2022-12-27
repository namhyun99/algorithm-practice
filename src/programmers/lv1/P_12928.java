package programmers.lv1;

public class P_12928 {
	// 약수의 합
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				answer += i;
		}
		return answer;
	}

	public static void main(String[] args) {
		P_12928 ex16 = new P_12928();

		System.out.println(ex16.solution(12));
		System.out.println(ex16.solution(5));
	}

}
