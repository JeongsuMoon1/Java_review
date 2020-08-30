package org.opentutorials.javatutorials._session2_5_constructor;


//		<24> 초기화와 생성자

//		초기화 : 어떤 일을 시작하기 전에 그 일을 하기 위해 필요한 준비와 같은 것을 말한다.
//		생성자 : 초기화를 객체자체에서 할 수 있게 도와주는 기능이다.


//		지금까지 사용해온 Calculator예제는 다음과 같은 식으로 사용함. 
//		즉, Calculator 클래스의 인스턴스를 new를 통해 생성(인스턴스화)해서 c1변수에 담는 것이다.
//		그리고 해당 인스턴스의 setOprands(10,20)을 호출한 후 sum()과 avg() 메소드를 실행해 각각 30과 15라는 값을 얻는다.
/*  -------------------------
 * 		Calculator c1 = new Calculator();
 * 		c1.setOperands(10,20);
 * 		c1.sum();
 * 		c1.avg();
 * 	-------------------------
 */
//		위의 코드는 개선이 필요한 코드이다. 그 이유는 어떤 클래스의 인스턴스를 만들고 그 인스턴스를 이용해 합계와 평균을 내려면 언제나 setOprands()메소드를 먼저 실행해야 한다는 전제가 있다는 것이다.
//		Calculator클래스의 사용법을 잘 모르면 아래와 같이 setOprands()메소드를 실행하지 않고 sum()과 avg()를 실행하게 될 수도 있다.
/*	-------------------------
 *  Calculator c1 = new Calculator();
 * 	c1.sum();
 *  c1.avg();
 * 	-------------------------
 */
//		Calculator클래스의 사용법이 복잡하다고 할 수가 있다. 그리고 사용자가 실수할 가능성이 있다고도 할 수 있다.
//		Calculator클래스는 사용성 측면에서 볼 때 반드시 left와 right라는 인스턴스 변수를 설정하는 기능을 반드시 가지고 있을 필요가 있다.
//		그렇다면 객체를 생성하는 과정에서 left와 right의 값을 설정하도록 강제하는 것 실시.
//		-> Calculator클래스를 생성하는 절차에서 인자를 전달하지 않으면 에러가 발생하기 때문에 사용자가 실수로 setOprands()메소드를 실행하지 않았을 때 일어나는 문제는 겪지 않는다.



//		Calculator클래스 정의 안에 클래스명과 똑같은 메소드가 선언돼 있다.(똑같은 이름이라는 것이 중요하다)
//		이 메소드에서 매개변수를 통해 left와 right의 값을 받게 돼 있고, 각각 this를 통해 전역변수의 값을 설정하고 있다.
//		즉 setOprands()메소드가 하는 역할을 클래스와 이름이 같은 Calculator메소드가 담당하는 것이다.
//		이 상태로 사용자가 sum()을 호출하면 this.left에 의해 전역변수인 left의 값을 사용하고 this.right에 의해
//		전역변수인 right의 값을 사용하게 된다.

//		Calculator메소드는 결국 생성자(constructor)라고 한다.
//		자바에서는 Calculator 클래스의 인스턴스가 생성될 때 자동으로 클래스와 똑같은 이름을 가진 생성자가 호출되도록 약속돼 있다.
//		그리고 생성자를 그 어떤 메소드보다 먼저 실행하도록 약속돼 있다.
//      따라서 클래스와 이름이 같은 메소드를 정의해서 로직을 채워두면 해당 로직은 그 어떤 메소드보다 먼저 실행돼서 해당 객체가 가장 먼저 해야 할 일,
//		다시 말해 초기화 작업을 할 수 있다는 것이다.

//		이전 예제들을 살펴보면 Calculator클래스에는 Calculator라는 이름의 메소드가 존재하지 않는다.
//		메소드가 존재하지 않으면 자바는 내부적으로 Calculator클래스와 똑같은 이름의 메소드를 자동으로 만들어 준다.
//		없으면 자동으로 만들고, 있으면 우리가 직접 만든 것을 사용하는 것이다.


//		[예제24.1] 클래스를 인스턴스화할 때 값을 지정

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
