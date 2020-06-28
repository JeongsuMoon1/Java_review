package org.opentutorials.javatutorials._910_conditionaloperator;

public class _3_LoginDemo {

	public static void main(String[] args) {
		
		// && 연산자를 사용하는 경우
		String id = args[0];
		String password = args[1];
		
		if(id.equals("egoing") && password.equals("111111")){
			System.out.println("right");
		}else{
			System.out.println("wrong");
		}
		
		// * &&와 같은 논리연산자를 사용하는 이유는 코드를 간결하게 만들기 위함이다.

	}

}
