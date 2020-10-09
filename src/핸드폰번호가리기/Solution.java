package 핸드폰번호가리기;


/*프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 
전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 * 
 * */
public class Solution {
 public String solution(String phone_number) {

	 
	 //수정가능한 StringBuffer를 생성해줍니다.
	 StringBuffer sb = new StringBuffer(phone_number);
	 // 나머지 4개의 수를  제외한 수를 구해줍니다.
	 int num = phone_number.length() - 4;
	 
	 for(int i=0; i<num; i++) {
		sb.setCharAt(i, '*'); 
	 }
		 
		 String answer = new String(sb); 

	 return answer;
 }
 
}
