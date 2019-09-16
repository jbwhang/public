package LAB22;
import java.util.Date;
import java.util.Random;

public class Sort {

	public static void main(String[] args) {
		int[] nansu = new int[100000];
		int min=0;
		int position=0;
		int tmp=0;
		int i, j;
		
		Random generator = new Random();
		for(i=0;i<=99999;i++) {
			nansu[i] = generator.nextInt(100000);
		//	System.out.print(nansu[i]+" / ");
		}
		System.out.println("");
		
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			//Selection Sort
			for(i=0;i<=99998;i++) {
				min=nansu[i];
				for(j=i+1;j<=99999;j++) {
					if(nansu[j] < min) {
						min = nansu[j];
						position = j;
					}
				}
				tmp = nansu[i];
				nansu[i] = min;
				nansu[position] = tmp;
			
			}
			long end = System.currentTimeMillis();
			System.out.println(new Date());
			long diff = end - start;
			System.out.println("Difference : " + diff);
		} catch (Exception e) {
			System.out.println("An Execption occure");
		}
		//for(i=0;i<=99999;i++) 
			//System.out.print(nansu[i]+" / ");
		
	}

}
