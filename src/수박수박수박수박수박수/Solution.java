package ���ڼ��ڼ��ڼ��ڼ��ڼ�;
/*
 * ���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
 * */

public class Solution {
	public String solution(int n) {
		String answer = "";
		String watermelon = "����";
		
		
		// �������� �̿��� �ڸ��� character ���� ����ϵ��� �մϴ�.
		for(int i=0; i<n; i++) {
			answer += watermelon.charAt(i%2);
		}
		
		return answer;
	}
}
