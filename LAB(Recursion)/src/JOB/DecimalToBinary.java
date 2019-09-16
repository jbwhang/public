package JOB;
import java.util.Scanner;

/* 10진수를 2진수로 변환하는 프로그램
 * by 황승현
 */

public class DecimalToBinary {
	static void decToBin(int num, int base) { 
		if (num>0) { 
			decToBin(num/base, base); 
			System.out.print(num%base); 
		}
}

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		System.out.print("10진수를 입력하세요 : ");
		int decNo = input.nextInt();
		
		System.out.print("십진수 " + decNo +"을(를) 이진수로 변환-> "); 
		decToBin(decNo, 2); 
		System.out.println();
	}
}
