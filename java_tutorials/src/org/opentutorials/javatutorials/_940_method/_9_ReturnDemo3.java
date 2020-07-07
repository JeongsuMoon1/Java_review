package org.opentutorials.javatutorials._940_method;

public class _9_ReturnDemo3 {

	// 여러개의 값을 반환하거나 출력하는 방법 -> 배열의 효용이 나타나는 순간이다.
	// 메소드마다 각기 다른 값을 반환
	public static String getMember1(){
		return "최진혁";
	}
	
	public static String getMember2(){
		return "최유빈";
	}
	
	public static String getMember3(){
		return "한이람";
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(getMember1());
		System.out.println(getMember2());
		System.out.println(getMember3());
		
	}
	
	// 우리가 하고싶은 것은 하나의 메소드가 "최진혁", "최유빈", "한이람"이라는 세명을 한꺼번에 반환하게 하고 싶은 것이다. -> 이 때 사용할 수 있는 것이 배열이다.

}
