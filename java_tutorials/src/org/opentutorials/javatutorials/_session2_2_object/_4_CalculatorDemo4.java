package org.opentutorials.javatutorials._session2_2_object;

//<����>
//left = 10;
//right = 20;
//
//sum(left, right);
//avg(left, right);

//<�ݺ�>
//left = 20;
//right = 40;
//
//sum(left, right);
//avg(left, right);		


// ���ݱ����� ������ �κ��� �޼ҵ�� ��� �޼ҵ�ȭ ��Ŵ.
// �׸��� ���ڰ����� left, right���� �ָ� �̿� ���� ���ʴ�� ȣ���� ������
// �޼ҵ� �ȿ� �ִ� ������ �������� ����ż� �Ʒ��� �ݺ��Ǵ� �ͱ����� ������ �� ���̴�.

// ������, ���ݺ��ʹ� �� �� �������� ���� ��� ���̴�.
// ������ �͵� �ȿ��� left=10; right=20;�̶�� �� �����͸� �����ϸ鼭
// � ���� sum()�� ���� �Ͱ�, � ���� avg()�� ȣ���ؼ� �� ����� ���������� �������� ���� ���� �ִ�.
// sum()�� avg()�� �ʿ信 ���� ����ϰ� ���� ���� �ִٴ� ��.
// �̸� ������Ű�� ���� ��ü�̴�.

// ��ü���� ����� �̿��� ������ ����
// -> �� ��ü�� ���� left, right ���� ���� sum()�̳� avg()�� ����� ����� �츮���� �����ִ� ���̴�.

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum(){
		System.out.println(this.left + this.right);
	}
	
	public void avg(){
		System.out.println((this.left+this.right)/2);
	}
}

public class _4_CalculatorDemo4 {
	
	public static void main(String[] args) {
		
		// ������ ����ǰ� ���׿� �븳�� �ȴ�.                  ** �ν��Ͻ�(��ü���� ��ü)��� �Ѵ�
		Calculator c1 = new Calculator(); // 1. �޼ҵ�� �տ� new�� �Ⱥٴ´�. ��, ��ü�� ���� ���� ���̴�.
										  //    �׷��� ���� Calculator��ü�� c1�̶�� ������ ��Ҵ�.
										  //    c1�� Calculator��� ��ü�� ���� �� �ִ� ������ ������ ���� �������� �Ѵ�.
	
		c1.setOperands(10,20); // setOperands()��� �޼ҵ�� ������ ����� �� ���� �޴µ�, 10�� 20�̶�� ���� setOperands() �޼ҵ忡 ���ڷ� �����ߴ�.
		c1.sum(); // c1 �̶�� ��ü��(��ü�� ��� �ִ� �����̱� �����̴�) sum()�̶�� �޼ҵ带 ȣ���ϸ� ��� ���� �Է°����� ���� �ʾ����� �̰��� ����� 30�� �ȴ�.
		c1.avg(); // c1��ü�� avg()�� �����ϸ� �� ����� 15�� �ȴ�.
		
		// ������ �� ��ü�� � ������ �������� ���캸�� ����, �ٷ� Ŭ������� ���� �˾ƺ��� ���̴�.
		// ���� ��ü�� ������ �ν��Ͻ���� �Ѵ�.

	}

}
