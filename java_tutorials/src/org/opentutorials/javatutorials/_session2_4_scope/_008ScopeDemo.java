package org.opentutorials.javatutorials._session2_4_scope;
		
//		[예제23.8] b()메소드에서 i변수를 선언

	

public class _008ScopeDemo {
	
	static int i = 5;
	
	static void a(){
		int i = 10;
		b();
	}
	
	static void b(){
		int i = 30; // 지역변수
		System.out.println(i);
	}
	

	public static void main(String[] args) {
		
		int i = 1;
		a();
		
//		int i = 30; 바로 밑에서 사용된 i변수가 b()메소드의 유효범위에 속하기 때문에 30이 출력된다.
//		반면 b()메소드에 지역변수 i가 없다면 전역변수 i가 사용된다. b()메소드를 호출하는 과정에서
//		만들어지는 지역변수는 b() 메소드의 변수에 영향을 미치지 못한다는 뜻이다.
		
		
	}

}
