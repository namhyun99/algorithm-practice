package programmers.lv1;

//크기가 작은 부분문자열
public class P_147355 {

  public static int solution(String t, String p) {
    int answer = 0;
    int len = p.length();
    long pNum = Long.parseLong(p);

    for (int i = 0; i <= t.length() - p.length(); i++) {
      long tNum = Long.parseLong(t.substring(i, len++));
      if (pNum >= tNum) {
        answer++;
      }
    }
    return answer;
  }

  public static void main(String[] args) {

//    String t = "3141592";
//    String p = "271";
    
//    String t = "500220839878";
//    String p = "7";
    
    String t = "10203";
    String p = "15";

    System.out.println(solution(t, p));

  }

}
