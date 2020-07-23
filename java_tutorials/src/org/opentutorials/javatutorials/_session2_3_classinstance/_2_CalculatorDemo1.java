package org.opentutorials.javatutorials._session2_3_classinstance;

		//�������� �ش��ϴ� 3.14�� ���Ⱑ ����ϰ� �ִٰ� ����ڰ� �ʿ�� �� �� �����ϴ� ���̴�.
		// sum()�� avg()�� ��ü�� ���� �ٸ�  ����� �����ְ� �ִ�. �̴� ��ü���� �ٸ����¸� ���� �����̴�. ��, ��ü���� �ٸ� �������� ������ �ֱ� �����̴�.(���� ������ left�� right�� ���ø��� �����ϱ� ����.)
		// ������, ���� �߰��� ������(3.14)�� ��ü���� �ٸ� ���� ���� �ʿ䰡 ����. �������� ��� ��ü�� �Ȱ��� ���� ������. 
		// Ŭ���� ������ ��� �ν��Ͻ��� ������ �� �ִ�.
		
		// Calculator Ŭ������ PI�� ����

class Calculator1{
	static double PI = 3.14; // ���� Ÿ�� �տ� static�� ���̸� �ڿ� ���� ������ static�� ������ �Ǵ� ���̰�,
							 // static�� ������ �ȴٴ� ���� �� ������ Ŭ������ �Ҽ��� �ȴٶ�� ���� ���Ѵ�.
							 // �׸��� Ŭ���� �Ҽ��� �ȴٴ� ���� �ش� ������ ��� �ν��Ͻ����� �����Ѵٴ� ���� �ǹ��Ѵ�.
	int left, right;
	
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum(){
		System.out.println(this.left+this.right);
	}
	
	public void avg(){
		System.out.println((this.left+this.right)/2);
	}
	
}

public class _2_CalculatorDemo1 {

	public static void main(String[] args) {
		
		// c1.PI�� �����ϸ� 3.14�� ȭ�鿡 ��µȴ�. �ֳ��ϸ� PI���� Ŭ���� ������ ����Ǳ� ������ �� Ŭ������ ��� �ν��Ͻ��� �״�� ����ϱ� ������ Ŭ���� ������ PI�� ���� ������ ���� �ִ�.
		// c2�� ���������� ����. 
		// c1 �̳� c2ó�� �ν��Ͻ��� ���ؼ��� ���������� ������ ���� ������, Calculator.PI�� �����ϸ� �̰͵� 3.14�� ��ȯ�� ���̴�.
		
		Calculator1 c1 = new Calculator1();
		System.out.println(c1.PI);
		
		Calculator1 c2 = new Calculator1();
		System.out.println(c2.PI);
		
		System.out.println(Calculator1.PI);

	}

}


