package jiwon_studyAlone;

public class javaStudy_220224_1 {

	public static void main(String[] args) {
		// 77ㅔ 77p
		
		System.out.println("3-07. 형변환 연산자");
		
		// 프로그램을 작성하다보면 같은 타입뿐만 아니라 서로 다른 타입간의 연산을 수행해야하는 경우도 있다.
		// 이럴 때는 연산을 수행하기 전에 타입을 일치시켜야 하는데, 변수나 리터럴의 타입을 다른 타입으로 변환하는것을 형변환이라고 한다.
		
		System.out.println("형변환이란 변수 또는 상수의 타입을 다른 타입으로 변환하는것");
		
		//방법은 아주 간단하다. 형변환 하고자 하는 변수나 리터럴의 앞에 변환하고자 하는 타입을 괄호와 함께 붙여주기만 하면 된다.
		
		System.out.println("'(타입)피연산자' 의 형태로 이루어진다.");
		//여기에 사용되는 괄호()는 '캐스트 연산자' or '형변환 연산자'라고 한다.
		
		//example
		double d = 85.4;
		int score = (int)d;
		
		System.out.println(score);
		
		//연산과정은 단계별로 살펴보자면
		
		System.out.println("int score=(int)d / double d = 85.4 일 때,");
		System.out.println("int score = (int)d;");
		System.out.println("int score = (int)85.4;");
		System.out.println("int score = 85");
		
		//이처럼 형변환 연산자는 그저 피연산자의 값을 읽어서 지정된 타이브로 형변환하고 그 결과를 반환 할 뿐인지라 피연산자 변수d의 값이 변하진 않는다.
		
		System.out.println("예제 3-5");
		
		d = 70.4;
		score = (int) d;
		System.out.println("score= "+ score);
		System.out.println("d="+d);
		
		// 이것의 풀이도. score에 형변환 된 d가 저장된 것 뿐이기에 d의 실제값은 변함이 없다.
	}

}
