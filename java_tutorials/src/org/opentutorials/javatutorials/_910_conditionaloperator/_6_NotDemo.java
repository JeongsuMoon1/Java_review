package org.opentutorials.javatutorials._910_conditionaloperator;

public class _6_NotDemo {

	public static void main(String[] args) {
		
		// ! 연산자 : 부정을 의미한다.
		// !true : false를 의미한다.
		// !false : true를 의미한다.
		
		//not 연산자
		if(!true){ // 조건 판단 결과 : 거짓
			System.out.println(1);
		}
		
		if(!false){ // 조건 판단 결과 : 참
			System.out.println(2);
		}
		
		// 조건문과 관련된 4가지 중요한 주제(비교 연산자, 불린 데이터 타입, 조건문, 논리 연산자)를 살펴봄.
		// 이 것들은 유기적으로 연결되어 조건문을 만들고, 프로그램의 활용성을 더욱 키워나간다.

	}

}
