package JOB;
import java.util.Scanner;

/* 10������ 2������ ��ȯ�ϴ� ���α׷�
 * by Ȳ����
 */

public class DecimalToBinary {
	static void decToBin(int num, int base) { 
		if (num>0) { 
			decToBin(num/base, base); 
			System.out.print(num%base); 
		}
}

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		System.out.print("10������ �Է��ϼ��� : ");
		int decNo = input.nextInt();
		
		System.out.print("������ " + decNo +"��(��) �������� ��ȯ-> "); 
		decToBin(decNo, 2); 
		System.out.println();
	}
}
