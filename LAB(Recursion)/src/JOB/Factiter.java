package JOB;
import java.util.Scanner;

/* 1���� n������ ���丮�� ���� �ݺ������� ���� �� �ð����⵵�� ���ϴ� ���α׷�
 * by Ȳ����
 */

public class Factiter {

	public static void main(String[] args) {
		long result = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("��) �ʹ� ū���� �Է��ϸ� �ùٸ� ������� ���� �� �����ϴ�.");
		System.out.print("���丮���� ���� ���� �Է��ϼ���(1~25): ");
		int x = input.nextInt();
		
		long time1 = System.currentTimeMillis();//��������ð�
		for(int i=1;i<=x;i++) {
			result = result * i;
		}
		long time2 = System.currentTimeMillis();//���丮�� �ݺ������� ���������ð�
		System.out.println(result);
		System.out.println(("f("+x+")�϶� : "+(time2 - time1)/1000.0));//������Ľð����̰��
	}

}
