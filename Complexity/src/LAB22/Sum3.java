package LAB22;
import java.util.*;

public class Sum3 {

	public static void main(String[] args) {

		long sum=0;

		for(int n=1000;n<=10000;n+=1000) {
			try {
				long start = System.currentTimeMillis();
				System.out.println(new Date());
				for(int i = 1;i<=n;i++) {
					for(int j=1;j<=i;j++) {
						sum=sum + 1;
						for(int k=1;k<=j;k++) {
							sum =sum + 0;
						}
					}
				}
				long end = System.currentTimeMillis();
				System.out.println(new Date());
				long diff = end - start;
				System.out.println(n+"ÀÏ¶§ : "+ "Difference : " + diff);
			} catch (Exception e) {
				System.out.println("An Execption occure");
				}
			sum=0;
		}
	}

}