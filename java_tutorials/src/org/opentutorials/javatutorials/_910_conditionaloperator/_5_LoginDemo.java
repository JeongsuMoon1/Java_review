package org.opentutorials.javatutorials._910_conditionaloperator;

public class _5_LoginDemo {

	public static void main(String[] args) {
		
		// or(||)�����ڴ� ���� ���� ���ø����̼��� ����ϰ� �ϰ� ���� ��� ����Ѵ�.
		// id�� "egoing", "k8805", "sorialgi"��� ���̵� �� �ϳ��� �Է��ϰ�, �н������ "111111"�� �Է����� ��� "right"�� ��ȯ�ϵ��� �� ���̴�.
		// id�� ���� ���� �߿� �ϳ��� �ƴ� �ٸ��� �ԷµǸ� "wrong"�� ��ȯ�ϰ�, �н����嵵 "111111"�� �ƴϸ� "wrong"�� ��ȯ�� ���ٴ�.
		// ��, �� �� ���� ���� �� �ϳ��� ��߳��� "wrong"�� ����� ���̴�.
		
		// or �������� Ȱ��
		String id = args[0];
		String password = args[1];
		
		if((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi")) && password.equals("111111")){
			System.out.println("right");
		}else{
			System.out.println("wrong");
		}

	}

}
