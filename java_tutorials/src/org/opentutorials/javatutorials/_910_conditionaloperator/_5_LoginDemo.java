package org.opentutorials.javatutorials._910_conditionaloperator;

public class _5_LoginDemo {

	public static void main(String[] args) {
		
		// or(||)연산자는 여러 명이 어플리케이션을 사용하게 하고 싶을 경우 사용한다.
		// id가 "egoing", "k8805", "sorialgi"라는 아이디 중 하나를 입력하고, 패스워드로 "111111"을 입력했을 경우 "right"를 반환하도록 할 것이다.
		// id가 위의 세개 중에 하나가 아닌 다른게 입력되면 "wrong"을 반환하고, 패스워드도 "111111"이 아니면 "wrong"을 반환해 보곘다.
		// 즉, 이 두 가지 조건 중 하나라도 어긋나면 "wrong"을 출력할 것이다.
		
		// or 연산자의 활용
		String id = args[0];
		String password = args[1];
		
		if((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi")) && password.equals("111111")){
			System.out.println("right");
		}else{
			System.out.println("wrong");
		}

	}

}
