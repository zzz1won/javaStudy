package jiwon_studyAlone;

import java.util.Scanner;

public class breakStatementAndContinueStatement {

	public static void main(String[] args) {
		// 121p
		
		System.out.println("4-22.break문과 continue문");
		
		int menu = 0, num=0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true)	{
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)을 선택하세요, 종료(0)> ");
			
			String tmp = scan.nextLine();	//화면에서 입력받은 수를 tmp에 저장
			menu=Integer.parseInt(tmp);		//입력받은 문자열 tmp를 숫자로 변환
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			}	else if (!(1<= menu && menu <=3))	{
				System.out.println("잘못 입력하셨습니다, 종료(0)");
				continue;
			}
			System.out.println("선택하신 메뉴는"+menu+"입니다");
		}

	}

}
