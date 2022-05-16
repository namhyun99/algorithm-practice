package javaprac.level1;

import java.util.*;

// 문자열 내 마음대로 정렬하기
public class Ex25 {

	public ArrayList<String> solution(String[] strings, int n) {

		Map<String, Character> map = new TreeMap<>();

		for (int i = 0; i < strings.length; i++) {
			map.put(strings[i], strings[i].charAt(n));
		}

		ArrayList<String> list = new ArrayList<>(map.keySet());
//		System.out.println(list);
		Collections.sort(list, (o1, o2) -> (map.get(o1).compareTo(map.get(o2))));
		return list;

	}

	public static void main(String[] args) {

		Ex25 ex25 = new Ex25();

		String[] strArr1 = { "sun", "bed", "car" };
		String[] strArr2 = { "abce", "abcd", "cdx" };

		System.out.println(ex25.solution(strArr1, 1));
		System.out.println(ex25.solution(strArr2, 2));
	}

}
