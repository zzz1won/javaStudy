package jiwon_studyAlone;

public class javaStudy_220228_3 {

	public static void main(String[] args) {
		// 93p
		
		System.out.println("3-18. 대입 연산자");
		
		// 대입 연산자는 변수와 같은 저장공간에 값 또는 수식의 연산결과를 저장하는데 사용된다. 
		// 연산자는 오른쪽 피연산자의 값을 왼쪽 피연산자에 저장한다. 그리고 저장 된 값을 연산결과로 반환한다.
		
		int x;
		System.out.println(  x= 3  ); //변수 x에 3이 저장되고, 3이 출력된다.
		
		System.out.println("lvalue 와 rvalue");
		System.out.println("left Value와 right Value인가보다.");
		
		System.out.println("대입연산자의 rvalue는 변수뿐 아니라 식이나 상수등이 모두 가능한 반면, lvalue는 반드시 변수처럼 값을 변경할 수 있는 것이어야 한다.");
		System.out.println("리터럴이나 상수같이 값을 저장할 수 없는 것은 lvalue가 될 수 없다.");
		
		// int i = 0; 문제 없음
		// 3 = i + 3; <- lvalue인 3에 값을 더할 수 없어서 에러.
		// i + 3 = i; <- i+3 인 lvalue는 값이 3이 되므로 23줄처럼 에러.
		
		// final inx MAX = 3; <- final이 붙으면 상수가 된다.
		// MAX = 10; <- final이 붙은 상수는 한 번 저장 된 값은 바꿀 수 없기 때문에 에러.
	}

}
