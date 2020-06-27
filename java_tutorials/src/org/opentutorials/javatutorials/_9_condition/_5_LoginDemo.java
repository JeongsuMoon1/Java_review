package org.opentutorials.javatutorials._9_condition;

public class _5_LoginDemo {

	public static void main(String[] args) {
		
		// 변수와 비교 연산자, 그리고 조건문
		
		// 조건문에 변수를 이용한 예제
		// 입력한 값에 따라 다른 결과를 반환하는 프로그램
		String id = args[0]; // 명령프롬프트에서 입력했던 값(입력값)이 들어오는 부분. 입력값이 LoginDemo로 전달될 떄, LoginDemo의 코드 안에서 사용자가 입력한 값이 무엇인가를 알아낼 수 있는 것이 args[0];이다.(추후에 강의 진행)
		if(id.equals("egoing")){ // id변수 : 문자열이다. "egoing"이나 "k8805"와 같은 프롬프트에서 입력한 값들을 담고 있다. id변수의 값은 사용자가 입력한 값에 따라 달아질 수 있다. 
								 // equals() : equals() 앞에 있는 값과 equals()뒤에 있는 괄호안의 값을 비교하는 메소드이다. 값이 같다면 true, 값이 다르다면 false를 반환한다.
			System.out.println("right");
		}else{
			System.out.println("wrong");
		}
		
		// 명령프롬프트에서 실행할 것임 
		// 1. cmd 접속
		// 2. cd C:\Users\appac\git\java_review\java_tutorials\bin 경로 변경
		// 3. java org.opentutorials.javatutorials.condition._5_LoginDemo 실행 
		//    * cmd에서 명령어 java는 자바 애플리케이션을 실행하곘다는 뜻이고, 뒤의 경로는 패키지 명이다. 
		//      LoginDemo라는 자바 어플리케이션을 실행할 것인데 인자값(입력값)으로 어떤 값을 주느냐에 따라 로그인을 수행하는 프로그램이다.
		// 4. java org.opentutorials.javatutorials.condition._5_LoginDemo egoing 을 실행하면 right값을 반환한다.
		
		// 결국 프롬프트에서 작성한 값은 args에 담기고 다시 id로 들어간다. 즉, id는 사용자가 입력한 값이다.
		
		// 콘솔에서 동작시키기
		// 1. 실행버튼 옆 삼각형 누르기 -> Run Configuratios -> New launch configurations -> 새로운 항목 추가 -> Name (_5_LoginDemo input - egoing)으로 바꿔준다. -> program argument 에 egoing입력 후 Run 실행
		
	}

}
