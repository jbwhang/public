import java.util.Arrays;

// Array Test Program
public class ArrayTest { 
	
	// Move all zeroes to end of array
	static void pushZerosToEnd(int arr[], int n) { 
		// 채워라 
		int[] temp = new int[n];
		int cnt=0;
		int zeroPoint=-1;
		int i=0;
		
		while (i<12) {
			if(arr[i] == 0 && zeroPoint == -1) {
				zeroPoint = i;
			}
			if(arr[i] == 0 && zeroPoint != -1) {
			}
			if(arr[i] != 0 && zeroPoint != -1) {
				arr[zeroPoint] = arr[i];
				arr[i] = 0;
				i = zeroPoint;
				zeroPoint = -1;
			}
			i++;
		}
	}
	
	public static void main(String[] args) { 
		// Array.binarySearch
		int intArr[] = { 10, 20, 15, 22, 35 };
		Arrays.sort(intArr); //정렬 
		int intKey = 22;
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));

		// To compare both arrays
		int intArr1[] = { 10, 15, 22 };
		// To compare both arrays(compare 메소드) 
		System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr, intArr1));
		
		// To compare both arrays(equals 메소드) 
		System.out.println("Integer Arrays on comparison: " + Arrays.equals(intArr, intArr1));
		
		// To sort the array using normal sort
		Arrays.sort(intArr);
		// To print the elements in one line 
		System.out.println("Integer Array: " + Arrays.toString(intArr));
		
		// Sort the given matrix
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		int n = arr.length;
		
		System.out.println("Array before pushing zeros to the back: ");
		for (int i=0; i<n; i++) 
			System.out.print(arr[i]+" ");
		System.out.println();
		pushZerosToEnd(arr, n);
		System.out.println("Array after pushing zeros to the back: ");
		for (int i=0; i<n; i++) 
			System.out.print(arr[i]+" ");
	}
	
}
