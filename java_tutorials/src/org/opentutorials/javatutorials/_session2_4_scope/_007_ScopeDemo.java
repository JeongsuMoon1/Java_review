package org.opentutorials.javatutorials._session2_4_scope;

//		[예제23.7] main메소드에서 i변수를 선언

public class _007_ScopeDemo {
	
	static int i = 5;
	
	static void a(){
		int i = 10;
		b();
	}
	
	static void b(){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		
		// i가 최종적으로 사용하는 값이 main안의 유효범위에 속한다면 아래와 같이 int i = 1; 이라고 했을 때 1을 출력해야 할 것이다.
		// 그런데 5가 출력되므로 이 가정은 틀림
		int i = 1;
		
		
		a();

	}

}
