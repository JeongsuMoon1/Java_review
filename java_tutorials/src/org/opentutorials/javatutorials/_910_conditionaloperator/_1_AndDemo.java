package org.opentutorials.javatutorials._910_conditionaloperator;

public class _1_AndDemo {

	public static void main(String[] args) {
		
		// 논리 연산자 : 조건문을 보조하는 역할(조건문이 중심이고, 이 조건문을 족므 더 강력하게 만들기 위해 논리 연산자라는 것이 필요.(비교와 불린이 필요))
		// 비교, 불린
		// 조건문
		// 논리 연산자
		
		// 논리연산자 : and(&&), or(||) 이 존재한다.
		// and(&&) : 앞(좌항)에는 참(true), 거짓(false) 즉 불린이 올 수 있고, 뒤(우항)에도 불린이 올 수 있다.
		//      -> 좌항 우항 모두 참 : 전체가 참
		//      -> 좌항과 우항 하나라도 거짓 : 전체가 거짓
		// or(||) : 좌항과 우항에 불린이 올 수 있다.
		//		-> 좌항이나 우항이 하나라도 참 : 전체가 참
		//		-> 좌항과 우항이 모두 참 : 전체가 참
		//		-> 좌항과 우항이 모두 거짓 : 전체가 거짓
		
		// And 연산자
		if(true && true){ // 조건 판간 결과 : 참
			System.out.println(1);
		}
		
		if(true && false){ // 조건 판단 결과 : 거짓
			System.out.println(2);
		}
		
		if(false && true){ // 조건 판단 결과 : 거짓
			System.out.println(3);			
		}
		
		if(false && false){ // 조건 판단 결과 : 거짓
			System.out.println(4);
		}

	}

}
