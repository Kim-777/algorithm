package ������ȣ;
/*
 * � ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
 * ���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. 
 * ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.
 * */
public class Solution {
	
	// String�� chracter�� �迭�̶�� �Ͱ�, character�� �迭�� �������� �Ķ���� ������ String�� ���� �� �ִٴ� ���� �˸� ���� Ǯ�� �ֽ��ϴ�.
	public String solution(String s, int n) {
		

		char[] chr = new char[s.length()];
		
		for(int i=0; i<s.length();i++){
			chr[i] = s.charAt(i);
			// char���� �ҹ��� ���� �빮������ 1�������� �Ǵ����ݴϴ�.
			if(chr[i]>='a'&&chr[i]<='z') {
				for(int j=0; j<n; j++) {
					// ���� �������� ���ڸ� �����(z , Z) ���ĺ��� �� ���ڸ��� a, A���� �־��ݴϴ�.
					if(chr[i]=='z') chr[i] = 'a';
					else chr[i]++;
				}
			}
			
			if(chr[i]>='A'&&chr[i]<='Z') {
				for(int j=0; j<n; j++) {
					if(chr[i]=='Z') chr[i] = 'A';
					else chr[i]++;
				}
			}
		}
		
		String answer= new String(chr);	
		
		return answer;
	}
	
}
