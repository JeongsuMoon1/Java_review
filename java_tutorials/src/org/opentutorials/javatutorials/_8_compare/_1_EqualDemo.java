package org.opentutorials.javatutorials._8_compare;

public class _1_EqualDemo {

	public static void main(String[] args) {
		
		// Boolean : 일종의 데이터 타입이다. 단 2개의 값(true, false)만 가질 수 있다.
		// 비교 연산자 : 좌항과 우항 사이에 비교연산자가 위치해서 왼쪽과 오른쪽의 크기가 같은지 혹은 누가 큰지, 누가 작은지 크기를 비교해서 그 결과를
		//          true나 false 값으로 돌려주는 역할을 하는 연산자이다.
		
		// ==(Equal) : 좌항과 우항이 같은지 비교하는 비교연산자(동등비교연산자)이다. 
		// 비교연산자는 숫자 뿐만 아니라, 문자열에서도 적용할 수 있다.
		// =(대입연산자) : 비교연산자와 헷갈리면 안된다.***
		
		System.out.println(1 == 2); 		  // false
		System.out.println(1 == 1); 		  // true
		System.out.println("one" == "two"); // false
		System.out.println("one" == "one"); // true
		
	}

}
