package jiwon_studyAlone;

public class ifStatement_220301_4_02 {

	public static void main(String[] args) {
		// 99p
		
		System.out.println("조건식의 다양한 예");
		
		System.out.println("if문에 사용되는 조건식은 일반적으로 비교연산자와 논리연산자로 구분한다.");
		System.out.println("자바에서 조건식의 결과는 반드시 true와 false로 나와야한다.");
		System.out.println("tip: 등가비교 연산자 == 를 사용해야 할 때, 대입연산자 = 를 사용하지 않도록 주의한다.");
		
		System.out.println("4-02.예제");
		
		int x = 0;
		
		System.out.printf("x가 %d 일 때, 참인것은 %n", x);
		// int x; 해놓으니 에러가 난다. 값이 없어서 그런가보다.
		
		if (x == 0) { System.out.println("1. x == 0");}		// x == 0 이 true일 때 x는 0이다.
		if (x != 0) { System.out.println("2. x != 0");}		// x != 0 이 true일 때 x는 0이 아니다
		if (!(x == 0)) { System.out.println("3. !(x == 0)");} // !(x == 0) 이 true라면 x는 0 이 아니다
		if (!(x != 0)) { System.out.println("4. !(x != 0)");} // !(x != 0) 이 true라면 x는 0이다. ( 1. x가 0이 아닌 값, 이걸 한번 더 뒤집어주니 x = 0 의 표현)
		//강한 부정은 긍정 ㅋ

		x = 1;
		System.out.printf("x가 %d 일 때, 참인것은 %n", x);
		// int x; 해놓으니 에러가 난다. 값이 없어서 그런가보다.
		
		if (x == 0) { System.out.println("1. x == 0");}
		if (x != 0) { System.out.println("2. x != 0");}
		if (!(x == 0)) { System.out.println("3. !(x == 0)");}
		if (!(x != 0)) { System.out.println("4. !(x != 0)");}
		
	
		
		
		
		

	}

}
