package WEEK02;
import java.util.*;

// 배열처리클래스의 테스트 클래스
public class DimTest {
	public static void main(String[] args) {
		int arrSize;
		int arrDigit;
		String inString;
		char df;
		
		Scanner in = new Scanner(System.in);
		Dim obj = new Dim();
		
		System.out.print("정수형 배열 크기를 입력하세요 : ");
		arrSize = in.nextInt();
		
		obj.init(arrSize, 'i');
		
		System.out.print("실수형 배열 크기를 입력하세요 : ");
		arrSize = in.nextInt();
		obj.init(arrSize, 'd');
		
		System.out.print("몇 번째 데이터를 출력하시겠습니까? >> ");
		arrDigit = in.nextInt();
		System.out.print("정수배열이면 'd', 실수배열이면 'f'를 입력하세요 >> ");
		inString = in.next();
		df = (char) inString.charAt(0);
		
		if(df == 'd' && obj.dsearch(arrDigit) != -1) 
			System.out.printf("%.0f", obj.dsearch(arrDigit));
		else if (df == 'f' && obj.dsearch(arrDigit) != -1.0)
			System.out.printf("%.2f", obj.dsearch(arrDigit));
		else if(df != 'd' && df != 'f') {
			System.out.println("잘못 입력하였습니다.");
			System.out.println("프로그램을 종료합니다.");
		}
		else
			System.out.println("배열 범위를 초과하였습니다.");
	}

}
