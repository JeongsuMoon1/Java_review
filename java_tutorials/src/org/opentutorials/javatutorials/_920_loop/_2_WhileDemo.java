package org.opentutorials.javatutorials._920_loop;

public class _2_WhileDemo {

	public static void main(String[] args) {
		
		// 하드코딩된 반복문 보다 더 높은 효용을 가지게 될려면
		// 언제까지 반복이 진행될 것이냐, 바로 그러한 정보와 반복문이 결합했을 때 반복문이 좀 더 큰 효용을 갖게 된다.
		// while문의 반복조건에 어떤 변수값을 주고 반복문이 실행되는 과정에서 조건이 변경될 수 있어야 한다.
		
		// 변수를 이용한 while문의 제어
		int i = 0;
		// i의 값이 10보다 작다면 true, 크다면 false가 된다.
		// 현재 i의 값은 0이기 때문에 이 반복문은 실행된다.
		while (i < 10){
			System.out.println("coding everybody" + i);
			// i의 값에 1을 더한다. 반복문의 마지막 줄에 도달하면
			// 반복문을 호출한다. 이때 i<10의 값을 검사하게 된다.
			i++;
		}

	}

}
