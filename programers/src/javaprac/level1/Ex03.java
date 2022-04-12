package javaprac.level1;


public class Ex03 {
	/*
	 * 행렬의 덧셈
	 */
	public int[][] solution(int[][] arr1, int[][] arr2){
		int[][] answer = new int[arr1.length][arr2.length];
		
		for(int i = 0; i < arr1.length; i++ ) {
			for(int j  = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];				
			}
		}
		
		return answer;
	}

	
	// 출력 테스트
	public static void main(String[] args) {
		
		Ex03 ex3 = new Ex03();
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		int[][] result = ex3.solution(arr1, arr2);

		// 이차원배열 출력
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
		}
	}

}
