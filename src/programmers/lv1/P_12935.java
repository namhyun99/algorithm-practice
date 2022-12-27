package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class P_12935 {

	// 제일 작은 수 제거하기
	public int[] solution(int[] arr) {

		int[] temArr = arr.clone();
		Arrays.sort(temArr);
		int min = temArr[0];

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min)
				list.add(arr[i]);
		}

		int[] answer = {};
		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}

		return answer;

	}

	// 출력테스트
	public static void main(String[] args) {

		P_12935 ex10 = new P_12935();

		int[] arr1 = { 4, 3, 2, 1 };
		int[] arr2 = { 10 };

		System.out.println(Arrays.toString(ex10.solution(arr1))); // [4,3,2]
		System.out.println(Arrays.toString(ex10.solution(arr2))); // [-1]

	}

}
