package ���ǰ��;

public class Solution {
	
	public int[] solution(int[] answers) {
		
		int[] answer = {};
		
		// ���� 3������ �迭�� ����ݴϴ�.
		int[] pattern1 = {1,2,3,4,5};
		int[] pattern2 = {2,1,2,3,2,4,2,5};
		int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};
		
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		for(int i=0; i<answers.length;i++) {
		
			//�� �迭�� ��� ��ü�� ����ŭ �������� �������ν� �� ���� �Ѿ ���� �Է� �޴��� �迭�� �ε����� ������ ���� �� �ְԲ� �մϴ�.
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
