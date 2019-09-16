package LAB22;
import java.util.*;

public class Prod3 {

	public static void main(String[] args) {

		long prod=1, x=1, n=1;
		for(int j=1;j<=6;j+=1) {
			try {
				long start = System.currentTimeMillis();
				System.out.println(new Date());
				for(int i = 1;i<=n;i++) {
					prod =prod * x;
				}
				long end = System.currentTimeMillis();
				System.out.println(new Date());
				long diff = end - start;
				System.out.println(n+"ÀÏ¶§ : "+ "Difference : " + diff);
			} catch (Exception e) {
				System.out.println("An Execption occure");
			}
			prod=0;
			n = n*2;
		}
	}

}
