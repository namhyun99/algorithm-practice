package backjoon.conditional;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class B_2753 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int result = 0;
		
//		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
//			result = 1;
//		} else {
//			result = 0;
//		}
		
		GregorianCalendar gc = new GregorianCalendar();
		if(gc.isLeapYear(year)) {
			result = 1;
		} else {
			result = 0;
		}
		
		
		System.out.println(result);
	}

}
