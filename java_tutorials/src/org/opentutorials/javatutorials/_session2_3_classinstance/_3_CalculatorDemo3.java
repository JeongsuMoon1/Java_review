package org.opentutorials.javatutorials._session2_3_classinstance;

// Calculator 클래스에 base클래스 변수를 정의

class Calculator2{
	static double PI = 3.14;	// 클래스 변수
	// 클래스 변수인 base가 추가됐다.
	static int base = 0;		// 클래스 변수
	int left, right;
	
	public void setOperands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	// 더하기에 base의 값을 포함시킨다.
	public void sum(){
		System.out.println(this.left+this.right+base);
	}
	
	// 평균치에 base의 값을 포함시킨다.
	public void avg(){
		System.out.println((this.left+this.right+base)/2);
	}
	
	
}


public class _3_CalculatorDemo3 {

	public static void main(String[] args) {
		
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10,20);
		// 30출력
		c1.sum(); // base가 0인 상태에서 계산을 한 것이다.
		
		Calculator2 c2 = new Calculator2();
		c2.setOperands(20,40);
		// 60출력
		c2.sum(); // base가 0인 상태에서 계산을 한 것이다.
		
		//클래스 변수 base의 값을 10으로 저장했다.
		Calculator2.base = 10;
		
		// 40출력
		c1.sum();
		// 70출력
		c2.sum();
		
		// PI라는 값은 고정돼 있고 모든 메소드에서 그 값을 사용하기 위해 지정했던 값이다. 사실 PI값은 고정돼 있어서 PI에 final이라는 속성을 지정하면 이 값을 어떤 경우에도 수정할 수 없게 된다.
		// 
		
		
		// 클래스 변수를 사용하는 용도
		// 1. 인스턴스에 따라 변하지 않는 값이 필요한 경우.
		// 2. 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우.
		//	     즉, Calculator.PI를 실행하면 3.14를 얻을 수 있다. 3.14라는 원주율만 얻고 싶다면 굳이 new 같은 과정을 거쳐 메모리를 더 쓰면서 클래스를 인스턴스로 만들어서 값을 가져올 필요는 없다.
		// 인스턴스를 만드는 이유는 c.sum() c.avg()라는 형태의 메소드를 이용해 인스턴스마다 다르게 설정돼 있는 상태, 즉 인스턴스별로 다르게 설정돼 있는 변수의 값에 따라 다른 처리 결과를 얻기 위해서이다.
		// 3. 값의 변경사항을 모든 인스턴스가 공유해야 하는 경우이다. Calculator2 클래스에 있는 base클래스 맴버를 변경하면 Calculator2클래스의 모든 인스턴스에 영향을 줄 수 있다.
	}

}









