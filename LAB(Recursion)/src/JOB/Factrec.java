package JOB;
import java.util.Scanner;

/* 1���� n������ ���丮�� ���� ��ͷ� ���� �� �ð����⵵�� ���ϴ� ���α׷�
 * by Ȳ����
 */

public class Factrec { 
	public static long facto(int num){ 
		//System.out.print(num+"/");
		if (num <= 1) 
			return num;
		else 
			return (num * facto(num - 1));
		
	}
	

	public static void main(String args[]){ 
		
		Scanner input = new Scanner(System.in);
		System.out.println("��) �ʹ� ū���� �Է��ϸ� �ùٸ� ������� ���� �� �����ϴ�.");
		System.out.print("���丮���� ���� ���� �Է��ϼ���(1~25): ");
		int x = input.nextInt();
		
		long time1 = System.currentTimeMillis();//��������ð�
		facto(x);//���丮��  ���ȣ��
		long time2 = System.currentTimeMillis();//���丮�����ȣ�� ���������ð�
		System.out.println(facto(x));
		System.out.println(("f("+x+")�϶� : "+(time2 - time1)/1000.0));//������Ľð����̰��
	}
}