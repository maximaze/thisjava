/*
 * 1. ���� : 2000���� 2100���� �߻�
 * 2. ���� �������� if���� ����Ͽ� �Ʒ��� ������ 
 *    �����ϸ� 1 �׷��� ������ 0�� ���϶�.
 *    - 4�⸶�� �� �� �߻� : 1
 *    - 100�⸶�� �߻����� ���� : 0
 *    - 400�⸶�� �ٽ� �߻� : 1
 */
package sec02.exam01_if;

import java.time.LocalDate;

public class IFExercise2 {
	final static int MIN_NUM = 2000;
	final static int MAX_NUM = 2100;  

	public static void main(String[] args) {
		// test();
		testLoop();
		// firstYear();

		// int num = (int)(Math.random() * (MAX_NUM - MIN_NUM + 1)) + MIN_NUM;
		// System.out.printf("num(%d), result(%d)\n", num, compute2(num));
		
	}
	
	public static void firstYear() {
		LocalDate now = LocalDate.of(1, 1, 1); // ��� 1�� 1�� 1��
		
		System.out.printf("��(%d), ��(%d), ��(%d) ����(%b), ����������(%d), ����(%s)\n",
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
		for(int cnt=MIN_NUM; cnt <=MAX_NUM; cnt++) {
			System.out.printf("num(%d), result(%d), isLeapYear(%d), lengthOfMonth(%d)\n", 
					cnt, compute2(cnt), isLeapYear(cnt, 2), lengthOfMonth(cnt, 2));
		}
	}
		
	public static void test() {
		System.out.printf("-----[test]-----\n");
		System.out.printf("num(%d), result(%d)\n", 1, compute1(1));
		System.out.printf("num(%d), result(%d)\n", 4, compute1(4));
		System.out.printf("num(%d), result(%d)\n", 100, compute1(100));
		System.out.printf("num(%d), result(%d)\n", 400, compute1(400));

		System.out.printf("-------------------------------------\n");
		System.out.printf("num(%d), result(%d)\n", 1, compute2(1));
		System.out.printf("num(%d), result(%d)\n", 4, compute2(4));
		System.out.printf("num(%d), result(%d)\n", 100, compute2(100));
		System.out.printf("num(%d), result(%d)\n", 400, compute2(400));
	}
	
	public static int compute1(int num) {
		// return ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) ? 1 : 0; 
		return (num % 4 == 0 && (num % 100 != 0  || num % 400 == 0)) ? 1 : 0; 
	}
	
	public static int compute2(int num) {
		int result = 0;
		if(num % 4 == 0) {
			if(num % 100 != 0 || num % 400 == 0) {
				result = 1;
			}
		}
		
		return result;
	}

}
