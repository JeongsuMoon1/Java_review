package org.opentutorials.javatutorials._session2_4_scope;

//		[����23.7] main�޼ҵ忡�� i������ ����

public class _007_ScopeDemo {
	
	static int i = 5;
	
	static void a(){
		int i = 10;
		b();
	}
	
	static void b(){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		
		// i�� ���������� ����ϴ� ���� main���� ��ȿ������ ���Ѵٸ� �Ʒ��� ���� int i = 1; �̶�� ���� �� 1�� ����ؾ� �� ���̴�.
		// �׷��� 5�� ��µǹǷ� �� ������ Ʋ��
		int i = 1;
		
		
		a();

	}

}
