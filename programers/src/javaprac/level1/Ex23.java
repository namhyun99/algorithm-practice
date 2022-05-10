package javaprac.level1;

public class Ex23 {
	// 문자열 내림차순으로 배치하기
	
	
	public String solution(String s) {
		String answer = "";
		int index = 0;
		
		char[] temArr = new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			temArr[i] = s.charAt(i);			
		}
		
		for(int i=0; i<temArr.length; i++) {
			
			if(temArr[index] < temArr[i]) {
				answer += temArr[i];
				index++;
			}
		}
			
		
		return answer;

	}
	
	
	public static void main(String[] args) {
		
		Ex23 ex23 = new Ex23();
		
		System.out.println(ex23.solution("Zbcdefg"));

	}

}
