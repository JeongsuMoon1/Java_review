package org.opentutorials.javatutorials._940_method;

public class _9_ReturnDemo4 {

	// �츮�� �ϰ���� ���� �ϳ��� �޼ҵ尡 "������", "������", "���̶�"�̶�� ������ �Ѳ����� ��ȯ�ϰ� �ϰ� ���� ���̴�. -> �� �� ����� �� �ִ� ���� �迭�̴�.
	// �޼ҵ忡�� ���ڿ� �迭�� ��ȯ
	public static String[] getMembers(){ // getMembers() �޼ҵ尡 ��ȯ�ϴ� ��ȯ���� ���ڿ� �����ͷ� ������ �迭�̶�� ���̴�.
		String[] members = {"������", "������", "���̶�"};
		return members;
	}	
	// return���� members�� ��ȯ�Ѵ�. �׷��� �� getMembers()��� �޼ҵ尡 ��ȯ�ϴ� ���� �迭�̶� getMembers()�� ��ȯ�ϴ� ���� �迭�� �ް� �ȴ�.
	// ���� getMembers()�� ��ȯ�� �� ���� ������ ��ȯ�ϴ� ���� �迭�̶� �迭 �ȿ� �������� ���� �� �� �ְ� �ȴ�.
	
	public static void main(String[] args) {
		
		String[] members = getMembers();
		
		for(int i = 0; i < members.length; i++){
			String result = members[i];
			System.out.println(result);
		}
		
		// �׳� �� ����22 for-each��
		for(String e : members){
			System.out.println(e);
		}
	}
	
	// return�� �����Ǵ� ��������, �޼ҵ尡 ���ڰ��� �ָ� �װ��� �Է°��� �ȴ�.
	// �� �Է°��� �迭�� ������ ���� ���� ���ڸ� �޸�(,)�� �����ؼ� ��ġ���� �ʾƵ� �ϳ��� ���� ���� ���� �����͸� ��Ƽ� �޼ҵ�� ������ �� �ִ�.
	
	// �޼ҵ�� ���α׷��� �Ŵ�ȭ�ϰ��ϴµ� �����̴�.
	// ��ü���⵵ �޼ҵ�� ���� ������ ������ �ִ�.

}
