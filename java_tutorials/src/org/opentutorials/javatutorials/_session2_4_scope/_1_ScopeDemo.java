package org.opentutorials.javatutorials._session2_4_scope;

// 유효범위 : 같은 이름을 누군가가 사용하면 충돌이 발생할 수도 있다는 것이다. 이런 문제를 해결하기 위한 것이 스코프(scope)라고도 하는 유효범위의 개념이다.

// 이름이 같은 i변수를 두 곳에 선언
class ScopeDemo{
	static void a(){
		int i = 0;
	}

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++){
			
			a();
			System.out.println(i);
		}

	}

}
// 프로그래밍에서는 a()메소드 안에서 변수를 선언하면 해당변수(예제에서는 i 변수)는 해당 메소드 안에서만 유효한, 즉 해당 메소드 안에서만 사용할 수 있는 변수가 된다. 이 같은 개념을 유효범위(Scope)라고 한다.