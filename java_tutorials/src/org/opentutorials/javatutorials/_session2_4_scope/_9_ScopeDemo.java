package org.opentutorials.javatutorials._session2_4_scope;


//		[예제23.9] b()메소드에서 i에 해당하는 변수를 찾지 못함

//		b()메소드에서 지역변수를 없애고 실행하면 전역변수가 사용되기 때문에 5가 출력된다는 것이다.
//		그리고 아래와 같이 전역변수도 없애고 예제를 실행해보면 b()메소드 안에서 에러가 발생한다.


public class _9_ScopeDemo {
	static int i = 5; // => 주석풀면 오류 해결
	
	static void a(){
		int i = 10;
		b();
	}
	
	static void b(){
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		
		int i = 1;
		a();
		

	}

}

//		이런 형태의 유효범위 스타일을 정적인 유효범위라고 한다.
//		b() 메소드의 유효범위는 b()메소드의 원래 유효범위, 즉 자기자신이거나 아니면 전역변수이거나 둘 중 하나에만 접근할 수 있는 고정된 형태의 유효범위이다.
//		b()메소드를 누가 호출했는지는 상관없다는 것이다. 반면 만약 b()를 호출했는데 b()를 호출한 a()라는 메소드가 갖고 있는 지역변수 10이 출력된다면
//		이것은 동적인 유효범위라고 하는 형태의 프로그래밍 스타일이다.
