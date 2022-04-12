package javaprac.level1;

public class Ex09 {
	/*
	 * 짝수와 홀수
	 * num이 짝수인 경우 'Even' 반환
	 * 홀수인 경우 'Odd'반환
	 * 
	 */
	
    public String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0) {
        	answer = "Even";
        } else { 
        	answer = "Odd";
        }
        
        return answer;
    }

	public static void main(String[] args) {
		
		Ex09 ex9 = new Ex09();
		System.out.println(ex9.solution(3));  // output : Odd 
		System.out.println(ex9.solution(4));  // output : Even
	}

}
