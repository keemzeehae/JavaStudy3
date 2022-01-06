package com.jihye.s2.overloading;

public class Count {
	
	public int hap(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public void hap(int num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);
	}

	public void hap(float num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);
	}

}
//경우의 수 만큼 메서드를 만들어 놓으면 됨
//method overloading의 조건
// 메서드의 이름이 같아아 함
// 매개변수의 갯수, 타입의 구성이 달라야 함(경우의 수 중복 안됨)
// 리턴타입은 상관없음