package programmers.kakao;

//숫자 문자열과 영단어
public class P_81301 {

  public static int solution(String s) {
    String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    for(int i=0; i<arr.length; i++) {
      if(s.contains(arr[i])) {
        s = s.replace(arr[i], Integer.toString(i));
      }
    }
    
    int result = Integer.parseInt(s);
    return result;
  }

  public static void main(String[] args) {
    String s = "one4seveneight";
    solution(s);
  }

}
