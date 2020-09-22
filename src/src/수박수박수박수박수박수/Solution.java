package 수박수박수박수박수박수;
/*
 * 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
 * */

public class Solution {
	public String solution(int n) {
		String answer = "";
		String watermelon = "수박";
		
		
		// 나머지를 이용해 자리의 character 값을 출력하도록 합니다.
		for(int i=0; i<n; i++) {
			answer += watermelon.charAt(i%2);
		}
		
		return answer;
	}
}
