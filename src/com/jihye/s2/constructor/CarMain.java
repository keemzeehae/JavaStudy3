package com.jihye.s2.constructor;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Car.company = "BMW";

		//변수선언 = new 생성자호출
		Car car = new Car();
//		car.brand ="k7";
//		car.company ="kia";
//		car.cc=2000;
		//car.Car(); error!!!!!
		car.info();
		Car car2 = new Car("k5");
		car2.brand="k5";
		car2.info();
		
		Car car3 = new Car ("k3","white");
		car3.info();
		
		Car car4 = new Car ("k5", "yellow", 2000);
		car4.info();
		
		
			

	}

}
