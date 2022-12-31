package backjoon.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//과제 안 내신 분?
public class B_5597 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> std = new ArrayList<>();
		List<Integer> allStd = new ArrayList<>();
		
		for(int i=0; i<28; i++) {
			std.add(sc.nextInt());
		}
		
		for(int i=1; i<31; i++) {
			allStd.add(i);
		}
		
		allStd.removeAll(std);
		
		for(int i : allStd) {
			System.out.println(i);
		}
		sc.close();
	}
}
