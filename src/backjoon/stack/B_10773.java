package backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//제로
public class B_10773 {
  
  public static void main(String args[]) throws NumberFormatException, IOException {
    Stack<Integer> stack = inputValue();
    resultPrint(stack);
  }

  private static Stack<Integer> inputValue() throws NumberFormatException, IOException {
    Stack<Integer> stack = new Stack<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());
    
    for(int i=0; i<k; i++) {
      int num = Integer.parseInt(br.readLine());

      if(num == 0) {
        stack.pop();
      } else {
        stack.push(num);
      }
    }    
    return stack;
  }

  private static void resultPrint(Stack<Integer> stack) {
    int result = 0;
    for(int i=0; i<stack.size(); i++) {
      result += stack.get(i);
    }
    System.out.println(result);
  }

}
