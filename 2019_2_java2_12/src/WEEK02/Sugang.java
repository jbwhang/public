package WEEK02;

// 수강내역을 생성하고 초기화, 출력하는 클래스
public class Sugang {
	private int gubun;
	private String subject;
	private int grade;
	private String classHour;
	
	Sugang(int gu, String su, int gr, String ch) {
		gubun = gu;
		subject = su;
		grade = gr;
		classHour = ch;
	}
	
	void write(int valGu, String valSu, int valGr, String valCh) {
		switch(valGu) {
			case 1:
				System.out.println("구     분 : 전공");
				break;
			case 2:
				System.out.println("구     분 : 교양");
				break;
			default:
				System.out.println("구     분 : 해당없음");
		}
		System.out.println("과     목 : "+valSu);
		System.out.println("학     점 : "+valGr);
		System.out.println("수업시간 : "+valCh);
		System.out.println("");
			}
	
}
