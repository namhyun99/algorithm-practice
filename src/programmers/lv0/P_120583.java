package programmers.lv0;

//중복된 숫자 개수
public class P_120583 {

	public int solution(int[] array, int n) {
		int answer = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				answer++;
			}
		}
		return answer;
	}

	// 출력 테스트
	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 2, 3, 4, 5 };
		int[] arr2 = { 0, 2, 3, 4 };

		P_120583 s = new P_120583();
		System.out.println(s.solution(arr1, 1));
		System.out.println(s.solution(arr2, 1));

	}

}
