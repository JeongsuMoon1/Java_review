package org.opentutorials.javatutorials._930_array;

public class _4_ArrayLoopDemo {

	public static void main(String[] args) {
		
		// 04. �ݺ����� �迭�� ��ȭ
		
		// �ݺ����� �̿��� �迭�� ���Ҹ� ��ȸ
		String[] members = {"������","������","���̶�"}; // members ������ ���ڿ� �����ͷ� ������.
		for(int i = 0; i < members.length; i++){ // i���� 0���� �����ؼ� i���� 3(members�� �迭�� �ڸ���)���� ���� ���� 1�� �����ϸ鼭 for������ ������ �ݺ�������. 
			String member = members[i]; // ���ȣ[]�� �Ⱦ� String�̴�. ��, �׳� ���ڿ��� ��� ���� �����̴�.
			System.out.println(member + "�� ����� �޾ҽ��ϴ�.");
		}
		
		// �迭�� �ݺ����� ���� �Ǵ� ��ȭ�� ������ �߿��� ����̴�. ������ ������ ������ �� �����ص� ��.

	}

}
