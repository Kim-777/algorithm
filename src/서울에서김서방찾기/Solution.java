package ���￡���輭��ã��;
/*
 * String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, 
 * solution�� �ϼ��ϼ���. seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 * */
public class Solution {
	
	// equals �޼��带 �̿��� �� ���� Ǯ�� �ֽ��ϴ�.
	public String solution(String[] seoul) {
		String answer ="";
		
		
		int i=0;
		for(String str : seoul) {
	
			if (str.equals("Kim")) answer="�輭���� " + i + "�� �ִ�";
			i++;
		}
		
		return answer;
		
		
	}
	
}
