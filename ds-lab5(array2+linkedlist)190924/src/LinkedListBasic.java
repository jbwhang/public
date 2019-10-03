import java.util.Arrays;
import java.util.LinkedList;
public class LinkedListBasic {

	public static void main(String[] args) {
		// LinkedList list2�� �����ϰ� ������ �� �־��� �ڷ�� �ʱ�ȭ�Ѵ�.  
		LinkedList<String> list2 = new LinkedList<String>(//);
				Arrays.asList("apple","strawberry","orange","banana","melon" ));
		
		/* add �޼ҵ�� �ʱ�ȭ (���)
		 * list2.add("apple");
		 * list2.add("strawberry");
		 * list2.add("orange");
		 * list2.add("banana");
		 * list2.add("melon");
		 */
		
		//for-each�� ��� ���� ���
		for(String s : list2) System.out.print(s+"  ");
		System.out.println();
		
		// ���ο� pineapple ���� �߰�
		list2.add(0, "pineapple");
		//for-each�� ��� ���� ���
		for(String s : list2) System.out.print(s+"  ");
		System.out.println();
		
		// �ι�° ���� ����
		list2.remove(1);
		//for-each�� ��� ���� ���
		for(String s : list2) System.out.print(s+"  ");
		System.out.println();
		
		// ������ ���� ���
		System.out.println("list2�� ���� ������ "+list2.size()+"�� �Դϴ�.");
		
		// list2 �������� durian �߰�
		list2.add(list2.size(), "durian");
		//for-each�� ��� ���� ���
		for(String s : list2) System.out.print(s+"  ");
		System.out.println();
		
	}

}
