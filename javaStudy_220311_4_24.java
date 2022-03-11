package jiwon_studyAlone;

import java.util.Scanner;

public class javaStudy_220311_4_24 {

	public static void main(String[] args) {
		// 123p
		System.out.println("4-24.이름붙은 반복문 예제");
		
		int menu=0, num=0;
		Scanner scan = new Scanner(System.in);
		
		outer: //while문에 이름을 붙여줍니다.
			while(true) {
				System.out.println("(1)square");
				System.out.println("(2)squareRoot");
				System.out.println("(3)log");
				System.out.print("(4)원하는 메뉴 1~3을 선택하세요, 종료를 원하면 0번:");
				
				String tmp = scan.nextLine(); // 화면에서 받은 글자를 tmp에 저장
				menu=Integer.parseInt(tmp);	// 입력받은 문자열 tmp를 숫자로 변환
				
				if(menu==0) {
					System.out.println("프로그램 종료");
					break;
				}	else if (!(1<=menu && menu <= 3))	{
					System.out.print("메뉴를 잘못선택하셨습니다, 종료를 원하면 0번:");
					continue;
				}
				for (;;) {
					System.out.print("계산할 값을 입력하세요. 계산종료:0, 전체종료:99: ");
					tmp=scan.nextLine();
					num=Integer.parseInt(tmp);
					
					if(num==0) {
						System.out.println("계산종료");
					}	
					if(num==99) {
						System.out.println("프로그램 종료");
						break outer; //얘가 없으면 switch문으로 이동해버리는구만!
					}
					switch (menu) {
					case 1://꼭 한 칸을 띄워줘야...?
						System.out.println("result="+num*num);
						break;
					case 2:
						System.out.println("result="+Math.sqrt(num));
						break;
					case 3:
						System.out.println("result="+Math.log(num));
						break;
					}
				}
				
			}
	

	}

}
