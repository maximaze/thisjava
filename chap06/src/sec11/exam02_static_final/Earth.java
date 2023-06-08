/*
 * 상수(constant)
 * 	 - 불변의 값
 * 	 - 모든 객체에서 유일한 값
 * 	 - 대문자
 * 	 - 단어는 언더스코어(_)로 연결
 */
package sec11.exam02_static_final;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}	
}

