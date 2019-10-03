import java.util.Arrays;
import java.util.LinkedList;
public class LinkedListBasic {

	public static void main(String[] args) {
		// LinkedList list2로 선언하고 생성한 후 주어진 자료로 초기화한다.  
		LinkedList<String> list2 = new LinkedList<String>(//);
				Arrays.asList("apple","strawberry","orange","banana","melon" ));
		
		/* add 메소드로 초기화 (방법)
		 * list2.add("apple");
		 * list2.add("strawberry");
		 * list2.add("orange");
		 * list2.add("banana");
		 * list2.add("melon");
		 */
		
		//for-each로 모든 원소 출력
		for(String s : list2) System.out.print(s+"  ");
		System.out.println();
		
		// 선두에 pineapple 원소 추가
		list2.add(0, "pineapple");
		//for-each로 모든 원소 출력
		for(String s : list2) System.out.print(s+"  ");
		System.out.println();
		
		// 두번째 원소 제거
		list2.remove(1);
		//for-each로 모든 원소 출력
		for(String s : list2) System.out.print(s+"  ");
		System.out.println();
		
		// 원소의 개수 출력
		System.out.println("list2의 원소 개수는 "+list2.size()+"개 입니다.");
		
		// list2 마지막에 durian 추가
		list2.add(list2.size(), "durian");
		//for-each로 모든 원소 출력
		for(String s : list2) System.out.print(s+"  ");
		System.out.println();
		
	}

}
