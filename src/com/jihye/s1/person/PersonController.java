package com.jihye.s1.person;

import java.util.Scanner;

public class PersonController {

	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		PersonUtil pu = new PersonUtil();
		PersonView pv = new PersonView();
		Person[] people = null;

		while (check) {
			System.out.println("1. 회원 정보 입력");
			System.out.println("2. 회원 정보 출력");
			System.out.println("3. 회원 정보 검색");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				people = pu.makePerson();
				break;
			case 2:
				if (people != null) {
					pv.view(people);
				} else {
					pv.view("회원 정보를 먼저 입력해주세요.");
				}
				break;
			case 3:
				if (people == null) {
					pv.view("회원 정보가 없습니다.");
					continue;
				}
				Person person = pu.search(people);
				if (person != null) {
					pv.view(person);

				} else {
					pv.view("검색 결과가 없습니다.");
					continue;
				}
				
				
			default:
				check = false;
				break;
			}

		}

	}
}
