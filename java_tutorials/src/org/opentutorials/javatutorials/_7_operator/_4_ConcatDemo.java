package org.opentutorials.javatutorials._7_operator;

public class _4_ConcatDemo {

	public static void main(String[] args) {
		
		// 더하기(문자열 결합) 연산자
		// 산술연산자에서만 더하기 연산자를 쓰는 것이 아닌 문자열을 합칠 경우에도 산술연산자 +가 사용되어 진다.
		
		String firstString = "this is";
		String secondString = " a concatenated string";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);
	}

}
