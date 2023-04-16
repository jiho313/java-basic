package var1;

public class Vardemo2 {

	public static void main(String[] args) {
		//문자
		char ch1 = 'A';      	// 문자 'A' 대입한다.
		char ch2 = 65;       	// 아스키 코드 표에서 65번째 문자를 대입한다.
		char ch3 = '\u0041'; 	//유니코드표에서 16진수 0041번째 문자를 대입한다.
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		// 문자열
		String str1 = "";
		String str2 = "abcd";
		String str3 = "안녕하세요. 반갑습니다.";
		String str4 = "\"자바\" 한방에 끝내기";
		String str5 = "c:\\app\\tools\\eclips.exe";
		String str6 = "이순신\t김유신\t강감찬\t류관순\t홍길동";
		String str7 = "학교종이 땡땡땡 어서 모이자\n 선생님이 우리를 기다리신다.";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		
		// 정수
		int num1 = 15;		// 십진수: 15 = 1*10^1 + 5*10^0
		int num2 = 015;		// 8진수: 15 = 1*8^1 + 5*8^0
		int num3 =0x15;		// 16진수: 15 = 1*16^1 + 5*16^0
		int num4 = 1_000_000;
		long num5 = 10_000_000_000l; //int 범위를 초과하는 정수는 L혹은 l을 끝에 붙인다.
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		//실수
		float f1 = 3.14f;   // 실수 리터럴은 double 타입으로 간주하기 때문에 f를 붙여서 float타입으로 처리하도록 한다.
		double f2 = 3.14;
		double f3 = 123.4;
		double f4 = 1234E-1;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		//부울
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 > 5; 	// 10은 5보다 크기 때문에 10>5 연산 결과는 true다. b3에는 true가 대입된다.
		boolean b4 = 10 == 5;	// 10 == 5에서 10은 5와 일치하지 않기 때문에 연산결과는 false다. b4에는 false가 대입된다.
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3); // true값이 출력된다.
		System.out.println(b4); // false값이 출력된다.
	}

}
