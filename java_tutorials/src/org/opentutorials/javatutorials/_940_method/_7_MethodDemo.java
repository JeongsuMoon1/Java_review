package org.opentutorials.javatutorials._940_method;

public class _7_MethodDemo {

	// �޼ҵ��� ��°�2
	
	// return���� �޼ҵ尪�� �ܺη� ��ȯ�ϴ� ���� : ��ǰ���μ� �޼ҵ��� ��ġ�� ���̱� ���� ��
	
//	// �޼ҵ� �ȿ��� ����� ���
//	public static void numbering(int init, int limit){
//		int i = init;
//		while(i<limit){
//			System.out.println(i);
//			i++;	
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		numbering(1,5);
//		
//
//	}
	// ����, �޼ҵ��� ���� ����ϴ� ����� �����Ͽ��� ���(���Ϸ� ����, �̸��Ϸ� ����,.. etc)����� ����� ���, �޼ҵ忡 �̹� ��� ����� ����� �־ �� �޼ҵ� �ϳ������� �� ������� ó���� �� ���� ���̴�.
	// System.out.println(i); ó�� ȭ�鿡 ����ϴ� ����� �� �ϳ��� ������������ ���������, ��� ����� �������� ��Ÿ���� �ҷ��� ����� ���� ����. ��, numbering()�� ��ǰ���μ��� ��ġ�� �������� ���̴�.
	// ��, System.out.println(i)�� �ٱ����� ����, numbering()�޼ҵ��� ��ȯ���� ���ڷ� �����ؼ� ó��
	
	public static String numbering(int init, int limit){
		int i = init;
		// ��������� ���ڸ� output ������ ��� ����
		// ������ ��  ���� �Ҵ��Ѵ�.
		String output = "";
		while(i<limit){
			// ���ڸ� ȭ�鿡 ����ϴ� ��� output ������ ��Ҵ�.
			output += i;
			i++;
		}
		// �߿�!!! output�� ��� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ���
		// �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ���� ��ġ�ϸ� �ȴ�.
		return output;
		
	}
	
	public static void main(String[] args){
		
		// numbering �޼ҵ尡 ��ȯ�� ���� result ������ ����.
		String result = numbering(1,5);
		// result ������ ���� ȭ�鿡 ����Ѵ�.
		System.out.println(result);
		// mail(result); -> ���Ϸ� �����ϰ��� �� �� �׳� ����ϸ� �ȴ�.
		// file(result); -> ���Ϸ� �����ϰ��� �� �� �׳� ����ϸ� �ȴ�.    ��, return ��Ų �޼ҵ带 ����ϸ� ��Ȱ�뼺�� ��������.(�ϳ��� �������� ����� ������ �� �ִ�)
		
		
	}

}












