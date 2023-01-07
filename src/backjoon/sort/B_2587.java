package backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//대표값2
public class B_2587 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int arr[] = new int[5];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		Arrays.sort(arr);
		
		int avg = sum/arr.length;
		int harf = arr[arr.length/2];
		System.out.println(avg);
		System.out.println(harf);
	}
}
