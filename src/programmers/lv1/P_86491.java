package programmers.lv1;

public class P_86491 {
//최소 직사각형
	public int solution(int[][] sizes) {
		int answer = 0;
		int maxWidth = 0;
		int maxHeight = 0;
		
		for(int i=0; i< sizes.length; i++) {
			int width = Math.max(sizes[i][0], sizes[i][1]);
			int height = Math.min(sizes[i][0], sizes[i][1]);
			maxWidth = Math.max(maxWidth, width);
			maxHeight = Math.max(maxHeight, height);
		}
		answer = maxWidth * maxHeight;
		return answer;
	}
	
	public static void main(String[] args) {
		P_86491 ex34 = new P_86491();
		
		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
		
		System.out.println(ex34.solution(sizes));
	}

}
