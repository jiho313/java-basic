package practice;

public class Demo5 {

	public static void main(String[] args) {
		// 지정된 정수의 약수와 약수의 합을 모두 출력하시오.
		int x = 12;
		int sum = 0;
		
		System.out.print("약수의 합: ");
		for (int i = 1; i <= x; i++) {
			if (x%i == 0) {
				sum += i;
				System.out.print(i);
				if (i == x) {
				break;
				}
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("약수의 합: " + sum);
	}

}
