package jiwon_studyAlone;

public class javaStudy_220207 {

	public static void main(String[] args) {
		// 220207. 헐 이클립스 관련 내용 다 까먹었네 증말...
		/* java의 정석 기초편... 46p 왕기초부터 가즈아
		 * 01. 화면에 글자 출력하기
		 */
		
		System.out.println("자바의정석 기초 46p"+"\n");
		
		System.out.println("예제2-1");
		System.out.print("줄바꿈 안하기");
		System.out.println("줄바꿈 하기");
		System.out.println("f11이었나, ctrl + f11이었나...");
		
		System.out.println("예제2-2");
		System.out.print("3+5=");
		System.out.println(3+5);
		
		System.out.println("예제2-3");
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3);
		
		/*
		 * 변수 : 하나의 값을 저장할 수 있는 저장 공간 
		 * 변수를 선언하는 방법: 변수타입 변수이름 <- 으로 표현한다.
		 * int x <- 변수타입이 int인 변수 x 를 선언한 셈이다.
		 */
		System.out.println("자바의정석 기초 49p_변수의 선언과 저장");
		System.out.println("예제 2-4");
		int x = 5;
		System.out.println("x="+x);
		
		// 변수를 사용하는 이유... 매번 모든 식을 바꾸지 않고도 계산식을 편하게 이용하기 위해서.
		System.out.println("예제 2-5");
		int x1 = 10;
		int y = 5;
		System.out.println(x1+y);
		System.out.println(x1-y);
		System.out.println(x1*y);
		System.out.println(x1/y);
		System.out.println("동일 클래스 내에서 같은 변수값을 사용할 수 없다.");
		System.out.println("\n");
		
		System.out.println("자바의정석 기초 50p_변수의 타입");
		System.out.println("예제 2-6");
		System.out.println("int_정수(21억이 넘어가면 long), double_실수, char_문자, String_문자열 만 우선 구분하자...");
		int x2 = 100;
		double pi = 3.14;
		char ch = 'a';
		String str = "abc";
		
		System.out.println(x2);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		System.out.println("\n");
		
		System.out.println("자바의정석 기초 51p_상수와 리터럴");
		// 상수 : 변수와 마찬가지로 값을 저장할 수 있는 공간.
		// 그러나 변수와 달리 한번 값을 지정하면 다른 값으로는 변환할 수 없다.
		// 상수를 선언하는 방법은 변수와 동일하며 변수의 타입 앞에 final을 붙여주면 상수이다.  
		System.out.println("1,상수");
		final int MAX_SPEED = 10;
		
		final int Max_value;
		Max_value = 100;
//		Max_value = 200; <- final이 붙어있으므로 상수(값이 변할 수 없음)처리가 되었다. 고로 변경이 불가능.
		System.out.println(MAX_SPEED);
		System.out.println(Max_value);
		
		System.out.println("2,리터럴");
		System.out.println("변수,상수가 갖고있는 값 그 자체");
		System.out.println("MAX_SPEED="+MAX_SPEED);
		System.out.println("Max_value="+Max_value);
		System.out.println(MAX_SPEED+","+Max_value+": 상수의 리터럴에 해당");
		System.out.print("변수: 하나의 값을 저장하기 위한 공간\t");
		System.out.println("상수: 단 한 번의 값만 저장되는 공간");
		System.out.println("리터럴: 변수들의 값 그 자체");
		

	}

}
