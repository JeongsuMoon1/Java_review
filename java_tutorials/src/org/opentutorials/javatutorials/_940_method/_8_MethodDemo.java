package org.opentutorials.javatutorials._940_method;

import java.io.*; // �ϴ� ����

public class _8_MethodDemo {

	// �޼ҵ� �ȿ��� ����� ���
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
		
		// out.txt��� ������ ����� �� ���Ͽ� result���� ����ϴ� �ڵ��̴�.
		try{ // �ϴ� ����
			// ���� ���� out.txt��� ���Ͽ�
			// numbering �޼ҵ尡 ��ȯ�� ���� �����մϴ�.
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e){
		} // �ϴ� ����
		
		// �� �ڵ带 �����ϸ� ������Ʈ�� ��Ʈ ���͸��� out.txt��� ������ ���������, �� ������ ����� ���Ͼȿ� 1234��� ���� ��ϵ� ������ Ȯ���� �� �ִ�.
		
	}

}
