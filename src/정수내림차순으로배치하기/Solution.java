package ���������������ι�ġ�ϱ�;

import java.util.Arrays;

/*
 * �Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
 * */
public class Solution {

	// char�迭�� ��ȯ �� ������ ���� ���� �� �� ���� �ε����� ���� ��ȯ�����ָ� ������ Ǯ �� �ֽ��ϴ�.
	public static long solution(long n) {
		long answer = 0;
		
		String str = n+"";
		char[] chr = str.toCharArray();
		System.out.println(str);
		
		Arrays.sort(chr);
		System.out.println(chr);
		
		int num = chr.length;
//		System.out.println("chr[5] : " + chr[5]);
//		System.out.println("chr[0] : " + chr[0]);
		
		for(int i=0;i<num/2;i++) {
			char temp = chr[i];
//			System.out.println("temp : " + temp);
			chr[i] = chr[num-i-1];
//			System.out.println("chr[num-i-1] : "+chr[num-i-1]);
//			System.out.println("chr[i] : " + chr[i]);
			chr[num-i-1] = temp;
//			System.out.println("chr[num-i-1] : " + chr[num-i-1]);
		}
		
		for(int i=0; i<chr.length;i++) {
			answer =  answer*10 + chr[i]-'0';
		}
//		System.out.println("answer :" + answer);
		return answer;
	}
	
	public static void main(String[] args) {
		solution(118372);
	}
}
