package org.opentutorials.javatutorials._920_loop;

public class _4_BreakDemo {

	public static void main(String[] args) {
		
		// 3. �ݺ����� ���ٸ�?
		// ���� ������ �ڵ��ؾ��Ѵ�.
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		System.out.println("coding everybody");
		
		// 10�� �ݺ� �ڵ�
		int i = 0;
		while(i<10){
			System.out.println("coding everybody");
			i++;
		}
		
		// ������ ��� �ٲ�� ����� �ڵ�
		int max = 10; // -> ������ �ٲ𶧸��� max���� �������ָ� �ȴ�. ��, �ٲ� �� �ִ� �κ��̴�. ������ �������� �ٲ��� �ʴ� �κ��̴�.
		int j = 0;
		while(j < max){
			System.out.println("coding everybody"+(j+1)*2);
			j++;
		}
		
		// 4. �ݺ����� ����
		// �������� �ݺ����� �����Ű�� ����� for���̳� while������ �ݺ����� �Ǵ� ���������̶�� �ϴ� �κ��� ���̳� �������� �����ϴ� �Ϳ� ���� �ݺ����� ��ӵǰų� ����Ǿ���.
		// �ݺ������� �����ϴ� ���� �߰�ȣ �ȿ��� ����ؼ� �ڵ尡 ��ȯ�ؼ� �����ϴµ�, �����ϴ� �������� � ���ǿ� �������� �� �������ǰ��� �����ϰ� �߰�ȣ ���� �������� � ������
		// �����ϸ� �� �ȿ��� �ݺ��� �����ϰų� �ݺ��� �� �� �����ϰ� �� ���� �ݺ����� �ǳʶٰ� �ϴ� ����� �ִ�.
		
		// break�� �̿��� �ݺ��� ����
		for(int k = 0; k < 10; k++){
			if(k==5) 
				break; // k�� ���� 5�� ���� �� break�� �Ѵٴ� ���̴�. break�� ������ �� �ݺ����� �� ���� ����ǰ�, �ݺ��� ���� �ڵ尡 ����ؼ� ����ȴ�.
			System.out.println("coding everybody"+k);
		}
		
		// **����**
		// if(k==5)          ->        if(k==5){ �߰�ȣ ���� �ڵ尡 break ó�� �� �ٷθ� �ۼ��� �Ǿ������� �߰�ȣ{}�� ���������ϴ�. but, �� �� �̻��̸� �ݵ�� �߰�ȣ�� �־�� �Ѵ�.
		//		break;						break;
		//									}
		
	}

}
