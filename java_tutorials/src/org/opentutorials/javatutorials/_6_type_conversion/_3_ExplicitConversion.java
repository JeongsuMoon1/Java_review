package org.opentutorials.javatutorials._6_type_conversion;

public class _3_ExplicitConversion {

	public static void main(String[] args) {
		
		// 명시적 형 변환(Explicit Conversion) : 개발자가 직접 수동으로 형 변환을 하는 경우이다.
//		float a = 100.0; double형인 상수
//		int b = 100.0F;  float형인 상수
		
		// 굳이 데이터를 넣고 싶다면
		float a = (float)100.0; // 명시적으로 double 데이터 타입이 float으로 변환 된다.
		int b = (int)100.0F;	// 명시적으로 float 데이터 타입이 int로 변환 된다. 만약 100.1F; 였다가 int로 형 변환을 하면 0.1이 손실되는 것이다.
		

	}

}
