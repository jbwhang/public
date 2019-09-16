package WEEK02;

// 수강 클래스를 테스트하는 클래스
public class SugangTest {

	public static void main(String[] args) {
		Sugang obj = new Sugang(1, "자바", 3, "목34");
		obj.write(1, "자바", 3, "목34");
		obj.write(2, "창의코딩웹", 3, "금34");
		obj.write(3, "세미나", 1, "금12");
	}
}
