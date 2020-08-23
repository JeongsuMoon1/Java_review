package org.opentutorials.javatutorials._940_method;

public class _9_ReturnDemo4 {

	// 우리가 하고싶은 것은 하나의 메소드가 "최진혁", "최유빈", "한이람"이라는 세명을 한꺼번에 반환하게 하고 싶은 것이다. -> 이 때 사용할 수 있는 것이 배열이다.
	// 메소드에서 문자열 배열을 반환
	public static String[] getMembers(){ // getMembers() 메소드가 반환하는 반환값이 문자열 데이터로 구성된 배열이라는 뜻이다.
		String[] members = {"최진혁", "최유빈", "한이람"};
		return members;
	}	
	// return에서 members를 반환한다. 그러면 이 getMembers()라는 메소드가 반환하는 값은 배열이라서 getMembers()가 반환하는 값은 배열로 받게 된다.
	// 따라서 getMembers()는 반환을 한 번만 하지만 반환하는 값이 배열이라서 배열 안에 여러개의 값이 들어갈 수 있게 된다.
	
	public static void main(String[] args) {
		
		String[] members = getMembers();
		
		for(int i = 0; i < members.length; i++){
			String result = members[i];
			System.out.println(result);
		}
		
		// 그냥 한 예제22 for-each문
		for(String e : members){
			System.out.println(e);
		}
	}
	
	// return에 한정되는 것이지만, 메소드가 인자값을 주면 그것은 입력값이 된다.
	// 그 입력값을 배열로 받으면 여러 개의 인자를 콤마(,)로 구분해서 배치하지 않아도 하나의 값에 여러 개의 데이터를 담아서 메소드로 전달할 수 있다.
	
	// 메소드는 프로그램을 거대화하게하는데 으뜸이다.
	// 객체지향도 메소드와 같은 취지를 가지고 있다.

}
