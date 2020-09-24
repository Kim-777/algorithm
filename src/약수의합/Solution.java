package 약수의합;


//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
public class Solution {
	
	//약수의 특징을 알고 있다면 쉽게 풀수 있는 문제입니다.
	public int solution(int n) {
		int answer=0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) answer += i;
		}
		
		return answer;
	}
	
}
