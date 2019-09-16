package JOB;
import java.util.Scanner;

/* 1부터 n까지의 팩토리얼 값을 반복문으로 구할 때 시간복잡도를 구하는 프로그램
 * by 황승현
 */

public class Factiter {

	public static void main(String[] args) {
		long result = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("주) 너무 큰값을 입력하면 올바른 결과값을 얻을 수 없습니다.");
		System.out.print("팩토리얼을 구할 값을 입력하세요(1~25): ");
		int x = input.nextInt();
		
		long time1 = System.currentTimeMillis();//지금현재시간
		for(int i=1;i<=x;i++) {
			result = result * i;
		}
		long time2 = System.currentTimeMillis();//팩토리얼 반복문으로 계산후현재시간
		System.out.println(result);
		System.out.println(("f("+x+")일때 : "+(time2 - time1)/1000.0));//계산전후시간차이계산
	}

}
