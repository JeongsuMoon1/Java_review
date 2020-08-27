package org.opentutorials.javatutorials._session2_4_scope;

//		[예제23.6] 전역변수에 접근

public class _6_ScopeDemo {

	static int i = 5;
	
	static void a(){
		int i = 10;
		b();
	}
	
	static void b(){
		System.out.println(i); // 전역변수 static int i = 5;를 사용함
	}
	
	public static void main(String[] args) {
		
		a();

	}

}
