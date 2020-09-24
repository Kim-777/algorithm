package �����������Ǻ�;

/*
 * ������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
 * n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
 * */
public class Solution {

	  public long solution(long n) {
		  
	      if(n==1){
	          return 4;
	      }
	      // i�� ���� �����̸� �� ���� 1�� ������Ų ���� ���� ��ȯ���ִ� for���� �����ϴ�.
	      for(long i=2;i<n/2+1;i++){
	          if(n== i*i){
	              return (i+1)*(i+1);
	          }
	      }
	      return -1;
	  }
	
}

/*�ٸ� ��� Ǯ�� Math ��ü�� �޼��带 ���� �� ���� �����ϱ� ��Ƴ�;
class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
  }
}
 */
