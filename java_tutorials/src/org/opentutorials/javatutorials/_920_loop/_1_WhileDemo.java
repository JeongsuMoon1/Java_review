package org.opentutorials.javatutorials._920_loop;

public class _1_WhileDemo {

	public static void main(String[] args) {
		
		// 반복문 : loop(루프), iteration(이터레이션)
		// 반복문은 크게 2가지로 나뉜다
		
		// while(조건){
		//			반복 실행 영역
		//           }
		
		// (조건) : 언제까지 반복할 것인지가 온다.
		// { }  : 반복적으로 실행하고자 하는 코드가 위치한다.
		
		// while 뒤에 오는 (조건)소괄호에 참true인 동안 중괄호{} 블록에 들어있는 작업을 반복 실행한다는 것이 while문의 문법적인 구성이다.
		// 무한 반복하는 코드 -> 정지버튼 눌러서 꺼둘 것. 
		while(true){ //-> (true) : 조건 소괄호에 true값을 지정하게 되면 "하드코딩"이라고 한다. 값이 고정되어 있다는 뜻이다.
			System.out.println("coding everything"); // 무한반복되는 실행 코드
		}
		
		// 실행자체가 안되는 오류코드(문법적인 오류는 아니고 반복할 수 없다는 의미에서 오류가 발생하는 것이다.)
//		while(false){
//			System.out.println("coding everything");
//		}

	}

}
