package org.opentutorials.javatutorials._session2_5_constructor;


//		<24> �ʱ�ȭ�� ������

//		�ʱ�ȭ : � ���� �����ϱ� ���� �� ���� �ϱ� ���� �ʿ��� �غ�� ���� ���� ���Ѵ�.
//		������ : �ʱ�ȭ�� ��ü��ü���� �� �� �ְ� �����ִ� ����̴�.


//		���ݱ��� ����ؿ� Calculator������ ������ ���� ������ �����. 
//		��, Calculator Ŭ������ �ν��Ͻ��� new�� ���� ����(�ν��Ͻ�ȭ)�ؼ� c1������ ��� ���̴�.
//		�׸��� �ش� �ν��Ͻ��� setOprands(10,20)�� ȣ���� �� sum()�� avg() �޼ҵ带 ������ ���� 30�� 15��� ���� ��´�.
/*  -------------------------
 * 		Calculator c1 = new Calculator();
 * 		c1.setOperands(10,20);
 * 		c1.sum();
 * 		c1.avg();
 * 	-------------------------
 */
//		���� �ڵ�� ������ �ʿ��� �ڵ��̴�. �� ������ � Ŭ������ �ν��Ͻ��� ����� �� �ν��Ͻ��� �̿��� �հ�� ����� ������ ������ setOprands()�޼ҵ带 ���� �����ؾ� �Ѵٴ� ������ �ִٴ� ���̴�.
//		CalculatorŬ������ ������ �� �𸣸� �Ʒ��� ���� setOprands()�޼ҵ带 �������� �ʰ� sum()�� avg()�� �����ϰ� �� ���� �ִ�.
/*	-------------------------
 *  Calculator c1 = new Calculator();
 * 	c1.sum();
 *  c1.avg();
 * 	-------------------------
 */
//		CalculatorŬ������ ������ �����ϴٰ� �� ���� �ִ�. �׸��� ����ڰ� �Ǽ��� ���ɼ��� �ִٰ��� �� �� �ִ�.
//		CalculatorŬ������ ��뼺 ���鿡�� �� �� �ݵ�� left�� right��� �ν��Ͻ� ������ �����ϴ� ����� �ݵ�� ������ ���� �ʿ䰡 �ִ�.
//		�׷��ٸ� ��ü�� �����ϴ� �������� left�� right�� ���� �����ϵ��� �����ϴ� �� �ǽ�.
//		-> CalculatorŬ������ �����ϴ� �������� ���ڸ� �������� ������ ������ �߻��ϱ� ������ ����ڰ� �Ǽ��� setOprands()�޼ҵ带 �������� �ʾ��� �� �Ͼ�� ������ ���� �ʴ´�.



//		CalculatorŬ���� ���� �ȿ� Ŭ�������� �Ȱ��� �޼ҵ尡 ����� �ִ�.(�Ȱ��� �̸��̶�� ���� �߿��ϴ�)
//		�� �޼ҵ忡�� �Ű������� ���� left�� right�� ���� �ް� �� �ְ�, ���� this�� ���� ���������� ���� �����ϰ� �ִ�.
//		�� setOprands()�޼ҵ尡 �ϴ� ������ Ŭ������ �̸��� ���� Calculator�޼ҵ尡 ����ϴ� ���̴�.
//		�� ���·� ����ڰ� sum()�� ȣ���ϸ� this.left�� ���� ���������� left�� ���� ����ϰ� this.right�� ����
//		���������� right�� ���� ����ϰ� �ȴ�.

//		Calculator�޼ҵ�� �ᱹ ������(constructor)��� �Ѵ�.
//		�ڹٿ����� Calculator Ŭ������ �ν��Ͻ��� ������ �� �ڵ����� Ŭ������ �Ȱ��� �̸��� ���� �����ڰ� ȣ��ǵ��� ��ӵ� �ִ�.
//		�׸��� �����ڸ� �� � �޼ҵ庸�� ���� �����ϵ��� ��ӵ� �ִ�.
//      ���� Ŭ������ �̸��� ���� �޼ҵ带 �����ؼ� ������ ä���θ� �ش� ������ �� � �޼ҵ庸�� ���� ����ż� �ش� ��ü�� ���� ���� �ؾ� �� ��,
//		�ٽ� ���� �ʱ�ȭ �۾��� �� �� �ִٴ� ���̴�.

//		���� �������� ���캸�� CalculatorŬ�������� Calculator��� �̸��� �޼ҵ尡 �������� �ʴ´�.
//		�޼ҵ尡 �������� ������ �ڹٴ� ���������� CalculatorŬ������ �Ȱ��� �̸��� �޼ҵ带 �ڵ����� ����� �ش�.
//		������ �ڵ����� �����, ������ �츮�� ���� ���� ���� ����ϴ� ���̴�.


//		[����24.1] Ŭ������ �ν��Ͻ�ȭ�� �� ���� ����

class Calculator{
	int left, right;
	
	public Calculator(int left, int right){ 	
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

public class _001_CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(10,20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20,40);
		c2.sum();
		c2.avg();		
		
	}

}