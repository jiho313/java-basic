package control;

public class IfDemo4 {

	public static void main(String[] args) {
		/*
		 *  내포된 if문
		 *  	 if블록 혹은 else 블록은 if문을 포함할 수 있다.
		 *   형식
		 *   	 if (조건식1) {
		 *   		 수행문1;
		 *   		if (조건식2) {
		 *   			수행문2;
		 *   		}
		 *   	}
		 *   	* 수행문1은 조건식1이 true로 판정되면 실행된다.
		 *   	* 수행문2는 조건식1이 true로 판정되고, 조건식2도 true로 판정되면 실행된다.
		 *   
		 *   	if (조건식1 && 조건식) {
		 *   	
		 *   			수행문1;
		 *   			수행문2;
		 *   		
		 *   	}
		 */

		// 성적이 60점 이상이면 합격이다.
		// 성적이 60점 미만이면 불합격이다.
		// 성적이 95점 이상이면 장학금 지급 대상이다.
		// 성적이 40점 미만이며 재응시 기회가 박탈됩니다.
		
		int score = 100;
		
		// 합격 여부 판정하기
		if(score >= 60) {
			System.out.println("합격입니다.");
			// 장학금 지급 여부 판정하기
			if(score >= 95) {
				System.out.println("장학금 지급 대상입니다.");
		} else {
			System.out.println("불합격입니다.");
			if(score < 40) {
				System.out.println("재응시 기회가 박탈되었습니다.");
			}
		}
		
		}
	}

}
