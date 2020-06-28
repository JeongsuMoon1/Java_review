package org.opentutorials.javatutorials._910_conditionaloperator;

public class _2_LoginDemo {

	public static void main(String[] args) {
		
		// 논리연산자를 앞서 배운 로그인 예제에 적용해본다.
		
		// if문을 중첩해서 사용하는 경우
		String id = args[0];
		String password = args[1];
		
		if(id.equals("egoing")){
			if(password.equals("111111")){
				System.out.println("right");
			}else{
				System.out.println("wrong");
			}
		}else{
			System.out.println("wrong");
		}

	}

}
