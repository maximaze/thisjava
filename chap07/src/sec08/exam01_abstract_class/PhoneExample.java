package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		// �߻� Ŭ������ ��üȭ �� �� ����.
		// Cannot instantiate the type Phone
		// Phone phone = new Phone();
		
		// ����� �̸� �������ʰ� �ʰ� �Ϸ����� �����ϰ� ��~ ��� ���Ѱ�����
		// �߻� Ŭ������ ���� Ŭ������ ���ؼ��� ��üȭ ����
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
