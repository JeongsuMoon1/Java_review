package org.opentutorials.javatutorials._session2_4_scope;

		// 03. �پ��� ��ȿ����

		// [����23.4] �ٸ� �޼ҵ忡 ����� ���������� ����

public class _004_ScopeDemo {

	static void a(){
		String title = "coding everybody";
	}
	
	public static void main(String[] args) {
		
		a();
		
//		�����ڵ�
//		System.out.println(title);   -> title�� a()�޼ҵ� �ȿ� ������ main�޼ҵ� ���忡���� �������� �ʴ� �Ͱ� �ٸ��� ����.
		

		
	}

}
