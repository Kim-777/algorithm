package ���ڿ��������ιٲٱ�;

/*
 * ���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * */
public class Solution {

	// String�� �޼��� substring�� �̿��ؼ� ���� Ǯ�� �ֽ��ϴ�.
	public int solution(String s) {
		
		int answer =0;
		
		if(s.charAt(0)=='-') {
			s = s.substring(1, s.length());
			answer = -Integer.parseInt(s);
		} else {
			answer = Integer.parseInt(s);
		}
		return answer;
	}
	
}
