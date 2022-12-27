package programmers.lv1;

public class P_17682 {

	// [1차] 다트게임
	public int solution(String dartResult) {
		
		String temp = "";
		int[] scores = new int[3];
		int idx =0;
		int answer = 0;
		
		for(int i =0; i < dartResult.length(); i++) {
			char ch = dartResult.charAt(i);
			switch(ch) {
			case 'S':
				scores[idx] = (int)Math.pow(Integer.parseInt(temp),1);
				idx++;
				temp = "";
				break;
			case 'D':
				scores[idx] = (int)Math.pow(Integer.parseInt(temp),2);
				idx++;
				temp = "";
				break;
			case 'T':
				scores[idx] = (int)Math.pow(Integer.parseInt(temp),3);
				idx++;
				temp = "";
				break;
			case '*':
				scores[idx-1] *= 2;
				if(idx > 1) scores[idx-2] *= 2;
				break;
			case '#':
				scores[idx-1] *= -1;
				break;
			default : 
				temp += String.valueOf(ch);
				break;
			}
		}
		for(int i : scores) {
			answer += i;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		P_17682 ex29 = new P_17682();
		System.out.println(ex29.solution("1S2D*3T"));
		System.out.println(ex29.solution("1D2S#10S"));
		System.out.println(ex29.solution("1D2S0T"));
		System.out.println(ex29.solution("1S*2T*3S"));
		System.out.println(ex29.solution("1D#2S*3S"));
		System.out.println(ex29.solution("1T2D3D#"));
		System.out.println(ex29.solution("1D2S3T*"));
	}
	
	
	
	
}
