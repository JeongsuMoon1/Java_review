package org.opentutorials.javatutorials._950_io;

import java.util.Scanner; // 1. - scanner�� �ε��ϱ� ����, import : �����´ٴ� ��.
						  //    - java.util.Scanner : java.util�̶�� ��Ű���� �ִ� scanner��� �ǹ���. ��, java.util ��Ű�� �ȿ� �ִ� Scanner��� ��ü�� ����ϰڴٴ� ��.


public class _3_ScannerDemo {

	public static void main(String[] args) {
		
		// scanner : ������ ���̺귯��(�ٸ� ����� ������ ����)
		
		// Scanner ���̺귯���� �̿��� ����� ���� �ޱ�
		Scanner sc = new Scanner(System.in); // Scanner��� ��ü�� ���� ����ٴ� ���̴�.
		int i = sc.nextInt(); // �� ������ ����Ǹ�, ���α׷��� ���⼭ ������ ���߰� ��ٸ��� ���°� �ȴ�(��Ʈ ��, ���ڰ� �ԷµǱ� ������ ��ٸ��� ���°� �ȴ�.)
							  // ��� ������Ʈ�� ���ڸ� �Է��ϰ� ���͸� ġ�� ���� sc.nextInt���� ������ ������ �ִ� �ڹٰ� �ٽ� ����Ǹ鼭 ����ڰ� �Է��� ���� ���� i�� ���� �ȴ�.
		System.out.println(i*1000);
		sc.close();
		
		// 2. Run Ŭ���Ŀ� consoleâ�� 1�� �Է��ϸ� 2000���.
		//    Run�� �����ϸ� _3_ScannerDemo��� ���ø����̼��� ����Ǹ�� main�޼ҵ尡 �ڹٿ� ���� ȣ��� ���̴�.
		

	}

}
