package WEEK02;
import java.util.*;

// �迭ó��Ŭ������ �׽�Ʈ Ŭ����
public class DimTest {
	public static void main(String[] args) {
		int arrSize;
		int arrDigit;
		String inString;
		char df;
		
		Scanner in = new Scanner(System.in);
		Dim obj = new Dim();
		
		System.out.print("������ �迭 ũ�⸦ �Է��ϼ��� : ");
		arrSize = in.nextInt();
		
		obj.init(arrSize, 'i');
		
		System.out.print("�Ǽ��� �迭 ũ�⸦ �Է��ϼ��� : ");
		arrSize = in.nextInt();
		obj.init(arrSize, 'd');
		
		System.out.print("�� ��° �����͸� ����Ͻðڽ��ϱ�? >> ");
		arrDigit = in.nextInt();
		System.out.print("�����迭�̸� 'd', �Ǽ��迭�̸� 'f'�� �Է��ϼ��� >> ");
		inString = in.next();
		df = (char) inString.charAt(0);
		
		if(df == 'd' && obj.dsearch(arrDigit) != -1) 
			System.out.printf("%.0f", obj.dsearch(arrDigit));
		else if (df == 'f' && obj.dsearch(arrDigit) != -1.0)
			System.out.printf("%.2f", obj.dsearch(arrDigit));
		else if(df != 'd' && df != 'f') {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
		}
		else
			System.out.println("�迭 ������ �ʰ��Ͽ����ϴ�.");
	}

}
