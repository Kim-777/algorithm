package 시저암호;
/*
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
 * 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 * */
public class Solution {
	
	// String이 chracter의 배열이라는 것과, character의 배열을 생성자의 파라미터 값으로 String을 만들 수 있다는 것을 알면 쉽게 풀수 있습니다.
	public String solution(String s, int n) {
		

		char[] chr = new char[s.length()];
		
		for(int i=0; i<s.length();i++){
			chr[i] = s.charAt(i);
			// char형이 소문자 인지 대문자인지 1차적으로 판단해줍니다.
			if(chr[i]>='a'&&chr[i]<='z') {
				for(int j=0; j<n; j++) {
					// 만약 각문자의 끝자리 수라면(z , Z) 알파벳의 맨 앞자리인 a, A값을 넣어줍니다.
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
