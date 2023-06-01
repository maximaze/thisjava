/*
 * 사다리꼴의 넓이를 구하라.
 * 윗변 : 5
 * 밑변 : 10
 * 높이 : 7
 * 공식 : (윗변 + 밑변) * 높이 / 2
 */

package verify;
public class Exercise06 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (   (10+5) * 7 / 2.0    );
		System.out.println(area);
	}
}




