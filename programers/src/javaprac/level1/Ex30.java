package javaprac.level1;

public class Ex30 {
	//가운데 글자 가져오기
	public String solution(String s) {
		String answer = "";
		if(s.length() % 2 == 0) {
			answer = s.substring(s.length()/2-1, s.length()/2+1);
		}else {
			answer = s.substring(s.length()/2, s.length()/2+1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		Ex30 ex30 = new Ex30();
		System.out.println(ex30.solution("abcde"));
		System.out.println(ex30.solution("qwer"));
		System.out.println(ex30.solution("abcdefg"));
		
	}

}
