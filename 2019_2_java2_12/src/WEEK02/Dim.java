package WEEK02;
import java.util.Random;
import java.util.Scanner;

// 배열 생성, 난수로 초기화, 출력하는 클래스
public class Dim {
    //필드 선언 : 정수형과 실수형 배열 선언, private
	private int[] intVal;
	private double[] doubleVal;
	
	double generator = Math.random();
	
	void init(int size, char type) {
			//매개변수로 받은 정수값만큼 배열을 생성한다.
    		//매개변수로 받은 문자가 ‘I’이면 정수형 배열, ‘d’이면 실수형 배열
			String s = type+"";
			switch (s) { 
				case "i":
					intVal = new int[size];
					System.out.println(">> 정수형 배열을 난수로 초기화합니다.");
					for(int i=0;i<size;i++) {
						intVal[i] = (int) (Math.random()*100);
					}
						System.out.println(">> 초기화된 정수형 배열을 출력합니다.");
					for(int i=0;i<size;i++) {
						System.out.print(intVal[i]+"  ");
					}
					System.out.println("");
					break;
				case "d":
					doubleVal = new double[size];
					System.out.println(">> 실수형 배열을 난수로 초기화합니다.");
					for(int i=0;i<size;i++) {
						doubleVal[i] = Math.random();
					}
					System.out.println(">> 초기화된 실수형 배열을 출력합니다.");
					
					for(int i=0;i<size;i++) {	
						System.out.printf("%.2f%s", doubleVal[i],"  ");
					}
						System.out.println("");					
					break;
				default:
					System.out.println("변수형이 잘못되었습니다!!!");
					System.out.println("");
					break;
			}
	}
	
		int isearch(int digit) {
			//매개변수로 받은 값에 해당하는 정수형 배열 원소를 반환, 범위를 벗어나면 -1반환
			if(digit > 0 && digit < intVal.length ) 
				return(intVal[digit]);
			else
				return(-1);
		}
	
		double dsearch(int digit) {
			//매개변수로 받은 값에 해당하는 실수형 배열 원소를 반환, 범위를 벗어나면 -1.0반환 	
			if(digit > 0 && digit < doubleVal.length ) 
				return(doubleVal[digit]);
			else
				return(-1.0);
		}
	
}