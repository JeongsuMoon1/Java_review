package org.opentutorials.javatutorials._6_type_conversion;

public class _3_ExplicitConversion {

	public static void main(String[] args) {
		
		// ����� �� ��ȯ(Explicit Conversion) : �����ڰ� ���� �������� �� ��ȯ�� �ϴ� ����̴�.
//		float a = 100.0; double���� ���
//		int b = 100.0F;  float���� ���
		
		// ���� �����͸� �ְ� �ʹٸ�
		float a = (float)100.0; // ��������� double ������ Ÿ���� float���� ��ȯ �ȴ�.
		int b = (int)100.0F;	// ��������� float ������ Ÿ���� int�� ��ȯ �ȴ�. ���� 100.1F; ���ٰ� int�� �� ��ȯ�� �ϸ� 0.1�� �սǵǴ� ���̴�.
		

	}

}
