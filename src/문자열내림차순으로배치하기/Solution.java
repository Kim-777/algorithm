package ���ڿ������������ι�ġ�ϱ�;

import java.util.Arrays;

// ���ڿ� String�� char���� �迭�� ���� ������ �� new �����ڸ� ���� char[]�� �޾� �����ϸ� ���� Ǯ �� �ֽ��ϴ�.
public class Solution {
	public String solution(String s) {
   
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        // ������ ���� ���� �߽����� �� ���� �ε����� ������ ü���� ���ݴϴ�.
        for(int i=0; i<ch.length/2; i++) {
        	char temp = ch[i];
        	ch[i] = ch[ch.length-i-1];
        	ch[ch.length-i-1] = temp;
        }
        
        String answer = new String(ch);
        
        return answer;
	}
}
