package jiwon_studyAlone;

import java.util.Scanner;

public class ifElseStatement_220301_4_04 {

	public static void main(String[] args) {
		// 101p
		
		System.out.println("4-04. if-else문");
		
		System.out.println("if의 조건식이 true일 때 수행한다면, if의 조건식 결과가 false일 때 else문을 수행한다.");
		System.out.println("두 블럭의 내용이 모두 수행되거나, 모두 수행하지 않는 경우는 있을 수 없다.");
		
		System.out.println("예제 4-03");
		System.out.print("숫자를 입력하세요> ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt(); //화면을 통해서 값을 입력받고 input에 저장.
		
		if (input == 0) {
			System.out.println("0을 입력하셨군요");
		}	else {
			System.out.println("숫자는 0이 아닙니다. 맞죠? 낄낄");
		}
		
	
	
	}

}
