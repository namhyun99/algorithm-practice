package programmers.lv1;

public class P_12943 {

	// 콜라츠 추측
	public int solution(long num) {
		int answer = 0;

		while (num != 1) {
			if (answer == 500) {
				answer = -1;
				break;
			}

			if (num % 2 == 0)
				num /= 2;
			else
				num = num * 3 + 1;

			System.out.println(answer + "번째 : " + num);
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		P_12943 ex7 = new P_12943();

//		System.out.println(ex7.solution(6));
//		System.out.println(ex7.solution(16));
		System.out.println(ex7.solution(626331));

	}

}
