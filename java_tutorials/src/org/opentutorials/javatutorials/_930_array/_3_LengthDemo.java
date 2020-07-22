package org.opentutorials.javatutorials._930_array;

public class _3_LengthDemo {

	public static void main(String[] args) {
		
		// 배열의 길이 확인    -> 밑의 코드는 위에서 작성된 코드와 정확하게 같은 의미로 사용되고 있다. 한 번이 아니라 배열의 데이터를 분할해서 정의하는 것이다.
				//타입              변수명
				String[] classGroup = new String[4]; 
				classGroup[0] = "최진혁"; // 0번째 자리에 최진혁이라는 뜻이다.
				System.out.println(classGroup.length);
				classGroup[1] = "최유빈"; // 1번째 자리에 최유빈이라는 뜻이다.
				System.out.println(classGroup.length);
				classGroup[2] = "한이람"; // 2번째 자리에 한이람이라는 뜻이다.
				System.out.println(classGroup.length);
				classGroup[3] = "이고잉";
				System.out.println(classGroup.length);
				// 첫번째 : 배열을 정의하는 또 다른 방법
				// 		 -> new String[4]; : 문자열 만드는 방법이다. 배열을 정의할 때는 new라는 것을 사용한다.
				//		 -> 배열을 만들기 위해서 꼭 사용하는 것은 아니다(여러가지 방법 중 하나이다.) 
				//		 -> 현재 문자열 배열을 만들기 위해서 String[]의 대괄호를 사용한 것이지, 다른 타입을 사용할 때는 또 달라질 것이다.
				//		 -> 배열에 담으려는 값이 4가 아닌 10개라면 new String[10];이다. 
				//		 -> 만약 String[100]이라 정의하고 100보다 많은 것을 담으려고 하면 에러가 난다 -> 이런 문제를 해결하는 방법은 뒤에서 논의하겠다.
				
				// 두번째 : 배열에 담긴 데이터의 개수를 알아보는 방법
				//		 -> System.out.println(classGroup.length)의 변수명 classGroup뒤에 점(.)을 찍고 length을 붙이면 변수에 담긴 배열이 담을 수 있는 원소의 개수를 가져온다.
				//			점(.)을 찍는 부분은 뒤에 객체지향에서 따로 배울 것이다.
				//		 -> .length 는 classGroup변수에 담긴 값이 몇 개 들어있는지 알려주는 것이 아니고, 변수에 담긴 배열이 몇 개의 값을 수용할 수 있는지 알려주는 값이다.
				
				System.out.println(classGroup[0]);
				System.out.println(classGroup[1]);
				System.out.println(classGroup[2]);
				System.out.println(classGroup[3]);

	}

}
