package org.opentutorials.javatutorials._session2_4_scope;

//		[����23.12] this�� �̿��� ���������� ����

//		���� system.out.println(v);�� �� �� �����ߴµ� �� ���� m()�̶�� �޼ҵ��� �������� v�� ����ϰ�,
//		�� �ѹ��� �������� v�� ����ϰ� ���� ���

//		���� � �ν��Ͻ��� �����ߴٸ� �� �ν��Ͻ��� �ν��Ͻ� �ڽ��� �ǹ��ϴ� ���� �ٷ� this�̴�.
//		���� this�� ������ �� ��ü�� ���� ���� ��ȿ������ �ǹ��Ѵ�.

class B{
	int v = 10;
	
	void m(){
		int v = 20;
		System.out.println(v);		// ��������
		System.out.println(this.v); // ��ü�� ���� ���� ��ȿ����.
	}
}


public class _012_ScopeDemo {

	public static void main(String[] args) {
		
		B c1 = new B();
		c1.m();

	}

}
