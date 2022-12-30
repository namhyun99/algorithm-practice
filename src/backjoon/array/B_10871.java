package backjoon.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//X보다 작은 수 
public class B_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		List<Integer> result = new ArrayList<>();	
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(x > num) {
				result.add(num);
			}
		}
		
		for(int i=0; i<result.size(); i++) {
			System.out.print(result.get(i) + " ");			
		}
		sc.close();
	}
}
