package backjoon.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//A+B -5
public class B_10952 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0 ) {
				break;
			} else {
				list.add(a+b);
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		sc.close();
	}

}
