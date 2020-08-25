package org.opentutorials.javatutorials._session2_3_classinstance;

        // Ŭ������ �ɹ� : �� Ŭ����(���赵)�� �������̰�, �ν��Ͻ��� �ɹ��� �ν��Ͻ�(��ü���� ��ǰ)�� �������̶�� ���̴�.
		// ��ü�� ������ �޼ҵ��� �����̴�.
		// �ν��Ͻ��ȿ��� �ش� Ŭ�������� ���ǵ� ������ �޼ҵ尡 �����Ѵ�. �ٷ� �׷��� �͵��� �ν��Ͻ��� �ɹ��̴�.

class Calculator{
	int left;
	int right;
	
	public void setOperands(int left, int right){
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

public class _1_Member {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOperands(10,20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOperands(20,40);
		c2.sum();
		c2.avg();
		
		// c1��ü�� c2��ü���� �� �� �Ȱ��� left, right��� ������ ��� ������ ������ �� ������ ��� ���� �ٸ���. �׷��� left������ right������ �ν��Ͻ��� ������� ǥ���� ���̴�.
		// �� ������ �ν��Ͻ����� ���� �ٸ��� �����̴�. ��, �ν��Ͻ����� ���� ���� �ٸ� ������ �����ϰ� �ִٰ� ������ �� �ִ�.
		
		// �ν��Ͻ��� ������ ������ �ִ°��� �ƴ� Ŭ������ ������ ������ �ִ�. Ŭ������ ������ ������ �ν��Ͻ��� ������ ������ �ٸ� Ư¡�� �ִ�.
		
		// class : ����, �޼ҵ� ( Ŭ������ �ɹ��� ������ �ν��Ͻ����� �ٸ� ���� �ƴ϶� ��� �ν��Ͻ����� ������ �ȴ�. 
		//		   �׻Ӹ� �ƴ϶� �ν��Ͻ��� �������� �ʰ� Ŭ������ ���� �����ؼ� �ش� Ŭ������ ���� ������ ������ �� ���� ����� ���� �ִ�.(main �޼ҵ� ������ �ۼ��Ǵ� �ν��Ͻ��� �������� �ʾƵ� �ȴٴ� ���̴�.)		
		// instance : ����, �޼ҵ� ( c1�� c2�� right, left�� �ν��Ͻ����� ���� �ٸ��� ������ �ν��Ͻ��� ������� �����ϸ� �ȴ�. )

	}

}
