package org.opentutorials.javatutorials._940_method;

public class _4_MethodDemo {

			// 메소드의 입력값1
			// 메소드의 핵심적 가치 : 재활용성 (이미 정의한 로직을 다시 실행할 수 있다는 것이 핵심적 가치이다.)
			
			// 어떤 값을 일력했을 때 그 입력에 따라 메소드가 동작하는 방식이 달라져서 그 결과를 출력한다면 똑같은 메소드를 굳이 또 한 번 만들 필요가 없다.(재활용성이 높다는 뜻)
			
			// 입력값 : 메소드에서 입력은 매개변수와 인자라는 것을 통해 이뤄진다.
			// numbering() 메소드에 입력값을 전달.
	public static void numbering(int limit){ // 바뀌지 않는 부분의 로직을 만드는 방법이다.
		
		int i = 0;
		while (i<limit){
			System.out.println(i);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		
		// numbering()이라는 메소드에 입력값(10이나 2 같은 숫자)을 주고 그 입력값에 따라 출력값이 달라지는 모습을 볼 수 있다.
		numbering(5);
		System.out.println("-------");
		numbering(2);
	}

	// 입력값을 주는 법을 배우고, 입력값을 어떻게 numbering()이라는 메소드가 받을 수 있게 처리했는지 배우는 것이 이번 수업의 핵심.
	// numbering 메소드 이름 뒤()안에 int limit이라는 변수를 선언 -> 정수만 받을 수 있는 변수이다
	// 컴터가 numbering()을 만나면 위에서 정의된 메소드를 호출하기 위해 위로 올라간다 -> numbering()메소드를 호출할 때 숫자5를 limit에 전달한다.
	// -> 그럼 limit에 5개 치환되고 while문의 조건에서도 limit은 5로 정의되어 조건문이 돌아간다.
	
	// 같은 경우이다(풀어쓴 경우) : 바뀌지 않는 부분과 바뀔 수 있는 부분이 함께 공존하는 상태이다. -> 바뀌지 않는 부분만으로 만들기 위해서 numbering(int limit)로 만들어 버린것.
//  public static void numbering(){
//	int limit = 5;
//	int i = 0;
//	while(i<limit){
//		System.out.println(i);
//		i++;
//		}
//  }
	
	// int limit, (5)는 입력값을 위한, 입력을 위한 도구이다.
	// limit : 변수 limit은 '매개변수(파라미터, parameter)'라고 한다. 입력값(5)을 수용하기 위한 변수가 정의된 부분을 매개변수 또는 파라미터라고 한다.
	// numbering(5)의 (5)의 값 : 인자 또는 아규먼트(argument)라고 한다. 매개변수에 어떤 값을 전달하는 값
	
	
}

