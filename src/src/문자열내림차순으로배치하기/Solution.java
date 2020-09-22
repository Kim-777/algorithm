package 문자열내림차순으로배치하기;

import java.util.Arrays;

// 문자열 String을 char형의 배열로 먼저 정리한 후 new 연산자를 통해 char[]를 받아 생성하면 쉽게 풀 수 있습니다.
public class Solution {
	public String solution(String s) {
   
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        // 길이의 나눈 값을 중심으로 앞 뒤의 인덱스의 값들을 체인지 해줍니다.
        for(int i=0; i<ch.length/2; i++) {
        	char temp = ch[i];
        	ch[i] = ch[ch.length-i-1];
        	ch[ch.length-i-1] = temp;
        }
        
        String answer = new String(ch);
        
        return answer;
	}
}
