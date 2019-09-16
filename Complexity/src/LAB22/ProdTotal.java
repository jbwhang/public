package LAB22;
import java.util.*;

public class ProdTotal {

	public static void main(String[] args) {

		long prod=2, x=1;
		for(int n=1000000;n<=10000000;n+=1000000) {
			// O(n)
			try {
				long start = System.currentTimeMillis();
				System.out.println(new Date());
				for(int i = 1;i<=n;i++) {
					prod =prod * x;
				}
				long end = System.currentTimeMillis();
				System.out.println(new Date());
				long diff = end - start;
				System.out.println("O("+n+")"+"일때 : "+ "Difference : " + diff);
			} catch (Exception e) {
				System.out.println("An Execption occure");
			}
			
			// O(log n)
			try {
				long start = System.currentTimeMillis();
				System.out.println(new Date());
				for(int i = 1;i<=n;i++) {
					prod =prod * prod;
				}
				long end = System.currentTimeMillis();
				System.out.println(new Date());
				long diff = end - start;
				System.out.println("O(log"+n+")"+"일때 : "+ "Difference : " + diff);
			} catch (Exception e) {
				System.out.println("An Execption occure");
			}
			prod=0;
		}
	}

}

