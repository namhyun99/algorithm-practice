package programmers.lv0;

//머쓱이보다 키 큰 사람
public class P_120585 {
	public int solution(int[] array, int height) {
		int answer = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > height){
				answer++;
			}
		}
		
		return answer;
	}
	
	
	//실행테스트
	public static void main(String[] args) {
		int arr1[] = {149,180,192,170};
		int arr2[] = {180,120,140};

		
		P_120585 s = new P_120585();
		System.out.println(s.solution(arr1, 167));
		System.out.println(s.solution(arr2, 190));
		
	}

}
