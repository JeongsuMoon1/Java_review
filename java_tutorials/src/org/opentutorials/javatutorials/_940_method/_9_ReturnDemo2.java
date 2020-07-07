package org.opentutorials.javatutorials._940_method;

public class _9_ReturnDemo2 {

	// 메소드에서 return문을 여러개 사용
	public static String num(int i){
		if(i==0){
			return "zero";
		}else if(i==1){
			return "one"; // i의 값이 1이기 때문에 return "one";을 만나게 되고 메소드가 종료가 된다.
		}else if(i==2){
			return "two";
		}
		return "none";
	}
	
	public static void main(String[] args) {
		
		System.out.println(num(1));

	}

}
