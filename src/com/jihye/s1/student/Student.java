package com.jihye.s1.student;

public class Student {
	
	//데이터를 담는 용도(Data 저장 용도)
	String name;
	int number;
	int kor;
	int math;
	int eng;

	int total;
	double avg;
	public void makeTotal() {
		System.out.println("참조변수 this");
		System.out.println("참조변수 this: "+this);
		this.total = this.kor + this.eng + this.math;
		// this 생략 가능 total = kor + eng + math;
		//학생평균
		this.avg = this.total /3.0;
	
	}
	public void hello() {
		System.out.println("안녕하세요");
		makeTotal();
	}
}
