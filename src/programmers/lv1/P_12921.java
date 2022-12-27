package programmers.lv1;

//소수 찾기
public class P_12921 {

	public int solution(int n) {
		 int answer = 0;
	        // 1. 에라토스테네스의 체로 거르기 위한 1차원 배열.
	        boolean check[] = new boolean[n+1];
	        
	        // 2. 2부터 n까지의 수들 중
	        for(int i =2;i<=n;i++){
	            // 2-1. 소수의 배수로써 걸러진 수들은 넘어가고, (4,6,8,9..... 등)
	            if(check[i] == true) continue;
	            // 2-2. 자신을 제외한 배수를 고려하기 위해 i+i; j<=n;j=j+i 조건으로 걸러준다.
	            for(int j=i + i;j<=n;j+=i){
	                check[j] = true;
	            }
	        }
	        
	        // 3. 걸러지지 않은 수 들의 개수를 카운팅.
	        for(int i=2;i<=n;i++){
	            if(!check[i]) {
	                answer++;
	            }
	        }

	        return answer;
	}

	public static void main(String[] args) {
		P_12921 ex20 = new P_12921();
//		System.out.println(ex20.solution(10));
		System.out.println(ex20.solution(5));
	}

	// 1~10의 사이의 소수는 아래와 같다.
	// 1 = 1
	// 2 = 1,2 *
	// 3 = 1,3 *
	// 4 = 1,2,4
	// 5 = 1,5 *
	// 6 = 1,2,3,6
	// 7 = 1,7 *
	// 8 = 1,2,4,8
	// 9 = 1,3,9
	// 10 = 1,2,5,10

}
