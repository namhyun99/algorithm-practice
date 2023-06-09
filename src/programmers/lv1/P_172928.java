package programmers.lv1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

//공원산책
public class P_172928 {
  
  public static final char START_POINT = 'S';
  public static final char BLOCK_POINT = 'X';
  
  public static int[] solution(String[] park, String[] routes) {
    int[] answer = new int[2];
    
    char[][] parkArr = getParkArr(park);
    Map<String, Integer> point = setStartPoint(parkArr);
    Map<String, Integer> routesMap = setRoutesMap(routes); 
    
    for(String op : routesMap.keySet()) {
      System.out.println(">>>>>> check point: ["+ point.get("x") + "," + point.get("y") + "]");
//      System.out.println("op: " + op);
      switch (op) {
        case "N":
          int northPoint = point.get("x") - routesMap.get(op);
          if(northPoint > answer.length || northPoint < 0) {
            continue;
          }
          for(int x = point.get("x"); x >= northPoint; x--) {
            if(parkArr[x][point.get("y")] == BLOCK_POINT) {
              break;
            }
            if(x == northPoint) {
              point.put("x", x);
            }
          }
          System.out.println(op +" : [" + point.get("x") + "," + point.get("y") + "]");
          break;
        case "S":
          int southPoint = point.get("x") + routesMap.get(op);
          if(southPoint > answer.length || southPoint < 0) {
            continue;
          }
          for(int x = point.get("x"); x <= southPoint; x++) {
            if(parkArr[x][point.get("y")] == BLOCK_POINT) {
              break;
            }
            if(x == southPoint) {
              point.put("x", x);
            }
          }
          System.out.println(op +" : [" + point.get("x") + "," + point.get("y") + "]");
          break;
        case "W":
          int westPoint = point.get("y") - routesMap.get(op);
          if(westPoint > answer.length || westPoint < 0) {
            continue;
          }
          for(int y = point.get("y"); y >= westPoint; y--) {
            if(parkArr[point.get("x")][y] == BLOCK_POINT) {
              break;
            }
            if(y == westPoint) {
              point.put("y", y);
            }
          }
          System.out.println(op +" : [" + point.get("x") + "," + point.get("y") + "]");
          break;
        case "E":
          int eastPoint = point.get("y") + routesMap.get(op);
          if(eastPoint > answer.length || eastPoint < 0) {
            continue;
          }
          for(int y = point.get("y"); y <= eastPoint; y++) {
            if(parkArr[point.get("x")][y] == BLOCK_POINT) {
              break;
            }
            if(y == eastPoint) {
              point.put("y", y);
            }
          }
          System.out.println(op +" : [" + point.get("x") + "," + point.get("y") + "]");
          break;
      }
    }
    
    answer[0] = point.get("x");
    answer[1] = point.get("y");
    return answer;
  }
  
  private static Map<String, Integer> setStartPoint(char[][] parkArr) {
    Map<String, Integer> result = new HashMap<>();
    for(int i=0; i<parkArr.length; i++) {
      for(int j=0; j<parkArr[i].length; j++) {
        if(parkArr[i][j] == START_POINT) {
          result.put("x", i);
          result.put("y", j);
//          System.out.println("Start Point: ["+i+"," + j + "]");
        }
//        System.out.print(parkArr[i][j] + " ");
      }
//      System.out.println();
    }
    return result;
  }

  private static Map<String, Integer> setRoutesMap(String[] routes) {
    Map<String, Integer> routesMap = new LinkedHashMap<>();
    for(int i=0; i<routes.length; i++) {
      StringTokenizer st = new StringTokenizer(routes[i], " ");
      String op = st.nextToken();
      Integer n = Integer.parseInt(st.nextToken());
      routesMap.put(op, n);
    }
    return routesMap;
  }

  private static char[][] getParkArr(String[] park) {
    char[][] result = new char[park.length][park.length];
    for(int i=0; i<park.length; i++) {
      result[i] = park[i].toCharArray();
    }
    return result;
  }

  //출력테스트
  public static void main(String args[]) {
    
//    String[] park = {"SOO","OOO","OOO"};
//    String[] routes = {"E 2","S 2","W 1"};
    
//    String[] park = {"SOO","OXX","OOO"};
//    String[] routes = {"E 2","S 2","W 1"};
    
    String[] park = {"OSO","OOO","OXO","OOO"};
    String[] routes = {"E 2","S 3","W 1"};

    int[] result = solution(park, routes);
    
    System.out.print("result: ");
    for(int i : result) {
      System.out.print(i + " ");
    }
  }

}
