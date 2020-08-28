package org.opentutorials.javatutorials._session2_4_scope;

//		[예제23.12] this를 이용해 전역변수에 접근

//		만약 system.out.println(v);를 두 번 실행했는데 한 번은 m()이라는 메소드의 지역변수 v를 출력하고,
//		또 한번은 전역변수 v를 출력하고 싶은 경우

//		만약 어떤 인스턴스를 생성했다면 그 인스턴스의 인스턴스 자신을 의미하는 값이 바로 this이다.
//		따라서 this가 붙으면 그 객체에 대한 전역 유효범위를 의미한다.

class B{
	int v = 10;
	
	void m(){
		int v = 20;
		System.out.println(v);		// 지역변수
		System.out.println(this.v); // 객체에 대한 전역 유효범위.
	}
}


public class _012_ScopeDemo {

	public static void main(String[] args) {
		
		B c1 = new B();
		c1.m();

	}

}
