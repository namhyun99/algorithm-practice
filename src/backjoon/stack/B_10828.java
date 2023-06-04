package backjoon.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//스택
public class B_10828 {

  public static final String PUSH  = "push";
  public static final String POP   = "pop";
  public static final String TOP   = "top";
  public static final String SIZE  = "size";
  public static final String EMPTY = "empty";

  public static void main(String[] args) throws Exception {

    Stack<Integer> stack = new Stack<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int comommandCount = Integer.parseInt(br.readLine());

    for (int i = 0; i < comommandCount; i++) {

      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      String command = st.nextToken();
      if(command == null) {
        throw new Exception("Check Command.");
      }
      Integer num = null;
      if (st.countTokens() > 0) {
        num = Integer.parseInt(st.nextToken());
      }

      switch (command) {
        case PUSH:
          stack.push(num);
          break;
        case POP:
          if (stack.isEmpty()) {
            System.out.println("-1");
          } else {
            int a = stack.pop();
            System.out.println(a);
          }
          break;
        case TOP:
          if (stack.isEmpty()) {
            System.out.println("-1");
          } else {
            System.out.println(stack.get(stack.size()-1));
          }
          break;
        case SIZE:
          System.out.println(stack.size());
          break;
        case EMPTY:
          if (stack.isEmpty()) {
            System.out.println("1");
          } else {
            System.out.println("0");
          }
          break;
        default:
          break;
      }

    }

  }

}
