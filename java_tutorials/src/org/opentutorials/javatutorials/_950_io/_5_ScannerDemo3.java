package org.opentutorials.javatutorials._950_io;

import java.util.Scanner;
import java.io.*;

public class _5_ScannerDemo3 {
	
	public static void main(String[] args){
		
		// ���Ϸκ��� �Է¹ޱ�
		try{
			File file = new File("out.txt"); 
			Scanner sc = new Scanner(file); // file(out.txt)�� Scanner�� �Է°����� ���ٴ� ���̴�.
			while(sc.hasNextInt()){
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		}catch(FileNotFoundException e){  // try-catch(����ó�� ����) : out.txt��� ������ ã�� �� ���ٸ�, �׶� ������ ������ ȭ�鿡 ����ϰ� �Ѵ�.
										  // ���� : ���α׷��� �����ϴ� �������� �������� ���ߴ�, �������� �帧������ �Ͼ�� ���� ���� �߻����� �� � ���� ó���϶�� �����ϴ� ����̴�.
			e.printStackTrace();
		}
	}

}
