package jiwon_studyAlone;

public class nestedForStatement_220302_4_15 {

	public static void main(String[] args) {
		// 113p ㅎ
		
		System.out.println("4-15.중첩for문");
		
		//for문 안의 for문...중첩횟수는 제한이 없다.
		System.out.println("별찍기!!!!!!!!!!");
		
		for(int i=1; i<=5; i++) {
			System.out.println("*****");
		} 	//별을 찍어서 어디에 쓰냐고

System.out.println("여기에 중첩 for문을 끼워 넣으면");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			} 	//별을 찍어서 어디에 쓰냐고
			System.out.println();
		} 	//별을 찍어서 어디에 쓰냐고

		System.out.println("\n진짜 별찍기");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}	System.out.println();
		}
		
		System.out.println("조건식의 숫자만 변하고 똑같은 내용이 반복된다면 한 문장의 조건식에 숫자 대신 '변수i'를 넣고\n 해당 문장을 i가 증가하는 for문 안에 넣으면 된다.");
	}

}
