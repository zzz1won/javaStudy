package jiwon_studyAlone;

import java.util.Scanner;

public class doWhileStatement_220303_4_19 {

	public static void main(String[] args) {
		// 118p
		
		System.out.println("do-while문은 while문의 변형\n기본적인 구조는 while문과 같으나 조건식과 블럭{}의 순서를 바꿔놓은 것이다.\n그래서 while문과는 반대로 블럭의 내용을 먼저 수행한 후에 조건식을 평가.\nwhile문은 조건식의 결과에 따라 블럭이 한 번도 수행되지 않을 수 있지만, do-while문은 최소한 한 번은 수행 될 것을 보장한다.");
		
		int ex = 0;
		/*
		 * do { // 조건식의 연산 결과가 참일 때 수행 될 문장을 적는다. // (처음 한 번은 무조건 실행) } while ( ex >=0
		 * );
		 */ //괄호 안은 조건식을 사용한다.
		
		//많이 쓰이는 것은 아니지만 반복적으로 사용자의 입력을 받아 처리할 때 유용하다.
		
		int input = 0, answer =0;
		
		answer = (int)(Math.random() * 100) + 1; // 1부터 100사이의 임의의 수를 answer에 저장.
		
		do {
			System.out.print("1과 100 사이의 정수를 입력하세요> ");
			Scanner scan = new Scanner(System.in);
			input = scan.nextInt();
			
			if (input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if ( input < answer )	{
				System.out.println("더 큰 수를 입력하세요.");
			}
		} while	(input != answer);
			System.out.println("정답입니다.");
		}

		
	

}
