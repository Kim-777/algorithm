package 문자열내마음대로정렬하기;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
 * 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.
 * */
public class Solution {

	  //Comparator을 정의해주어서 sort 메서드의 기준을 잡아주어 쉽게 풀수 있씁니다.
	  public String[] solution(String[] strings, int n) {
	      
	      Arrays.sort(strings, new Comparator<String>() {
	          @Override
	          public int compare(String s1, String s2){
	              char c1 = s1.charAt(n);
	              char c2 = s2.charAt(n);
	              
	              if(c1 == c2){
	                  return s1.compareTo(s2);
	              } else return c1 - c2;
	          }
	      });
	      
	      return strings;
	  }
	
}
