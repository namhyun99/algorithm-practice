package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

//추억점수
public class P_176963 {
  
  public static int[] solution(String[] name, int[] yearning, String[][] photo) {
    int[] answer = new int[photo.length];
    
    Map<String, Integer> map = new HashMap<>();
    
    for(int i=0; i<name.length; i++) {
      map.put(name[i], yearning[i]);
    }
    
    for(int i=0; i<photo.length; i++) {
      int result = 0;
      for(int j=0; j<photo[i].length; j++) {
        String photoName = photo[i][j];
        result += map.getOrDefault(photoName, 0);
      }
      answer[i] = result;
    }
    return answer;
  }
  
  
  //출력 테스트
  public static void main(String[] args) {
    String[] name = {"may", "kein", "kain", "radi"};
    int[] yearning = {5, 10, 1, 3};
    String[][] photo = {{"may", "kein", "kain", "radi"},
                        {"may", "kein", "brin", "deny"}, 
                        {"kon", "kain", "may", "coni"}};
    
    int[] resultArr = solution(name, yearning, photo);
    for(int result : resultArr) {
      System.out.print(result + " ");
    }
  }

}
