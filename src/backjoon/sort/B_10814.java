package backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


//나이순 정렬
public class B_10814 {
	
	//객체 선언
	public static class Person {
		private int age;
		private String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}

		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
		
	}
	
	//실행메소드
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //자리수 입력
		Person[] p = new Person[N]; //Person객체로 배열 선언

		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			p[i] = new Person(age, name);
		}
		
		// 나이순으로 정렬하기
		//new Comparator<Person> 을 람다식으로 구현
		Arrays.sort(p, (a1, a2) -> {
			return a1.age - a2.age;  
		});
		
		StringBuilder Builder = new StringBuilder();
		for(int i=0; i<N; i++) {
			Builder.append(p[i]);
		}
		System.out.println(Builder);
	}
}
