package org.opentutorials.javatutorials._8_compare;

public class _5_EqualStringDemo {

	public static void main(String[] args) {
		
		// 문자열을 비교할 때는 조심해야 한다.
		// 문자열을 비교할 때는 =가 두개 있는 ==(Equal, 동등비교연산자)로 비교하는게 아니라,
		// equals() 라는 메소드를 사용해야한다. ***
		
		String a = "Hello World";
		String b = new String("Hello World"); // 왜 new String()을 쓰는지 뒤에서 공부할 것이다.
		System.out.println(a == b);		 // false
		System.out.println(a.equals(b)); // true

	}

}
