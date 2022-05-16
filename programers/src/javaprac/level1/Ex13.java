package javaprac.level1;

public class Ex13 {

	// 자연수 뒤집어 배열로 만들기
	public int[] solution(long n) {

		String s = String.valueOf(n);
		int[] answer = new int[s.length()];
		int cnt = 0;
		while (n > 0) {
			answer[cnt] = (int) (n % 10);
			n /= 10;
			cnt++;
		}

		return answer;
	}

	// 출력테스트
	public static void main(String[] args) {

		Ex13 ex13 = new Ex13();
		System.out.println(ex13.solution(12345));

	}

}
