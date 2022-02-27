package jiwon_studyAlone;

import java.util.Scanner;

public class javaStudy_220227_1 {
	//87p
	public static void main(String[] args) {
	System.out.println("3-15.논리 연산자 && ||");
	
	/* 논리 연산자는 둘 이상의 조건을 '그리고(AND)' 나 '또는(OR)'로 연결하여 하나의 식으로 표현할 수 있게 해준다.
	 * 
	 */
	
	System.out.println("||(OR결합) : 피연산자 중 어느 한 쪽이 true면 true를 결과로 얻는다.");
	System.out.println("&&(AND결합): 피연산자 모두가 true여야 true를 결과로 얻는다.");
	
	//논리 연산자의 피연산자가 참(true)인 경우와 거짓(false)인 경우의 연산결과를 표로 나타내면 다음과 같다... 표로는 힘드니까...
	System.out.println("-------------------------------------");
	System.out.println("   x   |   y   |  x || y  |  x && y  ");
	System.out.println("-------------------------------------");
	System.out.println("  true |  true |   true   |   true   ");
	System.out.println("-------------------------------------");
	System.out.println("  true | false |   true   |   false  ");
	System.out.println("-------------------------------------");
	System.out.println(" false |  true |   true   |   false  ");
	System.out.println("-------------------------------------");
	System.out.println(" false | false |  false   |   false  ");	
	System.out.println("-------------------------------------");

	
System.out.print("자주 사용될 만한 예 1. >> ");
System.out.println("x는 10보다 크고, 20보다 작다");
System.out.println("x > 10 && x < 20");
//그렇다고해서 위의 식에서 논리연산자를 생략하고 '10 < x < 20 과 같이 표현하는 것은 허용되지 않는다. 
	
System.out.print("자주 사용될 만한 예 2. >> ");
System.out.println("i는 2의 배수 또는 3의 배수이다.");
System.out.println("i%2==0 || i%3==0");
//%나머지 연산자를 사용.

System.out.print("자주 사용될 만한 예 3. >> ");
System.out.println("i는 2의 배수 또는 3의 배수지만 6의 배수는 아니다.");
System.out.println("(i%2==0 || i%3==0)&&i%6!=0");
// &&가 ||보다 우선순위가 높기때문에 괄호로 먼저 연산 되게끔 진행한다.

System.out.print("자주 사용될 만한 예 4. >> ");
System.out.println("문자 ch는 숫자('0'~'9'이다."); //문자를 안배워서 모르는데!
System.out.println("'0' <= ch && ch <= '9'");
//유니코드에서 문자 '0'부터 '9'까지는 연속적으로 배치되어있기 떄문에 가능한 식이라고 한다.

System.out.println("문자 '0'부터 '9'의 유니코드는 10진수로 다음과 같다.");
System.out.println("-----------------------------------------------------------");
System.out.println(" '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ");
System.out.println("  48 |  49 |  50 |  51 |  52 |  53 |  54 |  55 |  56 | 57 ");
System.out.println("----------------------------------------------------------");

System.out.print("자주 사용될 만한 예 5. >> ");
System.out.println("문자 ch는 대문자 또는 소문자이다.");
//문자 'a'부터 'z', 그리고 'A'부터 'Z'까지도 연속적으로 배치되어있으므로 대문자 또문 소문자 확인하는 식을 쓸 수 있다.
System.out.println("('a'<= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z') ");


//---------------------------

System.out.println(" 예제 3-15 ");
Scanner scan = new Scanner(System.in);
char ch = ' ';

System.out.printf("문자를 하나 입력하세요> ");
String input = scan.nextLine();
ch = input.charAt(0);

if ('0' <= ch && ch <= '9')	{
	System.out.printf("입력하신 문자는 숫자입니다. %n");	
} 
if (('a'<= ch && ch<='z') || ('Z'<= ch && ch<='Z')) {
	System.out.printf("입력하신 문자는 영문자입니다. %n");
}

//아니 여기서도 에러가 난다니 따흑흑

	
	
	
	}
}
