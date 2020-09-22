package 모의고사;

public class Solution {
	
	public int[] solution(int[] answers) {
		
		int[] answer = {};
		
		// 패턴 3가지를 배열에 담아줍니다.
		int[] pattern1 = {1,2,3,4,5};
		int[] pattern2 = {2,1,2,3,2,4,2,5};
		int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};
		
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		for(int i=0; i<answers.length;i++) {
		
			//각 배열에 담긴 객체의 수만큼 나머지를 구함으로써 그 수를 넘어간 수를 입력 받더라도 배열의 인덱스의 범위에 들어올 수 있게끔 합니다.
			if(answers[i]==pattern1[i%5]) {
				result1 +=1;
			}
			
			if(answers[i]==pattern2[i%8]) {
				result2 +=1;
			}
			
			if(answers[i]==pattern3[i%10]) {
				result3 +=1;
			}
		}
		
		if(result1==result2&&result1==result3) {
			answer= new int[]{1,2,3};
		} else if(result1==result2&&result1>result3) {
			 answer= new int[]{1,2};
		} else if(result2>result1&&result2==result3) {
			answer= new int[]{2,3};
		} else if(result1>result2&&result1==result3) {
			answer= new int[]{1,3};
		} else if(result1>result2&&result1>result3) {
			answer= new int[] {1};
		}else if(result2>result1&&result2>result3) {
			answer= new int[] {2};
		} else {
			answer= new int[] {3};
		}
		
		return answer;
	}
}
