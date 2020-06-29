package org.opentutorials.javatutorials._6_type_conversion;

public class _2_ImplicitConversion {

	public static void main(String[] args) {
		
		// 자동 형 변환(=암시적 형 변환)
		
		// a는 double이라는 데이터 타입을 가진다. -> 3.0뒤에 F를 붙여서 상수의 데이터 타입은 float이 된다.
		// 변수와 상수가 서로 다른 데이터 타입을 가지고 있는 상태이다.
		// 오류가 안나는 이유(암시적 형 변환) : double이 float보다 더 많은 정보를 수용할 수 있기 때문이다.
		// 떄문에, float에서 double형인 a에 데이터가 들어가도 데이터 손실이 없다는 측면이 있다.
		double a = 3.0F; 
		//System.out.println(a);
		
		
		// 실수에 아무것도 안 붙어있다면 자동적으로 데이터 타입은 double이다.
		// float형의 변수에 double형의 데이터를 담을려고 하는 상황.
		// float형 변수에 double형의 데이터가 담아질 수가 없다 -> double데이터 타입이 float형 변수보다 더 많은 수를 표현할 수 있기 떄문에 호환이 안된다.
		//float a = 3.0;
		
		// 자동 형 변환의 원칙
		// byte -> short -> int -> long -> float -> double
		//         char
		
		// 정수 -> 실수 : 형 변환 가능
		// 실수 -> 정수 : 형 변환 불가능
		// char -> int : 형 변환 가능
		// int -> char : 형 변환 불가능
		
		// a와 b를 더하기 위해서는 먼저 형을 같게 만들어 줘야한다.
		int b = 3; // 정수는 실수로 변환 가능
		float c = 1.0F; // 실수는 그냥 실수로 있어도 됨
		double d = b + c; // 실수로 변환된 b와 그냥 실수인 c와 더하면 float가 되는데 여기서 다시 한 번 double로 형 변환이 된다.
		//System.out.println(d);
	}

}
