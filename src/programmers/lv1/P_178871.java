package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

//달리기 경주
public class P_178871 {

  public static String[] solution(String[] players, String[] callings) {
    
    Map<String, Integer> playerInfo = new HashMap<>();
    
    for(int i=0; i<players.length; i++) {
      playerInfo.put(players[i],i);
    }
    
    for(String player : callings) {
      int idx = playerInfo.get(player);
      String frontPlayer = players[idx-1];
      players[idx-1] = player;
      players[idx] = frontPlayer;
      
      playerInfo.put(player, idx -1);
      playerInfo.put(frontPlayer, idx);
    }
    
    return players;
    /*
    for(int i=0; i<callings.length; i++) {
      String callPlayer = callings[i];
      String temp = "";
      
      for(int j=0; j<players.length; j++) {
        if(callPlayer.equals(players[j])) {
          temp = players[j];
          players[j] = players[j-1];
          players[j-1] = temp;
        }
      }
    }
    return Arrays.copyOf(players, players.length);
    */
  }
  
  
  //출력 테스트
  public static void main(String args[]) {
    String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    String[] callings = {"kai", "kai", "mine", "mine"};
    
    String[] result = solution(players, callings);
    for(String s : result) {
      System.out.println(s);
    }
  }

}
