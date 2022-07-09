package javaprac.level1;

// 부족한 금액 계산하기
public class Ex32 {
	public long solution(int price, int money, int count) {
		
		long sum = 0;
		
		for(int i=1; i<=count; i++) {
			sum += price * i;
		}
		
		long result = sum - money;
		return result < 0 ? 0 : result;
	}
	
	public static void main(String[] args) {
		Ex32 ex32 = new Ex32();
		System.out.println(ex32.solution(3, 20, 4));
	}

}
