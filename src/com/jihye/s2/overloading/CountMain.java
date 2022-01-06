package com.jihye.s2.overloading;

public class CountMain {

	public static void main(String[] args) {
		Count count = new Count();
		count.hap(10,20);
		
		count.hap(10,1.2);
		System.out.println();

	}

}
//overloading: 같은 이름의 메서드를 여러개만드는 것
//비슷한 일을 하는 같은 이름의 메서드를 여러개 생성