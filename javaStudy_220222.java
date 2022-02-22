package jiwon_studyAlone;

public class javaStudy_220222 {

	public static void main(String[] args) {
		// 220222
		
		// 3-01 연산자와 피연산자 70p
		System.out.println("4*x+3 -> 4*5+3 -> 23");
		//23이라는 결과가 나왔지만 이 값이 어디에도 쓰이지않고 사라지기 때문에 이 식은 아무런 의미가 없다.
		// 대입연산자 = 를 이용해 변수와 같이 값을 저장할 수 있는 공간에 결과를 저장해야 한다.
		
		int y = 0;
		int x = 5;
		y = 4 * x + 3;
		System.out.println("y= "+y);
		// 변수 y에 저장된 값을 다른 곳에 사용하거나 화면에 출력함으로써 의미있는 결과를 얻을 수 있다.
		
		
		
		// 3-02 연산자의 종류 71p
		System.out.println("종류 : 산술연산자 / 비교연산자 / 논리연산자 / 대입연산자 / 기타 로 나뉜다");
		System.out.println("----------------------------------------------------------");
		System.out.println("❤ 산술연산자: +, -, *, /, %, <<, >>");
		System.out.println("사칙연산과 나머지 연산(%)");
		System.out.println("----------------------------------------------------------");
		System.out.println("❤ 비교연산자: >, <, >=, <=, ==, !=");
		System.out.println("크고 작음 그리고 같고 다름을 비교한다.");
		System.out.println("----------------------------------------------------------");
		System.out.println("❤ 논리연산자: &&, ||, !, &, |, ^, ~");
		System.out.println("그리고AND 와 또는OR 로 조건을 연결하는 방식이다.");
		System.out.println("----------------------------------------------------------");
		System.out.println("❤ 대입연산자: = ❤ ");
		System.out.println("우변의 값을 좌변에 저장한다.");
		System.out.println("----------------------------------------------------------");
		System.out.println("❤ 기타: (type)?: instanceof");
		System.out.println("형변환 연산자, 삼항 연산자, instance연산자");
		System.out.println("----------------------------------------------------------");
		
		//피연산자의 개수로 연산자를 분류하기도 하는데, 피연산자의 개수가 하나면 '단항연산자', 두개면 '이항연산자', 세개면 '삼항연산자'라고 부른다. 대부분은 이항 연산자이다.
		
		System.out.println("-3-5");
		//여기서 -3은 부호연산자 이고, 3과 5를 잇는 것은 뺄셈 연산자이다.
		
		
		
		// 3-03 연산자의 우선순위
		//수학적으로 접근해서 문제를 풀면 된다~
		System.out.println("5+3*4="+(5+3*4));
		//3*4 가 먼저 연산되고, 3*4의 값과 5가 연산되는 상식적인 문제.
		System.out.println("-x+3="+(-x+3));
		System.out.println("x+3*y="+(x+3*y));
		System.out.println("x+3 > y-2");
		System.out.println("x+3 > y-2="+(x+3>y-2));
		System.out.println("x>3 && x < 5");
		System.out.println("x>3 && x < 5="+(x>3 && x<5));
		System.out.println("result = x+y*3");
		System.out.println("대입연산자는 연산자 중에서 제일 우선순위가 낮다. 그래서 우변의 최종 연산 결과가 변수 result에 저장된다.");
		
		
	
		
	

	}

}
