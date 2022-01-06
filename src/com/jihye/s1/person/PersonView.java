package com.jihye.s1.person;

public class PersonView {
	
	//출력전용
	//viewPeole 여러명의 사람들의 모든 정보를 출력
	public void view(Person [] people) {
		for (int i=0;i<people.length;i++) {
			this.view(people[i]);
			
		}
	}
	//사람한명 정보를 출력 
	public void view(Person person) {
		System.out.println("회원 이름: "+person.name);
		System.out.println("핸드폰번호 뒤4자리: "+person.num);
		System.out.println("나이: "+person.num);
		System.out.println("포인트: "+person.point);
		System.out.println("기간: "+person.period);
		System.out.println("선호도: "+person.preference);
		
	}
	public void view(String message) {
		//문자열 출력
		System.out.println("=====================");
		System.out.println(message);
		System.out.println("=====================");
		
	}
	
}
