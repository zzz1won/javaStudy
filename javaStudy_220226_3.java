package jiwon_studyAlone;

public class javaStudy_220226_3 {

	public static void main(String[] args) {
		// 85p 이거 하고 김치볶음밥 해먹어야징 랄라 앗 계란ㅇㅣ없
		
		System.out.println("3-13. 비교연산자");

		//자주 썼었는데! 연산결과는 true 와 false 둘 중 하나로만 나온다.ㅏ
		System.out.println("비교연산자 역시 이항 연산자이므로 비교하는 피연산자의 타입이 서로 다른 경우에는 자료형의 범위가 큰 쪽으로 자동 형변환 하여 핑녀산자의 타입을 일치시킨 후에 비교한다.");
		System.out.println("대소비교 연산자 <, >, <=, >=");
		// 설명은 너무 당연해서 생략.
		
		System.out.println("등가비교 연산자 ==, !=");
		System.out.println("==: 두 값이 같으면 true, 다르다면 false");
		System.out.println("!=: 두 값이 같지 않으면 true, 같다면 false");
		
		
		
		//86p
		System.out.println("3-14. 문자열의 비교");
		System.out.println("✔ 두 문자열을 비교할 때에는 비교연산자 '==' 대신 equals()라는 메서드를 사용한다!!!");
		// 끄앙 반가워 이퀄스! 비교 연산자는 두 문자열이 완전히 같은것인지를 비교할 뿐이므로, 문자열의 내용이 같은지 비교하기 위해서는 equals()를 사용하는 것이다.
		
		String strstr = new String("abc");
		//equals() 는 두 문자열의 내용이 같으면 true, 다르면 false를 결과로 반환한다.
		boolean result = strstr.equals("abc");
		// 내용이 같으므로 result에는 true가 저장된다. 오옹...
		
		System.out.println("원래 String은 class 이므로, 아래와 같이 new를 사용해 객체를 생성해야한다.");
		
		String strs = new String ("abcd");
		// String strs = "abcd"; 
		System.out.println("String strs = \"abcd\"; 으로 간단히 쓸 수 있게 허용한다.");
		
		System.out.println("-----------");
		System.out.println("예제 3-14");
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\"?: %b%n ","abc"=="abc");
		//헐 예제 문자 너무 많아
		System.out.printf("str1 == \"abc\"? %b%n", str1 == "abc");
		System.out.printf("str2 == \"abc\"? %b%n", str2 == "abc"); // 내용은 같지만 다른 객체여서 그렇다고한다. 문자열로 비교해야하나보다.
		System.out.printf("str1.equals(\"abc\")? %b%n", str1 == "abc");
		System.out.printf("str2.equals(\"abc\")? %b%n", str2.equals("abc"));
		//%b%n이 뭐고 백슬래시 왜 붙이는걸까?
		System.out.printf("str2.equals(\"ABC\")? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIsIgnoreCase(\"ABC\")?%b%n",str2.equalsIgnoreCase("ABC")); //대소문자 구분 무시하려면 equalsIsIgnoreCase !
		
		
	}

}
