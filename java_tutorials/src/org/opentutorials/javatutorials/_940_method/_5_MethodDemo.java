package org.opentutorials.javatutorials._940_method;

public class _5_MethodDemo {
	
	// 메소드의 입력값2
	// numbering() 메소드에 시작값과 종료값을 전달
	public static void numbering(int init, int limit	){
		int i = init;
		while(i<limit){
			System.out.println(i);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		
		numbering(1,5); // numbering()메소드를 호출할 떄 1과 5라는 값을 전달했다.
						// 1은 매개변수 int init으로, 5는 매개변수 int limit로 전달된다.
		System.out.println("============");
		numbering(3,5);

	}
	
	// 여러 개의 인자 값, 여러 개의 입력값을 갖게 하고 싶다면 메소드를 호출할 때 인자값을 여러 개 배치하고, 인자와 인자 사이를 콤모(,)로 구분하면 된다.
	// 메소드를 정의할 떄 인자를 전달받을 매개변수의 순서 역시 인자가 전달될 순서에 따라 배치하고
	// 매개변수와 매개변수 사이에 콤마를 붙인다. 

}
