package javaprac.level1;

public class Ex07 {

	/*
	 * ÄÝ¶óÃ÷ ÃßÃø
	 */

	public int solution(long num) {

		int answer = 0;
		
		while (num != 1) {
			if(answer == 500) {
				answer = -1;
				break;
			}
			
			if(num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}			
			
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {

		Ex07 ex7 = new Ex07();

		System.out.println(ex7.solution(6));
		System.out.println(ex7.solution(16));
		System.out.println(ex7.solution(626331));

	}

}
