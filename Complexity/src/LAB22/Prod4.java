package LAB22;
import java.util.*;

public class Prod4 {

	public static void main(String[] args) {

		long prod=2, x=1;
		for(int n=1;n<=6;n+=1) {
			try {
				long start = System.currentTimeMillis();
				System.out.println(new Date());
				for(int i = 1;i<=n;i++) {
					prod =prod * prod;
				}
				long end = System.currentTimeMillis();
				System.out.println(new Date());
				long diff = end - start;
				System.out.println(n+"ÀÏ¶§ : "+ "Difference : " + diff);
			} catch (Exception e) {
				System.out.println("An Execption occure");
			}
			prod=0;
		}
	}

}
