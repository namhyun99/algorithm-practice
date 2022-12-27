package programmers.lv1;

public class P_12918 {

	// 문자열 다루기 기본
	public boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) {
			try {
				int x = Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		} else
			return false;
	}

	public static void main(String[] args) {

		P_12918 ex22 = new P_12918();
		System.out.println(ex22.solution("a234"));
		System.out.println(ex22.solution("1234"));

	}

}
