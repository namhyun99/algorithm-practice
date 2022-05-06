package javaprac.level1;


//소수 찾기
public class Ex20 {
	
	public int solution(int n) {
		int answer = 0;
		
		for(int i=1; i < n; i++) {
			
			if(n%i == 0) // 1,2,5,10
				continue;
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex20 ex20 = new Ex20();
		System.out.println(ex20.solution(10));
	}
	
	// 1~10의 사이의 소수는 아래와 같다.
	// 1 = 1
	// 2 = 1,2  *
	// 3 = 1,3	*
	// 4 = 1,2,4
	// 5 = 1,5	*
	// 6 = 1,2,3,6
	// 7 = 1,7	*
	// 8 = 1,2,4,8
	// 9 = 1,3,9
	// 10 = 1,2,5,10

}
