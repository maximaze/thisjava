/*
 * 1. 난수 : 2000부터 2100까지 발생
 * 2. 아래의 조건을 if문을 사용하여 아래의 조건을
 *    만족하면 1 그렇지 않으면 0을 구하라.
 * 		- 4년마다 한 번 발생 : 1 
 * 		- 100년마다 발생하지 않음 : 0
 * 		- 400년마다 다시 발생 : 1
 */
package sec02.exam01_if;

import java.time.LocalDate;

public class IfExcercise2 {
	final static int MAX_NUM = 2100;
	final static int MIN_NUM = 2000;
	final static int CYCLE = 4;
	final static int NOT_OCCUR = 100;
	final static int RETURN_OCCUR = 400;
	
	public static void main(String[] args) {
		// test();
		// testLoop();
		firstYear();
		
		//int num = (int)(Math.random() * (MAX_NUM - MIN_NUM + 1)) + MIN_NUM;
		//System.out.printf("num(%d), result(%d)\n", num, compute2(num));
	}
	
	public static void firstYear() {
		LocalDate now = LocalDate.of(1, 1, 1); // 기원 1년1월1일
		
		System.out.printf("년(%d), 월(%d), 일(%d) 윤달(%b),마지막일자(%d), 요일(%s)\n",
				now.getYear(),
				now.getMonth().getValue(),
				now.getDayOfMonth(),
				now.isLeapYear(),
				now.lengthOfMonth(),
				now.getDayOfWeek());
	}
	
	public static int isLeapYear(int year, int month) {
		LocalDate now = LocalDate.of(year, month, 1);
		return now.isLeapYear() ? 1 : 0;
	}
	
	public static int lengthOfMonth(int year, int month) {
		LocalDate now = LocalDate.of(year, month, 1);
		return now.lengthOfMonth();
	}
	
	public static void testLoop() {
		for(int cnt=MIN_NUM; cnt <= MAX_NUM; cnt++) {
			System.out.printf("num(%d), result(%d), isLeapYear(%d), lengthOfMonth(%d)\n",
					cnt, compute2(cnt), isLeapYear(cnt, 2), lengthOfMonth(cnt, 2));
		}
	}
	
	public static void test() {
		System.out.printf("------[test]------\n");
		System.out.printf("난수(%d), result(%d)\n",1,compute1(1));
		System.out.printf("난수(%d), result(%d)\n",4,compute1(4));
		System.out.printf("난수(%d), result(%d)\n",100,compute1(100));
		System.out.printf("난수(%d), result(%d)\n",400,compute1(400));
		
		System.out.printf("-------------------------\n");
		System.out.printf("난수(%d), result(%d)\n",1,compute2(1));
		System.out.printf("난수(%d), result(%d)\n",4,compute2(4));
		System.out.printf("난수(%d), result(%d)\n",100,compute2(100));
		System.out.printf("난수(%d), result(%d)\n",400,compute2(400));
	}
	
	public static int compute1(int num) {
		// return ((num%CYCLE == 0 && num%NOT_OCCUR != 0) || num%RETURN_OCCUR ==0) ? 1 : 0;
		return (num%CYCLE == 0 && (num%NOT_OCCUR != 0 || num%RETURN_OCCUR ==0)) ? 1 : 0;
	}
	
	public static int compute2(int num) {
		int result = 0;
		if (num % 4 == 0) {
			if(num % 100 != 0 || num % 400 == 0) {
				result = 1;
			} 	
		}
		return result;
	}
}
