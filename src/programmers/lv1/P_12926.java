package programmers.lv1;

// 시저암호
public class P_12926 {
	public String solution(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == ' ') {
				answer += ch;
				continue;
			}

			if (Character.isLowerCase(ch)) {
				answer += (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				answer += (char) ((ch - 'A' + n) % 26 + 'A');
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		P_12926 ex17 = new P_12926();

		System.out.println(ex17.solution("AB", 1));
		System.out.println(ex17.solution("z", 1));
		System.out.println(ex17.solution("a B z", 4));

	}

}
