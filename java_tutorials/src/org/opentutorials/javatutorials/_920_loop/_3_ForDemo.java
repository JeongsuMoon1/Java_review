package org.opentutorials.javatutorials._920_loop;

public class _3_ForDemo {

	public static void main(String[] args) {
		
		// for문 : while문을 기반하고 있다. while문을 잘 상기하고 있어야 for문을 공부하는데 방해가 없다.
		
		// for(초기화 ; 종료조건; 반복실행){ -> ;(세미콜론)으로 각 조건들을 구분함., 이 세덩어리가 모여 어제까지 반복할 것인지 지정하는 로직이 된다.
		// 		반복적으로 실행될 구문
		// }

		for(int i = 0; i < 10; i++){
			System.out.println("coding everybody " + i);
		}
		
		// int i = 0 ; -> 초기화한다. for문이 실행될 떄 맨 먼저 한 번만 실행하도록 약속돼 있음.
		// 코드가 실행되면 i값은 0부터 시작하고 0 < 10 이므로 한 번더 실행을 한다. -> 0을 출력하고 -> 1을 증가시킨다 -> 반복
		// i가 10과 같거나 초과하는 시점에 for문은 false가 되므로 for문 실행을 중단하고 for문 밖의 코드를 실행해 나간다.
		
		for (int i = 5; i < 10; i++){
			System.out.println("coding everybody " + i);
		}
		
		for (int i = 5; i < 20; i++){
			System.out.println("coding everybody " + i);
		}
		
		for (int i = 5; i < 20; i=i+2){ // 5에서 시작해서 2씩 증가하는 로직이다.
			System.out.println("coding everybody " + i);
		}
		
		for (int i = 10; i>0; i=i-1){ // 부등호의 방향을 바꾸고 큰수에서 작은수로 내려오는 로직.
			System.out.println("coding everybody " + i);
		}
		
		for (int i = 20; i>10; i=i-2){
			System.out.println("coding everybody " + i);
		}
		
	}

}
