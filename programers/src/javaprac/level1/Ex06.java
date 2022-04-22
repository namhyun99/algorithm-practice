package javaprac.level1;

public class Ex06 {
	
	// 평균 구하기
	public double solution(int[] arr) {	
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		
		double answer = (double) sum / arr.length;
		return answer;
	}

	
	//출력 테스트
	public static void main(String[] args) {

		Ex06 ex6 = new Ex06();
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,5};
		
		System.out.println(ex6.solution(arr1));
		System.out.println(ex6.solution(arr2));
	}

}
