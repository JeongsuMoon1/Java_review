package org.opentutorials.javatutorials._910_conditionaloperator;

public class _2_LoginDemo {

	public static void main(String[] args) {
		
		// �������ڸ� �ռ� ��� �α��� ������ �����غ���.
		
		// if���� ��ø�ؼ� ����ϴ� ���
		String id = args[0];
		String password = args[1];
		
		if(id.equals("egoing")){
			if(password.equals("111111")){
				System.out.println("right");
			}else{
				System.out.println("wrong");
			}
		}else{
			System.out.println("wrong");
		}

	}

}
