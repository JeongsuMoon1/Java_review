package org.opentutorials.javatutorials._session2_4_scope;

//		[����23.6] ���������� ����

public class _6_ScopeDemo {

	static int i = 5;
	
	static void a(){
		int i = 10;
		b();
	}
	
	static void b(){
		System.out.println(i); // �������� static int i = 5;�� �����
	}
	
	public static void main(String[] args) {
		
		a();

	}

}
