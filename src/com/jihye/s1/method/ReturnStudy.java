package com.jihye.s1.method;

import java.util.Random;
import java.util.Scanner;

public class ReturnStudy {
	//접근지정자 [그외지정자] 리턴타입 메서드명 ([매개변수]){}
	public Scanner test4 () {
		Scanner sc = new Scanner(System.in);
		return sc; //sc안에는 주소가 들어가 있음, 변수명 앞에 있는 게 데이터 타입 Scanner
	}
	public String test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		return name;
	
		//public int test3() 이라면 return 0; 미리 설정//return 할값을 미리 설정해놔야 에러가 안뜸 
	}
	public int test2() {
		Random random = new Random(); //Random클래스의 객체를 만들어주고 random에 주소를 담으세요
		int num = random.nextInt();//정수범위에서 숫자를 하나 뽑아옴
		System.out.println("Test2: "+num);
		return num; //리턴 num의 데이터타입을 적어줘야함 public 뒤에 
	}

	public void test1 () {
		System.out.println("void는 리턴이 없을 때 사용");
	}
}
