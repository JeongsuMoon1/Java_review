package org.opentutorials.javatutorials._900_condition;

public class _6_LoginDemo {

	public static void main(String[] args) {
		
		// 조건문을 중첩하는 방법
		
		// 두 개의 조건문을 중첩한 예제
		// if문 안에는 또 다른 if문이 들어가서 더 복잡한 조건을 만들 수 있다는 것이 이번 핵심 내용이다.
		String id = args[0];         // id 입력값인 egoing이 첫번째로 작성되게 돼있어서 args[0]으로 표시.
		String password = args[1];   // password 입력값인 111111이 두번째로 작성되게 돼있어서 args[1]으로 표시.
		if(id.equals("egoing")){
			if(password.equals("111111")){
				System.out.println("right");
			}else{
				System.out.println("wrong");
			}
		}else{
			System.out.println("wrong");
		}
		// * 하나의 if문 안에 또 다른 if문을 사용해서 if문이 두 번 등장하기보다는 하나의 if문만으로 이러한 조건들을 응집해서 서로 연관된 로직은 하나의 덩어리로 모을 수 있다.
		//   그것은 논리 연산자이고 다음 시간에 학습할 것이다. 
	}

}
