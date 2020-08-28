package org.opentutorials.javatutorials._session2_4_scope;

//		[예제23.13] this를 이용해 전역변수에 접근

class Calculator{
	static double PI = 3.14;
	
	int left, right;
	
	public void setOperands(int left, int right){ // int left, int right : 메소드안에서만 유효한 지역변수이다.
		this.left = left;	// this. 를 통해서 전역변수를 생성
		this.right = right; // this. 를 통해서 전역변수를 생성
		
		/*
		 * public void setOperands(int _left, int _right){
		 * 		left = _left;	
		 * 		right = right;
		 * 
		 * 		-> 문제가 안생기는 이유 : setOperands() 메소드의 유효범위 안에는 left라는 지역변수가 없기 때문에
		 * 						 자바는 전역변수의 left가 있는지 찾아서 있다고 하면 그것을 사용하기 때문이다.
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
