package javaprac.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex23 {
	// 문자열 내림차순으로 배치하기
	public String solution(String s) {
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}

		list.sort(Comparator.reverseOrder());
		String answer = "";
		for (Character c : list) {
			answer += c;
		}
		return answer;
	}

	public static void main(String[] args) {

		Ex23 ex23 = new Ex23();
		System.out.println(ex23.solution("Zbcdefg"));
	}

}
