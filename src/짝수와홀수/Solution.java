package 짝수와홀수;
/*
 * 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
 * */
public class Solution {
	// 삼항 연산자를 통해 쉽게 풀 수 있습니다.
	public String solution(int num) {
		
		String answer = (num%2==0)? "Even": "Odd";
		return answer;
	}
	
}
