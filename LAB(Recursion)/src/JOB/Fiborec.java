package JOB;

/* f(10), f(20), f(30), f(40), f(50)�� �Ǻ���ġ ������ ��ͷ� ���� �� �ð����⵵�� ���ϴ� ���α׷�
 * by Ȳ����
 */

public class Fiborec { 
	public static int fibo(int x){ 
		//System.out.print(x+"/");
		if (x <= 1) 
			return x;
		else 
			return (fibo(x - 2) + fibo(x - 1));
		
	}
	

	public static void main(String args[]){ 
		
		for(int x = 10;x<=50;x+=10) {
			long time1 = System.currentTimeMillis();//��������ð�
			fibo(x);//�Ǻ���ġ����������
			long time2 = System.currentTimeMillis();//�Ǻ���ġ�������������ð���� 
			System.out.println(("f("+x+")�϶� : "+(time2 - time1)/1000.0));//�Ǻ���ġ����������Ľð����̰��
		}
	}
}
