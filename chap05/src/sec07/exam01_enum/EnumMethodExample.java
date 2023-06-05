package sec07.exam01_enum;

public class EnumMethodExample {
	public static void main(String[] args) {		
		// name() 메소드
		Week today = Week.SUNDAY;
		System.out.println("today: " + today);
		
		String name = today.name(); // 열거객체가 가지고 있는 문자열을 리턴
		System.out.println(name);
		
		// ordinal() 메소드
		// 전체 열거 객체 중 몇 번째 순서
		int ordinal = today.ordinal(); 
		System.out.println(ordinal);

		// compareTo() 메소드
		// 상대적인 위치
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); // -2 
		int result2 = day2.compareTo(day1); // 2
		System.out.println(result1);
		System.out.println(result2);

		// valueOf() 메소드
		// 인자로 전달된 문자열과 동일한 열거 객체를 리턴
		// String strWeek = "SUMDAY";
		String strWeek = "SUNDAY";

		try {
			Week weekDay = Week.valueOf(strWeek);
			System.out.println("weekDay: " + weekDay);
	
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군요");
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("열거형으로 변환 할 수 없는 문자열입니다. " + strWeek);
		}
		
		/*
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군요");
			}
		}
		*/
		
		// values() 메소드
		// 열거 타입의 모든 열거 객체들을 배열로 리턴
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
