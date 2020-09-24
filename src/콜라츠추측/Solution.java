package 콜라츠추측;

/*
 * 1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
 * 1-1. 입력된 수가 짝수라면 2로 나눕니다. 
 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
 * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 * 예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야하는지 반환하는 함수, 
 * solution을 완성해 주세요. 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.*/
public class Solution {
	
	// 주어진 조건을 따라 while문을 설정해 풀 수 있었습니다. 자꾸 오류가 나서 확인해봤더니 int의 값을 long 변수로 변환시켜준 후 풀면 문제없이 풀렸습니다.
	// 왜 int의 값을 long으로 바꾸어주어야 하는진 잘 모르겠습니다. 추후에 공부할 예정입니다.
	public static int solution(int num) {
		int answer = 0;
		long num2 = num;
		while(num2!=1&&answer<500) {
			if(num2%2==0) {
				num2 = num2/2;
				++answer;
			} else {
				num2 = num2*3+1;
				++answer;
			}
		}
		
		if(answer==500) return -1;

		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(10));
	}

}


/* 다른 사람 풀이
 * 
 *     public int collatz(int num) {
 *   long n = (long)num;
 *   for(int i =0; i<500; i++){      
 *     if(n==1) return i;
 *     n = (n%2==0) ? n/2 : n*3+1;            
 *   }
 *   return -1;
 * }
 * */
