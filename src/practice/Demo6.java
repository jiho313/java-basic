package practice;

public class Demo6 {

	public static void main(String[] args) {
		// 구구단 출력하기
		
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단을 출력합니다.");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
			System.out.println();
		}

	}

}
