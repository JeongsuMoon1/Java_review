package org.opentutorials.javatutorials._920_loop;

public class _3_ForDemo {

	public static void main(String[] args) {
		
		// for�� : while���� ����ϰ� �ִ�. while���� �� ����ϰ� �־�� for���� �����ϴµ� ���ذ� ����.
		
		// for(�ʱ�ȭ ; ��������; �ݺ�����){ -> ;(�����ݷ�)���� �� ���ǵ��� ������., �� ������� �� �������� �ݺ��� ������ �����ϴ� ������ �ȴ�.
		// 		�ݺ������� ����� ����
		// }

		for(int i = 0; i < 10; i++){
			System.out.println("coding everybody " + i);
		}
		
		// int i = 0 ; -> �ʱ�ȭ�Ѵ�. for���� ����� �� �� ���� �� ���� �����ϵ��� ��ӵ� ����.
		// �ڵ尡 ����Ǹ� i���� 0���� �����ϰ� 0 < 10 �̹Ƿ� �� ���� ������ �Ѵ�. -> 0�� ����ϰ� -> 1�� ������Ų�� -> �ݺ�
		// i�� 10�� ���ų� �ʰ��ϴ� ������ for���� false�� �ǹǷ� for�� ������ �ߴ��ϰ� for�� ���� �ڵ带 ������ ������.
		
		for (int i = 5; i < 10; i++){
			System.out.println("coding everybody " + i);
		}
		
		for (int i = 5; i < 20; i++){
			System.out.println("coding everybody " + i);
		}
		
		for (int i = 5; i < 20; i=i+2){ // 5���� �����ؼ� 2�� �����ϴ� �����̴�.
			System.out.println("coding everybody " + i);
		}
		
		for (int i = 10; i>0; i=i-1){ // �ε�ȣ�� ������ �ٲٰ� ū������ �������� �������� ����.
			System.out.println("coding everybody " + i);
		}
		
		for (int i = 20; i>10; i=i-2){
			System.out.println("coding everybody " + i);
		}
		
	}

}
