package org.opentutorials.javatutorials._session2_4_scope;



		// 02. ��������, ��������

		// ���͸� : �� ���͸� �ȿ����� ���� �̸��� ��� ������ ���͸� �ٱ��ʿ����� ���� �̸��� ������ �ƹ��� ������ �߻����� �ʴ´�.
		//        ���͸���� ���� ���� �̸� �浹�̶�� ������ ��ȭ�ϴ� ���̴�.

public class _2_ScopeDemo {

	static void a(){
		int i = 0; // �������� -> main �޼ҵ��� for���� ������ ��ġ�� �ʴ´�.
	}
	
	public static void main(String[] args) {

		for(int i = 0; i < 5; i++){
			a();
			System.out.println(i);
		}
		

	}

}
