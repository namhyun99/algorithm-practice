package programmers.lv1;

class Solution {
  public String solution(String[] cards1, String[] cards2, String[] goal) {
      
    int c1 = 0;
    int c2 = 0;
    
    for(int i=0; i<goal.length; i++) {
      if(c1 < cards1.length && goal[i].equals(cards1[c1])) c1++;
      else if(c2 < cards2.length && goal[i].equals(cards2[c2])) c2++;
      else return "No";
    }

    return "Yes";
  }
}

public class P_159994 {
  
  public static void main(String[] args) {
    
    String[] card1 = {"i","water","water"};
    String[] card2 = {"want","to"};
    String[] goal = {"i","want","to","drink","water"};
    
    Solution s = new Solution();
    String result = s.solution(card1, card2, goal);
    
    System.out.println(result);
  }
}
