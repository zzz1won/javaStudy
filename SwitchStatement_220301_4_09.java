package jiwon_studyAlone;

import java.util.Scanner;

public class SwitchStatement_220301_4_09 {

	public static void main(String[] args) {
		// 106p
		
		System.out.println("4-09. switch문");
		//오 그떄도 난 스위치에서 멍청하게 앉아있던 것 같아!
		System.out.println("단 하나의 조건식으로 많은 경우의 수를 처리할 수 있고 표현도 간결하다.");
		System.out.println("처리할 경우의 수가 많은 경우에는 if문보다 switch문으로 작성하는 것이 좋다.");
		System.out.println("다만 switch문은 제약조건이 있기 때문에, 경우의 수가 많아도 어쩔 수 없이 if문으로 작성해야하는 경우도 있다.\n");
		//-------------
		System.out.println("switch문은 조건식을 먼저 계산한 다음, 조건의 결과와 일치하는 case statement로 이동한다. 이동한 case 아래 있는 문장을 수행하며 break문을 만나면 전체 switch문을 빠져나가게 된다. ");
		System.out.println("😀default");
		System.out.println("만일 조건식 결과와 일치하는 case문이 하나도 없는 경우에는 default문으로 이동. else 블럭과 같은 역할을 한다.");
		System.out.println("😀break");
		System.out.println("case문의 영역을 구분하는 역할. break문을 생략하면 case문 사이의 구분이 없어지므로 다른 break문을 만나거나 switch문 블럭{}의 끝을 만날때까지 나오는 모든 문장을 수행한다.");
		System.out.println("고로, 각 case문 마지막에 break문을 빼먹는 실수를 하지 않도록 주의!!!!! \n");
		
		// 107p
		System.out.println("4-10. switch문의 제약조건");
		System.out.println("switch문의 조건식은 결과값이 반드시 정수여야하며, 이 값과 일치하는 case문으로 이동하기 때문에 case값 역시 정수여야한다.");
		System.out.println("case값은 중복이면 안되며, 반드시 상수여야한다. 변수나 실수는 case문의 값으로 사용할 수 없다.\n");
		
		System.out.println("Switch문의 제약조건");
		System.out.println("1. switch문의 조건식 결과는 정수 또는 문자열이어야한다.");
		System.out.println("2. case문의 값은 정수 상수(문자 포함), 문자열만 가능하며 중복되지 않아야한다.\n");
		
		//int num, result;
		
		//final int ONE = 1;
		
		//switch (result) {
		//case '1':
		//case ONE :
		//case "YES":	// 문자열 리터럴, JDK 1.7부터 된다며... 얜 안되는건가?
		//case num : // 변수라서 error
		//case 1.0: // 실수라서 error
		// 무ㅓ야 이해 안되는데}
		
		System.out.println("4-11 switch문의 제약조건 예제");
		System.out.print("현재 월을 입력하세요> ");
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄이 왔군요");
			break;
		case 6: case 7: case 8:
			System.out.println("여름엔 내 생일이 있지!");
			break;
		case 9: case 10: case 11:
			System.out.println("가을은 짧다");
			break;
		
		case 12: case 1: case 2:
			System.out.println("겨울추워");
			break;
			
		}
	
		

	
	}

}
