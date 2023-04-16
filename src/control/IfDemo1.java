package control;

public class IfDemo1 {

	public static void main(String[] args) {
		/*
		 * if문
		 * 	조건식에 따라서 수행문의 실행여부를 결정하는 구문이다.
		 * if문의 형식
		 * 		if (조건식) {
		 * 			수행문1;
		 * 			수행문2;
		 * 		}
		 * 		* 조건식은 연산결과가 true/false인 연산식이다.
		 * 		* 수행문1과 수행문2는 조건식이 true로 판정될 때 실행되는 수행문이다.
		 */

		// 점수가 80점 이상이면 합격을 출력한다.
		// int 타입 변수 score를 생성하고, 정수 90을 대입한다.
		int score = 90;
		// score변수에 저장된 값이 80이상이면 true로 판정하고, if 블록의 수행문을 실행한다.
		if (score >= 80) {
			// 시스템의 표준 출력장치에 "합격입니다."를 출력한다.
			System.out.println("합격입니다.");
		}
		
		// 구매금액이 50만원 이상일 때 구매금액의 3%를 포인트로 지급한다.
		int orderAmount = 300000;
		if (orderAmount >= 500000) {
			int point = (int) (orderAmount*0.03);
			System.out.println(point);
			
		}
	}

}
