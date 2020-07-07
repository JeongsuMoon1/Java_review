package org.opentutorials.javatutorials._940_method;

public class _7_MethodDemo {

	// 메소드의 출력값2
	
	// return으로 메소드값을 외부로 반환하는 이유 : 부품으로서 메소드의 가치를 높이기 위한 것
	
//	// 메소드 안에서 결과를 출력
//	public static void numbering(int init, int limit){
//		int i = init;
//		while(i<limit){
//			System.out.println(i);
//			i++;	
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		numbering(1,5);
//		
//
//	}
	// 만약, 메소드의 값을 출력하는 방식을 변경하였을 경우(파일로 저장, 이메일로 전달,.. etc)요건이 변경된 경우, 메소드에 이미 출력 방법이 내장돼 있어서 이 메소드 하나만으로 그 모든일을 처리할 수 없을 것이다.
	// System.out.println(i); 처럼 화면에 출력하는 방법이 딱 하나만 정해져있으면 상관없지만, 출력 방법이 여러개로 나타내게 할려면 사용할 수가 없다. 즉, numbering()의 부품으로서의 가치가 떨어지는 것이다.
	// 즉, System.out.println(i)을 바깥으로 빼고, numbering()메소드의 반환값을 인자로 전달해서 처리
	
	public static String numbering(int init, int limit){
		int i = init;
		// 만들어지는 숫자를 output 변수에 담기 위해
		// 변수에 빈  값을 할당한다.
		String output = "";
		while(i<limit){
			// 숫자를 화면에 출력하는 대신 output 변수에 담았다.
			output += i;
			i++;
		}
		// 중요!!! output에 담긴 문자열을 메소드 외부로 반환하려면
		// 아래와 같이 return 키워드 뒤에 반환하려는 값을 배치하면 된다.
		return output;
		
	}
	
	public static void main(String[] args){
		
		// numbering 메소드가 반환한 값이 result 변수에 담긴다.
		String result = numbering(1,5);
		// result 변수의 값을 화면에 출력한다.
		System.out.println(result);
		// mail(result); -> 메일로 전달하고자 할 때 그냥 사용하면 된다.
		// file(result); -> 파일로 저장하고자 할 때 그냥 사용하면 된다.    즉, return 시킨 메소드를 사용하면 재활용성이 좋아진다.(하나로 여러가지 방법에 대응할 수 있다)
		
		
	}

}












