package JOB;

/* f(10), f(20), f(30), f(40), f(50)�� �Ǻ���ġ ������ �ݺ������� ���� �� �ð����⵵�� ���ϴ� ���α׷�
 * by Ȳ����
 */

public class Fibiter {
	public static void loopFibo(int value) {
		int result = 0;
		int num1 = 0; // n-1
		int num2 = 0; // n-2

		long time1 = System.currentTimeMillis();//��������ð�
		//System.out.println(time1);
		for(int i=0; i<=value; i++) {
			if (i ==0 ) {
				num1=0;
				num2=0;
				result=0;
			} 
			else if(i==1) {
				num2=0;
				result=1;
			} 
			else {
				result = num1 + num2;
			}
			num2 = num1;
			num1 = result;
		}
		long time2 = System.currentTimeMillis();//�Ǻ���ġ�������������ð���� 
		//System.out.println(time2);
		System.out.println("f("+value+")"+"�϶� ����ð� : "+((time2 - time1)/1000.0));//�Ǻ���ġ����������Ľð����̰��
	}

	public static void main(String[] args) {
		for(int i=10;i<=50;i+=10) loopFibo(i);
		
	}	
}