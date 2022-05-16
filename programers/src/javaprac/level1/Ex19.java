package javaprac.level1;

// 수박수박수박수박수박수?
public class Ex19 {

	public String solution(int n) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			answer += i % 2 == 0 ? "수" : "박";
		}

		return answer;
	}

	public static void main(String[] args) {

		Ex19 ex19 = new Ex19();
		System.out.println(ex19.solution(3));

	}

}
