package WEEK02;

public class Circle {
	private double radious;
	
	Circle(double r) {
		radious = r;
	}
	
	void getArea(double value) {
		System.out.println("�� ���� : " + value*value*3.14);
	}
	
	void getCircum(double value) {
		System.out.println("�� �ѷ� : " + 2*3.14*value);
	}
}
