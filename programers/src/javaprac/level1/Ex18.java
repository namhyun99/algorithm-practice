package javaprac.level1;

public class Ex18 {
	// 문자열을 정수로 바꾸기
	public int solution(String s) {
		
		int answer = 0;
		if(s.length() >= 1 && s.length() <=5 ) {
			answer = Integer.parseInt(s);
		}
		
		System.out.println(answer);
        return answer;
    }

	
	
	public static void main(String[] args) {
		
		
		Ex18 ex18 = new Ex18();
		ex18.solution("1234");
		ex18.solution("-1234");
		
	}
	
	
}
