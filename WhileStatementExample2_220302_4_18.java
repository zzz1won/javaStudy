package jiwon_studyAlone;

import java.util.Scanner;

public class WhileStatementExample2_220302_4_18 {

	public static void main(String[] args) {
		// 117p
		
		System.out.println("4-18.while문 예제2");
		
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요>");
		
		Scanner scan = new Scanner(System.in);
		
		String tmp = scan.nextLine(); 	//화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp);	//입력받은 문자열을 숫자로 변환합니다~

		while(num!=0) {
			// num을 10으로 나눈 나머지를 sum에 더함. 
			sum += num%10;
			System.out.printf("sum=%d num=%d%n", sum, num);
			
			num /= 10; // num = num / 10 한 결과를 다시 num에 대입
		}
		System.out.println("각 자리수의 합:"+sum);
		
	}

}
