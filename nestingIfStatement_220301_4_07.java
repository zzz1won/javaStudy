package jiwon_studyAlone;

import java.util.Scanner;

public class nestingIfStatement_220301_4_07 {

	public static void main(String[] args) {
		// 104p
		
		System.out.println("4-07.중첩 if문");
		System.out.println("말 그대로 if문 안의 if문");
		System.out.println("괄호 생략이 가능하지만 가능하면 안하는것이 좋다."); // 난 블럭쟁이긴 하지만 ㅜㅜ...
		
		
		// 105p
		System.out.println("4-08.중첩 if문 예제");
		System.out.println("예제 4-5");
		
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수입력 > ");
		Scanner scan = new Scanner(System.in);
		
		score = scan.nextInt();
		
		System.out.printf("당신의 점수는 %d점 입니다.", score);
	
		
		if (score >= 90) {
			grade = 'A';
			if(score >= 98) 	{
				opt = '+';
			} else if(score >=94){
				opt = '-';
			}
			
		}	else if (score >= 80) {
			grade = 'B';
			if(score >= 88) 	{
				opt = '+';
			} else if(score >=84){
				opt = '-';
			}
			
		} else	{
			grade = 'C';	
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);
		
		//외부 if문의 조건식에 의해 한 번 걸러졌기 때문에 내부 if문의 조건식은 더 간단하게 쓸 수 있다.

	}

}
