import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList list 선언, 생성
		ArrayList<String> list = new ArrayList<String>();

		// list에 10개의 First Name 삽입
		list.add("Lee");
		list.add("Park");
		list.add("Jung");
		list.add("Kim");
		list.add("Choi");
		list.add("Hwang");
		list.add("Kang");
		list.add("Na");
		list.add("Go");
		list.add("Song");
		
		// list의 모든 원소 출력
		for(String s : list) System.out.print(s+"  ");
		System.out.println();
		
		// 다섯 번째 원소 출력
		System.out.println("다섯번째 원소는 "+list.get(4));
		
		// 다섯 번째 원소 제거
		list.remove(4);
		for(String s : list) System.out.print(s+"  "); //제거후 출력
		System.out.println();
		
		// 원소의 개수 출력
		System.out.println("원소의 개수는 "+list.size());
		
		// 원소의 개수-3번째 원소 출력
		System.out.println("원소의 개수-3번째 원소는 "+list.get(list.size()-3));
		
		// 다시 모든 원소 출력
		for(String s : list) System.out.print(s+"  ");
		System.out.println();
		
		String sKey = "Kim";
		int index = list.indexOf(sKey);
		if(index==-1)
			System.out.println("원소 "+sKey+"가 존재하지 않습니다.");
		else
			System.out.println("원소 "+sKey+"이(가) "+index+"번째 위치에 존재합니다.");
	}

}
