package org.opentutorials.javatutorials._900_condition;

public class _6_LoginDemo {

	public static void main(String[] args) {
		
		// ���ǹ��� ��ø�ϴ� ���
		
		// �� ���� ���ǹ��� ��ø�� ����
		// if�� �ȿ��� �� �ٸ� if���� ���� �� ������ ������ ���� �� �ִٴ� ���� �̹� �ٽ� �����̴�.
		String id = args[0];         // id �Է°��� egoing�� ù��°�� �ۼ��ǰ� ���־ args[0]���� ǥ��.
		String password = args[1];   // password �Է°��� 111111�� �ι�°�� �ۼ��ǰ� ���־ args[1]���� ǥ��.
		if(id.equals("egoing")){
			if(password.equals("111111")){
				System.out.println("right");
			}else{
				System.out.println("wrong");
			}
		}else{
			System.out.println("wrong");
		}
		// * �ϳ��� if�� �ȿ� �� �ٸ� if���� ����ؼ� if���� �� �� �����ϱ⺸�ٴ� �ϳ��� if�������� �̷��� ���ǵ��� �����ؼ� ���� ������ ������ �ϳ��� ����� ���� �� �ִ�.
		//   �װ��� �� �������̰� ���� �ð��� �н��� ���̴�. 
	}

}
