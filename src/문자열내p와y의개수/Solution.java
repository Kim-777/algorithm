package ���ڿ���p��y�ǰ���;

public class Solution {
	
	// String�� ������ �ִ� �޼��带 ����ؼ� ���� Ǯ �� �ֽ��ϴ�.
	boolean solution(String s) {
		
		boolean answer = true;
		int check = 0;
		String s2 = s.toLowerCase();
		
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i)=='y') ++check;
			else if(s2.charAt(i)=='p') --check;
		}
		
		answer = (check==0)? true : false;
		return answer;
	}
}
