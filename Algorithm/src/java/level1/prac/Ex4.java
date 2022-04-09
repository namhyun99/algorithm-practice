package java.level1.prac;


/*
 * ▼문제설명
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 
 * 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 * 으로 가린 문자열을 
 * 리턴하는 함수, solution을 완성해주세요.
 * 
 * ▼제한조건
 * phone_number는 길이 4이상, 20이하인 문자열 입니다.
 */

public class Ex4 {
	
	public String solution(String phone_nember) {
		
		
		String answer = phone_nember.replaceAll(phone_nember, "4");
		
		System.out.println(answer);
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Ex4 ex4 = new Ex4();
		
		ex4.solution("01033334444");
		
	}

}
