package WEEK02;
import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		double inRad;
		int sel;
		
		Circle obj = new Circle(0);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ��� >>> ");
		inRad = scan.nextDouble();
		System.out.print("1. ����, 2���ѷ� >> ���� : ");
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
				System.out.println("�ش�޴� ����");
		}
			
	}

}


