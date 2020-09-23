package 서울에서김서방찾기;
/*
 * String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, 
 * solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
 * */
public class Solution {
	
	// equals 메서드를 이용해 손 쉽게 풀수 있습니다.
	public String solution(String[] seoul) {
		String answer ="";
		
		
		int i=0;
		for(String str : seoul) {
	
			if (str.equals("Kim")) answer="김서방은 " + i + "에 있다";
			i++;
		}
		
		return answer;
		
		
	}
	
}
