package programmers.kakao;

import java.util.HashMap;
import java.util.Map;

//성격 유형 검사하기
public class P_118666 {

  private static Map<Character, Integer> resultMap = new HashMap<>();

  public static String solution(String[] survey, int[] choices) throws Exception {

    //1.check size
    if (survey.length != choices.length) {
      throw new Exception("The Length is Not Same");
    }

    setResultMap(survey, choices);

    String result = getResultValue();

    return result;
  }

  private static String getResultValue() {
    StringBuilder builder = new StringBuilder();
    builder.append(resultMap.getOrDefault('R', 0) >= resultMap.getOrDefault('T', 0) ? 'R' : 'T');
    builder.append(resultMap.getOrDefault('C', 0) >= resultMap.getOrDefault('F', 0) ? 'C' : 'F');
    builder.append(resultMap.getOrDefault('J', 0) >= resultMap.getOrDefault('M', 0) ? 'J' : 'M');
    builder.append(resultMap.getOrDefault('A', 0) >= resultMap.getOrDefault('N', 0) ? 'A' : 'N');
    return builder.toString();
  }

  private static void setResultMap(String[] survey, int[] choices) {
    for (int i = 0; i < survey.length; i++) {
      char[] type = survey[i].toCharArray();
      int choice = choices[i];
     
      if (choice < 4 && choice > 0) {
        resultMap.put(type[0], resultMap.getOrDefault(type[0], 0) + getScore(choice));
      } else if (choice > 4) {
        resultMap.put(type[1], resultMap.getOrDefault(type[1], 0) + getScore(choice));
      }
    }
  }

  private static Integer getScore(int choice) {
    switch (choice) {
      case 1:
      case 7:
        return 3;
      case 2:
      case 6:
        return 2;
      case 3:
      case 5:
        return 1;
      default:
        return 0;
    }
  }

  public static void main(String[] args) {

    /*
    String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
    int[] choices = {5, 3, 2, 7, 5};
    */
    /*
    String[] survey = {"TR", "RT", "TR"};
    int[] choices = {7, 1, 3};
    */
    String[] survey = {"RT", "RT", "RT"};
    int[] choices = {7, 5, 2};
    
    

    try {
      System.out.println(solution(survey, choices));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
