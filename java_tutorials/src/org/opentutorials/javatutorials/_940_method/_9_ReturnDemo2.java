package org.opentutorials.javatutorials._940_method;

public class _9_ReturnDemo2 {

	// �޼ҵ忡�� return���� ������ ���
	public static String num(int i){
		if(i==0){
			return "zero";
		}else if(i==1){
			return "one"; // i�� ���� 1�̱� ������ return "one";�� ������ �ǰ� �޼ҵ尡 ���ᰡ �ȴ�.
		}else if(i==2){
			return "two";
		}
		return "none";
	}
	
	public static String numm(int j){
		if(j==0){
			return "zero";
		}else if(j==1){
			return "one";
		}else if(j==2){
			return "two";
		}else{
			return "none";	
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(num(1));
		System.out.println(numm(2));
	}

}
