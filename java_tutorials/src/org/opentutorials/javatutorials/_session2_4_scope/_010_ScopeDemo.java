package org.opentutorials.javatutorials._session2_4_scope;


//		[예제23.10] m()메소드에서 전역변수를 사용 


//		지금까지는 클래스 변수를 이용해 전역변수와 지역변수라는 개념을 알아보았다
//		이번에는 인스턴스 기준으로 설명가능함
//		this 키워드에 관한 내용 진행.

class C{
	int v = 10;
	
	void m(){
		System.out.println(v);
	}
}


public class _010_ScopeDemo {

	public static void main(String[] args) {
		
		C c1 = new C(); // 1. C클래스의 인스턴스를 c1이라는 변수에 담았다.
		c1.m();			// 2. c1인스턴스에 있는 m() 메소드를 호출하는데 m()에서는 system.out.println(v);을 실행한다.
						//	  v는 전역변수이고, 10을 값으로 가진다.
		
	}

}
