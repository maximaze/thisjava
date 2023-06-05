package sec07.exam01_enum;

public class EnumMethodExampleKor {
	public static void main(String[] args) {		
		// name() �޼ҵ�
		WeekKor today = WeekKor.�Ͽ���;
		System.out.println("today: " + today);
		
		String name = today.name(); // ���Ű�ü�� ������ �ִ� ���ڿ��� ����
		System.out.println(name);
		
		// ordinal() �޼ҵ�
		// ��ü ���� ��ü �� �� ��° ����
		int ordinal = today.ordinal(); 
		System.out.println(ordinal);

		// compareTo() �޼ҵ�
		// ������� ��ġ
		WeekKor day1 = WeekKor.������;
		WeekKor day2 = WeekKor.������;
		int result1 = day1.compareTo(day2); // -2 
		int result2 = day2.compareTo(day1); // 2
		System.out.println(result1);
		System.out.println(result2);

		// valueOf() �޼ҵ�
		// ���ڷ� ���޵� ���ڿ��� ������ ���� ��ü�� ����
		// String strWeek = "SUMDAY";
		String strWeek = "�Ͽ���";

		try {
			WeekKor weekDay = WeekKor.valueOf(strWeek);
			System.out.println("weekDay: " + weekDay);
	
			if(weekDay == WeekKor.����� || weekDay == WeekKor.�Ͽ���) {
				System.out.println("�ָ� �̱���");
			} else {
				System.out.println("���� �̱���");
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("���������� ��ȯ �� �� ���� ���ڿ��Դϴ�. " + strWeek);
		}
		
		// values() �޼ҵ�
		// ���� Ÿ���� ��� ���� ��ü���� �迭�� ����
		WeekKor[] days = WeekKor.values();
		for(WeekKor day : days) {
			System.out.println(day);
		}
	}
}
