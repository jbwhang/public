package JOB;
import java.util.Scanner;

/* 1���� n������ ���� �ݺ������� ���ϴ� ���α׷� 
 * by Ȳ���� 
 */

public class SumIteration {
	public static long sumiter(int n) { 
		long sum=0;
		for(int i=1;i<=n;i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� ������ ���� �Է��ϼ��� : ");
		int n = input.nextInt();
		
		System.out.println(sumiter(n)); //������ 
	}
}
