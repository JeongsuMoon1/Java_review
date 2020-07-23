package org.opentutorials.javatutorials._session2_3_classinstance;

		//원주율에 해당하는 3.14를 계산기가 기억하고 있다가 사용자가 필요로 할 때 지공하는 것이다.
		// sum()과 avg()는 객체에 따라 다른  결과를 보여주고 있다. 이는 객체마다 다른상태를 갖기 때문이다. 즉, 객체마다 다른 변수값을 가지고 있기 때문이다.(이전 수업의 left와 right를 떠올리면 이해하기 쉽다.)
		// 하지만, 새로 추가할 원주율(3.14)는 객체마다 다른 값을 가질 필요가 없다. 원주율은 모든 객체가 똑같은 값을 가진다. 
		// 클래스 변수는 모든 인스턴스가 공유할 수 있다.
		
		// Calculator 클래스에 PI를 정의

class Calculator1{
	static double PI = 3.14; // 변수 타입 앞에 static을 붙이면 뒤에 오는 변수는 static한 변수가 되는 것이고,
							 // static한 변수가 된다는 것은 이 변수가 클래스의 소속이 된다라는 것을 뜻한다.
							 // 그리고 클래스 소속이 된다는 것은 해당 변수를 모든 인스턴스에서 공유한다는 것을 의미한다.
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
		
		// c1.PI를 실행하면 3.14가 화면에 출력된다. 왜냐하면 PI값은 클래스 변수로 선언되긴 했지만 그 클래스를 모든 인스턴스가 그대로 사용하기 때문에 클래스 변수인 PI를 통해 접근할 수가 있다.
		// c2도 마찬가지로 가능. 
		// c1 이나 c2처럼 인스턴스를 통해서도 직접적으로 접근할 수도 있지만, Calculator.PI를 실행하면 이것도 3.14를 반환할 것이다.
		
		Calculator1 c1 = new Calculator1();
		System.out.println(c1.PI);
		
		Calculator1 c2 = new Calculator1();
		System.out.println(c2.PI);
		
		System.out.println(Calculator1.PI);

	}

}


