package org.opentutorials.javatutorials._900_condition;

public class _7_SwitchDemo {

	public static void main(String[] args) {
		
		// switch문
		
		// switch문은 if문으로 완벽하게 대체할 수 있다.
		// if문이 훨씬 더 많이 사용한다.
		System.out.println("switch(1)");
		switch(1){
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("switch(2)");
		switch(2){
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("switch(3)");
		switch(3){
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		// switch문은 시작하고 어떤 값이 들어가는 괄호가 등장한다. 위 코드에서는 괄호안에 1,2,3을 각각 넣었다.
		// case : switch문의 중괄호 안쪽에 위치하고 있다. 이 중괄호가 switch문의 그룹이다.
		// *case1, case2, case3에서 각 숫자가 일종의 조건이다.
		// *switch(1)의 괄호안의 숫자가 1이면 case 1이 샐행된다. switch(2)의 괄호안의 숫자가 2이면 case2, switch(3)이면 case3이 실행된다.
		// *만약 숫자 1을 switch()의 괄호안에 넣었을 경우에는 case1만 실행되는 것이 아닌 case2, case3도 차례대로 실행이 된다.
		// *2를 넣으면 case2를 포함한 그 뒤의 case3을 순차적으로 실행한다. 

	}

}
