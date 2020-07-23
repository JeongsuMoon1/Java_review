package org.opentutorials.javatutorials._session2_3_classinstance;

// Calculator Ŭ������ baseŬ���� ������ ����

class Calculator2{
	static double PI = 3.14;	// Ŭ���� ����
	// Ŭ���� ������ base�� �߰��ƴ�.
	static int base = 0;		// Ŭ���� ����
	int left, right;
	
	public void setOperands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	// ���ϱ⿡ base�� ���� ���Խ�Ų��.
	public void sum(){
		System.out.println(this.left+this.right+base);
	}
	
	// ���ġ�� base�� ���� ���Խ�Ų��.
	public void avg(){
		System.out.println((this.left+this.right+base)/2);
	}
	
	
}


public class _3_CalculatorDemo3 {

	public static void main(String[] args) {
		
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10,20);
		// 30���
		c1.sum(); // base�� 0�� ���¿��� ����� �� ���̴�.
		
		Calculator2 c2 = new Calculator2();
		c2.setOperands(20,40);
		// 60���
		c2.sum(); // base�� 0�� ���¿��� ����� �� ���̴�.
		
		//Ŭ���� ���� base�� ���� 10���� �����ߴ�.
		Calculator2.base = 10;
		
		// 40���
		c1.sum();
		// 70���
		c2.sum();
		
		// PI��� ���� ������ �ְ� ��� �޼ҵ忡�� �� ���� ����ϱ� ���� �����ߴ� ���̴�. ��� PI���� ������ �־ PI�� final�̶�� �Ӽ��� �����ϸ� �� ���� � ��쿡�� ������ �� ���� �ȴ�.
		// 
		
		
		// Ŭ���� ������ ����ϴ� �뵵
		// 1. �ν��Ͻ��� ���� ������ �ʴ� ���� �ʿ��� ���.
		// 2. �ν��Ͻ��� ������ �ʿ䰡 ���� ���� Ŭ������ �����ϰ� ���� ���.
		//	     ��, Calculator.PI�� �����ϸ� 3.14�� ���� �� �ִ�. 3.14��� �������� ��� �ʹٸ� ���� new ���� ������ ���� �޸𸮸� �� ���鼭 Ŭ������ �ν��Ͻ��� ���� ���� ������ �ʿ�� ����.
		// �ν��Ͻ��� ����� ������ c.sum() c.avg()��� ������ �޼ҵ带 �̿��� �ν��Ͻ����� �ٸ��� ������ �ִ� ����, �� �ν��Ͻ����� �ٸ��� ������ �ִ� ������ ���� ���� �ٸ� ó�� ����� ��� ���ؼ��̴�.
		// 3. ���� ��������� ��� �ν��Ͻ��� �����ؾ� �ϴ� ����̴�. Calculator2 Ŭ������ �ִ� baseŬ���� �ɹ��� �����ϸ� Calculator2Ŭ������ ��� �ν��Ͻ��� ������ �� �� �ִ�.
	}

}









