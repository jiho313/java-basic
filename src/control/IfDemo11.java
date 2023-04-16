package control;

public class IfDemo11 {

	public static void main(String[] args) {
		
		// 점수가 80점 이상이면 합격을 출력한다.
		// 점수 = 명사				----> 변수
		// 80점 이상이면 = 조건			----> if문
		// 합격을 출력한다. = 수행문 	----> System.out.println();
		
		int score = 80;
		if (score >= 80 ) {
			System.out.println("합격입니다.");
		}

	}

}
