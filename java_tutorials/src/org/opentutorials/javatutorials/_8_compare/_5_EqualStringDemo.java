package org.opentutorials.javatutorials._8_compare;

public class _5_EqualStringDemo {

	public static void main(String[] args) {
		
		// ���ڿ��� ���� ���� �����ؾ� �Ѵ�.
		// ���ڿ��� ���� ���� =�� �ΰ� �ִ� ==(Equal, ����񱳿�����)�� ���ϴ°� �ƴ϶�,
		// equals() ��� �޼ҵ带 ����ؾ��Ѵ�. ***
		
		String a = "Hello World";
		String b = new String("Hello World"); // �� new String()�� ������ �ڿ��� ������ ���̴�.
		System.out.println(a == b);		 // false
		System.out.println(a.equals(b)); // true

	}

}
