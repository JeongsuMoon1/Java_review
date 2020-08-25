package org.opentutorials.javatutorials._session2_3_classinstance;

        // 클래스의 맴버 : 그 클래스(설계도)의 구성원이고, 인스턴스의 맴버는 인스턴스(구체적인 제품)의 구성원이라는 뜻이다.
		// 객체는 변수와 메소드의 집합이다.
		// 인스턴스안에는 해당 클레스에서 정의된 변수와 메소드가 존재한다. 바로 그러한 것들이 인스턴스의 맴버이다.

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
		
		// c1객체와 c2객체에는 둘 다 똑같이 left, right라는 변수가 들어 있지만 실제로 그 변수에 담긴 값은 다르다. 그래서 left변수와 right변수를 인스턴스의 변수라고 표현한 것이다.
		// 그 이유는 인스턴스마다 값이 다르기 때문이다. 즉, 인스턴스마다 서로 값이 다른 변수를 소유하고 있다고 생각할 수 있다.
		
		// 인스턴스가 소유한 변수만 있는것이 아닌 클래스가 소유한 변수도 있다. 클래스가 소유한 변수는 인스턴스가 소유한 변수와 다른 특징이 있다.
		
		// class : 변수, 메소드 ( 클래스의 맴버인 변수는 인스턴스마다 다른 것이 아니라 모든 인스턴스에서 공유가 된다. 
		//		   그뿐만 아니라 인스턴스를 생성하지 않고도 클래스에 직접 접근해서 해당 클래스에 속한 변수에 접근해 그 값을 사용할 수도 있다.(main 메소드 측에서 작성되는 인스턴스를 생성하지 않아도 된다는 말이다.)		
		// instance : 변수, 메소드 ( c1과 c2의 right, left는 인스턴스마다 값이 다르기 때문에 인스턴스의 소유라고 생각하면 된다. )

	}

}
