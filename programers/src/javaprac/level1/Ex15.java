package javaprac.level1;

import java.util.Arrays;

public class Ex15 {

	// 이상한 문자 만들기
	public String solution(String s) {
		String answer = "";
		int cnt = 0;
		String[] strArr = s.split("");

		for (String s1 : strArr) {
//			cnt = s1.contains(" ") ? 0 : cnt + 1;
			if (s1.contains(" "))
				cnt = 0;
			else
				cnt++;

//			answer += cnt % 2 == 0 ? s1.toLowerCase() : s1.toUpperCase();

			if (cnt % 2 == 0) {
				answer += s1.toLowerCase();
			} else {
				answer += s1.toUpperCase();
			}
		}
		return answer;
	}

	// 출력 테스트
	public static void main(String[] args) {

		Ex15 ex15 = new Ex15();

		System.out.println(ex15.solution("try hello world"));
		System.out.println(ex15.solution("hello java test Page"));
		System.out.println(ex15.solution("hello java test Page edlf"));

	}

}
