package org.opentutorials.javatutorials._950_io;


		// 입력과 출력
		// 01. 개요
		// -> 입력 : 어떤 프로그램안으로 들어오는 정보
		// -> 출력 : 프로그램 바깥쪽으로 빼내는 정보

		// 메소드에도 입출력이 있다.
		// -> 메소드 역시 매개변수와 인자를 통해 어떤 값을 받아오고, 받아온 값에 따라 어떠한 동작을 수행한 후, 동작한 결과를 반환값을 통해 외부로 돌려줌으로써 출력한다고 배움.

		// 입출력 = IO(InputOutput)

public class _1_InputDemo {
	
	public static void main(String[] args){
		// 02. 시작할 때 입력 1
		
		// 명령줄 인자를 사용하는 예제
		System.out.println(args.length);
		
		// main 함수의 매개변수인 String[] args에 대해 알아본다.
		// String[] : 문자열로 구성된 배열을 의미.
		// args : args라는 변수를 정의
		// main(String[] args) : main메소드의 매개변수라는 것을 의미한다.
		
		// 매개변수는 메소드의 입력값이고, 메소드 앞에는 void가 붙는데 이것은 main메소드는 출력값이 없다는 뜻이다.
		// public static : 여전히 알 수 없는 영역, 추후에 학습할 예정.
		// args.length : 문자열로 된 args 배열에 담긴 원소의 개수가 아니라 배열이 몇 개의 값을 담을 수 있는지 알아낼 수 있다.
		
		// cmd 프롬프트로 _1_InputDemo 실행하기
		// cmd -> cd C:\Users\appac\git\java_review\java_tutorials -> java -cp bin org.opentutorials.javatutorials._950_io._1_InputDemo 실행
		// java -cp bin org.opentutorials.javatutorials._950_io._1_InputDemo one two three : _1_InputDemo 클래스의 입력값으로 one two three라는 세 개의 값을 준 것이다.
		// -> 즉, 입력한 세 개의 값은 args라는 매개변수의 인자로 입력값이 돼서 들어간다.
		
	}

}
