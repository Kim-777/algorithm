package �������;


//���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
public class Solution {
	
	//����� Ư¡�� �˰� �ִٸ� ���� Ǯ�� �ִ� �����Դϴ�.
	public int solution(int n) {
		int answer=0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) answer += i;
		}
		
		return answer;
	}
	
}
