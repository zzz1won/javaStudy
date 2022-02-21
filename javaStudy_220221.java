package jiwon_studyAlone;

import java.util.Scanner;

public class javaStudy_220221 {

	public static void main(String[] args) {
		// 월요일 열심히 살았어야했는데 ㅠ

		System.out.println("61p_2-14 화면으로부터 입력받기");
		//드디어 다시 나온 scanner scan
		
		Scanner scan = new Scanner (System.in);
		// Scanner 클래스의 객체 생성
		
		String input = scan.nextLine(); //입력받은 내용을 input에 저장
		int num = Integer.parseInt(input); //입력받은 내용을 int 타입의 값으로 변환
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 자리 정수를 하나 입력해주세요!: ");
		String input1 = scan.nextLine();
		int num1 = Integer.parseInt(input1); //입력 받은 문자열을 숫자로 변환
		
		System.out.println("입력내용: "+input1);
		System.out.println("num1: "+num1);
	}

}
