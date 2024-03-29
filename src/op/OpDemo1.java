package op;

public class OpDemo1 {

	public static void main(String[] args) {
		// 산술 연산자
		// + - * / %
		// 나머지 연산자의 연산결과는 0 ~ 나누는 수 -1
		int num1 = 11;
		int num2 = 4;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1*num2;
		int result4= num1/num2;
		int result5 = num1%num2;
		System.out.println(result1);	// 15
		System.out.println(result2);	// 7
		System.out.println(result3);	// 44
		System.out.println(result4);	// 2 (몫)
		System.out.println(result5);	// 3 (나머지)
		
		double num3 = 0.1;
		double num4 = 0.2;
		
		double result6 = num3 + num4;
		double result7 = num3 - num4;
		
		System.out.println(result6);	// 0.30000000000000004
		System.out.println(result7);	// -0.1
		
		double result8 = (num3*10 + num4*10)/10;	// 실수에 적절한 10^n 값을 곱해서 소숫점 부분을 없앤다음 연산을 수행한다.
		System.out.println(result8);	// 0.3
		
	}

}
