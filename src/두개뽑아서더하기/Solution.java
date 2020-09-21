package �ΰ��̾Ƽ����ϱ�;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ���� �迭 numbers�� �־����ϴ�. numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ� ���� �� �ִ� ��� ���� �迭�� ������������ ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 * */
public class Solution {

	 public int[] solution(int[] numbers) {
		int[] answer = {};
		
		Set<Integer> set = new HashSet<Integer>();

		for(int i=0; i<numbers.length-1;i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		Iterator<Integer> it =set.iterator();
		
		answer = new int[set.size()];
		
		
		int i=0;
		while(it.hasNext()) {
			answer[i] = (int) it.next();
			i++;
		}
		
		Arrays.sort(answer);
		
		return answer;
	}
	 
//	    public int[] solution(int[] numbers) {
//	        int[] answer = {};
//
//	        ArrayList<Integer> list = new ArrayList<> ();
//
//	        for(int i=0; i<numbers.length-1; i++) {
//	            for(int j=i+1; j<numbers.length; j++) {
//	                int sum = numbers[i] + numbers[j];
//	                if(! list.contains(sum)) list.add(sum);
//	            }
//	        }
//
//	        Collections.sort(list);
//
//	        answer = new int[list.size()];
//
//	        for(int i=0; i<list.size(); i++) {
//	            answer[i] = list.get(i);
//	        }
//
//
//	        return answer;
//	    }
	 	
}
