package programmers.lv1;

public class P_12947 {
	// 하샤드 수
	public boolean solution(int x) {

		// 자리수 더하기
		String str = Integer.toString(x);
		char[] ch = new char[str.length()];
		int sum = 0;
		boolean answer = true;

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}

		for (int i = 0; i < ch.length; i++) {
			sum += Character.getNumericValue(ch[i]);
		}

		// 나누기

		if (x % sum == 0) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}

	// 출력 테스트
	public static void main(String[] args) {

		P_12947 ex5 = new P_12947();

		System.out.println(ex5.solution(10));
		System.out.println(ex5.solution(12));
		System.out.println(ex5.solution(11));
		System.out.println(ex5.solution(13));

	}

}
