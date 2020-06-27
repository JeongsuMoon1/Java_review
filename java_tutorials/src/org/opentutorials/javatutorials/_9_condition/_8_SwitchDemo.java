package org.opentutorials.javatutorials._9_condition;

public class _8_SwitchDemo {

	public static void main(String[] args) {
		
		// 각 case마다 break 문을 추가
		// case2 만 실행시키고 종료하고 싶을 경우 작성하는 방법이다.
		
		System.out.println("switch(1)");
		switch(1){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
		
		System.out.println("switch(2)");
		switch(2){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
		
		System.out.println("switch(3)");
		switch(3){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
		
		// switch 값에 1이 들어갔을 때, case1 이 실행되고 break를 만났기 때문에 switch 문이 종료되면서 switch문 바깥쪽에 있는 코드가 실행되는 것이다.

	}

}
