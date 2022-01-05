package com.jihye.s1.student;

import java.util.Scanner;

public class StudentController {

	public void start() {

		Scanner sc = new Scanner(System.in);
		boolean button = true;
		StudentUtil su = new StudentUtil();
		StudentView sv = new StudentView();
		Student [] students =null;

		while (button) {

			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 프로그램 종료");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				students= su.makeStudents();
				break;

			case 2:
				if (students != null) {
				sv.viewStudents(students);
				}else {
					sv.viewMessage("학생정보를 먼저 입력하세요");
				}
				break;
				
			case 3:
				System.out.println("학생정보를 검색합니다.");
				su.search(students);
				break;

			default:
				System.out.println("종료");
				System.out.println("프로그램을 종료합니다");
				button = false;
				break;
			}

		}

	}

}
