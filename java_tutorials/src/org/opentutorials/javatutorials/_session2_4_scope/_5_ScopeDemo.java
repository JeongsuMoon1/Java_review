package org.opentutorials.javatutorials._session2_4_scope;



//		[예제23.5] for문에 선언된 변수에 접근

public class _5_ScopeDemo {

	
	
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++){
			System.out.println(i);
		}
//		오류코드
//		System.out.println(i);   -> 에러 발생 이유 : 변수 i는 for문에서 선언됐고 이 변수는 중괄호 사이에서만 유효하기 때문에
//									       	      중괄호 바깥쪽에서는 존재하지 않는 변수를 화면에 출력하는 것으로 간주하기 때문.
	}

}
