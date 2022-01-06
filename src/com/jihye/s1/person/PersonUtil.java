package com.jihye.s1.person;

import java.util.Scanner;

public class PersonUtil {

	//객체를 생성하고 정보를 입력받는 곳
	//키보드로부터 이름, 나이, 포인트, 기간, 선호도를 받음
	Scanner sc;
	public PersonUtil() {
		this.sc = new Scanner(System.in);
	}
	public void initUtil() {
		this.sc =new Scanner(System.in);
		
	}
	public Person search(Person[] people) {
		System.out.println("핸드폰 뒷자리 4자리 입력");
		int num = sc.nextInt();
		
		Person person = null;
		for(int i=0;i<people.length;i++) {
			if (people[i].num == num) {
				System.out.println("find");
				person = people[i];
				break;
						
			}
			
		}
		return person;
		
	}
	//사람 수를 입력받음
	public Person[] makePerson() {
		System.out.println("회원 수 입력");
		int count = this.sc.nextInt();//this 없애고도 써보기
		Person [] people = new Person [count];
		
		//키보드로부터 이름 번호 포인트 기간 선호도 입력
		for(int i=0; i<people.length;i++) {
			Person person = new Person();
			
			System.out.println("회원이름 입력");
			person.name = sc.next();
			System.out.println("회원 핸드폰번호 뒤4자리 입력");
			person.num = sc.nextInt();
			System.out.println("포인트입력");
			person.point = sc.nextInt();
			System.out.println("기간입력");
			person.period = sc.nextInt();
			System.out.println("선호도입력(0~100)");
			person.preference =sc.nextInt();
		
			people[i]=person;
			
			
		} return people;
		
	} 
	//키보드로부터 이름 번호 나이 포인트 기간 선호도 입력 리턴
	public Person personOne(){
		Person person = new Person();
		System.out.println("회원이름 입력");
		person.name = sc.next();
		System.out.println("회원 핸드폰번호 뒤4자리 입력");
		person.num = sc.nextInt();
		System.out.println("나이입력");
		person.age = sc.nextInt();
		System.out.println("포인트입력");
		person.point = sc.nextInt();
		System.out.println("기간입력");
		person.period =sc.nextInt();
		System.out.println("선호도입력");
		person.preference =sc.nextInt();
		return person;
	}
}
