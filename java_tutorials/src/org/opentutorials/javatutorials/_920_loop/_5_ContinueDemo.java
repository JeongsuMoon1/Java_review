package org.opentutorials.javatutorials._920_loop;

public class _5_ContinueDemo {

	public static void main(String[] args) {
		
		//continue�� �̿��� �ݺ��� ����
				for(int l = 0; l < 10; l++){
					if(l==5)
						continue; // l�� ���� 5�� ���� ��, continue�� ������ �� ���� ���� ���� ���� �ݺ��� �ϴ� �����ȴ�.
								  // �� ��, continue���� ���߱� ������ System.out.println�κ��� ���� ������ �ȵȴ�.
								  // �� ���� �ݺ��� ���� ��, l�� 5���� l++�� �ž� 6�� �Ǹ鼭 �ݺ����� �̾ ������ �ȴ�.
					System.out.println("coding everybody"+l);
				}
				
		// ��� : �ݺ����� ����Ǵٰ� continue�� ������ �� ������ �ϴ� ���߰� �ٽ� for������ �ö� ����ؼ� ����Ǵ� ���̴�. �ݴ�� break�� ������ �� ������ �ݺ����� ������ �ݺ��� �ٱ��� ������ ����ؼ� ����ȴ�.

	}

}
