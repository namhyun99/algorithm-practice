package programmers.challenge;

//없는 숫자 더하기
public class P_86051 {

  public static int solution(int[] numbers) {
    int answer = 0;
    boolean[] checkArr = new boolean[10];
   
    for(int number : numbers) {
      checkArr[number] = true;
    }
    
    for(int i=0; i<checkArr.length; i++) {
      if(checkArr[i] == false) {
        answer += i;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
//    int[] numbers = {1,2,3,4,6,7,8,0};
    int[] numbers = {5,8,4,0,6,7,9};
    
    solution(numbers);
  }

}
