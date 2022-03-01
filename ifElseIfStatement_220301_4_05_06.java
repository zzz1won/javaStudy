package jiwon_studyAlone;

import java.util.Scanner;

public class ifElseIfStatement_220301_4_05_06 {

	public static void main(String[] args) {
		// 102p
		System.out.println("4-05. if-else if문 개념");
		System.out.println("처리해야할 경우의 수가 셋 이상일 때 사용.");
		System.out.println("결과가 참인 조건식을 만날 때 까지 첫번째 조건식부터 순서대로 평가하고, 참인 조건식을 만나면 해당 블럭{}의 문장을 수행한 후 if-else if문을 빠져나온다.");
		
		
		// 103p
		System.out.println("4-06. if-else if문 예제");
		System.out.println("예제 4-4");
		
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요>");
		Scanner scan = new Scanner (System.in);
		
		score = scan.nextInt();
		
		if ( score >= 90 ) {
			grade = 'A';
		}	else if ( score >= 80 )	{
			grade = 'B';
		}	else if ( score >= 70 )	{
			grade = 'C';
		}	else {
			grade = 'D';
		}
		
		System.out.println( "당신의 학접은 "+grade+"입니다.");
	}
	
	//ㅋㅋㅋ 자바 처음 배울때 이거 엄청 신기하고 재밌었는데 반갑다 ㅠ ㅋㅋㅋ

}
