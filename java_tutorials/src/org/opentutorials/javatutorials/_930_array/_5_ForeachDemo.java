package org.opentutorials.javatutorials._930_array;

public class _5_ForeachDemo {

	public static void main(String[] args) {
		
		// 반복문 : while문 -> for문
		// for문과 배열을 결합해서 사용하다가 그 목적에만 주목하는 문법이 나온 것.
		String[] members = {"최진혁","최유빈","한이람"};
		
		for(String e : members){ 
			System.out.println(e+"이 상담을 받았습니다.");
		}
		// members 변수가 for문으로 왔다. 그 뒤의 콜론(:) 뒤에 e변수의 데이터 형식으로 String을 지정하고 있다.
		// 콜론(:)뒤에 따라오는 emebers에 담긴 값을 반복문이 동작할 때마다 하나씩 꺼내서 e변수에 담아주도록 약속돼 있다.
		// 그러면 이 반복문 안에서는 e변수의 값을 사용해 members에 담긴 최진혁,최유진,한이람을 하나씩 꺼내서 어떤 처리를 할 수 있게 된다.
		// 이런 문장을 쓰는 이유는 그 만큼 중요한 배열과 반복문은 떼려야 뗄 수 없는 관계에 있는 것이다.
		
		
	}

}
