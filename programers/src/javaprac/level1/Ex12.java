package javaprac.level1;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex12 {
	
	// 정수 내림차순으로 배치하기
	
	public long solution(long n) {
		String str = Long.toString(n);
		ArrayList<Character> list = new ArrayList<Character>();
		
		for(int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));			
		}
		
		list.sort(Comparator.reverseOrder());
		
		String temStr = "";
		
		for(int i = 0; i < list.size(); i++) {
			temStr += list.get(i);
		}
		
		return Long.parseLong(temStr);
	}

	// 출력 테스트
	public static void main(String[] args) {

		Ex12 ex12 = new Ex12();
		System.out.println(ex12.solution(118372));

	}

}
