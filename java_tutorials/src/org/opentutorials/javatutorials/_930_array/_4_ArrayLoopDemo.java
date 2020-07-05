package org.opentutorials.javatutorials._930_array;

public class _4_ArrayLoopDemo {

	public static void main(String[] args) {
		
		// 04. 반복문과 배열의 조화
		
		// 반복문을 이용해 배열의 원소를 순회
		String[] members = {"최진혁","최유빈","한이람"}; // members 변수는 문자열 데이터로 구성됨.
		for(int i = 0; i < members.length; i++){ // i값이 0으로 시작해서 i값이 3(members의 배열의 자리값)보다 작을 동안 1씩 증가하면서 for문안의 구문을 반복실행함. 
			String member = members[i]; // 대괄호[]를 안쓴 String이다. 즉, 그냥 문자열을 담는 변수 선언이다.
			System.out.println(member + "이 상담을 받았습니다.");
		}
		
		// 배열과 반복문의 궁합 또는 조화는 굉장히 중요한 요소이다. 응용의 여지가 있으니 잘 이해해둘 것.

	}

}
