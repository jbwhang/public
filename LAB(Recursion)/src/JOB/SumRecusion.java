package JOB;
import java.util.Scanner;

/* 1���� n������ �տ� ��ͷ� ���ϴ� ���α׷�
 * by Ȳ����
 */

public class SumRecusion {
	public static long sumrec(int n) { 
		if(n == 1) return 1; 
		long result = n + sumrec(n - 1); 
		return result; 
		} 

	public static void main(String args[] ) {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� ������ ���� �Է��ϼ��� : ");
		int n = input.nextInt();
		
		System.out.println(sumrec(n));
	}
}
