import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList list ����, ����
		ArrayList<String> list = new ArrayList<String>();

		// list�� 10���� First Name ����
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
		
		// list�� ��� ���� ���
		for(String s : list) System.out.print(s+"  ");
		System.out.println();
		
		// �ټ� ��° ���� ���
		System.out.println("�ټ���° ���Ҵ� "+list.get(4));
		
		// �ټ� ��° ���� ����
		list.remove(4);
		for(String s : list) System.out.print(s+"  "); //������ ���
		System.out.println();
		
		// ������ ���� ���
		System.out.println("������ ������ "+list.size());
		
		// ������ ����-3��° ���� ���
		System.out.println("������ ����-3��° ���Ҵ� "+list.get(list.size()-3));
		
		// �ٽ� ��� ���� ���
		for(String s : list) System.out.print(s+"  ");
		System.out.println();
		
		String sKey = "Kim";
		int index = list.indexOf(sKey);
		if(index==-1)
			System.out.println("���� "+sKey+"�� �������� �ʽ��ϴ�.");
		else
			System.out.println("���� "+sKey+"��(��) "+index+"��° ��ġ�� �����մϴ�.");
	}

}
