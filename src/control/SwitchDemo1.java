package control;

public class SwitchDemo1 {

	public static void main(String[] args) {
		/* 같을 때만 비교
		 *  switch문
		 *  	 switch (값) {
		 *  		case 값1:
		 *  			수행문1;
		 *  			break;
		 *  		case 값2:
		 *  			수행문2;
		 *  			break;
		 *  		case 값3:
		 *  			수행문3;
		 *  			break;
		 *  		default:
		 *  			수행문4;
		 *  	}
		 *  	* 값은 타입은 정수, 문자, 문장열, enum만 가능하다.
		 *  	* 수행문1은 값과 값1이 일치하면 실행된다.
		 *  	* 수행문2는 값과 값2가 일치하면 실행된다
		 *  	* 수행문3은 값과 값3이 일치하면 실행된다.
		 *  	* 수행문4는 값과 일치하는 case가 없을 때 실행된다.
		 *  	* break는 switch문의 실행을 중단시키고 탈출한다.
		 */

		// String 타입의 변수 grade를 생성하고 "일반"이라는 문자열 값을 대입한다.
		String grade = "골드";
		// int 타입의 변수 orderAmount를 생성하고 정수 1_000_000을 대입안다.
		int orderAmount = 1000000;
		
		// 실수 타입의 변수 depositRate를 생성하고 0을 대입한다.
		double depositRate = 0;
		// switch문을 작서하고 grade 변수에 저장된 값과 일치하는 경우를 찾아서 해당 수행문을 수행시키낟.
		switch(grade) {
		// grade의 값이 "골드"와 일치하는 경우 아래의 수행문이 실행된다.
		case "골드":
			depositRate = 0.05;
			break;
		case "실버":
			depositRate = 0.02;
			break;
		case "브론즈":
			depositRate = 0.01;
			break;
		default:
			depositRate = 0.003;
		}
		int point =(int)(orderAmount*depositRate);
		System.out.println("고객등급: " + grade);
		System.out.println("적립률: " + depositRate);
		System.out.println("구매금액: " + orderAmount);
		System.out.println("포인트: " + point);
	}
}
