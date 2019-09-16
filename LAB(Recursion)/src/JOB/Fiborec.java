package JOB;

/* f(10), f(20), f(30), f(40), f(50)의 피보나치 수열을 재귀로 구할 때 시간복잡도를 구하는 프로그램
 * by 황승현
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
			long time1 = System.currentTimeMillis();//지금현재시간
			fibo(x);//피보나치수열돌리기
			long time2 = System.currentTimeMillis();//피보나치수열계산후현재시간출력 
			System.out.println(("f("+x+")일때 : "+(time2 - time1)/1000.0));//피보나치수열계산전후시간차이계산
		}
	}
}
