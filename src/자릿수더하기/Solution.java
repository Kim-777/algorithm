package 자릿수더하기;

public class Solution {

	public static int solution(int n) {
		int answer =0;
		
		String str = n+"";
		
		for(int i=0; i<str.length(); i++) {
			answer += str.charAt(i)-'0';
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(3));
	}
	
}
