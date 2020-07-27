package org.opentutorials.javatutorials._session2_3_classinstance;

// 타입별 비교 : 클래스 멤버, 인스턴스 멤버간의 관계를 정리

// 1. 인스턴스 메소드는 클래스 맴버에 접근할 수 있다
//	  - 인스턴스 메소드는 인스턴스에 속한 메소드로서 static이라는 키워드가 지정되지 않은 메소드이다. 인스턴스 메소드는 클래스 맴버(클래스 변수와 클래스 메소드)에 접근할 수 있다.
//      즉, 인스턴스 메소드 안에서 클래스 변수와 클래스 메소드에 접근할 수 있다는 뜻이다.

// 2. 클래스 메소드는 인스턴스 멤버에 접근할 수 없다.
//	  - 클래스라는 것은 언제나 인스턴스보다 먼저 존재한다. 왜냐하면 클래스라는 설계도를 만들고 이 설계도에 따라 만들어진 구체적인 제품인 인스턴스를 나중에 만들기 때문이다.
//      즉, 어떤 변수에 인스턴스가 담겨 있는지도차도 클래스 안에서느 알 수 없기 때문에 접근할 수 없는 것이다.
//      하지만 인스턴스 메소드의 경우 인스턴스가 생성됐다는 것은 반드시 클래스가 이미 존재한다는 의미이기 때문에 인스턴스 메소드 안에서는 클래스의 멤버인 클래스 변수와 클래스 메소드에 접근해서 사용할 수 있다는 의미가 된다.

// ex) 클래스 멤버와 인스턴스 멤버의 접근

class C1{ // 1) C1 클래스 정의(클래스 변수, 인스턴스 변수)
	static int static_variable = 1; // 클래스 변수(static fielf) 변수라는 말 대신 필드(field)라고도 한다.
	int instance_variable = 2;		// 인스턴스 변수(non_static field)
	
	static void static_static(){
		System.out.println(static_variable);
	}
	
	static void static_instance(){
		// 클래스 메소드에서 인스턴스 변수에 접근할 수 없다.
		//System.out.println(instance_variable);
	}
	
	void instance_static(){
		// 인스턴스 메소드에서는 클래스 변수에 접근할 수 있다.
		System.out.println(static_variable);
	}
	void instance_instance(){
		System.out.println(instance_variable);
	}
	
}

public class _5_ClassMemberDemo {

	public static void main(String[] args) {
		
		C1 c = new C1();
				
		// 인스턴스를 이용해 정적 메소드에 접근 -> 성공
		// 인스턴스 메소드가 정적 변수에 접근 -> 성공
		c.static_static();
		
		// 인스턴스를 이용해 정적 메소드에 접근 -> 성공
		// 정적 메소드가 인스턴스 변수에 접근 -> 실패
		c.static_instance();
		
		// 인스턴스를 이용해 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메소드가 클래스 변수에 접근 -> 성공
		c.instance_static();
		
		// 인스턴스를 이용해 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
		c.instance_instance();
		
		// 클래스를 이용해 클래스 메소드에 접근 -> 성공
		// 클래스 메소드가 클래스 변수에 접근 -> 성공
		C1.static_static();
		
		// 클래스를 이용해 클래스 메소드에 접근 -> 성공
		// 클래스 메소드가 인스턴스 변수에 접근 -> 실패
		C1.static_instance();
		
		// 클래스를 이용해 인스턴스 메소드에 접근 -> 실패
		//C1.instance_static();
		
		// 클래스를 이용해 인스턴스 메소드에 접근 -> 실패
		//C1.instance_instance();

	}

}





















