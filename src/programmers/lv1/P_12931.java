package programmers.lv1;

public class P_12931 {

	// 자릿수 더하기
	public int solution(int n) {
		int answer = 0;
		while (n > 0) {
			answer += n % 10;
			n /= 10;
		}

		return answer;
	}

	// 출력 테스트
	public static void main(String[] args) {

		P_12931 ex14 = new P_12931();

		System.out.println(ex14.solution(123));
		System.out.println(ex14.solution(987));

	}

}
