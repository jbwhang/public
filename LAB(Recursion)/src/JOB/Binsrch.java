package JOB;
import java.util.Scanner;

/* �ݺ������� ���ĵ� �迭�κ��� ã���� �ϴ� ���� ��ġ�� ã�� ����Ž�� ���α׷�
 * by Ȳ����
 */

public class Binsrch {
	public static int Bin (int a[], int key, int min, int max) { 
		while(min <= max) {
			int mid = (min + max) / 2; 
			if (key == a[mid]) return mid;
			else if (key < a[mid]) {
				mid = mid - 1;
				max = mid;
			}
			else if (key > a[mid]) {
				mid = mid + 1;
				min = mid;
			}
			else 
				return -1;
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