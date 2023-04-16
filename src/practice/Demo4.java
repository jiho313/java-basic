package practice;

public class Demo4 {

	public static void main(String[] args) {
		// 아래 두 수의 값을 서로 교환하시오.
		int x = 10;
		int y = 20;
		int temp = 0;
		
		System.out.println("x: " + x +", " + "y: " + y);
		
		temp = x;
		x=y;
		y=temp;
		System.out.println("x: " + x +", " + "y: " + y);

	}

}
