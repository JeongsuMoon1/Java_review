package org.opentutorials.javatutorials._950_io;

public class _2_InputForeachDemo {

	// ����ڰ� �Է��� �Է°��� ���ø����̼��� args��� �Ű������� �޾Ƽ� �� ���ڰ��� ���ø����̼� ���η� ��������, for-each ������ �̿��� ȭ�鿡 �� ������ ���.
	
	public static void main(String[] args) {
		
		for(String e: args){
			System.out.println(e);
		}
		
		// java -cp bin org.opentutorials.javatutorials._950_io._2_InputForeachDemo one : one�� _2_InputForeachDemo�� �Է°����� ����  args -> e �� one ���� ����. 
		// -> e�� ���� ���� system.out.println�� ���� ���� ��µȴ�.

	}

}
