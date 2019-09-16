package WEEK02;

//Account 클래스에 대한 객체를 생성하고 테스트 하는 클래스
public class AccountTest {
	public static void main(String[] args) {
		Account obj = new Account("",10000); //Account 클래스 객체 obj 선언 & 생성 – 본인작성
	
	 //dePosit()메소드 호출, 10000을 매개변수로 전달- 본인작성
     obj.dePosit(10000);
     
	 System.out.println("입금 후 잔액 : " + obj.getBalance());
	 //withDraw() 메소드 호출, 5000을 매개변수로 전달- 본인작성
     obj.withDraw(5000);                                                           
	 System.out.println("출금 후 잔액 : " + obj.getBalance());
	 System.out.println(obj); //객체 내용 출력
	 
	 Account obj2 = new Account("황승현", 20000000);
	 
	 System.out.println(obj2);
	}
}

