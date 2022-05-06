package javaprac.level1;

public class Ex21 {
	
	// 서울에서 김서방 찾기
	public String solution(String[] seoul) {
		String answer = "";
		
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim"))
				answer = "김서방은 " + i + "에 있다";			
		}
				
		return answer;
	}
	
	
	// 출력 테스트
	public static void main(String[] args) {
		
		Ex21 ex21 = new Ex21();
		
		String[] strArr1 = {"Jane","Kim"};
		String[] strArr2 = {"Kane","Lee"};
		
		
		
		System.out.println(ex21.solution(strArr1));
		System.out.println(ex21.solution(strArr2));
		
	}

}
