package array;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo8 {

	public static void main(String[] args) {
		// 1 ~ 100 사이의 임의의 정수를 배열에 저장한다.
		// 배열의 크기는 10이다.
		// 숫자에 3 혹은 6 혹은 9가 포함되어 있는 숫자가 몇개나 있는지 조사해서 그 수를 출력하기
		
		// 1. 난수를 제공하는 Random객체를 생성한다.
		Random random = new Random();
		
		// 2. 정수 10개를 저장하는 배열객체를 생성한다.
		int[] numbers = new int[10];
		
		// 3. 배열의 각 요소에 임의의 정수 저장하기
		for (int i = 0; i < numbers.length; i++) {
			// 1 ~ 100 사이의 임의의 정수를 획득해서 number 변수에 저장한다.
			int number = random.nextInt(100)+1;
			// 배열의 i번째 요소에 숫자를 저장한다.
			numbers[i]= number;

		}
		
		// 4. 배열에 저장된 숫자 중에서 3, 6, 9를 포함하고 있는 숫자의 갯수를 담을 변수 생성
		int count = 0;
		
		// 5. 배열의 각 요소에 저장된 숫자를 조사해서, 3, 6, 9가 포함되어 있는지 확인하고, 포함되어 있으면 count값을 1증가 시킨다.
		for (int number : numbers) {
			// 일의 자릿수 조회하기
			int num1 = number%10;
			// 십의 자릿수 조회하기
			int num2 = number/10;
			if (num1 == 3 || num1 == 6 ||num1 == 9) {
				count++;
				// continue 키워드로 일의 자릿수에서 해당 숫자가 포함됐다면 밑에 수행문을 실행하지 않고 다시 반복문을 처음부터 실행한다.
				continue;
			}
			if (num2 == 3 || num2 == 6 ||num2 == 9) {
				count++;
			}
		}
		
		// 6. count에 저장된 값을 출력한다.
		System.out.println("3, 6, 9가 포함되어 있는 숫자의 합계: " + count);
		
		// 7. 배열에 저장된 숫자를 전부 출력하기
		System.out.println(Arrays.toString(numbers));
	}

}
