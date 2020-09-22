package ���ڿ���������������ϱ�;

import java.util.Arrays;
import java.util.Comparator;

/*
 * ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�.
 * ���� ��� strings�� [sun, bed, car]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� u, e, a�� strings�� �����մϴ�.
 * */
public class Solution {

	  //Comparator�� �������־ sort �޼����� ������ ����־� ���� Ǯ�� �־��ϴ�.
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
	
}
