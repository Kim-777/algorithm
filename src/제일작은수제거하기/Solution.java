package 제일작은수제거하기;

import java.util.*;

/*
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 * */
class Solution {
	  //ArrayList를 활용해서 풀수 있습니다.
      public int[] solution(int[] arr) {
          int[] answer = {};
          ArrayList<Integer> arr2 = new ArrayList<Integer>();
        
        if(arr.length <=1) {
            return new int[] {-1};
        }
          
          for(int i=0; i<arr.length; i++) {
              arr2.add(arr[i]);
          }
          
          // 최소값을 구해주는 Collections 메서드를 사용합니다.
          int min = Collections.min(arr2);
          
          // 인덱스를 구해서
          int index_of_min = arr2.indexOf(min);
          
          // ArrayList remove 함수로 key 값의 value를 지워줍니다.
          arr2.remove(index_of_min);
          
          
          answer = new int[arr2.size()];
          
          for(int i=0; i<arr2.size(); i++) {
              answer[i] = arr2.get(i);
          }
          
          return answer;
      }
    }
