package sec07.exam01_enum;

public class EnumMethodExample {
	public static void main(String[] args) {		
		// name() �޼ҵ�
		Week today = Week.SUNDAY;
		System.out.println("today: " + today);
		
		String name = today.name(); // ���Ű�ü�� ������ �ִ� ���ڿ��� ����
		System.out.println(name);
		
		// ordinal() �޼ҵ�
		// ��ü ���� ��ü �� �� ��° ����
		int ordinal = today.ordinal(); 
		System.out.println(ordinal);

		// compareTo() �޼ҵ�
		// ������� ��ġ
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); // -2 
		int result2 = day2.compareTo(day1); // 2
		System.out.println(result1);
		System.out.println(result2);

		// valueOf() �޼ҵ�
		// ���ڷ� ���޵� ���ڿ��� ������ ���� ��ü�� ����
		// String strWeek = "SUMDAY";
		String strWeek = "SUNDAY";

		try {
			Week weekDay = Week.valueOf(strWeek);
			System.out.println("weekDay: " + weekDay);
	
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ� �̱���");
			} else {
				System.out.println("���� �̱���");
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("���������� ��ȯ �� �� ���� ���ڿ��Դϴ�. " + strWeek);
		}
		
		/*
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ� �̱���");
			} else {
				System.out.println("���� �̱���");
			}
		}
		*/
		
		// values() �޼ҵ�
		// ���� Ÿ���� ��� ���� ��ü���� �迭�� ����
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
