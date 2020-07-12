package org.opentutorials.javatutorials._950_io;

import java.util.Scanner; // 1. - scanner를 로드하기 위함, import : 가져온다는 뜻.
						  //    - java.util.Scanner : java.util이라는 패키지에 있는 scanner라는 의미임. 즉, java.util 패키지 안에 있는 Scanner라는 객체를 사용하겠다는 뜻.


public class _3_ScannerDemo {

	public static void main(String[] args) {
		
		// scanner : 일종의 라이브러리(다른 사람이 만들어둔 로직)
		
		// Scanner 라이브러리를 이용한 명령줄 인자 받기
		Scanner sc = new Scanner(System.in); // Scanner라는 객체를 새로 만든다는 뜻이다.
		int i = sc.nextInt(); // 이 구문이 실행되면, 프로그램은 여기서 실행을 멈추고 기다리는 상태가 된다(인트 즉, 숫자가 입력되기 전까지 기다리는 상태가 된다.)
							  // 명령 프롬프트에 숫자를 입력하고 엔터를 치는 순간 sc.nextInt에서 실행이 멈춰져 있던 자바가 다시 실행되면서 사용자가 입력한 값이 변수 i에 담기게 된다.
		System.out.println(i*1000);
		sc.close();
		
		// 2. Run 클릭후에 console창에 1을 입력하면 2000출력.
		//    Run을 실행하면 _3_ScannerDemo라는 애플리케이션이 실행되며넛 main메소드가 자바에 의해 호출될 것이다.
		

	}

}
