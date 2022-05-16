package javaprac.level1;

public class Ex14 {

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

		Ex14 ex14 = new Ex14();

		System.out.println(ex14.solution(123));
		System.out.println(ex14.solution(987));

	}

}
