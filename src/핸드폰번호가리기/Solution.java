package �ڵ�����ȣ������;


/*���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, 
��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 * 
 * */
public class Solution {
 public String solution(String phone_number) {

	 
	 //���������� StringBuffer�� �������ݴϴ�.
	 StringBuffer sb = new StringBuffer(phone_number);
	 // ������ 4���� ����  ������ ���� �����ݴϴ�.
	 int num = phone_number.length() - 4;
	 
	 for(int i=0; i<num; i++) {
		sb.setCharAt(i, '*'); 
	 }
		 
		 String answer = new String(sb); 

	 return answer;
 }
 
}
