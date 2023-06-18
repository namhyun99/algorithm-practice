package programmers.kakao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

//2023 KAKAO BLIND RECRUTMENT 개인정보 수집 유효기간
public class P_150370 {

  public static List<Integer> solution(String today, String[] terms, String[] privacies) throws Exception {

    //terms, privacies 배열로 객체 리스트 반환
    List<PrivaciesData> dataList = getPrivaciesDataList(terms, privacies);
    
    //expriyDate가 today보다 작으면 삭제 처리.
    Date todayDate = dateToString(today.replace(".", ""));
    List<Integer> list = new ArrayList<>();
    for(PrivaciesData p : dataList) {
      if(!todayDate.before(p.getExpiryDate())) {
        list.add(p.getIdx());
      }
    }
    return list;
  }

  private static List<PrivaciesData> getPrivaciesDataList(String[] terms, String[] privacies) throws Exception {

    List<PrivaciesData> resultList = new ArrayList<>();

    int index = 1;
    for (String privacie : privacies) {
      PrivaciesData result = new PrivaciesData();
      StringTokenizer st1 = new StringTokenizer(privacie, " ");
      Date startDate = dateToString(st1.nextToken().replace(".", ""));
      String term = st1.nextToken();

      for (String term1 : terms) {
        StringTokenizer st2 = new StringTokenizer(term1, " ");
        String checkTerm = st2.nextToken();
        int expriyMonth = Integer.parseInt(st2.nextToken());
        if (term.equals(checkTerm)) {
          Date expriyDate = expriyDateCalculator(startDate, expriyMonth);
          result.setExpiryDate(expriyDate);
        }
      }

      result.setIdx(index++);
      result.setStartDate(startDate);
      result.setTerm(term);
      resultList.add(result);
    }

    return resultList;
  }

  private static Date expriyDateCalculator(Date startDate, int expriyMonth) throws Exception {
    Calendar cal = Calendar.getInstance();
    cal.setTime(startDate);
    cal.add(Calendar.MONTH, expriyMonth);
    return cal.getTime();
  }
  
  private static Date dateToString(String s) throws Exception {
    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    return format.parse(s);
  }

  public static void main(String[] args) throws Exception {
    /*
    String today = "2022.05.19";
    String[] trem = {"A 6", "B 12", "C 3"};
    String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

    solution(today, trem, privacies);
    */
    
    
    String today = "2020.01.01";
    String[] trem = {"Z 3", "D 5"};
    String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

    System.out.println(solution(today, trem, privacies));
    
  }
}


class PrivaciesData {
  private int    idx;        //인덱스
  private String term;       //약관
  private Date startDate;    //수집일자
  private Date expiryDate;   //유효기간
  public int getIdx() {
    return idx;
  }
  public void setIdx(int idx) {
    this.idx = idx;
  }
  public String getTerm() {
    return term;
  }
  public void setTerm(String term) {
    this.term = term;
  }
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
  public Date getExpiryDate() {
    return expiryDate;
  }
  public void setExpiryDate(Date expiryDate) {
    this.expiryDate = expiryDate;
  }
  @Override
  public String toString() {
    return "PrivaciesData [idx=" + idx + ", term=" + term + ", startDate=" + startDate + ", expiryDate=" + expiryDate + "]" + "\n";
  }

}
