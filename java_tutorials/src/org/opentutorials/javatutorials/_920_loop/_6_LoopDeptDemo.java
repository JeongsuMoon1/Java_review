package org.opentutorials.javatutorials._920_loop;

public class _6_LoopDeptDemo {

	public static void main(String[] args) {
		
		// 5. 반복문의 중첩
		// 반복문과 if문이라는 두 개의 서로 다른 기능을 조합해서 조금 더 기능적이고 지능적인 프로그램을 만들 수 있다.
		
		// for-if중첩
		// for(){
		// 	if(){
		//
		//	 }
		// }
		
		// if-for 중첩
		// if(){
		// 	for(){
		//
		//	 }
		// }
		
		// 반복문의 중첩 (00부터 99까지 화면에 출력하는 예제)
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.println(i+""+j);
			}
		}
		
		// 반복문을 중첩할 경우 서로 다른 이름의 변수로 설정하는 것을 잊지말 것.
		
		
		
		
	}

}
