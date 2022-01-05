package com.jihye.s1.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		System.out.println("MainMethod Start");
		System.out.println("Conflict test");
	
		//객체 만들기 객체 생성코드 
		//new 클래스명();
		ReturnStudy rs = new ReturnStudy(); //객체를 만들고 rs라는 변수에 주소를 담으세요
		//참조변수명.멤버들 (실제 주소를 담고 있는 변수 여기서는 rs)

		rs.test1();
		
		int num = rs.test2(); //우측의 결과물을 좌측에 대입 , 대입연산자는 우선순위가 낮다
		//int count = rs.test2(); 상관없음
		
		System.out.println("Main: "+ num);
		String name =rs.test3();
		System.out.println(name);
		
		double choose = Math.random();  // ran까지 치고 ctrl space 누르면 데이터타입 알 수 있음
		
		Scanner sc=rs.test4();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		System.out.println("Age: "+ age);
		System.out.println("Double: "+ choose);
		
		System.out.println("MainMethod Finish");
		
		rs.test3();

	}

}
