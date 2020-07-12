package org.opentutorials.javatutorials._session2_2_object;

public class _3_CalculatorDemo3 {

	// 메소드를 이용해 프로그램을 작성하다 보면 결국에는 메소드가 많아질 것이고, 그 과정에서 또 다른 문제가 발생된다.
	
	// 개선이 필요한 예제
	
	// 평균 메소드
	public static void avg(int left, int right){
		System.out.println((left+right)/2);		
	}
	
	// 합계 메소드
	public static void sum(int left, int right){
		System.out.println(left+right);
	}
	
	public static void main(String[] args) {
		
		int left, right;
		
		// 첫번째 그룹
		left = 10;
		right = 20;
		
		sum(left, right);
		avg(left, right);
		
		// 두번째 그룹
		left = 20;
		right = 40;
		
		sum(left, right);
		avg(left, right);
		
		// left, right과 sum(), avg()의 거리가 점점 멀어진다는 것 : 유지보수하는 거이 어렵다는 뜻이다.
		
		
		
		

	}

}
