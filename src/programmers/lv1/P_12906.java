package programmers.lv1;

import java.util.*;

public class P_12906 {
	// 같은 숫자는 싫어
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		int value = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != value) {
				list.add(arr[i]);
				value = arr[i];
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

	// 출력 테스트
	public static void main(String[] args) {
		P_12906 ex28 = new P_12906();

		int[] arr1 = { 1, 1, 3, 3, 0, 1, 1 };
		int[] arr2 = { 4, 4, 4, 3, 3 };
		System.out.println(Arrays.toString(ex28.solution(arr1)));
		System.out.println(Arrays.toString(ex28.solution(arr2)));
	}

}
