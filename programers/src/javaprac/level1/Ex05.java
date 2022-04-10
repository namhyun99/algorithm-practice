package javaprac.level1;

public class Ex05 {
	/*
	 * 하샤드 수
	 * 
	 * ▼문제설명
	 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
	 * 예를 들어 18의 자릿수 합은 1+8=9이고, 
	 * 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
	 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수
	 * solution을 완성해 주세요
	 * 
	 * ▼제한조건
	 * x는 1이상, 10000이하인 정수
	 *  
	 */
	public boolean solution(int x) {
		
		// 자리수 더하기
		String str = Integer.toString(x);
		char[] ch = new char[str.length()];
		int sum = 0;
		boolean answer = true;
		
		for(int i= 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
			
		for(int i = 0; i < ch.length; i++) {
			sum += Character.getNumericValue(ch[i]);
		}
		
		// 나누기
		
		if( x % sum == 0) {
			answer = true;
		} else {
			answer = false;
		}	
		
		return answer;
	}
	

	public static void main(String[] args) {
		
		
		Ex05 ex5 = new Ex05();
		
		System.out.println(ex5.solution(10));
		System.out.println(ex5.solution(12));
		System.out.println(ex5.solution(11));
		System.out.println(ex5.solution(13));
		

	}

}
