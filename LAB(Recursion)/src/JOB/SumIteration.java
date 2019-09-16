package JOB;
import java.util.Scanner;

/* 1부터 n까지의 합을 반복문으로 구하는 프로그램 
 * by 황승현 
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
		System.out.print("합을 구할 마지막 값을 입력하세요 : ");
		int n = input.nextInt();
		
		System.out.println(sumiter(n)); //결과출력 
	}
}
