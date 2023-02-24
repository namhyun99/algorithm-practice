package programmers.lv1;

class Solution {
  public String solution(String[] cards1, String[] cards2, String[] goal) {
      
    int mergeCardLen = cards1.length + cards2.length;
    String[] mergeCardsArr = new String[mergeCardLen];
    
    int index = 0;
    for(int i=0; i<cards1.length; i++) {
      if(i==1) {
        for(int j=0; j<cards2.length; j++) {
          mergeCardsArr[index++] = cards2[j];
        }
      }
      mergeCardsArr[index++] = cards1[i];
    }
    
    for(int i=0; i<goal.length; i++) {
      if(!goal[i].equals(mergeCardsArr[i])) {
        return "No";
      }
    }
    return "Yes";
  }
}

public class P_159994 {
  
  public static void main(String[] args) {
    
    String[] card1 = {"i","drink","water"};
    String[] card2 = {"want","to"};
    String[] goal = {"i","want","to","drink","water"};
    
    Solution s = new Solution();
    String result = s.solution(card1, card2, goal);
    
    System.out.println(result);
  }
}
