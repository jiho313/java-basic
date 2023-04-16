package control;

public class IfDemo3 {
	
	public static void main(String[] args) {
		/*
		 * if ~ else if ~ else if ~ else 문
		 * 		조건이 여러 개 일 때는 if ~ else if ~ 구문을 사용한다.
		 * 	형식
		 * 		if (조건식1) {
		 * 			수행문1;
		 * 		} else if (조건식2) {
		 * 			수행문2;
		 * 		} else if (조건식3) {
		 * 			수행문3;
		 * 		} else {
		 * 			수행문4;
		 * 		}
		 * 		* 조건식1이 true로 판정되면 수행문1을 실행하고, 제어문을 빠져나간다.
		 */
		
		// 성적이 90점 이상이면 A, 80점 이상이면 B, 70이상이면 C, 60점 이상이면 D, 그 외는 F로 한다.
		int score = 81;
		
		if (score >= 90) {
			System.out.println("A학점");
		}else if (score >= 80) {
			System.out.println("B학점");
		}else if (score >= 70) {
			System.out.println("C학점");
		}else if (score >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		// 구매 금액이 100만원 이상이면 구매금액의 5%를 포인트로 적립한다.
		// 구매 금액이 70만원 이상이면 구매금액의 2%를 포인트로 적립한다.
		// 구매 금액이 50만원 이상이면 구매금액의 1%를 포인트로 적립한다.
		// 구매 금액이 10만원 이상이면 구매금액의 0.1%를 포인트로 적립한다.
		int orderAmount = 1000000;
		double depositRate = 0;
	
		if (orderAmount >= 1_000_000) {
			depositRate = 0.05;
		} else if (orderAmount >= 700_000) {
			depositRate = 0.02;
		} else if (orderAmount >= 500_000) {
			depositRate = 0.01;
		} else if (orderAmount >= 100_000) {
			depositRate = 0.001;
		} 
		
		int point = (int)(orderAmount*depositRate);
		
		System.out.println("구매금액: "+ orderAmount + "원" );
		System.out.println("적립포인트: "+ point + "점" );

		
		
	}

}
