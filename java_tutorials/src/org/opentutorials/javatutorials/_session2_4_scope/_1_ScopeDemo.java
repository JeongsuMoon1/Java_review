package org.opentutorials.javatutorials._session2_4_scope;

// ��ȿ���� : ���� �̸��� �������� ����ϸ� �浹�� �߻��� ���� �ִٴ� ���̴�. �̷� ������ �ذ��ϱ� ���� ���� ������(scope)��� �ϴ� ��ȿ������ �����̴�.

// �̸��� ���� i������ �� ���� ����
class ScopeDemo{
	static void a(){
		int i = 0;
	}

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++){
			
			a();
			System.out.println(i);
		}

	}

}
// ���α׷��ֿ����� a()�޼ҵ� �ȿ��� ������ �����ϸ� �ش纯��(���������� i ����)�� �ش� �޼ҵ� �ȿ����� ��ȿ��, �� �ش� �޼ҵ� �ȿ����� ����� �� �ִ� ������ �ȴ�. �� ���� ������ ��ȿ����(Scope)��� �Ѵ�.