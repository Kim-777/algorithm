package ���ڿ���������������ϱ�;

import java.util.Arrays;
import java.util.Comparator;

/*
 * ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�.
 * ���� ��� strings�� [sun, bed, car]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� u, e, a�� strings�� �����մϴ�.
 * */
public class Solution {

	  //Comparator�� �������־ sort �޼����� ������ ����־� ���� Ǯ�� �ֽ��ϴ�.
	  public String[] solution(String[] strings, int n) {
	      
	      Arrays.sort(strings, new Comparator<String>() {
	          @Override
	          public int compare(String s1, String s2){
	              char c1 = s1.charAt(n);
	              char c2 = s2.charAt(n);
	              
	              if(c1 == c2){
	                  return s1.compareTo(s2);
	              } else return c1 - c2;
	          }
	      });
	      
	      return strings;
	  }
	  
	  // �ٸ� ��� Ǯ��
	  
	  /*
		import java.util.*;
		
		class Solution {
		    public String[] solution(String[] strings, int n) {
		        String[] answer = {};
		        ArrayList<String> arr = new ArrayList<>();
		        for (int i = 0; i < strings.length; i++) {
		            arr.add("" + strings[i].charAt(n) + strings[i]);
		        }
		        Collections.sort(arr);
		        answer = new String[arr.size()];
		        for (int i = 0; i < arr.size(); i++) {
		            answer[i] = arr.get(i).substring(1, arr.get(i).length());
		        }
		        return answer;
		    }
		}
	   */
	
}
