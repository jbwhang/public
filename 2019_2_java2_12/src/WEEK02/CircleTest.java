package WEEK02;
import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		double inRad;
		int sel;
		
		Circle obj = new Circle(0);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 >>> ");
		inRad = scan.nextDouble();
		System.out.print("1. 넓이, 2원둘레 >> 선택 : ");
		sel = scan.nextInt();
		switch(sel)
		{
			case 1:
				obj.getArea(inRad);
				break;
			case 2:
				obj.getCircum(inRad);
				break;
			default:
				System.out.println("해당메뉴 없음");
		}
			
	}

}


