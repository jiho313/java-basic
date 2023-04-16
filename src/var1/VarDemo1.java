package var1;

public class VarDemo1 {
	
	public static void main(String[] args) {
	
	// 국어, 영어, 수학점수와 총점, 평균, 합격여부를 저장하는 변수를 생성하기
	// 정수  정수  정수     정수  실수  불린  <--- 값의 타입을 파악한다.
	// int  int int     int double boolean  <--값을 저장하는 저장소의 타입을 파악한다.
	
	// 변수 (값의 저장소) 생성하기
	// 타입 변수명;
	
	int korScore;        // 정수를 저장하는 저장소를 메모리에 생성하고, 그 저장소의 이름을 korScore로 지정함
	int engScore;
	int mathScore;
	int totalScore;
	double average;
	boolean passed;
	
	// 변수를 초기화하기
	// 초기화는 변수(저장소)에 값을 대입(저장)하는 것이다.
	// 변수명 = 값;
	
	korScore = 100;		// 정수 100을 korScore라는 이름을 가진 저장소에 대입시킨다.
	engScore = 90;
	mathScore = 80;
	totalScore = korScore + engScore + mathScore;
	average = totalScore/3;
	passed = true;
	

	double c= 5/2.0;
	
	// 변수에 저장된 값을 사용하기
	// 변수명으로 변수에 지정된 값을 이용한다.
	
	//변수명으로 값을 출력하기
	System.out.println(korScore);   // 저장소 이름이 korScore인 저장소에 저장된 값을 가져와서 출력해라
	System.out.println(engScore);
	System.out.println(mathScore);
	System.out.println(totalScore);
	System.out.println(average);
	System.out.println(c);
	
	String s1 = "가나다";
	String s2 = "가나다";
	s2 = "다나가";
	System.out.println(s1 == s2);
	
	}
	
}
