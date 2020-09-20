package ü����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ���ɽð��� ������ ���, �Ϻ� �л��� ü������ �������߽��ϴ�. ������ ���� ü������ �ִ� �л��� �̵鿡�� ü������ �����ַ� �մϴ�. �л����� ��ȣ�� ü�� ������ �Ű��� �־�, 
 * �ٷ� �չ�ȣ�� �л��̳� �ٷ� �޹�ȣ�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. 
 * ���� ���, 4�� �л��� 3�� �л��̳� 5�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. ü������ ������ ������ ���� �� ���� ������ ü������ ������ ���� �ִ��� ���� �л��� ü�������� ���� �մϴ�.
 * ��ü �л��� �� n, ü������ �������� �л����� ��ȣ�� ��� �迭 lost, ������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��, 
 * ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * */
public class Soulution {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		
		// ���� ���� �л��� ���� ���� ���մϴ�.
		int stealed = lost.length;
		//�纸 ���� �� �ִ� �л��� ���� ������ �����մϴ�.
		int restored=0;
		
		for(int i=0;i<stealed;i++) {
			for(int j=0;j<reserve.length;j++) {
				if(lost[i]==reserve[j]) {
					reserve[j] = -1;
					lost[i] =-1;
					restored++;
					break;
				}
			}
		}
		
		// ���� ���� �л��� ����ŭ ����� ������ �� �ִ� �� Ȯ�� �ϱ� ���� for���� �ۼ��մϴ�.
		for(int i=0; i<stealed; i++) {
			//������ ���� ������ �л��� �߿� �յ� ��ȣ�� �л��� ���� ���� ���� ��� ���� �����ִ� ��츦 Ȯ�� �ϱ� ���� for���� �ۼ��մϴ�.
			// �ڱ� �ڽŵ� ������ ������ ���� �����Ƿ� ���� ���� �����մϴ�.
			for(int j=0; j <reserve.length;j++) {
				if(reserve[j]-1==lost[i]||reserve[j]+1==lost[i]) {
					restored +=1;
					reserve[j] = -1;	
					break;
				}
			}
		}
		
		answer = n - stealed + restored;
		
		
		return answer;
	}
}
