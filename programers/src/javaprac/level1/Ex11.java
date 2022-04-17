package javaprac.level1;

public class Ex11 {
	
	/*
	 * 정수 제곱근 판별
	 * 
	 * ▼문제 설명
	 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
	 * n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	 * 
	 * ▼제한 사항
	 * n은 1이상, 50000000000000 이하인 양의 정수입니다.
	 * 
	 * ▼ 입출력 예
	 * 입출력 예#1
	 * 121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
	 * 입출력 예#2
	 * 3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
	 *
	 */
	
    public long solution(long n) {
    	
    	long answer = 0;
    	Double x = Math.sqrt(n);
    	   	   	
    	if( x == x.intValue()) {
    		answer = (long) Math.pow(x + 1, 2);    		
    	} else {
    		answer = -1;
    	}
    	
        return answer;
    }

    
    //출력 테스트
	public static void main(String[] args) {
		
		
		Ex11 ex11 = new Ex11();
//      System.out.println(ex11.solution(121));
		System.out.println(ex11.solution(3));
	}

}
