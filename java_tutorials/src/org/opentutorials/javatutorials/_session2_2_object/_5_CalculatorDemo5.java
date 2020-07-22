package org.opentutorials.javatutorials._session2_2_object;

// Calculator Ŭ���� 

class Calculator1{ // class Ű����� ���ݺ��� Calculator��� ��ü�� ���赵�� �˷��ְڴٴ� ���� ��ǻ�Ϳ� �˷��ִ� �����̴�.
				   // Calculator1�� Ŭ����, �� ���赵����.
	int left, right;
	
	public void setOperands(int left, int right){
		
		// this. : c1�� ��� Calculator1 �ν��Ͻ�(���� ��ü)�� ����Ų��.
		this.left = left;   // this.left�� Calculator1 Ŭ������ ������ �� �Բ� ������ int left, int right ������ ����Ű�� �ȴ�.
							// this�� �� �ν��Ͻ� �ڽ��� �ǹ��Ѵ�.
		this.right = right; // ������ left, right���� �Ű������� ���޵� ���� ������ �ȴ�.
							// �� ��ü �������� ������ �� �ִ� left����(class Calculator �ؿ� �ٷ� ������ int left, right)�� 10�� ���� �� ���̴�.
	}
	
	public void sum(){
		System.out.println(this.left+this.right); // class Calculator �ٷ� �ؿ� ������ int left, right�� ���� 10,20�� ����� ������ �� ���� �����ͼ� ����� �����Ѵ�.
	}
	
	public void avg(){
		System.out.println((this.left+this.right)/2);
	}
}	// ��������� ��ü�̴�.(���α׷�)-����, �޼ҵ� ���ԵǾ� �ִ�.

public class _5_CalculatorDemo5 {

	public static void main(String[] args) {
		
		// c1 �ν��Ͻ� �����
		Calculator1 c1 = new Calculator1(); // class Calculator1�� �ش��Ѵ�.
											// new�� �̿��� ���� ��ü�� �����ϱ� ���� ���赵�� �ٷ� class Calculator1 ���ʿ� �ִ� �����̴�.
		c1.setOperands(10,20);
		c1.sum();
		c1.avg();
		// => ��ó�� new�� �̿��� ������ c1�� ��� ��ü���� ��ü��� �� �� �ִ� �ν��Ͻ��� ����� ���� ��ü���� ��ǰ, �� �ν��Ͻ��� ���赵�� �ش��ϴ� Ŭ������ ����� ����� �������.
		
		
		// ��� ��ü�� Ȱ���� �� �ִ����� ���� �ڵ���.
		// c2 �ν��Ͻ� �����
		Calculator1 c2 = new Calculator1();
		c2.setOperands(20,40);
		c2.sum();
		c2.avg();
	}
	
	// c1�� c2�� ���� ���°� �ٸ���. �� ��ü���� ���� �ٸ� ���� ������ �ִ�.(30,60 ��)
	
}
