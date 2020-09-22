package 체육복;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 학생들의 번호는 체격 순으로 매겨져 있어, 
 * 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
 * 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
 * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
 * 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
 * */
public class Soulution {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		
		// 도난 당한 학생의 수를 먼저 구합니다.
		int stealed = lost.length;
		//양보 받을 수 있는 학생을 담을 변수를 선언합니다.
		int restored=0;
		
		for(int i=0;i<stealed;i++) {
			for(int j=0;j<reserve.length;j++) {
				if(lost[i]==reserve[j]) {
					reserve[j] = -1;
					lost[i] =-1;
					restored++;
					break;
				}
			}
		}
		
		// 도난 당한 학생의 수만큼 몇명을 구제할 수 있는 지 확인 하기 위해 for문을 작성합니다.
		for(int i=0; i<stealed; i++) {
			//여벌의 옷을 가져온 학생들 중에 앞뒤 번호의 학생의 옷이 도난 당한 경우 옷을 빌려주는 경우를 확인 하기 위해 for문을 작성합니다.
			// 자기 자신도 여벌을 가졌을 수도 있으므로 같은 값도 포함합니다.
			for(int j=0; j <reserve.length;j++) {
				if(reserve[j]-1==lost[i]||reserve[j]+1==lost[i]) {
					restored +=1;
					reserve[j] = -1;	
					break;
				}
			}
		}
		
		answer = n - stealed + restored;
		
		
		return answer;
	}
}
