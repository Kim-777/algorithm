package ������ڰ�������;

/*
 * �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
 * */
public class Solution {

	//String�� �޼��带 �̿��ؼ� ����� �ʰ� Ǯ �� �ֽ��ϴ�.
	public String solution(String s) {
		String answer = "";
		
		if(s.length()%2==0) {
			answer = s.substring(s.length()/2-1, (s.length()/2)+1);
		} else {
			answer = s.charAt(s.length()/2)+"";
		}
		return answer;
	}
	
}
