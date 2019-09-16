package JOB;
import java.util.Scanner;

/* 1부터 n까지의 합울 재귀로 구하는 프로그램
 * by 황승현
 */

public class SumRecusion {
	public static long sumrec(int n) { 
		if(n == 1) return 1; 
		long result = n + sumrec(n - 1); 
		return result; 
		} 

	public static void main(String args[] ) {
		Scanner input = new Scanner(System.in);
		System.out.print("합을 구할 마지막 값을 입력하세요 : ");
		int n = input.nextInt();
		
		System.out.println(sumrec(n));
	}
}
