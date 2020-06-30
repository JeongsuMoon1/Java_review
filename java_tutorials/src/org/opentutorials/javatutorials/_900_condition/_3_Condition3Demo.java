package org.opentutorials.javatutorials._900_condition;

public class _3_Condition3Demo {

	public static void main(String[] args) {
		
		// if문 만으로는 조금 더 복잡한 동작을 처리하기가 불편하다.
		// if문 만으로 참일 경우, 거짓일 경우를 따로 작성할 수 있다.(약간 불편)
		if(true){
			// 참일 떄 실행할 내용
		}
		if(false){
			// 거짓일 떄 실현할 내용
		}
		// else문 : if문 하나로 참일 때 무엇을 하고, 거짓일 경우 무엇을 한다는 것을 한번에 처리하는 것
//		if(true 또는 false){
//			true일 경우 실행 됨
//		}else{
//			false일 경우 실행 됨
//		}
		
		// true 실행문
		if(true){
			System.out.println(1); // 조건절이 true이면 이 부분의 내용만 실행하고 else뒤는 생략한 후 밖으로 빠져버린다.
		}else{
			System.out.println(2); // 조건절이 false일 경우만 실행 될 내용
		}
		// false 실행문 
		if(false){
			System.out.println(1); // 거짓일 경우 실행
		}else{
			System.out.println(2); // 참일 경우 실행
		}
		
	}

}
