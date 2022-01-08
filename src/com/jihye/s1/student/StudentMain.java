package com.jihye.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		StudentController sc = new StudentController();
		sc.start();
		
//		Student student = new Student();
//		student.name = "suzy";
//		student.kor=10;
//		student.math=10;
//		student.eng=10;
//		
//		student.hello();
//		student.makeTotal();
//		System.out.println("참조변수 student: "+student);
//		System.out.println("Student Total: "+student.total);
//		
//		Student student2 = new Student();
//		student2.kor=20;
//		student2.eng=20;
//		student2.math=20;
//		
//		System.out.println("참조변수 student2: "+student2);
//		student2.makeTotal();
//		System.out.println("Student2 Total: "+student2.total);
//		
		
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