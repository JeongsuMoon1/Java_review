package org.opentutorials.javatutorials._session2_4_scope;


//		[����23.9] b()�޼ҵ忡�� i�� �ش��ϴ� ������ ã�� ����

//		b()�޼ҵ忡�� ���������� ���ְ� �����ϸ� ���������� ���Ǳ� ������ 5�� ��µȴٴ� ���̴�.
//		�׸��� �Ʒ��� ���� ���������� ���ְ� ������ �����غ��� b()�޼ҵ� �ȿ��� ������ �߻��Ѵ�.


public class _009_ScopeDemo {
	static int i = 5; // => �ּ�Ǯ�� ���� �ذ�
	
	static void a(){
		int i = 10;
		b();
	}
	
	static void b(){
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		
		int i = 1;
		a();
		

	}

}

//		�̷� ������ ��ȿ���� ��Ÿ���� ������ ��ȿ������� �Ѵ�.
//		b() �޼ҵ��� ��ȿ������ b()�޼ҵ��� ���� ��ȿ����, �� �ڱ��ڽ��̰ų� �ƴϸ� ���������̰ų� �� �� �ϳ����� ������ �� �ִ� ������ ������ ��ȿ�����̴�.
//		b()�޼ҵ带 ���� ȣ���ߴ����� ������ٴ� ���̴�. 

//		�ݸ� ���� b()�� ȣ���ߴµ� b()�� ȣ���� a()��� �޼ҵ尡 ���� �ִ� �������� 10�� ��µȴٸ�
//		�̰��� ������ ��ȿ������� �ϴ� ������ ���α׷��� ��Ÿ���̴�.