package org.opentutorials.javatutorials._930_array;

public class _5_ForeachDemo {

	public static void main(String[] args) {
		
		// 반복문 : while문 -> for문
		// for문과 배열을 결합해서 사용하다가 그 목적에만 주목하는 문법이 나온 것.
		String[] members = {"최진혁","최유빈","한이람"};
		
		for(String e : members){ 
			
//			String member = members[i]; // 대괄호[]를 안쓴 String이다. 즉, 그냥 문자열을 담는 변수 선언이다.
//			본래라는 members 배열안에 있는 데이터를 member라는 String변수로 다시 선언한 이후 하나하나 for을 돌리면서 대입을 시키고 출력하여
//			로직을 짜야하지만, for-each는 e를 미리 for문 조건절에 포함시켜 버려서 then절에 더 이상의 로직을 안 써도 된다.
			
			System.out.println(e+"이 상담을 받았습니다.");
		}
		// members 변수가 for문으로 왔다. 그 뒤의 콜론(:) 뒤에 e변수의 데이터 형식으로 String을 지정하고 있다.
		// 콜론(:)뒤에 따라오는 emebers에 담긴 값을 반복문이 동작할 때마다 하나씩 꺼내서 e변수에 담아주도록 약속돼 있다.
		// 그러면 이 반복문 안에서는 e변수의 값을 사용해 members에 담긴 최진혁,최유진,한이람을 하나씩 꺼내서 어떤 처리를 할 수 있게 된다.
		// 이런 문장을 쓰는 이유는 그 만큼 중요한 배열과 반복문은 떼려야 뗄 수 없는 관계에 있는 것이다.
		
//		연습용
//		String[] mem = {"1","2","3"};
//		for(String e : mem){
//			System.out.println(e+"이렇게 된다");
//		}
		
	}

}
