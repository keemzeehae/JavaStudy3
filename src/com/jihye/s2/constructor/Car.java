package com.jihye.s2.constructor;

public class Car {
	
	String brand;
	public static String company = "KIA";
	String color;
	int cc;
	
	
	//생성자
	public Car () {
//		System.out.println();
		this("k9");  // 첫줄에 써야함
//		System.out.println("생성자 실행");
//		this.company="kia";
//		this.brand = "k7";
//		this.color ="black";
//		this.cc=5000;
	}
	//
	public Car (String color) {
		this("k7",color);
//		this.company = "kia";
//		this.brand = brand;//이때는 멤버변수와 지역변수를 구분하기 위해서 this를 생략하면 안됨
//		this.color ="black";
//		this.cc = 5000;
		
	}
	
	public Car (String brand, String color) {
		this(brand,color,5000);
//		this.company = "kia";
//		this.brand = brand;//이때는 멤버변수와 지역변수를 구분하기 위해서 this를 생략하면 안됨
//		this.color = color;
//		this.cc = 5000;
	}
	public Car (String brand, String color, int cc) {
		
		this.brand = brand;//이때는 멤버변수와 지역변수를 구분하기 위해서 this를 생략하면 안됨
		this.color = color;
		this.cc = cc;
	}
	//멤버메서드
	public void info () {
		System.out.println("멤버메서드");
		System.out.println(Car.company);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.cc);
		
	}

}
