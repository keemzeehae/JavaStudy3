package com.jihye.s1.same;

public class Square {
	int x;
	int y;
	
	public boolean same (Square s) {
	
		//멤버변수 x,y
		if (this.x ==s.x && this.y == s.y) {
			return true;
		}else {
					
		return false;
		}
	}

}
