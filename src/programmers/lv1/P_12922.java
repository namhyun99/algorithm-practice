package programmers.lv1;

// 수박수박수박수박수박수?
public class P_12922 {

	public String solution(int n) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			answer += i % 2 == 0 ? "수" : "박";
		}

		return answer;
	}

	public static void main(String[] args) {

		P_12922 ex19 = new P_12922();
		System.out.println(ex19.solution(3));

	}

}
