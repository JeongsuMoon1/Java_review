package org.opentutorials.javatutorials._940_method;

public class _3_MethodDemo {
	// 메소드가 없다면?
	// numbering() 메소드를 이용
	
	public static void numbering(){
		
		int i = 0;
		
		while(i<10){
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		numbering();
		numbering();
		numbering();
		numbering();
		numbering();

	}
	
	// 메소드를 이해하는 핵심적인 코드는 이미 정의해 놓은 로직을 재활용할 수 있다는 축면이다.
	// 재활용할 수 있으므로 코드의 양을 줄일 수 있다.
	// 코드의 양을 극단적으로 줄일 수 있고, 재활용성이 높아진다는 것은 유지보수가 유리해진다는 뜻이다.
	// 유지보수 : 코드에 어떤 문제나 버그가 있을 때 이를 고친다거나 코드를 개선할 수 있는 여지가 있을 때 그러한 변화를 보통 유지보수라고 한다.
	// 반복되는 코드를 하나하나 다 고치는 것이 아니라, 메소드 하나만 고치면 나머지는 자동으로 고쳐지기 때문이다.

}
