package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P_12910 {
	// 나누어 떨어지는 숫자 배열
	public int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			} else {
				continue;
			}
		}
		Collections.sort(list);
		int[] answer = new int[list.size()];

		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
		return answer;
	}

	// 출력 테스트
	public static void main(String[] args) {
		P_12910 ex27 = new P_12910();

		int[] arr1 = { 5, 9, 7, 10 };
		int[] arr2 = { 2, 36, 1, 3 };
		int[] arr3 = { 3, 2, 6 };

		System.out.println(Arrays.toString(ex27.solution(arr1, 5)));
		System.out.println(Arrays.toString(ex27.solution(arr2, 1)));
		System.out.println(Arrays.toString(ex27.solution(arr3, 10)));
	}
}
