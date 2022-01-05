package com.jihye.s1.same;

public class SquareMain {

	public static void main(String[] args) {
		Square s1 = new Square();
		
		s1.x=4;
		s1.y=4;
		
		Square s2 = new Square();
		s2.x=4;
		s2.y=4;
		
		boolean check = s1 ==s2;
		System.out.println(check);

	}

}
