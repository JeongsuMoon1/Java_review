package org.opentutorials.javatutorials._session2_4_scope;
		
//		[����23.8] b()�޼ҵ忡�� i������ ����

	

public class _008ScopeDemo {
	
	static int i = 5;
	
	static void a(){
		int i = 10;
		b();
	}
	
	static void b(){
		int i = 30; // ��������
		System.out.println(i);
	}
	

	public static void main(String[] args) {
		
		int i = 1;
		a();
		
//		int i = 30; �ٷ� �ؿ��� ���� i������ b()�޼ҵ��� ��ȿ������ ���ϱ� ������ 30�� ��µȴ�.
//		�ݸ� b()�޼ҵ忡 �������� i�� ���ٸ� �������� i�� ���ȴ�. b()�޼ҵ带 ȣ���ϴ� ��������
//		��������� ���������� b() �޼ҵ��� ������ ������ ��ġ�� ���Ѵٴ� ���̴�.
		
		
	}

}
