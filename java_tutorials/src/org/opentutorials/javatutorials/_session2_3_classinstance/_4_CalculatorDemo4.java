package org.opentutorials.javatutorials._session2_3_classinstance;

	// 클래스 메소드
	// Calculator3 클래스에 클래스 메소드를 정의
class Calculator3{ // 클래스 정의

	public static void sum(int left, int right){ // 1) sum()메소드에 static이라는 키워드를 지정하면 마치 클래스 변수처럼 sum()메소드는 클래스 메소드가 된다(클래스 소속의 메소드가 된다).
												 //    그래서 클래스에 소속된 메소드의 인자값으로 left와 right값을 지정하면 그 left, right값을 계산한 결과를 화면에 출력한다.
												 //    즉, static이 지정된 클래스 메소드는 static이 지정되지 않은 인스턴스 메소드와 달리 클래스를 통해 직접 접근해서 실행할 수 있다는 차이가 있다.(클래스에 직접 접근해서 실행할 수 있다.)
		System.out.println(left+right);
	}

	public static void avg(int left, int right){
		System.out.println((left+right)/2);
	}
}


public class _4_CalculatorDemo4 { // _4_CalculatorDemo4은 실행 클래스라서 이를 실행해서 프로그램을 구동하게 된다.

	public static void main(String[] args) {
		
		Calculator3.sum(10,20);
		Calculator3.avg(10,20);
		Calculator3.sum(20,40);
		Calculator3.avg(20,40);
		

	}

}

// 지금까지는 어떤 작업을 하기 위해 인스턴스를 만들었습니다. Calculator클래스를 구체화한 인스턴스를 만들어서 해당 인스턴스의 left, right 값을 setOperands()메소드를 호출해서
// 지정하고 sum(), avg() 메소드를 인자 없이 호출해 left, right 인스턴스 변수에 저장된 값을 계산한 값을 계산한 결과를 출력해 왔다.
// 하지만 이번 예제에는 인스턴스가 존재하지 않는다.
// 주목할 점은 인스턴가 등장하지 않고 '클래스.sum()', '클래스.avg()'형식으로 클래스에 직접 접근해서 sum()과 avg()메소드를 호출한다는 점이다.

// Calculator3 클래스가 어떻게 구현돼 있는지 설명 : 1)번 참조할 것.

// 왜 클래스 변수를 쓰는가? ( 이전에 살펴본 예제는 다음과 같은 식으로 코드가 동작한다)
// Calculator c1 = new Calculator();   new연산자를 통해 인스턴스를 c1변수에 담았고, setOperands()메소드에 10과 20이라는 인자를 전달해 left, right값을 각각 10과 20으로 지정하고 c1.sum()을 실행하면 30이 출력된다.
// c1.setOperands(10,20);
// c1.sum();
// 즉, 인스턴스마다 다른 상태를 가지고 있어야 하거나 여러 개의 서로 다른 상태를 가진 c1,c2,c3가 존재해야 할 필요가 있을 때, 그리고 각 인스턴스에 대한 연산을 수행했을 때 그 결과가 다르게 출력돼야 되는 경우에 인스턴스라는 것을 만든다.
// 하지만 sum()과 avg()라는 것이 꼭 같은 상태를 유지하는 것이 아니라 sum()은 더하기 연산을 수행하는 것이고 avg()는 평균연산을 수행하는 것처럼 필요할 때마다 인자를 지정해 사용하는 경우라면 각 메소드가 어떤 상태를 공유할 필요 없이 클래스만 이용해 사용하면 되고,
// 마치 일회용 물품처럼 한번만 사용해도 되는 특징이 있기 때문에 그런 경우에는 굳이 메모리를 사용하고 코드를 길게 만들면서 인스턴스를 만들 필요가 없다. 이 경우 클래스 소속 메소드를 사용하면 메모리도 절약할 수 있고 더 빠르게 동작하는 애플리케이션을 만들 수 있다.













