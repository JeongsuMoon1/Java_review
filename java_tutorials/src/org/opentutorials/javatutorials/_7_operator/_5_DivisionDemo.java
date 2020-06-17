package org.opentutorials.javatutorials._7_operator;

public class _5_DivisionDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b); // 3  -> 정수값과 정수값을 연산하여 실수값이 나오더라도 결과값의 소수점 이하는 손실시켜버리고, 정수의 값으로 출력된다.
		System.out.println(c/d); // 3.3333333 -> 둘 다 실수의 값을 가진 상수이다.
		System.out.println(a/d); // 3.3333333 -> a는 정수(실수로 자동 형 변환한다.), d는 실수이다(바로 a와 연산가능함)

	}

}
