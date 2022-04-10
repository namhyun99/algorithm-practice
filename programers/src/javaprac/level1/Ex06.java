package javaprac.level1;

public class Ex06 {
	
	/*
	 * 평균 구하기
	 * 
	 * ▼문제설명
	 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
	 * 
	 * ▼제한사항
	 * arr은 길이 1이상, 100이하인 배열입니다.
	 * arr의 원소는 -10,000이상 10,000이하인 정수입니다.
	 * 
	 */
	
	public double solution(int[] arr) {	
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		
		double answer = (double) sum / arr.length;
		return answer;
	}

	public static void main(String[] args) {

		Ex06 ex6 = new Ex06();
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,5};
		
		System.out.println(ex6.solution(arr1));
		System.out.println(ex6.solution(arr2));
	}

}
