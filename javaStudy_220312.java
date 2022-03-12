package jiwon_studyAlone;

import java.util.Scanner;

public class javaStudy_220312 {

	public static void main(String[] args) {
		// 125p 연습문제 풀어보기
		
		System.out.println("4-1. 다음의 문장들을 조건식으로 표현하라");
		System.out.println("1) int형 변수x가 10보다 크고 20보다 작을 때 true인 조건식");
		int x = 0;
		System.out.print("숫자를 입력하세용: ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt(); 
		if(x<10 && x<20) {
			System.out.println("1번답 ture");
		}else	{
			System.out.println("1번답 false");
		}
		
		//char형을 잘 모르는데! 99p 참고!
		char ch = '3'; // 더블쿼터 사용이 안된다!
		
		System.out.println("2) char형 변수 ch가 공백이거나 탭이 아닐 때 true인 조건식");
		if(!(ch==' '&&ch=='\t'))	{
			System.out.println("2번답, true");
		}else	{
			System.out.println("2번답, false");
		}
		
		System.out.println("3) char형 변수 ch가 숫자 '0'~'9'일 때 true인 조건식");

		if('0' <= ch && ch<'9')	{
			System.out.println("3번답, true");
		}else	{
			System.out.println("3번답, false");
		}
		
		System.out.println("4) char형 변수 ch가 영문자(대문자or소문자)일 때 true인 조건식");
		System.out.println("ch를 'B'로 설정");
		ch='B';
		if(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')) {
			System.out.println("4번답, true");
		}else	{
			System.out.println("4번답, false");
		}
		
		System.out.println("5) char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식");
		ch='x';
	
		if(ch=='x'||ch=='X') {
			System.out.println("5번답, true");
		}else	{
			System.out.println("5번답, false");
		}
		System.out.println("6) int형 변수 year가 400으로 나눠 떨어지거나 혹은 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을 때 true인 조건식");
		int year = 0;
		System.out.print("year값을 입력하세요:");
		year = scan.nextInt();
		
		if ((year%400==0)||(year%4==0&!(year%100==0)))	{
			System.out.println("6번답, true");
		}else	{
			System.out.println("6번답, false");
		}
	
		System.out.println("7) boolean형 변수 powerOn이 false일 때 ture인 조건식");
		boolean powerOn = true;
		
		if(!powerOn) {
			System.out.println("7번답, true");
		}else	{
			System.out.println("7번답, false.");
		}
		
		System.out.println("8) 문자형 참조변수 str이 'yes'일 때 true인 조건식");
		String str;
		System.out.print("둘 중에 하나 골라 말하기 yes or no: ");
		str=scan.nextLine();
		if(str=="yes") {
			System.out.println("8번답, ture");
		}else	{
			System.out.println("8번답, false");
		}
	}

}
