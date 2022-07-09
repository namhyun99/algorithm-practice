package javaprac.level1;

import java.util.ArrayList;
import java.util.List;

//나머지가 1이 되는 수 찾기
public class Ex33 {
	
	public int solution(int n) {
		List<Integer> list = new ArrayList<>();
		for(int i=1; i < n; i++) {
			if(n % i == 1) 
				list.add(i);
		}
		return list.get(0);
	}
	
	public static void main(String[] args) {
		Ex33 ex33 = new Ex33();
		System.out.println(ex33.solution(10));
		System.out.println(ex33.solution(12));
	}

}
