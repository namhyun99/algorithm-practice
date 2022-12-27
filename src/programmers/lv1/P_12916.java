package programmers.lv1;

public class P_12916 {
	// 문자열 내 p와 y의 개수
	boolean solution(String s) {

		if (s.length() <= 50) {
			int pCnt = 0;
			int yCnt = 0;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
					pCnt++;
				else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
					yCnt++;
			}

			if (pCnt != yCnt) {
				return false;
			} else if (pCnt == yCnt) {
				return true;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		P_12916 ex24 = new P_12916();

		System.out.println(ex24.solution("pPoooyY"));
		System.out.println(ex24.solution("Pyy"));

	}

}
