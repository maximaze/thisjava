/*
 * �߻� Ŭ����:
 *   - Ŭ���� �̸� �տ� abstract�� ���
 *   - �޼ҵ� �̸� �տ� abstract�� ����ϸ� ��ü Ŭ�������� �ݵ�� ������ �ؾ� �Ѵ�.
 *     . �����κ��� ����.
 * 	 - ��ü Ŭ�������� ����� �ʵ�� �޼ҵ��� �̸��� ������ ����
 * 	 - ��ü Ŭ������ �ۼ��� �� �ð��� ����
 * 	 - ��ü Ŭ�������� Ư���� ����� �����ϵ��� ����(����)
 */
package sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	// �߻� �޼ҵ� : ������ ����.
	// �޼ҵ� �ñ״�ó�� ����
	// �� �޼ҵ带 �����ض� ��� ���� �ɾ�а�
	// abstract
	// public abstract void sound() {} // ����
	public abstract void sound();
}

