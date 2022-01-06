package com.jihye.s1.student;

public class StudentView {
	//출력전용 
	//viewStudents - 여러명의 학생의 모든 정보를 출력
	public void viewStudents(Student [] students) {
		//overloading으로 위아래 메서드 view라고 하나로 설정해놓고 사용해도 된다
		for (int i = 0; i < students.length; i++) {
			//Student student = students[i];
			//this.viewStudent(student);
			// 위에 두줄 합쳐놓은 것
			this.viewStudent(students[i]);
		}
	}
	public void viewMessage(String message) {
			
			System.out.println("=============================");
			System.out.println(message);
			System.out.println("=============================");
			
		}
	
//	//viewStudent -학생의 모든 정보를 출력
	public void viewStudent(Student student) {
		
		System.out.println("학생이름: "+student.name);
		System.out.println("학생번호: "+student.number);
		System.out.println("국어점수: "+student.kor);
		System.out.println("영어점수: "+student.eng);
		System.out.println("수학점수: "+student.math);
		
	}
}
//	//아래는 메서드1
//	public void viewMessage(String message) {
//		//문자열 출력
//		System.out.println("=============================");
//		System.out.println(message);
//		System.out.println("=============================");
//		
//	}


