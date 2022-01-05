package com.jihye.s1.same;

public class Square {
	int x;
	int y;
	
	public boolean same (Square check) {
		
		SquareMain sm = new SquareMain();
		boolean check = sm.s1.x == sm.s2.x && sm.s1.y ==sm.s2.y;
		//멤버변수 x,y
		if (sm.s1.x == sm.s2.x && sm.s1.y ==sm.s2.y) {
			check = true;
			System.out.println("값이 같습니다");

		
		return check;
		}
	}

}
