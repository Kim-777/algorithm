package ����������¼��ڹ迭;

import java.util.ArrayList;
import java.util.Arrays;


// ����Ʈ�� �̿��ؼ� ���� Ǯ �� �־��ϴ�.
public class Solution {

	public int[] solution(int[] arr, int divisor) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]%divisor==0) {
				list.add(arr[i]);
			}
		}
		
		int[] answer = new int[list.size()];
		
		for(int i=0; i<list.size() ; i++) {
			answer[i] = list.get(i);
		}
		
		if(answer.length==0) {
			answer = new int[]{-1};
			return answer;
		}
		
		Arrays.sort(answer);
		
		return answer;
	}
	
}
