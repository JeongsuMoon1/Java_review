package org.opentutorials.javatutorials._940_method;

public class _9_ReturnDemo1 {
	
	// 메소드에서 return 문을 여러개 사용
	public static int one(){
			
			return 1;
//			return 2;
//			return 3;
		}
	
	public static void main(String[] args) {
		
		System.out.println(one());

	}
	
	// return 1;을 만난순간 메소드의 실행을 완전히 종료한다.
	// 나머지 return 2;, return 3;을 넣은게 실수를 한게 아니냐는 생각으로 컴파일을 거부한다.
	// 하지만, return은 한 번만 등장하지 않는다.
	// 다음 예제에서 여러개의 return을 사용하는 것을 실습하겠다.

}
