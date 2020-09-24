package 최대공약수와최소공배수;

/*
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 * */
public class Solution {
	//유클리드 호제법이라는 것을 인터넷에 써칭해서 풀었는데, 개념을 한번더 정리해야할 필요성이 있습니다.
	public int[] solution(int n, int m) {
	      int[] answer = new int[2];
	      int temp=1;
	      int gcd=n*m;
	      while(temp!=0){
	        temp=m%n;
	        m=n;
	        n=temp;
	      }
	      answer[0]=m;
	      answer[1]=gcd/m;
	        return answer;
	    }
	
}

/*
  다른사람풀이
     public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        int mini = 0;
        int maxi = 1;

        for(int i = 1; i<=a; i++) 
                    if(a%i==0&&b%i==0)
                        maxi = i;

                for(int i = a*b; i>0; i--)
                    if(i%a==0&&i%b==0)
                        mini = i;

        answer[0] = maxi;
        answer[1] = mini;

        return answer;
    }
 */
