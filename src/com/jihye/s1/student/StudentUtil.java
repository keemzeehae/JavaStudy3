package com.jihye.s1.student;

import java.util.Scanner;

public class StudentUtil {
	//학생 객체를 생성하고 정보를 입력 받는 곳
	public Student[] makeStudents() {
		// 학생의 수를 입력 받음
		// 키보드로부터 이름,번호,국어 영어 수학 입력
		// 학생들의 정보 입력
		// 배열

		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		Student [] students = new Student[count];
		
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			
			
			System.out.println("학생이름");
			student.name = sc.next();

			System.out.println("학생번호");
			student.number = sc.nextInt();

			System.out.println("국어점수");
			student.kor = sc.nextInt();

			System.out.println("영어점수");
			student.eng = sc.nextInt();

			System.out.println("수학점수");
			student.math = sc.nextInt();
			students[i] = student;
		}
		//학생들의 정보를 리턴, 리턴을 만나는 즉시 종료라서 for문이 끝나고 넣어야함
		return students;
	}
}
//	public Student makeStudent() {
//		//키보드로부터 이름,번호,국어 영어 수학 리턴 -> 이거를 하나로 입력 받아
//		//public Student <- 이게 return 해줄 데이터타입이 바로 Student!
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("학생이름");
//		String name = sc.next();
//		
//		System.out.println("학생번호");
//		int number = sc.nextInt();
//		
//		System.out.println("국어점수");
//		int kor = sc.nextInt();
//		
//		System.out.println("영어점수");
//		int eng = sc.nextInt();
//		
//		System.out.println("수학점수");
//		int math = sc.nextInt();
//		//1. 배열 => 같은 데이터타입만 담을 수 있어서 이거는 배열 사용 안됨
//		//2. class  만들어줘야함
//		
//		Student student = new Student();// 한개의 변수로 다섯개의 정보를 가지고 올수 있음
//		// 주소를 알려주면 5개 정보를 가지고 올수 있음
//		student.name = name;
//		student.number=number;
//		student.kor=kor;
//		student.eng=eng;
//		student.math=math;
//		
//		return student;
//	}

//       Student s = new Student();
//       Scanner sc = new Scanner(System.in);
//		
//		System.out.println("학생이름");
//		s.name = sc.next();
//		
//		System.out.println("학생번호");
//		s.number = sc.nextInt();
//		
//		System.out.println("국어점수");
//		s.kor = sc.nextInt();
//		
//		System.out.println("영어점수");
//		s.eng = sc.nextInt();
//		
//		System.out.println("수학점수");
//		s.math = sc.nextInt();
//        이렇게 해도 됨
