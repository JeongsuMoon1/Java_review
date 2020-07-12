package org.opentutorials.javatutorials._950_io;

import java.util.Scanner;
import java.io.*;

public class _5_ScannerDemo3 {
	
	public static void main(String[] args){
		
		// 파일로부터 입력받기
		try{
			File file = new File("out.txt"); 
			Scanner sc = new Scanner(file); // file(out.txt)이 Scanner의 입력값으로 들어간다는 뜻이다.
			while(sc.hasNextInt()){
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		}catch(FileNotFoundException e){  // try-catch(예외처리 구문) : out.txt라는 파일을 찾을 수 없다면, 그때 에러의 내용을 화면에 출력하게 한다.
										  // 예외 : 프로그램을 동작하는 과정에서 예상하지 못했던, 정상적인 흐름에서는 일어나지 않을 일이 발생했을 때 어떤 일을 처리하라고 지정하는 기능이다.
			e.printStackTrace();
		}
	}

}
