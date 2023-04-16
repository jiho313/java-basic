package array;

public class ArrayDemo10 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * 		타입[][] 변수명 = new 타입[사이즈][사이즈];
		 * 		타입[][] 변수명 = new 타입[사이즈][];		// 두 번째 배열 표시의 사이즈 생략가능한다.
		 * 		타입[][][] 변수명 = new 타입[사이즈][사이즈][사이즈];
		 * 		* 첫 번째 사이즈는 생략할 수 없다.
		 * 
		 * 		타입[][] 변수명 = {{값, 값}, {값, 값}, {값, 값}};
		 * 		타입[][] 변수명 = {{값}, {값, 값, 값}, {값, 값}};
		 * 		* 내부 배열의 사이즈는 서로 다를 수 있다.
		 */
		
		// 2행 3열 크기의 배열 객체를 생성하기
		int[][] arr1 = new int[2][3];

		// 행의 크기 조회하기
		System.out.println("행의 크기: " + arr1.length);
		// 열의 크기 조회하기
		System.out.println("1번째 행의 배열 크기: " + arr1[0].length);
		System.out.println("2번째 행의 배열 크기: " + arr1[1].length);
		
		// 배열에 값 대입하기
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[1][0] = 40;
		arr1[1][1] = 50;
		arr1[1][2] = 60;
		
		// 3행 4열 크기의 배열객체를 생성하기
		int[][] arr2 = {
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 100, 110, 120}
		};
		// 배열의 값 출력하기
		// 다중 for문을 사용해서 다차원 배열을 반복 처리할 수 있다.
		int rowSize = arr2.length;
		for (int i = 0; i < rowSize; i++) {				// 행의 갯수만큼 반복한다.
			int columnSize = arr2[i].length;
			for (int j = 0; j <columnSize; j++) {		// 열의 갯수만큼 반복한다.
				System.out.println("arr2[" + i +"]" + "[" + j + "]> " + arr2[i][j]);
			}
		}
		
		// 열의 크기가 서로 다른 3행짜리 배열 객체 생성하기
		String[][] names = new String[3][];
		String[] teamA = {"김유신", "홍길동"};
		String[] teamB = {"강감찬"};
		String[] teamC = {"이순신", "류관순", "윤봉길", "안중근", "김구"};
		names[0] = teamA;
		names[1] = teamB;
		names[2] = teamC;
		
		// 배열의 값 출력하기
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.println("names[" + i +"]" + "[" + j + "]> " +names[i][j]);
			}
		}
		
		// 배열의 값 출력하기
		for (String[] items: names) {
			for (String item : items) {
				System.out.println(item);
			}
		}
	}

}
