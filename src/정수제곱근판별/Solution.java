package 정수제곱근판별;

/*
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 * */
public class Solution {

	  public long solution(long n) {
		  
	      if(n==1){
	          return 4;
	      }
	      // i의 값의 제곱이면 그 값의 1을 증가시킨 제곱 값을 반환해주는 for문을 돌립니다.
	      for(long i=2;i<n/2+1;i++){
	          if(n== i*i){
	              return (i+1)*(i+1);
	          }
	      }
	      return -1;
	  }
	
}

/*다른 사람 풀이 Math 객체의 메서드를 아직 잘 몰라서 접근하기 어렵네;
class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
  }
}
 */
