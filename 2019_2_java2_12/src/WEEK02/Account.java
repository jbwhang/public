package WEEK02;

//은행 계좌 처리를 위한 클래스
public class Account { 
	private String name;         //이름을 저장하기 위한 필드 name 선언, private
	private int balance;          //잔액을 저장하기 위한 필드 balance 선언(4byte 정수형), private
	
	//생성자 – 매개변수로 받은 값으로 이름과 잔액을 초기화- 본인작성
	Account(String n, int b) {
		name = n;
		balance = b;
	}
	//형식 매개변수로 받은 값만큼 잔액을 증가하는 메소드, 반환값 없음 - 본인작성
	void dePosit(int money){ 
		this.balance = this.balance + money;
	}

	//형식 매개변수로 받은 값만큼 잔액을 감소하는 메소드, 반환값 없음 – 본인작성
	void withDraw(int money){ 
		this.balance = this.balance - money;
	}

	//필드 balance 값을 반환하는 getBalance() 메소드, 매개변수 없음
	public int getBalance() { return balance; }

	public String toString(){ //객체 내용(이름과 잔액)을 문자열로 반환
		return (name + balance);
	}
}