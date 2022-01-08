package com.jihye.s1.student;

import java.util.Scanner;

public class StudentUtil {
	// 학생 객체를 생성하고 정보를 입력 받는 곳

	Scanner sc;
	public StudentUtil() {
		this.sc = new Scanner (System.in);
	}

	public void initUtil() {
		this.sc = new Scanner(System.in);
	}

	public Student search(Student[] students) {
		// 검색할학생의 수를 입력 받음
		// 입력받은 번호와 일치하는 학생을 찾아서 리턴
		System.out.println("학생번호를 입력하세요");
		int num = sc.nextInt();
		
		Student student = null;

		for (int i = 0; i < students.length; i++) {
			if (students[i].number == num) {
				System.out.println("Find");
//				sv.viewStudents(students)
				student=students[i] ;
				break;
			
			}
		}
		return student;

		// 학생들의 정보를 리턴, 리턴을 만나는 즉시 종료라서 for문이 끝나고 넣어야함

	}

	public Student[] makeStudents() {

		// 학생의 수를 입력 받음
		System.out.println("학생 수 입력");
		int count = sc.nextInt();
		Student[] students = new Student[count];

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			// 키보드로 부터 이름, 번호, 국어 영어 수학 입력
			System.out.println("이름 입력");
			student.name = this.sc.next();
			System.out.println("번호 입력");
			student.number = sc.nextInt();
			System.out.println("국어 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 입력");
			student.eng = sc.nextInt();
			System.out.println("수학 입력");
			student.math = sc.nextInt();
			student.makeTotal();
			students[i] = student;
		}

		// 학생들의 정보를 리턴
		return students;
	}

	public Student makeStudent() {
		// 키보드로부터 이름,번호,국어 영어 수학 리턴 -> 이거를 하나로 입력 받아
		// public Student <- 이게 return 해줄 데이터타입이 바로 Student!
		Scanner sc = new Scanner(System.in);

		System.out.println("학생이름");
		String name = sc.next();

		System.out.println("학생번호");
		int number = sc.nextInt();

		System.out.println("국어점수");
		int kor = sc.nextInt();

		System.out.println("영어점수");
		int eng = sc.nextInt();

		System.out.println("수학점수");
		int math = sc.nextInt();
		// 1. 배열 => 같은 데이터타입만 담을 수 있어서 이거는 배열 사용 안됨
		// 2. class 만들어줘야함

		Student student = new Student();// 한개의 변수로 다섯개의 정보를 가지고 올수 있음
		// 주소를 알려주면 5개 정보를 가지고 올수 있음
		student.name = name;
		student.number = number;
		student.kor = kor;
		student.eng = eng;
		student.math = math;
		student.makeTotal();

		return student;
	}
}

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
