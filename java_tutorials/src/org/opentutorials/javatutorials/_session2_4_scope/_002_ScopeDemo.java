package org.opentutorials.javatutorials._session2_4_scope;



		// 02. 전역변수, 지역변수

		// 디렉터리 : 한 디렉터리 안에서는 같은 이름을 써야 하지만 디렉터리 바깥쪽에서는 같은 이름을 쓰더라도 아무런 문제가 발생하지 않는다.
		//        디렉터리라는 것을 통해 이름 충돌이라는 현상을 완화하는 것이다.

public class _002_ScopeDemo {

	static void a(){
		int i = 0; // 지역변수 -> main 메소드의 for문에 영향을 미치지 않는다.
	}
	
	public static void main(String[] args) {

		for(int i = 0; i < 5; i++){
			a();
			System.out.println(i);
		}
		

	}

}
