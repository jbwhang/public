package WEEK02;

// ���������� �����ϰ� �ʱ�ȭ, ����ϴ� Ŭ����
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
				System.out.println("��     �� : ����");
				break;
			case 2:
				System.out.println("��     �� : ����");
				break;
			default:
				System.out.println("��     �� : �ش����");
		}
		System.out.println("��     �� : "+valSu);
		System.out.println("��     �� : "+valGr);
		System.out.println("�����ð� : "+valCh);
		System.out.println("");
			}
	
}
