package 자연수뒤집어배열로만들기;

public class Solution {
// 배열에 담긴 수를 역으로 나타내는 것
// 기존 배열의 맨뒤에 있던 수를 맨 앞으로 두고 차례로 쌓는 것 이기 때문에 나머지를 활용하면 될듯
	
    public int[] solution(long n) {
        int[] answer = {};
        String str = "";
        
		while(n!=0) {
			str +=n%10;
			n = n/10;
		}
		
		answer = new int[str.length()];
		for(int i=0; i<str.length();i++) {
			answer[i] = str.charAt(i)-'0';
		}
        return answer;
    }
	
	public static void main(String[] args) {
		String str =" ";
		str += "ssss";
		str += "ddddd";
		System.out.println(str);
	}
}
