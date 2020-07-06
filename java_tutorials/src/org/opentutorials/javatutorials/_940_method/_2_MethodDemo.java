package org.opentutorials.javatutorials._940_method;

public class _2_MethodDemo {

	public static void main(String[] args) {
		
		// main : 약속
		// 실행하고자 하는 명령이나 하고자 하는 작업이 있다면 public static void main이라는 형식의, 이름이 main이고 public static void같은 속성을 지닌 메소드를 정의해서
		// 그 메소드의 본문에 코드를 위치시키기로 약속된 것이다.
		// 이름이 main인 메소드를 구현해 놓으면 자바가 실행될 때 그 main이라는 메소드를 호출하도록 약속돼 있다.
		
		// 메소드를 사용하지 않는 예제
		int i = 0;
		while(i<10){
			System.out.println(i);
			i++;
		}
		
		i = 0;
		while(i<10){
			System.out.println(i);
			i++;
		}

		i = 0;
		while(i<10){
			System.out.println(i);
			i++;
		}
		
		i = 0;
		while(i<10){
			System.out.println(i);
			i++;
		}
		
		// 반복문의 중첩
		int j = 0;
		while (j<5){
			i = 0;
			while(i<10){
				System.out.println(i);
				i++;
			}
			j++;
		
		}

	}

}









