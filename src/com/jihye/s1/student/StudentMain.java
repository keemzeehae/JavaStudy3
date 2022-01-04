package com.jihye.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		// makeStudent 호출
		// 이름 번호 국 영 수 출력

		StudentUtil studentUtil = new StudentUtil();
//		Student student = su.makeStudents();
		Student[] students = studentUtil.makeStudents();

		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.println("이름: " + student.name);
			System.out.println("번호: " + student.number);
			System.out.println("국어: " + student.kor);
			System.out.println("영어: " + student.eng);
			System.out.println("수학: " + student.math);
		}
	}
}
