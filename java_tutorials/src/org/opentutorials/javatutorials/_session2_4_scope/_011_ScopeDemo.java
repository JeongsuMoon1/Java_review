package org.opentutorials.javatutorials._session2_4_scope;

//		[����23.11] m()�޼ҵ忡�� ���������� �̸��� ���� ���������� ����


//		���α׷� �����ϸ� ����� 20�� ��µȴ�.
//		�������� v�� 10�� ���� ������ �ִ� �����̰�, �������� v�� ���� ��������� �ش� ���������� 20�̶�� ���� ����ִ� �����ε�,
//		system.out.println(v);�� ����� �� ���������� ���������� �����ϰ� �ǰ� ���������� �켱������ �� ���Ƽ� ���������� v�� ���� ��µǱ� �����̴�.

//		������ ��ø�� ���� ������ �⺻������ v��� ������ 10�̶�� ���� ��� �޼ҵ峪 ��� �߰�ȣ �ȿ��� ���������� ����� �� �ִ� �⺻���̶�� ������ �� �ִٴ� ���̴�.
//		m()�޼ҵ忡�� v��� ���������� ������ �����ؼ� ���� �����ϸ� m()�޼ҵ� �ȿ����� v�� ���� �ٲ� �� �ִ�.
//		�׷� ��ü�����δ� v�� ���� 10���� ��Ƴ��� ���߿��� �ʿ信 ���� v�� ���� �ٸ� ���� �� �� �ִ�.
//		*�� ��� ��ü���� ���ϼ��� �� �켱������ ���ٴ� �͵� �Ϲ����� ��Ģ�̴�.(�� ��Ģ�� ���������� ���Ǵ� ����ص� ��)

class A{
	int v = 10;
	
	void m(){
		int v = 20;
		System.out.println(v);
	}
	
}


public class _011_ScopeDemo {

	public static void main(String[] args) {
		
		A c1 = new A();
		c1.m();

	}

}