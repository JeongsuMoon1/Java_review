package org.opentutorials.javatutorials._950_io;

import java.util.Scanner;

public class _4_ScannerDemo2 {

	public static void main(String[] args) {
		
		// 사용자 입력을 통해 계속 상호작용하는 예제1
		Scanner sc = new Scanner(System.in); // System.in : 사용자가 키보드로 입력한 값을 얻어오라는 뜻이다.
		while(sc.hasNextInt()){
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();

	}

}
