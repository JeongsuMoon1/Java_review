package org.opentutorials.javatutorials._9_condition;

public class _1_Condition1Demo {

	public static void main(String[] args) {
		
		// 조건문 : 조건이 이렇다면 이런 행동을 하고, 조건이 저렇다면 저런 행동을 하도록 컴퓨터가 동작하는 방법을 조건에 따라 분기하는 역할.
		// 불린 : true, false 중 하나의 값을 출력. 조건문과 만나면 그 효용이 나타난다.
		
		// 프로그래밍에서 문(文, statement)은 문법적인 완결성을 가진 하나의 완제품이라고 할 수 있다. if문, for문, while문 등이 여기에 해당된다.
		//         절(節, clause)은 문(statement)를 구성하는 부품이라고 할 수 있다. 
		
		// if문  : 조건문의 핵심. if가 프로그램 코드상에서 동작하면 컴퓨터는 이제 조건문이 시작하겠구나라고 조건문을 해석할 준비를 한다.
		// if ( true ) { if절
		//				 then절
		//			   }
		// if : 조건문이 시작한다는 사실을 알리는 문법적인 요소.
		// (true) : 조건절(조건절에는 딱 2가지 밖에 못 들어간다. true이냐 false이냐)
		// {} : 중괄호 사이에는 then절이 들어온다.
		// 조건절이 true이면 중괄호안의 코드가 실행된다.
		// 조건절이 false이면 중괄호안의 코드는 실행이 안된다.
		
		// if문
		if(true){ // 조건절의 값이 true이기 때문에 중괄호안의 then절이 실행된다.
			System.out.println("resule : true");
		}
		
		if(false){ // 조건절의 값이 false이기 때문에 중괄호안의 then절은 실행안된다.
			System.out.println("result : false");
		}
			
	}

}
