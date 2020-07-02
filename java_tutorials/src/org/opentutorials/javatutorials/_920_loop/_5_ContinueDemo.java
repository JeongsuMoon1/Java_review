package org.opentutorials.javatutorials._920_loop;

public class _5_ContinueDemo {

	public static void main(String[] args) {
		
		//continue를 이용한 반복문 제어
				for(int l = 0; l < 10; l++){
					if(l==5)
						continue; // l의 값이 5가 됐을 때, continue를 만나는 그 순간 현재 실행 중인 반복이 일단 정지된다.
								  // 이 때, continue에서 멈추기 때문에 System.out.println부분은 더는 실행이 안된다.
								  // 그 다음 반복이 됐을 때, l은 5에서 l++이 돼어 6이 되면서 반복문이 이어서 실행이 된다.
					System.out.println("coding everybody"+l);
				}
				
		// 결론 : 반복문이 실행되다가 continue를 만나면 그 순간은 일단 멈추고 다시 for문으로 올라가 계속해서 실행되는 것이다. 반대로 break를 만나면 그 순간에 반복문이 끝나고 반복문 바깥의 내용이 계속해서 실행된다.

	}

}
