package backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//단어 정렬
public class B_1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		// Comparator 표현
//		Arrays.sort(arr, new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				if(s1.length() == s2.length()) { //길이가 같다면
//					return s1.compareTo(s2); //사전순 정렬
//				} else {
//					return s1.length() - s2.length();
//				}
//			}
//		});

		// 람다식으로 표현
		Arrays.sort(arr, (s1, s2) -> {
			if (s1.length() == s2.length()) { // 길이가 같다면
				return s1.compareTo(s2); // 사전순 정렬
			} else {
				return s1.length() - s2.length();
			}
		});

		StringBuilder Builder = new StringBuilder();

		Builder.append(arr[0]).append("\n");

		for (int i = 1; i < N; i++) {
			if (!arr[i].equals(arr[i - 1])) {
				Builder.append(arr[i]).append("\n");
			}
		}
		System.out.println(Builder);
	}
}
