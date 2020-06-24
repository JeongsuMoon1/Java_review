package org.opentutorials.javatutorials._9_condition;

public class _2ConditionDemo {

	public static void main(String[] args) {
		
		// if문
		if(true){
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		} // 여기까지 결과값은 1,2,3,4
		System.out.println(5);
		// 중괄호의 조건문이 끝나면 프로그램은 중괄호 바깥 부분으로 빠져나가서 System.out.println(5);가 실행되므로 5가 출력된다.
	
		
		
		if(false){
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		} // 조건절이 false이므로 중괄호안의 코드는 실행되지 않음.
			System.out.println(5);
			// System.out.println(5);만 출력이된다.
	}

}
