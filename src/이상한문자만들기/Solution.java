package �̻��ѹ��ڸ����;
/*
 * ���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�.
 * �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
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

/* �ٸ� Ǯ�� : �̰ɷ� Ǯ���µ� �������� �׽�Ʈ�� �ƴ� �κ��� ��� �Ǿ��մϴ� ���� Ǯ�̰� �� ���ٰ� �����˴ϴ�.;
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
