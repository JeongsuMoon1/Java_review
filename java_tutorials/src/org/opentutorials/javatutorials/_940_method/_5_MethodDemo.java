package org.opentutorials.javatutorials._940_method;

public class _5_MethodDemo {
	
	// �޼ҵ��� �Է°�2
	// numbering() �޼ҵ忡 ���۰��� ���ᰪ�� ����
	public static void numbering(int init, int limit	){
		int i = init;
		while(i<limit){
			System.out.println(i);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		
		numbering(1,5); // numbering()�޼ҵ带 ȣ���� �� 1�� 5��� ���� �����ߴ�.
						// 1�� �Ű����� int init����, 5�� �Ű����� int limit�� ���޵ȴ�.
		System.out.println("============");
		numbering(3,5);

	}
	
	// ���� ���� ���� ��, ���� ���� �Է°��� ���� �ϰ� �ʹٸ� �޼ҵ带 ȣ���� �� ���ڰ��� ���� �� ��ġ�ϰ�, ���ڿ� ���� ���̸� �޸�(,)�� �����ϸ� �ȴ�.
	// �޼ҵ带 ������ �� ���ڸ� ���޹��� �Ű������� ���� ���� ���ڰ� ���޵� ������ ���� ��ġ�ϰ�
	// �Ű������� �Ű����� ���̿� �޸��� ���δ�. 

}
