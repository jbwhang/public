package JOB;
import java.util.Scanner;

/* 1부터 n까지의 팩토리얼 값을 재귀로 구할 때 시간복잡도를 구하는 프로그램
 * by 황승현
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
		System.out.println("주) 너무 큰값을 입력하면 올바른 결과값을 얻을 수 없습니다.");
		System.out.print("팩토리얼을 구할 값을 입력하세요(1~25): ");
		int x = input.nextInt();
		
		long time1 = System.currentTimeMillis();//지금현재시간
		facto(x);//팩토리얼  재귀호출
		long time2 = System.currentTimeMillis();//팩토리얼재귀호출 계산후현재시간
		System.out.println(facto(x));
		System.out.println(("f("+x+")일때 : "+(time2 - time1)/1000.0));//계산전후시간차이계산
	}
}