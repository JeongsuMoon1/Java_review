package org.opentutorials.javatutorials._session2_2_object;

public class _3_CalculatorDemo3 {

	// �޼ҵ带 �̿��� ���α׷��� �ۼ��ϴ� ���� �ᱹ���� �޼ҵ尡 ������ ���̰�, �� �������� �� �ٸ� ������ �߻��ȴ�.
	
	// ������ �ʿ��� ����
	
	// ��� �޼ҵ�
	public static void avg(int left, int right){
		System.out.println((left+right)/2);		
	}
	
	// �հ� �޼ҵ�
	public static void sum(int left, int right){
		System.out.println(left+right);
	}
	
	public static void main(String[] args) {
		
		int left, right;
		
		// ù��° �׷�
		left = 10;
		right = 20;
		
		sum(left, right);
		avg(left, right);
		
		// �ι�° �׷�
		left = 20;
		right = 40;
		
		sum(left, right);
		avg(left, right);
		
		// left, right�� sum(), avg()�� �Ÿ��� ���� �־����ٴ� �� : ���������ϴ� ���� ��ƴٴ� ���̴�.
		
		
		
		

	}

}
