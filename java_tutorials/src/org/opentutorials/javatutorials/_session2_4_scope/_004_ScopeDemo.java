package org.opentutorials.javatutorials._session2_4_scope;

		// 03. 다양한 유효범위

		// [예제23.4] 다른 메소드에 선언된 지역변수에 접근

public class _004_ScopeDemo {

	static void a(){
		String title = "coding everybody";
	}
	
	public static void main(String[] args) {
		
		a();
		
//		오류코드
//		System.out.println(title);   -> title이 a()메소드 안에 잇으면 main메소드 입장에서는 존재하지 않는 것과 다름이 없다.
		

		
	}

}
