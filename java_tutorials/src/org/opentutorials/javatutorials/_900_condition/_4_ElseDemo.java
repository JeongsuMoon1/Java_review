package org.opentutorials.javatutorials._900_condition;

public class _4_ElseDemo {

	public static void main(String[] args) {
		
		// true�̳� false�̳��� �� ���� �ϳ������� ��Ȳ�� �ܼ�ȭ�ϸ� �ذ��ؾ� �� �������� ������(�ξ� �� ������ ���)�� ó���� �� ���� ���̴�.
		// �׷��� ���� �� �����ϰ� ���� �帧�� �����ϴ� ����� else if �̴�.
		
//		if(true �Ǵ� false){
//			true�� ��� ���� �� -> ���� �� if���� ����������.
//		}else if(true �Ǵ� false){ if���� false�� ��� else if�� �������� true�� false�� �Ǵ��ϱ� ���� ������
//			else if�� true�� ��� ���� �� -> ���� �� else if���� ����������.
//		}else{ else if�� �������� false�� ��� else���� �����ϱ� ���� ������
//			else if���� ������ ��� ���� �� -> ���� �� else���� ����������.
//		}
		
		// if���� if�κ��� ���ǹ����� �� �� ���� �� �� �ִ�.
		//      else�κе� ���ǹ� �� ���� ��ġ�ϰų� ������ �� �ִ�.
		//      else if�κ� ���� ������ ���� ������, else�� else if���� ���� �ͼ��� �ȵȴ�.(�׻� else�� �� �ڿ� �´�)
		
		// ����� 2 ���
		if(false){
			System.out.println(1);
		}else if(true){
			System.out.println(2); // ù ��°�� else if���� true�̹Ƿ� ���� �� if���� ����������.
		}else if(true){
			System.out.println(3);
		}else{
			System.out.println(4);
		}
		// �� ���ǹ����� ���� �� ���̶� �����ϸ� ���� ó������ ������ ������ ����ǰ� ���ǹ��� ���ᰡ �ȴ�.
		
		// ����� 3 ���
		if(false){
			System.out.println(1);
		}else if(false){
			System.out.println(2);
		}else if(true){
			System.out.println(3);
		}else{
			System.out.println(4);
		}
		
		// ����� 4 ���
		if(false){
			System.out.println(1);
		}else if(false){
			System.out.println(2);
		}else if(false){
			System.out.println(3);
		}else{
			System.out.println(4);
		}
		// �ٽ� �������� � ��쿡�� ������ �ƹ��� ������ ������� �ʾҴٸ� else������ ����ȴ�.
		// else�� ��������, else if�� ��������, else if�� �������� ������ ���� �ִ�.
		
		
		// *���ݱ��� ���ǹ��� if���� ���������� ��(true,false)�� �����Ǿ� �־���. ��, ���ǿ� ���� �����ϴ� ���� �ƴ϶�
		// true�� false�Ŀ� ���� ����ǰų� ������� �ʾҴٴ� ���̴�. ������, ���� �ڵ���� ���ǹ����� ���� ���ǹ��̴�.
		// it���� �������� ��������, ���α׷��������� � ��쿡�� ���� �ǰ�, � ��쿡�� ������ �ž� ���ǹ����ν� ȿ���� ���� �ȴ� -> �����ð��� �н� ����
		
		
	}

}
