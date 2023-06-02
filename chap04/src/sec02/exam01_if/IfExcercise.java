/*
 * 1. 난수 : 2000부터 2100까지 발생
 * 2. 아래의 조건을 if문을 사용하여 아래의 조건을
 *    만족하면 1 그렇지 않으면 0을 구하라.
 * 		- 4년마다 한 번 발생 : 1 
 * 		- 100년마다 발생하지 않음 : 0
 * 		- 400년마다 다시 발생 : 1
 */
package sec02.exam01_if;

public class IfExcercise {
	final static int MAX_NUM = 2100;
	final static int MIN_NUM = 2000;
	final static int CYCLE = 4;
	final static int NOT_OCCUR = 100;
	final static int RETURN_OCCUR = 400;
	
	public static void main(String[] args) {
		// int num = (int)(Math.random() * (MAX_NUM - MIN_NUM + 1)) + MIN_NUM;
		// test();
		
		for(int num = MIN_NUM; num <= MAX_NUM; num++) {
			System.out.printf("num(%d), result(%d)\n", num, compute2(num));
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
