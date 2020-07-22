package org.opentutorials.javatutorials._session2_2_object;

// Calculator 클래스 

class Calculator1{ // class 키워드는 지금부터 Calculator라는 객체의 설계도를 알려주겠다는 것을 컴퓨터에 알려주는 역할이다.
				   // Calculator1은 클래스, 즉 설계도였다.
	int left, right;
	
	public void setOperands(int left, int right){
		
		// this. : c1에 담긴 Calculator1 인스턴스(상세한 객체)를 가리킨다.
		this.left = left;   // this.left는 Calculator1 클래스를 정의할 때 함께 정의한 int left, int right 변수를 가리키게 된다.
							// this는 그 인스턴스 자신을 의미한다.
		this.right = right; // 우항의 left, right에는 매개변수로 전달된 값이 들어오게 된다.
							// 이 객체 전역에서 접근할 수 있는 left변수(class Calculator 밑에 바로 정의한 int left, right)에 10이 담기게 된 것이다.
	}
	
	public void sum(){
		System.out.println(this.left+this.right); // class Calculator 바로 밑에 정의한 int left, right에 현재 10,20이 담겨져 있으니 이 값을 가져와서 계산을 수행한다.
	}
	
	public void avg(){
		System.out.println((this.left+this.right)/2);
	}
}	// 여기까지가 객체이다.(프로그램)-변수, 메소드 포함되어 있다.

public class _5_CalculatorDemo5 {

	public static void main(String[] args) {
		
		// c1 인스턴스 만들기
		Calculator1 c1 = new Calculator1(); // class Calculator1에 해당한다.
											// new를 이용해 실제 객체를 생성하기 위한 설계도가 바로 class Calculator1 안쪽에 있는 로직이다.
		c1.setOperands(10,20);
		c1.sum();
		c1.avg();
		// => 이처럼 new를 이용해 생성한 c1에 담긴 구체적인 객체라고 할 수 있는 인스턴스를 만드는 법과 구체적인 제품, 즉 인스턴스의 설계도에 해당하는 클래스를 만드는 방법을 살펴봤음.
		
		
		// 어떻게 객체를 활용할 수 있는지에 대한 코드임.
		// c2 인스턴스 만들기
		Calculator1 c2 = new Calculator1();
		c2.setOperands(20,40);
		c2.sum();
		c2.avg();
	}
	
	// c1과 c2는 현재 상태가 다른다. 각 객체에는 서로 다른 값을 가지고 있다.(30,60 등)
	
}
