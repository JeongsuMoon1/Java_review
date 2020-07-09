package org.opentutorials.javatutorials._950_io;

public class _2_InputForeachDemo {

	// 사용자가 입력한 입력값을 애플리케이션이 args라는 매개변수로 받아서 그 인자값을 애플리케이션 내부로 가져오고, for-each 구문을 이용해 화면에 그 내용을 출력.
	
	public static void main(String[] args) {
		
		for(String e: args){
			System.out.println(e);
		}
		
		// java -cp bin org.opentutorials.javatutorials._950_io._2_InputForeachDemo one : one이 _2_InputForeachDemo의 입력값으로 들어가고  args -> e 에 one 값이 담긴다. 
		// -> e에 값이 담기면 system.out.println에 의해 값이 출력된다.

	}

}
