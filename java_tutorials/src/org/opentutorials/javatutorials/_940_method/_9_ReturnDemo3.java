package org.opentutorials.javatutorials._940_method;

public class _9_ReturnDemo3 {

	// �������� ���� ��ȯ�ϰų� ����ϴ� ��� -> �迭�� ȿ���� ��Ÿ���� �����̴�.
	// �޼ҵ帶�� ���� �ٸ� ���� ��ȯ
	public static String getMember1(){
		return "������";
	}
	
	public static String getMember2(){
		return "������";
	}
	
	public static String getMember3(){
		return "���̶�";
	}
	
	// �׳� ����11
	public static void getMember4(){
		String name = "������";
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		System.out.println(getMember1());
		System.out.println(getMember2());
		System.out.println(getMember3());
		
		// �׳� ����11
		getMember4();
		
	}
	
	// �츮�� �ϰ���� ���� �ϳ��� �޼ҵ尡 "������", "������", "���̶�"�̶�� ������ �Ѳ����� ��ȯ�ϰ� �ϰ� ���� ���̴�. -> �� �� ����� �� �ִ� ���� �迭�̴�.

}
