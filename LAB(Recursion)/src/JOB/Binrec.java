package JOB;
import java.util.Scanner;

/* ��͸� �̿��Ͽ� ���ĵ� �迭�κ��� ã���� �ϴ� ���� ��ġ�� ã�� ����Ž�� ���α׷�
 * by Ȳ����
 */


public class Binrec {
	public static int Bin(int a[], int key, int min, int max) { 
		if (min <= max) { 
			int mid = (min + max) / 2; 
			if (key == a[mid]) return mid;
			else if (key < a[mid]) return (Bin(a, key, min, mid - 1));
			else if (key > a[mid]) return (Bin(a, key, mid + 1, max));
			else {
				return -1;
			}
		}
		return -1;
	} 
	
	public static void main(String[] args) { 		
		int A[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 }; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("ã�� ���� �Է��ϼ��� : ");
		int in = input.nextInt();
		int index = Bin(A, in, 0, A.length - 1);
		if (index < 0) {
			System.out.println("�ش�Ǵ� ���� ã�� �� ���� : " + in);
		}		
		else
			System.out.println("�迭��  index���� " + index + ", " + "ã�� ���� " + A[index]);
	}
}
