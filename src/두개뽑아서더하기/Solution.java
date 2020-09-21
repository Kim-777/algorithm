package 두개뽑아서더하기;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
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
