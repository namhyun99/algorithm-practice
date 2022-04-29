package javaprac.level1;


public class Ex17 {
	public String solution(String s, int n) {

		String answer = "";
		
		char[] chArr = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			chArr[i] = s.charAt(i);
		}
		
		String str = "a";
		String[] tempArr = new String[26];
		for (int i = 0; i < tempArr.length; i++) {
			tempArr[i] = str;
		}
		


	
		return answer;
	}

	public static void main(String[] args) {

		Ex17 ex17 = new Ex17();

		System.out.println(ex17.solution("AB", 1));
		// System.out.println(ex17.solution("z", 1));
		// System.out.println(ex17.solution("a B z", 4));

	}

}
