package ���������������ϱ�;

import java.util.*;

/*
 * ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. 
 * ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
 * ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
 * */
class Solution {
	  //ArrayList�� Ȱ���ؼ� Ǯ�� �ֽ��ϴ�.
      public int[] solution(int[] arr) {
          int[] answer = {};
          ArrayList<Integer> arr2 = new ArrayList<Integer>();
        
        if(arr.length <=1) {
            return new int[] {-1};
        }
          
          for(int i=0; i<arr.length; i++) {
              arr2.add(arr[i]);
          }
          
          // �ּҰ��� �����ִ� Collections �޼��带 ����մϴ�.
          int min = Collections.min(arr2);
          
          // �ε����� ���ؼ�
          int index_of_min = arr2.indexOf(min);
          
          // ArrayList remove �Լ��� key ���� value�� �����ݴϴ�.
          arr2.remove(index_of_min);
          
          
          answer = new int[arr2.size()];
          
          for(int i=0; i<arr2.size(); i++) {
              answer[i] = arr2.get(i);
          }
          
          return answer;
      }
    }
