package org.opentutorials.javatutorials._9_condition;

public class _5_LoginDemo {

	public static void main(String[] args) {
		
		// ������ �� ������, �׸��� ���ǹ�
		
		// ���ǹ��� ������ �̿��� ����
		// �Է��� ���� ���� �ٸ� ����� ��ȯ�ϴ� ���α׷�
		String id = args[0]; // ���������Ʈ���� �Է��ߴ� ��(�Է°�)�� ������ �κ�. �Է°��� LoginDemo�� ���޵� ��, LoginDemo�� �ڵ� �ȿ��� ����ڰ� �Է��� ���� �����ΰ��� �˾Ƴ� �� �ִ� ���� args[0];�̴�.(���Ŀ� ���� ����)
		if(id.equals("egoing")){ // id���� : ���ڿ��̴�. "egoing"�̳� "k8805"�� ���� ������Ʈ���� �Է��� ������ ��� �ִ�. id������ ���� ����ڰ� �Է��� ���� ���� �޾��� �� �ִ�. 
								 // equals() : equals() �տ� �ִ� ���� equals()�ڿ� �ִ� ��ȣ���� ���� ���ϴ� �޼ҵ��̴�. ���� ���ٸ� true, ���� �ٸ��ٸ� false�� ��ȯ�Ѵ�.
			System.out.println("right");
		}else{
			System.out.println("wrong");
		}
		
		// ���������Ʈ���� ������ ���� 
		// 1. cmd ����
		// 2. cd C:\Users\appac\git\java_review\java_tutorials\bin ��� ����
		// 3. java org.opentutorials.javatutorials.condition._5_LoginDemo ���� 
		//    * cmd���� ��ɾ� java�� �ڹ� ���ø����̼��� �����ρٴٴ� ���̰�, ���� ��δ� ��Ű�� ���̴�. 
		//      LoginDemo��� �ڹ� ���ø����̼��� ������ ���ε� ���ڰ�(�Է°�)���� � ���� �ִ��Ŀ� ���� �α����� �����ϴ� ���α׷��̴�.
		// 4. java org.opentutorials.javatutorials.condition._5_LoginDemo egoing �� �����ϸ� right���� ��ȯ�Ѵ�.
		
		// �ᱹ ������Ʈ���� �ۼ��� ���� args�� ���� �ٽ� id�� ����. ��, id�� ����ڰ� �Է��� ���̴�.
		
		// �ֿܼ��� ���۽�Ű��
		// 1. �����ư �� �ﰢ�� ������ -> Run Configuratios -> New launch configurations -> ���ο� �׸� �߰� -> Name (_5_LoginDemo input - egoing)���� �ٲ��ش�. -> program argument �� egoing�Է� �� Run ����
		
	}

}
