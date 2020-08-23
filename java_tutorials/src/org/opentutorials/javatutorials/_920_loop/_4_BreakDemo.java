package org.opentutorials.javatutorials._920_loop;

public class _4_BreakDemo {

	public static void main(String[] args) {
		
		// 3. 반복문이 없다면?
		// 직접 손으로 코딩해야한다.
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		
		// 10번 반복 코드
		int i = 0;
		while(i<10){
			System.out.println("coding everybody");
			i++;
		}
		
		// 조건이 계속 바뀌는 경우의 코드
		int max = 10; // -> 조건이 바뀔때마다 max값을 조정해주면 된다. 즉, 바뀔 수 있는 부분이다. 나머지 로직들은 바뀌지 않는 부분이다.
		int j = 0;
		while(j < max){
			System.out.println("coding everybody"+(j+1)*2);
			j++;
		}
		
		// 4. 반복문의 제어
		// 이전까진 반복문을 종료시키는 방법은 for문이나 while문에서 반복조건 또는 종료조건이라고 하는 부분을 참이나 거짓으로 지정하는 것에 따라 반복문이 계속되거나 종료되었다.
		// 반복조건을 만족하는 동안 중괄호 안에서 계속해서 코드가 순환해서 동작하는데, 동작하는 과정에서 어떤 조건에 도달했을 떄 종료조건과는 무관하게 중괄호 안의 로직에서 어떤 조건을
		// 만족하면 그 안에서 반복을 종료하거나 반복을 한 번 생략하고 그 다음 반복으로 건너뛰게 하는 방법이 있다.
		
		// break를 이용한 반복문 제어
		for(int k = 0; k < 10; k++){
			if(k==5) 
				break; // k의 값이 5와 같을 때 break를 한다는 것이다. break를 만나면 이 반복문은 그 순간 종료되고, 반복문 밖의 코드가 계속해서 실행된다.
			System.out.println("coding everybody"+k);
		}
		
		// **참고**
		// if(k==5)          ->        if(k==5){ 중괄호 안의 코드가 break 처럼 한 줄로만 작성이 되어있으면 중괄호{}는 생략가능하다. but, 한 줄 이상이면 반드시 중괄호를 넣어야 한다.
		//		break;						break;
		//									}
		
	}

}
