package org.opentutorials.javatutorials._930_array;

public class _3_LengthDemo {

	public static void main(String[] args) {
		
		// �迭�� ���� Ȯ��    -> ���� �ڵ�� ������ �ۼ��� �ڵ�� ��Ȯ�ϰ� ���� �ǹ̷� ���ǰ� �ִ�. �� ���� �ƴ϶� �迭�� �����͸� �����ؼ� �����ϴ� ���̴�.
				//Ÿ��              ������
				String[] classGroup = new String[4]; 
				classGroup[0] = "������"; // 0��° �ڸ��� �������̶�� ���̴�.
				System.out.println(classGroup.length);
				classGroup[1] = "������"; // 1��° �ڸ��� �������̶�� ���̴�.
				System.out.println(classGroup.length);
				classGroup[2] = "���̶�"; // 2��° �ڸ��� ���̶��̶�� ���̴�.
				System.out.println(classGroup.length);
				classGroup[3] = "�̰���";
				System.out.println(classGroup.length);
				// ù��° : �迭�� �����ϴ� �� �ٸ� ���
				// 		 -> new String[4]; : ���ڿ� ����� ����̴�. �迭�� ������ ���� new��� ���� ����Ѵ�.
				//		 -> �迭�� ����� ���ؼ� �� ����ϴ� ���� �ƴϴ�(�������� ��� �� �ϳ��̴�.) 
				//		 -> ���� ���ڿ� �迭�� ����� ���ؼ� String[]�� ���ȣ�� ����� ������, �ٸ� Ÿ���� ����� ���� �� �޶��� ���̴�.
				//		 -> �迭�� �������� ���� 4�� �ƴ� 10����� new String[10];�̴�. 
				//		 -> ���� String[100]�̶� �����ϰ� 100���� ���� ���� �������� �ϸ� ������ ���� -> �̷� ������ �ذ��ϴ� ����� �ڿ��� �����ϰڴ�.
				
				// �ι�° : �迭�� ��� �������� ������ �˾ƺ��� ���
				//		 -> System.out.println(classGroup.length)�� ������ classGroup�ڿ� ��(.)�� ��� length�� ���̸� ������ ��� �迭�� ���� �� �ִ� ������ ������ �����´�.
				//			��(.)�� ��� �κ��� �ڿ� ��ü���⿡�� ���� ��� ���̴�.
				//		 -> .length �� classGroup������ ��� ���� �� �� ����ִ��� �˷��ִ� ���� �ƴϰ�, ������ ��� �迭�� �� ���� ���� ������ �� �ִ��� �˷��ִ� ���̴�.
				
				System.out.println(classGroup[0]);
				System.out.println(classGroup[1]);
				System.out.println(classGroup[2]);
				System.out.println(classGroup[3]);

	}

}
