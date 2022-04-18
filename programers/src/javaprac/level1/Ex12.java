package javaprac.level1;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex12 {
	/*
	 * 정수 내림차순으로 배치하기
	 * 
	 * ▼문제설명 함수 solution은 정수 n을 매개변수로 입력받습니다. 
	 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를
	 * 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	 * 
	 */
	
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
