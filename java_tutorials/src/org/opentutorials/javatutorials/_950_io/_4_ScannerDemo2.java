package org.opentutorials.javatutorials._950_io;

import java.util.Scanner;

public class _4_ScannerDemo2 {

	public static void main(String[] args) {
		
		// ����� �Է��� ���� ��� ��ȣ�ۿ��ϴ� ����1
		Scanner sc = new Scanner(System.in); // System.in : ����ڰ� Ű����� �Է��� ���� ������� ���̴�.
		while(sc.hasNextInt()){
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();

	}

}
