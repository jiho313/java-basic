package practice;

public class Demo3 {

	public static void main(String[] args) {
		// 아래의 세자리 숫자에 대해서 100의 자리, 10의 자리 1의 자리의 숫자를 구해서 그 숫자들의 합계를 출력하세요.
		int number =345;
		
		int h = (number/100)%10;
		int t = (number/10)%10;
		int o = number%10;
		int total = h + t + o;
		
		System.out.println("h" + h);
		System.out.println("t" + t);
		System.out.println("o" + o);
		System.out.println("total: " + total);
		System.out.println();
		
		int number2 = 12345;
		int sum = 0;

		while(number2 > 0) {
		   int digit = number2 % 10; // get the last digit
		   sum += digit; // add the digit to the sum
		   number2 /= 10; // remove the last digit from the number
		   System.out.println("Digit: " + digit);
		}

		System.out.println("Sum: " + sum);

		

	}

}
