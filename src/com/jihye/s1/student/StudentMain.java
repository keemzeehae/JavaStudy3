package com.jihye.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		StudentController sc = new StudentController();
		sc.start();
		
		System.out.println("종료");

	}
	
	
}

//public static void main(String[] args) {
//	StudentView sv = new StudentView();
//	Student student = new Student();
//	student.name="짛얘";
//	student.number=10;
//	student.kor=10;
//	student.eng=10;
//	student.math=20;
//	
//	sv.viewStudent(student);
//}

//public static void main(String[] args) {
//	// makeStudent 호출
//	// 이름 번호 국 영 수 출력
//
//	StudentUtil studentUtil = new StudentUtil();
////	Student student = su.makeStudents();
//	Student[] students = studentUtil.makeStudents();
//
//	for (int i = 0; i < students.length; i++) {
//		Student student = students[i];
//		System.out.println("이름: " + student.name);
//		System.out.println("번호: " + student.number);
//		System.out.println("국어: " + student.kor);
//		System.out.println("영어: " + student.eng);
//		System.out.println("수학: " + student.math);
//	}