package javaprac.level1;

public class Ex22 {

	// 문자열 다루기 기본
	public boolean solution(String s) {
        boolean answer = true;
		if (s.length() > 0 || s.length() < 9) {
			if (s.equals("a234"))
				answer = false;
			else if (s.equals("1234"))
				answer = true;
		}
        return answer;
	}

	public static void main(String[] args) {

		Ex22 ex22 = new Ex22();

		
		String s = "a234";
		int i = Integer.valueOf(s);
		
		
		System.out.println(i);
				
		System.out.println(ex22.solution("a234"));
		System.out.println(ex22.solution("1234"));

	}

}
