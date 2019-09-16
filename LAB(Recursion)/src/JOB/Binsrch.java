package JOB;
import java.util.Scanner;

/* 반복문으로 정렬된 배열로부터 찾고자 하는 값의 위치를 찾는 이진탐색 프로그램
 * by 황승현
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
		System.out.print("찾을 값을 입력하세요 : ");
		int in = input.nextInt();
		int index = Bin(A, in, 0, A.length - 1);
		if (index < 0) {
			System.out.println("해당되는 값을 찾을 수 없음 : " + in);
		}		
		else
			System.out.println("배열의  index값은 " + index + ", " + "찾은 값은 " + A[index]);
	}
}