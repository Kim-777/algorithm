package 이상한문자만들기;
/*
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 * */
public class Solution {

	public static String solution(String s) {
		
		String[] strings = s.toLowerCase().split(" ");
		String answer ="";
		for(String str : strings) {
			char[] chr = str.toCharArray();
			for(int i=0; i<chr.length; i++) {
				if(chr[i]>='A'&&chr[i]<='z') {
					if(i%2==0) chr[i] -= 32;
				}
			}
			answer += new String(chr)+ " ";
		}
		
		int i= answer.length();
		answer = answer.substring(0, i-1);
		return answer;
	}

	public static void main(String[] args) {
		
		System.out.println(solution("try hello world sdadsaasaddsa"));
	}
}

/* 다른 풀이 : 이걸로 풀었는데 위에꺼의 테스트중 아닌 부분이 없어서 의아합니다 위에 풀이가 더 낫다고 생각됩니다.;
class Solution {
  public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
}
 */
