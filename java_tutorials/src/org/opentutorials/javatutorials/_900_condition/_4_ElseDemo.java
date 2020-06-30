package org.opentutorials.javatutorials._900_condition;

public class _4_ElseDemo {

	public static void main(String[] args) {
		
		// true이냐 false이냐의 둘 중의 하나만으로 상황을 단순화하면 해결해야 할 현실적인 문제들(훨씬 더 복잡한 경우)을 처리할 수 없을 것이다.
		// 그래서 조금 더 복잡하게 실행 흐름을 제어하는 방법이 else if 이다.
		
//		if(true 또는 false){
//			true일 경우 실행 됨 -> 실행 후 if문을 빠져나간다.
//		}else if(true 또는 false){ if문이 false일 경우 else if의 조건절이 true냐 false냐 판단하기 위해 내려옴
//			else if가 true일 경우 실행 됨 -> 실행 후 else if문을 빠져나간다.
//		}else{ else if의 조건절이 false일 경우 else문을 실행하기 위해 내려옴
//			else if문이 거짓일 경우 샐행 됨 -> 실행 후 else문을 빠져나간다.
//		}
		
		// if문의 if부분은 조건문에서 딱 한 번만 쓸 수 있다.
		//      else부분도 조건문 맨 끝에 위치하거나 생략할 수 있다.
		//      else if부분 역시 생략할 수는 있지만, else가 else if보다 먼저 와서는 안된다.(항상 else가 맨 뒤에 온다)
		
		// 결과값 2 출력
		if(false){
			System.out.println(1);
		}else if(true){
			System.out.println(2); // 첫 번째의 else if문이 true이므로 실행 후 if문을 빠져나간다.
		}else if(true){
			System.out.println(3);
		}else{
			System.out.println(4);
		}
		// 위 조건문에서 참이 한 번이라도 등장하면 참이 처음으로 등장한 구간만 실행되고 조건문은 종료가 된다.
		
		// 결과값 3 출력
		if(false){
			System.out.println(1);
		}else if(false){
			System.out.println(2);
		}else if(true){
			System.out.println(3);
		}else{
			System.out.println(4);
		}
		
		// 결과값 4 출력
		if(false){
			System.out.println(1);
		}else if(false){
			System.out.println(2);
		}else if(false){
			System.out.println(3);
		}else{
			System.out.println(4);
		}
		// 다시 말하지만 어떤 경우에도 위에서 아무런 구간도 실행되지 않았다면 else구각이 실행된다.
		// else는 생략가능, else if도 생략가능, else if는 여러개가 등장할 수도 있다.
		
		
		// *지금까지 조건문인 if문의 조건절에는 값(true,false)이 고정되어 있었다. 즉, 조건에 따라 동작하는 것이 아니라
		// true냐 false냐에 따라서 실행되거나 실행되지 않았다는 것이다. 떄문에, 위의 코드들은 조건문답지 않은 조건문이다.
		// it문의 조건절이 동적으로, 프로그래밍적으로 어떤 경우에는 참이 되고, 어떤 경우에는 거짓이 돼야 조건문으로써 효용을 갖게 된다 -> 다음시간에 학습 예정
		
		
	}

}
