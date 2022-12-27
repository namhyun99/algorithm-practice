package programmers.lv1;

public class P_12925 {
	// 문자열을 정수로 바꾸기
	public int solution(String s) {

		int answer = 0;
		if (s.length() >= 1 && s.length() <= 5) {
			answer = Integer.parseInt(s);
		}

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		P_12925 ex18 = new P_12925();
		ex18.solution("1234");
		ex18.solution("-1234");

	}

}
