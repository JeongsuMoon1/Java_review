package org.opentutorials.javatutorials._4_datatype;

public class _1_datatype {

	public static void main(String[] args) {
		
		// 1. 데이터 타입이란?
		// bit : 프로그래밍에서 가장 작은 단위(0 과 1이 비트(bit)이다.)
		// 1byte : 8 bit의 모임
		// 1KB : 1024byte의 모임
		// 1MB : 1024kbyte의 모임
		// 1GB : 1024mbyte의 모임
		// -> TB -> PB -> EB -> ZB
		
		// 2. 데이터 타입 비교
		// 숫자 -> 정수(byte,short,int,long 등..3가지), 실수(double,float 등..2가지) 타입이 존재한다.
		
		// <정수>
		// byte(1바이트) : -128 ~ 127
		// short(2바이트) : -32,768 ~ 32,767
		// int(4바이트) : -2,147,483,648 ~ 2,147,486,647
		// long(8바이트) : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		
//		오류 코드
//		byte a;
//		a = 128; // byte는 127까지 표현 가능
		// 128을 표현하고 싶다면 더 높은 데이터 형식을 써야한다.
//		short a;
//		a = 128;
		
		// 가능하면 원하는 표현값을 나타낼 수 있는 데이터형식이 작은게 있다면 그걸 쓰는것을 추천 -> 메모리 사용공간을 아껴준다.
		
		long a = 2147483647;
		long b = 1;
		// 일 경우, a,b 둘다 메모리를 사용하는 크기는 동일하다. 데이터 타입이 메모리 사용 크기를 결정하기 때문이다. 
		
		int c = 2147283647;  // 4바이트 사용중
		long d = 2147283647; // 8바이트 사용중
		// 일 경우, c가  d보다 작은 메모리를 사용하고 있다.
		
		// <실수>
		// float(4바이트)
		// double(8바이트)
		// 결론적으론 실수를 표현할 경우는 double을 사용하면 된다.
		
		// <문자>
		// char(character, 2바이트) : 'A'문자 표현할 시 2바이트 사용, "AB"문자열 표현할 시 2바이트씩 총 4바이트 사용.
		
	}

}
