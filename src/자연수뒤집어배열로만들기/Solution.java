package �ڿ���������迭�θ����;

public class Solution {
// �迭�� ��� ���� ������ ��Ÿ���� ��
// ���� �迭�� �ǵڿ� �ִ� ���� �� ������ �ΰ� ���ʷ� �״� �� �̱� ������ �������� Ȱ���ϸ� �ɵ�
	
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
