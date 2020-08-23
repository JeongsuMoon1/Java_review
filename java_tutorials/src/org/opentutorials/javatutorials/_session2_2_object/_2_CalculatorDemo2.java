package org.opentutorials.javatutorials._session2_2_object;

public class _2_CalculatorDemo2 {

	// 2. 메소드로 중복을 제거
	
	public static void sum(int left, int right){
		System.out.println(left+right);
	}
	
	public static void main(String[] args) {
		
		sum(10,20);
		sum(20,40);

	}
	
	// _1_CalculatorDemo와 로직은 똑같은데 중복을 제거함(건강한 코드).
	// 이러한 절차를 리책터링(refactoring)이라고 한다 : 기존 코드와 동일하게 동작하지만 코드의 내용을 개선해서 더 효율적으로 만드는 행위를 의미.
	
	
}
