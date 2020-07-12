package org.opentutorials.javatutorials._7_operator;

public class _6_PrePostDemo {

	public static void main(String[] args) {
		
		// 이항 연산자 : 좌항과 우항이 존재하여 산술연산자로 연괄 되는 관계인 연산자
		// 단항 연산자 : 좌항과 우항이 존재안한다
		
		
		// 단항 연산자 
		// + : 양수를 표현한다, 실제로는 사용할 필요가 없다.
		// - : 음수를 표현한다
		// ++ : 증가(increment)연산자로 항의 값을 1만큼 증가시킨다.
		// -- : 감소(decrement)연산자로 항의 값을 1만큼 감소시킨다.
		
		// 단항 연산자
		// 뒤에 따라오는 우항값을 꾸미는 역할을 하므로 단항 연산자이다
//		+3 // 양수
//		-3 // 음수
		
		// ++ : 증가 연산자(단항 연산자)
		// ++, -- : i의 값에 1을 더하거나 빼는 연산자이다
		
		int i = 3;
		i++; // i = i+1 같은 의미일 것 같다.
		System.out.println(i); // 4출력
		++i;
		System.out.println(i); // 5출력
		System.out.println(++i); // 6출력 
		System.out.println(i++); // 6출력, i++은 바로 반영되지 않지만, 이 맥락이 끝나자마자 i의 값이 1만큼 증가하므로 그다음에 i 값을 사용하면 7이 출력된다.
		System.out.println(i); // 7출력
		

	}

}
