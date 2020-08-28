package org.opentutorials.javatutorials._session2_4_scope;

//		[����23.13] this�� �̿��� ���������� ����

class Calculator{
	static double PI = 3.14;
	
	int left, right;
	
	public void setOperands(int left, int right){ // int left, int right : �޼ҵ�ȿ����� ��ȿ�� ���������̴�.
		this.left = left;	// this. �� ���ؼ� ���������� ����
		this.right = right; // this. �� ���ؼ� ���������� ����
		
		/*
		 * public void setOperands(int _left, int _right){
		 * 		left = _left;	
		 * 		right = right;
		 * 
		 * 		-> ������ �Ȼ���� ���� : setOperands() �޼ҵ��� ��ȿ���� �ȿ��� left��� ���������� ���� ������
		 * 						 �ڹٴ� ���������� left�� �ִ��� ã�Ƽ� �ִٰ� �ϸ� �װ��� ����ϱ� �����̴�.
		 * 
		 * }
		 */
	}
	
	public void sum(){
		System.out.println(this.left+this.right);
	}
	
	public void avg(){
		System.out.println((this.left+this.right)/2);
	}
}


public class _013_ScopeDemo {

	public static void main(String[] args) {
		
		Calculator c1 =  new Calculator();
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		
		System.out.println(Calculator.PI);

	}

}
