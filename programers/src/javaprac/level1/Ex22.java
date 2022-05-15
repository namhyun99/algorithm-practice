package javaprac.level1;

public class Ex22 {

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

		Ex22 ex22 = new Ex22();
		System.out.println(ex22.solution("a234"));
		System.out.println(ex22.solution("1234"));

	}

}
