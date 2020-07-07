package org.opentutorials.javatutorials._940_method;

import java.io.*; // 일단 무시

public class _8_MethodDemo {

	// 메소드 안에서 결과를 출력
	public static String numbering(int init, int limit){
		
		int i = init;
		
		String output = "";
		
		while(i<limit){
			output += i;
			i++;
		}
		
		return output;
		
	}
	
	
	public static void main(String[] args) {

		String result = numbering(1,5);
		System.out.println(result);
		
		// out.txt라는 파일을 만들고 그 파일에 result값을 기록하는 코드이다.
		try{ // 일단 무시
			// 다행 행은 out.txt라는 파일에
			// numbering 메소드가 반환한 값을 저장합니다.
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e){
		} // 일단 무시
		
		// 이 코드를 실행하면 프로젝트의 루트 디렉터리에 out.txt라는 파일이 만들어지고, 그 파일을 열어보면 파일안에 1234라는 값이 기록돼 있음을 확인할 수 있다.
		
	}

}
