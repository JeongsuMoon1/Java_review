package org.opentutorials.javatutorials._940_method;

public class _6_MethodDemo {

	
		
		// 메소드의 출력값 1
		// 메소드의 출력은 return(돌려준다)과 연결되어 있다.
		// 메소드가(처음 메소드가 정의된 쪽) 입력값을 받아 동작해서(메소드 구문인 {}사이를 실행했을 때.) 그 결과를 메소드 밖으로(메소드를 호출한 쪽으로)돌려준다는 개념에서 return이라는 말을 사용한다.
		
		// return문을 이용해 메소드 호출 결과를 반환
		
		// **** 코드 읽는 요령 : 메소드를 이애하고 싶다면 메소드의 정의 부분을 먼저 보면 너무 복잡하다.
		// 대신 메소드를 어떻게 사용하고 메소드의 입력값은 무엇이고 메소드의 출력값은 무엇인가를 보면 해당 메소드가 어떤 용도이고 어떻게 동작하는지 이해할 수 있다.
		// 그 다음 메소드의 정의부를 보는것이 전체적인 맥락을 이해하는데 도움이 된다.
	
	public static String numbering(int init, int limit){ // ** 메소드 정의부
		int i = init;
		// 만들어지는 숫자를 output이라는 변수에 담기 위해
		// 변수에 빈 값을 주었다.(아무런 값도 없는 빈 문자열을 가진 상태에서 시작한다.)
		String output ="";
		while(i<limit){
			// 숫자를 화면에 출력하는 대신 변수 output에 담았다.
			output += i; // += : output변수에 i의 값이 계속해서 옆으로 붙게 된다. output = output+i; 과 같은 의미이다.
			i++;
		}
		// 중요!!! output에 담긴 문자열을 메소드 외부로 반환하려면
		// 아래와 같이 return 키워드 뒤에 반환하려는 값을 배치하면 된다.
		// 자바는 return을 만나면 실행중이던 메소드를 종료시킨다.(뒤에 뭐가 있어도 무조건 종료됨)
		// return 뒤에 오는 값을 메소드의 출력값으로 외부에 반환한다.
		return output; 
	}
	
	
	public static void main(String[] args) {	// ** 메소드 출력부
		// numbering 메소드에서 리턴(return)한 값이 result(문자열타입) 변수에 담긴다.
		String result = numbering(1,5);
		// result 변수의 값을 화면에 출력한다.
		System.out.println(result);
		
	}
	
	// public static String numbering(int init, int limit){
	//	
	// String : numbering() 메소드가 반환할 값이 반드시 문자열이라는 것을 의미.
	//			-> String a : a라는 변수가 반드시 문자열을 담는 변수임을 명시적으로 선언한느 것이다.
	// 			-> 그러므로 numbering()메소드가 반환한 값을 받는 result변수는 반드시 String 형식의 컨테이너여야 한다.
	// }
	
	// public static void numbering(int init, int limit){
	//	
	// void(뜻:빈 공간, 공동, 공허감, 효력이 없는) : 메소드 이름 앞에 void가 붙으면 이 메소드는 반환값이 없다는 것을 명시적으로 선언한 것이다.
	// 		  	                                                               그러므로 메소드를 호출할 때 지금까지 return이라는 것을 사용하지 않았던 것이다.
	//
	// }
	
	
	

}
