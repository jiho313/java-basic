package op;

public class OpDemo6 {

	public static void main(String[] args) {
		// 조건 연산자
		// 조건식 ? 값1 : 값2
		// 조건식은 최종 결과가 true/false로 판정되는 식이다.
		// 값1은 조건식이 true일 때 이 연삭식의 최종 결과가 된다.
		// 값2는 조건식이 false일 때 이 연산식의 최종 결과가 된다.
		// 값1과 값2는 같은 타입의 값이어야 한다.
		
		// 점수가 60점 이상이면 "합격"을, 아니면 "불합격"이 최종 연산 결과가 된다.
		int score = 70;
		String result = score >= 60 ? "합격" : "불합격";
		System.out.println(result);
		
		//포인트 지급하기 : 구매 금액이 50만원 이상이면 구매 금액의 3%를, 그 외는 1%를 포인트로 지급한다.
		int orderAmount = 200000;
		int point = orderAmount >= 500000 ? (int)(orderAmount*0.03) : (int)(orderAmount*0.01);
		System.out.println(point);

	}

}
