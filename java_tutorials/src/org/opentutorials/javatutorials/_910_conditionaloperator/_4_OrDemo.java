package org.opentutorials.javatutorials._910_conditionaloperator;

public class _4_OrDemo {

	public static void main(String[] args) {
		
		// or ������
		if(true || true){ // ���� �Ǵ� ��� : ��
			System.out.println(1);
		}
		
		if(true || false){ // ���� �Ǵ� ��� : ��
			System.out.println(2);
		}
		
		if(false || true){ // ���� �Ǵ� ��� : ��
			System.out.println(3);
		}
		
		if(false || false){ // ���� �Ǵ� ��� : ����
			System.out.println(4);
		}
		
		

	}

}
