package 정수내림차순으로배치하기;

import java.util.Arrays;

/*
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 * */
public class Solution {

	// char배열로 변환 후 랭쓰의 반을 나눈 뒤 앞 뒤의 인덱스의 값을 변환시켜주며 문제를 풀 수 있습니다.
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
