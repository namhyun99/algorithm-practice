package backjoon.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//나머지
public class B_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			arr[i] = num%42;
		}
		
		int cnt = 0; 
		for(int i=0; i<arr.length; i++) {
			int tmp = 0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) tmp++; // 수가 같으면 +1
			}
			if(tmp == 0) { // 같은수가 없으면
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		//HashSet 사용
		Set<Integer> h = new HashSet<>();
		for(int i=0; i<10; i++) {
			h.add(sc.nextInt() % 42);
		}
		
		System.out.println(h.size());
		
		sc.close();
	}

}
