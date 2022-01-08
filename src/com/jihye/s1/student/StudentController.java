package com.jihye.s1.student;

import java.util.Scanner;

public class StudentController {

	public void start() {

		Scanner sc = new Scanner(System.in);
		boolean button = true;
		StudentUtil su = new StudentUtil();
		//su.initUtil();
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
				sv.view(students);
				}else {
					sv.view("학생정보를 먼저 입력하세요");
				}
				break;
				
			case 3:
				if (students ==null) {
					sv.view("학생정보가 없습니다");
					continue;
				}
				System.out.println("학생정보를 검색합니다.");
				Student student= su.search(students);
				if(student!= null) {
					sv.view(student);
				}else {
					sv.view("검색결과가 없습니다.");
				}
				break;

			default:
	
				button = false;
				break;
			}

		}

	}

}
