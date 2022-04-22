package javaprac.level1;

public class Ex04 {

	// 핸드폰 번호 가리기
	public String solution(String phone_number) {
		
		String answer = "";
		
		for(int i = 0; i < phone_number.length(); i++) {
			if(i < phone_number.length() - 4)
				answer += "*";
			else
				answer += phone_number.charAt(i);
		}
		
		return answer;
	}

	// 출력 테스트
	public static void main(String[] args) {
		
		Ex04 ex4 = new Ex04();
		System.out.println(ex4.solution("01033334444"));
		System.out.println(ex4.solution("027778888"));

	}

}
