package programmers.challenge;

import java.util.ArrayList;
import java.util.List;

//음양 더하기
public class P_76501 {

  public static int solution(int[] absolutes, boolean[] signs) throws Exception {
    
    //1. check size 
    if(absolutes.length != signs.length) {
      throw new Exception("Not Same Length");
    }
    List<Integer> list = setAbsolutesList(absolutes, signs);
    return list.stream().reduce(0, Integer :: sum);
  }

  private static List<Integer> setAbsolutesList(int[] absolutes, boolean[] signs) {
    List<Integer> result = new ArrayList<>();
    
    for(int i=0; i<absolutes.length; i++) {
      if(signs[i] == false) {
        result.add(absolutes[i]*-1);
      } else {
        result.add(absolutes[i]);
      }
    }
    return result;
  }

  public static void main(String[] arge) throws Exception {
    /*
    int[] absolutes = {4,7,12};
    boolean[] signs = {true,false,true};
    */
    int[] absolutes = {1,2,3};
    boolean[] signs = {false,false,true};
    
    System.out.println(solution(absolutes, signs));

  }
}
