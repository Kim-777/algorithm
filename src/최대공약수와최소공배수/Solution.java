package �ִ��������ּҰ����;

/*
 * �� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������. �迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�.
 * ���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.
 * */
public class Solution {
	//��Ŭ���� ȣ�����̶�� ���� ���ͳݿ� ��Ī�ؼ� Ǯ���µ�, ������ �ѹ��� �����ؾ��� �ʿ伺�� �ֽ��ϴ�.
	public int[] solution(int n, int m) {
	      int[] answer = new int[2];
	      int temp=1;
	      int gcd=n*m;
	      while(temp!=0){
	        temp=m%n;
	        m=n;
	        n=temp;
	      }
	      answer[0]=m;
	      answer[1]=gcd/m;
	        return answer;
	    }
	
}

/*
  �ٸ����Ǯ��
     public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        int mini = 0;
        int maxi = 1;

        for(int i = 1; i<=a; i++) 
                    if(a%i==0&&b%i==0)
                        maxi = i;

                for(int i = a*b; i>0; i--)
                    if(i%a==0&&i%b==0)
                        mini = i;

        answer[0] = maxi;
        answer[1] = mini;

        return answer;
    }
 */
