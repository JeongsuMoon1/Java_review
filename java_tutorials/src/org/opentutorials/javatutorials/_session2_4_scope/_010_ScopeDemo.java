package org.opentutorials.javatutorials._session2_4_scope;


//		[����23.10] m()�޼ҵ忡�� ���������� ��� 


//		���ݱ����� Ŭ���� ������ �̿��� ���������� ����������� ������ �˾ƺ��Ҵ�
//		�̹����� �ν��Ͻ� �������� ��������
//		this Ű���忡 ���� ���� ����.

class C{
	int v = 10;
	
	void m(){
		System.out.println(v);
	}
}


public class _010_ScopeDemo {

	public static void main(String[] args) {
		
		C c1 = new C(); // 1. CŬ������ �ν��Ͻ��� c1�̶�� ������ ��Ҵ�.
		c1.m();			// 2. c1�ν��Ͻ��� �ִ� m() �޼ҵ带 ȣ���ϴµ� m()������ system.out.println(v);�� �����Ѵ�.
						//	  v�� ���������̰�, 10�� ������ ������.
		
	}

}
