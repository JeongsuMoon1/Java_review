package org.opentutorials.javatutorials._940_method;

public class _1_MethodDemo {
	// 메소드 정의와 호출	
	
	//public static void main(String[] args) {
		
		// 메소드(method) : 함수(function)라고도 한다.
		//				 자바에서는 메소드, 다른 언어에서는 함수
		
		// 메소드나 객체지향과 같은 개념은 웅장하고, 결함이 없고, 유지보수하기 쉬운 애플리케이션을 만들기 위한 기법이다.
		// 프로그램이 점점 커지는 순간 인간이 관리하는 수준에서 벗어나고 새로운 관리방법이 필요해진다.
		// 이때, 메소드는 규모가 큰 프로그램을 효율적으로 관리해주도록 도와주는 역할도 한다.
		
		
		// public static : 미지의 영역
		// void : 미지의 영역
		// main : 메소드이다
		// (String[] args){
		// 
		// 	}
	
		// 메소드를 정의하는 방법과 정의한 메소드를 호출하는 방법
		// define : 정의하는 것
		// call : 호출하는 것
	
		public static void numbering(){ // 1. 메소드 정의
		
			int i = 0;
			while (i<10){
				System.out.println(i);
				i++;
			}
		}
		
		public static void main(String[] args){ 
			// 지금까지는 main이라고 하는 중괄호{} 안쪽에 작성해왔다. 그 안쪽에서 numbering()이라고 쓰면 이름이 numbering인 메소드가 호출된다. 다른 말로는 실행되는 것이고, 사용된다는 뜻이 된다.
			
			numbering(); // 2. 메소드 호출
			// numbering메소드는 바로 위에 작성된 numbering()이다. numbering메소드의 본체(본문)은 { }사이에 들어가 있는 i의 선언문이 메소드의 본문에 해당된다.
			// 그래서 numbering을 실행하면 이름이 numbering인 메소드의 본문 영역이 실행되는 것이다.(public static void numbering()) 실행.
			// 호출은 소괄호()로 끝나고 아무것도 없다는 것.
			// 정의는 메소드 이름이 나오고, 소괄호()다음에 중괄호{}가 나타나면 정의된다는 것이 컴퓨터 안에서의 약속.
			numbering();
			numbering();
		
	}

}