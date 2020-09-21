package �������ڴ½Ⱦ�;

import java.util.ArrayList;

/*
 * �迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
 * ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,
 * arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
 * arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
 * �迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.
 * */
public class Solution {

	// ���� �ε����� ���ڿ� ���� ������ ����Ʈ�� ��Ƴ��� ������� Ǯ� �� �ֽ��ϴ�.
	public int[] solution(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(i==0) list.add(arr[i]);
			else if(arr[i-1]!=arr[i]) list.add(arr[i]);
		}
		int[] answer= new int[list.size()];
		for(int i=0; i<answer.length;i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
