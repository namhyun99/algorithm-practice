package javaprac.level1;

public class Ex26 {
	// 두 정수 사이의 합
	public long solution(int a, int b) {

		long answer = 0;
		if (a > b) {
			for (int i = b; i < a + 1; i++) {
				answer += i;
			}
			return answer;
		} else if (a < b) {
			for (int i = a; i < b + 1; i++) {
				answer += i;
			}
			return answer;
		} else {
			return a;
		}

	}

	public static void main(String[] args) {

		Ex26 ex26 = new Ex26();
		System.out.println(ex26.solution(3, 5));
		System.out.println(ex26.solution(3, 3));
		System.out.println(ex26.solution(5, 3));

	}

}
