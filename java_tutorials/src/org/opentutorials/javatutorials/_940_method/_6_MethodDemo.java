package org.opentutorials.javatutorials._940_method;

public class _6_MethodDemo {

	
		
		// �޼ҵ��� ��°� 1
		// �޼ҵ��� ����� return(�����ش�)�� ����Ǿ� �ִ�.
		// �޼ҵ尡(ó�� �޼ҵ尡 ���ǵ� ��) �Է°��� �޾� �����ؼ�(�޼ҵ� ������ {}���̸� �������� ��.) �� ����� �޼ҵ� ������(�޼ҵ带 ȣ���� ������)�����شٴ� ���信�� return�̶�� ���� ����Ѵ�.
		
		// return���� �̿��� �޼ҵ� ȣ�� ����� ��ȯ
		
		// **** �ڵ� �д� ��� : �޼ҵ带 �̾��ϰ� �ʹٸ� �޼ҵ��� ���� �κ��� ���� ���� �ʹ� �����ϴ�.
		// ��� �޼ҵ带 ��� ����ϰ� �޼ҵ��� �Է°��� �����̰� �޼ҵ��� ��°��� �����ΰ��� ���� �ش� �޼ҵ尡 � �뵵�̰� ��� �����ϴ��� ������ �� �ִ�.
		// �� ���� �޼ҵ��� ���Ǻθ� ���°��� ��ü���� �ƶ��� �����ϴµ� ������ �ȴ�.
	
	public static String numbering(int init, int limit){ // ** �޼ҵ� ���Ǻ�
		int i = init;
		// ��������� ���ڸ� output�̶�� ������ ��� ����
		// ������ �� ���� �־���.(�ƹ��� ���� ���� �� ���ڿ��� ���� ���¿��� �����Ѵ�.)
		String output ="";
		while(i<limit){
			// ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
			output += i; // += : output������ i�� ���� ����ؼ� ������ �ٰ� �ȴ�. output = output+i; �� ���� �ǹ��̴�.
			i++;
		}
		// �߿�!!! output�� ��� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ���
		// �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ���� ��ġ�ϸ� �ȴ�.
		// �ڹٴ� return�� ������ �������̴� �޼ҵ带 �����Ų��.(�ڿ� ���� �־ ������ �����)
		// return �ڿ� ���� ���� �޼ҵ��� ��°����� �ܺο� ��ȯ�Ѵ�.
		return output; 
	}
	
	
	public static void main(String[] args) {	// ** �޼ҵ� ��º�
		// numbering �޼ҵ忡�� ����(return)�� ���� result(���ڿ�Ÿ��) ������ ����.
		String result = numbering(1,5);
		// result ������ ���� ȭ�鿡 ����Ѵ�.
		System.out.println(result);
		
	}
	
	// public static String numbering(int init, int limit){
	//	
	// String : numbering() �޼ҵ尡 ��ȯ�� ���� �ݵ�� ���ڿ��̶�� ���� �ǹ�.
	//			-> String a : a��� ������ �ݵ�� ���ڿ��� ��� �������� ���������� �����Ѵ� ���̴�.
	// 			-> �׷��Ƿ� numbering()�޼ҵ尡 ��ȯ�� ���� �޴� result������ �ݵ�� String ������ �����̳ʿ��� �Ѵ�.
	// }
	
	// public static void numbering(int init, int limit){
	//	
	// void(��:�� ����, ����, ���㰨, ȿ���� ����) : �޼ҵ� �̸� �տ� void�� ������ �� �޼ҵ�� ��ȯ���� ���ٴ� ���� ���������� ������ ���̴�.
	// 		  	                                                               �׷��Ƿ� �޼ҵ带 ȣ���� �� ���ݱ��� return�̶�� ���� ������� �ʾҴ� ���̴�.
	//
	// }
	
	
	

}