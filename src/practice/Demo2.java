package practice;

public class Demo2 {

	public static void main(String[] args) {
		
		// 숫자 3개 중에서 가장 큰 수 출력하기
		int x = 10;
		int y = 20;
		int z = 30;
		int max = 0;
		
		max = x;
		
		if (max < y) {
			max = y;
		}
		if (max < z) {
			max = z;
		}
		System.out.println(max);
		
		// x와 y를 비교해서 더 큰 값을 max에 저장한다.
		if (x >= y){
			max = x;
		} else {
			max = y;
		}
		
		// t와 z를 비교해서 더 큰 값을 출력시킨다.
		if (max >= z) {
			System.out.println(max);
		}else {
			System.out.println(z);
		}

	}

}
