package javaprac.level1;

public class Ex11 {
	
	// 정수 제곱근 판별
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
