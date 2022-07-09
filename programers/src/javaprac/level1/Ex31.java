package javaprac.level1;

import java.util.Arrays;

public class Ex31 {

	public String[] solution(int n, int[] arr1, int[] arr2) {

		String[] answer = new String[n];
		String[] temArr = new String[n];
		char[][] map1 = new char[n][n];
		char[][] map2 = new char[n][n];
		char[][] result = new char[n][n];
		
		if(n >= 1 || n <= 16) {
			
			// map1
			for (int i = 0; i < arr1.length; i++) {
				int binary = Integer.parseInt(Integer.toBinaryString(arr1[i]));
				temArr[i] = String.format("%" + n + "d", binary);
			}

			for (int i = 0; i < map1.length; i++) {
				for (int j = 0; j < map1[i].length; j++) {
					map1[i][j] = temArr[i].charAt(j);
				}
			}

			// map2
			for (int i = 0; i < arr2.length; i++) {
				int binary = Integer.parseInt(Integer.toBinaryString(arr2[i]));
				temArr[i] = String.format("%" + n + "d", binary);
			}

			for (int i = 0; i < map2.length; i++) {
				for (int j = 0; j < map2[i].length; j++) {
					map2[i][j] = temArr[i].charAt(j);
				}
			}

			// result

			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					if (map1[i][j] == '1' || map2[i][j] == '1') {
						result[i][j] = '#';
					} else {
						result[i][j] = ' ';
					}
				}
			}

			// 배열에 넣기
			for (int i = 0; i < result.length; i++) {
				String str = "";
				for (int j = 0; j < result[i].length; j++) {
					str += result[i][j];
				}
				answer[i] = str;
			}
			
		} else {
			System.out.println("오류");
		}

		
		return answer;
	}

	public static void main(String[] args) {

		Ex31 ex31 = new Ex31();

//		int[] arr1 = { 9, 20, 28, 18, 11 };
//		int[] arr2 = { 30, 1, 21, 17, 28 };
//
//		System.out.println(Arrays.toString(ex31.solution(5, arr1, arr2)));
		
		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };

		System.out.println(Arrays.toString(ex31.solution(6, arr1, arr2)));

	}

}
