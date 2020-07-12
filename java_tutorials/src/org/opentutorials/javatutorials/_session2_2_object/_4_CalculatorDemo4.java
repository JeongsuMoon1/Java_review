package org.opentutorials.javatutorials._session2_2_object;

//<연관>
//left = 10;
//right = 20;
//
//sum(left, right);
//avg(left, right);

//<반복>
//left = 20;
//right = 40;
//
//sum(left, right);
//avg(left, right);		


// 지금까지는 연관된 부분을 메소드로 묶어서 메소드화 시킴.
// 그리고 인자값으로 left, right값을 주면 이에 따라 차례대로 호출할 때마다
// 메소드 안에 있는 내용이 차근차근 실행돼서 아래의 반복되는 것까지도 실행이 될 것이다.

// 하지만, 지금부터는 좀 더 세부적인 것을 배울 것이다.
// 연관된 것들 안에서 left=10; right=20;이라는 이 데이터를 유지하면서
// 어떤 때는 sum()을 쓰고 싶고, 어떤 때는 avg()를 호출해서 그 결과를 선택적으로 가져오고 싶을 수도 있다.
// sum()과 avg()을 필요에 따라 사용하고 싶을 수도 있다는 것.
// 이를 충족시키는 것은 객체이다.

// 객체지향 기법을 이용해 개선한 예제
// -> 이 객체가 가진 left, right 값에 따라 sum()이나 avg()를 계산한 결과를 우리에게 돌려주는 것이다.

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
		
		// 우항이 실행되고 좌항에 대립이 된다.                  ** 인스턴스(구체적인 객체)라고 한다
		Calculator c1 = new Calculator(); // 1. 메소드는 앞에 new가 안붙는다. 즉, 객체를 새로 만든 것이다.
										  //    그렇게 만든 Calculator객체를 c1이라는 변수에 담았다.
										  //    c1은 Calculator라는 객체를 담을 수 있는 데이터 형식을 가진 변수여야 한다.
	
		c1.setOperands(10,20); // setOperands()라는 메소드는 연산의 대상이 될 값을 받는데, 10과 20이라는 값을 setOperands() 메소드에 인자로 전달했다.
		c1.sum(); // c1 이라는 객체에(객체가 담겨 있는 변수이기 때문이다) sum()이라는 메소드를 호출하면 어떠한 값도 입력값으로 주지 않았지만 이것의 결과는 30이 된다.
		c1.avg(); // c1객체에 avg()를 수행하면 이 결과는 15가 된다.
		
		// 실제로 이 객체가 어떤 로직을 가졌는지 살펴보는 것이, 바로 클래스라는 것을 알아보는 것이다.
		// 실제 객체의 내용을 인스턴스라고 한다.

	}

}
