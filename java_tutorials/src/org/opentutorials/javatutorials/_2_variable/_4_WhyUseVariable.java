package org.opentutorials.javatutorials._2_variable;

public class _4_WhyUseVariable {

	public static void main(String[] args) {
		
		// 하나하나 전부 작성을 해야하는 번거로움
		System.out.println(100+10);
		System.out.println((100+10)/10);
		System.out.println(((100+10)/10)-10);
		System.out.println((((100+10)/10)-10)*10);
		
		// 변수의 필요성
		int a = 100;
		System.out.println(a+10);
		System.out.println((a+10)/10);
		System.out.println(((a+10)/10)-10);
		System.out.println((((a+10)/10)-10)*10);
		
		// ** 변수의 필요성은 중복의 제거에서 나온다
		// 바꿀필요가 없는 부분과 바뀔 가능성이 있는 것은 그 부분끼리 묶어준다
		
	}

}
