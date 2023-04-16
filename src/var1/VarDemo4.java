package var1;

public class VarDemo4 {

	public static void main(String[] args) {
		// 기본형 데이터 타입의 형변환
		// 	  정수 - 실수간의 형변환을 지원한다.
		// 	  문자 - 문자간의 형변환을 지원한다.
		// 묵시적 형변환
		//		* 정밀도가 낮은 쪽에서 정밀도가 높은 쪽으로 변하는 것은 자동으로 변환이 일어난다.
		//		* 데이터 타입의 크기가 작은 쪽에서 데이터 타입의 크기가 크기가 큰 쪽으로 변하는 것은 자동으로 변환이 일어난다.
		//		예시
		//			10/4.0		 	-> 10.0/4.0				-> 연산 결과는 2.5다.
		//			double x = 10; 	-> double x = 10.0;		-> x에는 10.0이 대입된다.
		//			char x = 65;	-> char x = 'A';		-> x에는 'A'가 대입된다.
		//			int x = 'A';	-> int x = 65;			-> x에는 65가 대입된다.
		//			* int와 char는 형변환 규칙과 상관없이 상호 변환된다.
		// 명시적 형변환
		//		* 개발자가 형변환 연산자를 사용해서 형변환 의사를 명시적으로 드러내는 것
		//		예시
		//			int average = (int) 83.56; // 개발자가 형변환 의사를 드러냈기 때문에 소수점 부분의 값이 손실되지만 정수로 변환한다.
		//			(double) 10/4; 10.0/4
		
		
		double a = 10;
		char b = 65;
		int c = 'A';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		// 자바의 연산
		// 자바는 연산에 참여한 데이터 타입과 연산결과의 데이터 타입이 항상 동일하다.
		System.out.println(10/4);			// 정수/정수 = 정수
		System.out.println(10.0/4.0);		// 실수/실수 = 실수
		// 자바의 연산은 데이터 타입이 서로 다르면 같은 데이터 타입으로 변환한 다음 연산이 실행된다.
		// 데이터 타입의 변하는 방향
		//		정밀도가 낮은 쪽에서 정밀도가 높은 쪽으로(정수 -> 실수)
		//		데이터 타입의 크기가 작은 쪽에서 크기가 큰 쪽으로 (정수(4byte) -> 실수(8byte))
		System.out.println(10.0/4);			// 실수/정수 = 실수
		System.out.println(10/4.0);			// 정수/실수 = 실수
		
		
		// 명시적 형변환 예
		int x = (int) 10.3;
		int count = 3;
		int totalScore = 100 + 80 + 67;
		double average1 = totalScore/count;
		// double average1 = 247/3; 
		// double average1 = 82; 
		// double average1 = 82.0; 
		
		double average2 =(double) totalScore/count;
		// double average2 = (double) 247/3;
		// double average2 = 247.0/3;
		// double average2 = 247.0/3.0;
		// double average2 = 82.33333333333333;
		System.out.println(x);
		System.out.println(average1);
		System.out.println(average2);
	}

}
