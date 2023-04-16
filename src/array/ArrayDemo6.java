package array;

import util.KeyboardReader;

public class ArrayDemo6 {

	public static void main(String[] args) {
		
		// 키보드 입력으로 두 수를 입력받아서, 해당 숫자의 범위에 포함되는 모든 숫자를 저장하는 배열을 생성하고,
		// 배열에 저장된 숫자들의 총합을 출력하기
		
		KeyboardReader reader = new KeyboardReader();
		
		// 숫자를 입력받는다.
		System.out.print("첫번재 숫자 입력: ");
		int fir = reader.readInt();
		System.out.print("두번째 숫자 입력: ");
		int sec = reader.readInt();
		
		if (fir > sec) {
		int size = fir - sec + 1;
		int[] arr = new int [size];
		
		// 배열에 숫자 저장하기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + sec;
		}
		
		// 총합을 계산하기
		int total = 0;
		for (int num : arr) { // arr 배열의 length (arr배열에 저장된 인덱스) 반복하면서 인덱스를 한 번씩 꺼내고 int num변수에 담는다.
			total += num;
			System.out.print(num);
			// braek문을 이용해서 num의 값이 arr배열의 마지막 값과 같아진다면 밑에 수행문을 실행시키지 않고 반복문을 탈출하게 했다.
			if (num == arr[arr.length-1]) {
				break;
			}
			System.out.print(", ");
		}
		
		System.out.println("--- 총합을 확인하세요 ---");
		System.out.println("총합: " + total);
		} else {
		// 배열을 생성한다.
		int size = sec - fir + 1;
		int[] arr = new int [size];
		
		
		// 배열에 숫자 저장하기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + fir;
		}
		
		// 총합을 계산하기
		int total = 0;
		for (int num : arr) { // arr 배열의 length (arr배열에 저장된 인덱스) 반복하면서 인덱스를 한 번씩 꺼내고 int num변수에 담는다.
			total += num;
			System.out.print(num);
			// braek문을 이용해서 num의 값이 arr배열의 마지막 값과 같아진다면 밑에 수행문을 실행시키지 않고 반복문을 탈출하게 했다.
			if (num == arr[arr.length-1]) {
				break;
			}
			System.out.print(", ");
		}
		System.out.println();
		System.out.println("--- 총합을 확인하세요 ---");
		System.out.println("총합: " + total);
		}
		
	}

}
