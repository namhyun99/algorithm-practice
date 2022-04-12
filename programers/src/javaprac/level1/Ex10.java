package javaprac.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex10 {

	/*
	 * 제일 작은 수 제거하기
	 * 
	 * ▼문제설명 정수를 저장한 배열, arr에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는
	 * 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴하고, [10]면
	 * [-1]을 리턴합니다.
	 */

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

	public static void main(String[] args) {

		Ex10 ex10 = new Ex10();

		int[] arr1 = { 4, 3, 2, 1 };
		int[] arr2 = { 10 };

		System.out.println(Arrays.toString(ex10.solution(arr1))); // [4,3,2]
		System.out.println(Arrays.toString(ex10.solution(arr2))); // [-1]

	}

}
