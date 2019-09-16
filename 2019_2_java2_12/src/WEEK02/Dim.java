package WEEK02;
import java.util.Random;
import java.util.Scanner;

// �迭 ����, ������ �ʱ�ȭ, ����ϴ� Ŭ����
public class Dim {
    //�ʵ� ���� : �������� �Ǽ��� �迭 ����, private
	private int[] intVal;
	private double[] doubleVal;
	
	double generator = Math.random();
	
	void init(int size, char type) {
			//�Ű������� ���� ��������ŭ �迭�� �����Ѵ�.
    		//�Ű������� ���� ���ڰ� ��I���̸� ������ �迭, ��d���̸� �Ǽ��� �迭
			String s = type+"";
			switch (s) { 
				case "i":
					intVal = new int[size];
					System.out.println(">> ������ �迭�� ������ �ʱ�ȭ�մϴ�.");
					for(int i=0;i<size;i++) {
						intVal[i] = (int) (Math.random()*100);
					}
						System.out.println(">> �ʱ�ȭ�� ������ �迭�� ����մϴ�.");
					for(int i=0;i<size;i++) {
						System.out.print(intVal[i]+"  ");
					}
					System.out.println("");
					break;
				case "d":
					doubleVal = new double[size];
					System.out.println(">> �Ǽ��� �迭�� ������ �ʱ�ȭ�մϴ�.");
					for(int i=0;i<size;i++) {
						doubleVal[i] = Math.random();
					}
					System.out.println(">> �ʱ�ȭ�� �Ǽ��� �迭�� ����մϴ�.");
					
					for(int i=0;i<size;i++) {	
						System.out.printf("%.2f%s", doubleVal[i],"  ");
					}
						System.out.println("");					
					break;
				default:
					System.out.println("�������� �߸��Ǿ����ϴ�!!!");
					System.out.println("");
					break;
			}
	}
	
		int isearch(int digit) {
			//�Ű������� ���� ���� �ش��ϴ� ������ �迭 ���Ҹ� ��ȯ, ������ ����� -1��ȯ
			if(digit > 0 && digit < intVal.length ) 
				return(intVal[digit]);
			else
				return(-1);
		}
	
		double dsearch(int digit) {
			//�Ű������� ���� ���� �ش��ϴ� �Ǽ��� �迭 ���Ҹ� ��ȯ, ������ ����� -1.0��ȯ 	
			if(digit > 0 && digit < doubleVal.length ) 
				return(doubleVal[digit]);
			else
				return(-1.0);
		}
	
}