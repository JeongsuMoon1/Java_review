package org.opentutorials.javatutorials._900_condition;

public class _8_3_SwitchDemo {

	public static void main(String[] args) {
		
		// switch문에 default문을 추가
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
		default:
			System.out.println("default");
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
		default:
			System.out.println("default");
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
		default:
			System.out.println("default");
			break;
		}
		
		System.out.println("switch(4)");
		switch(4){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
			break;
		}
		
		// switch문에서 조건에 들어온 값이 case문의 어디에도 속하지 않는다면 default로 정의된 부분이 실행된다.
		
		// *switch에는 case라는 구문이 있고, 이 switch문이 가진 시각적인 특성 덕분에 비교해야 할 조건이 아주 많다면 if문보다 보기가 편할 것이다. 이럴 떄는 switch문을 쓰는게 좋다.
		// **switch문의 뒤에 나오는 괄호()안에 들어가는 값은 몇가지 형태가 제한돼 있다 : byte, short, char, int, enum, String, Character, Byte, Short, Integer 형태의 데이터 타입 및 클래스만 switch문의 조건에 들어갈 수 있다.
		
	}

}
