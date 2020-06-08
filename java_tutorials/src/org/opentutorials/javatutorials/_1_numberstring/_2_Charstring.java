package org.opentutorials.javatutorials._1_numberstring;

public class _2_Charstring {

	public static void main(String[] args) {
		

		// 믄자
		// A도 문자, B도 문자
		// AB는 문자열
		// character : 문자   '' 으로 구분
		// string : 문자열       "" 으로 구분
		
		System.out.println('생');
		System.out.println("생활코딩");
		
		// 문자열을 '' 으로 묶으면 오류발생
		// 오류코드
		//System.out.println('생활코딩');
		
		// 문자를 ""으로 묶으면 문자열로 인식하여 에러발생 안한다
		System.out.println("생");
		
		// + 연산자를 사용하여 문자도 더할 수 있다.
		System.out.println("생활코딩" + "입니다");
		
		// 숫자에 ""을 감싸면 문자열로 인식하여 1+1=2 가 성립되지 못한다.
		System.out.println(1+1);
		System.out.println("1"+"1"); // 문자열 1과 문자열1이 합쳐서 11이 된다(문자열을 나열한 것이 된다).
		
		// 역슬러시 \를 사용하면 문자열 안에서 표현하고 싶어하는 기호를 집어 넣을 수 있다.
		System.out.println("egoing said\"Welcome programming world\"");
		
		// 줄 바꿈
		System.out.println("egoing said\n\"Welcome programming world\"");
		
	}

}