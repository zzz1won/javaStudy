package jiwon_studyAlone;

import java.io.PrintStream;

public class block_220301_4_03 {

	public static void main(String[] args) {
		// 100p 🦾😎🤗
		
		System.out.println("4-03. 블럭 {} ");
		
		System.out.println("문장을 하나의 단위로 묶을 때 사용, } 다음에 세미콜론을 붙이지 않는다.");
		int score = 75;
		if(score > 60)	{
			System.out.println("합격");
		}
		
		System.out.println("블럭내의 문장이 한 줄 일 때, 괄호를 생략할 수 있지만 가능하면 생략하지 않고 사용하는 것이 바람직하다.");		
		if(score > 70)
			System.out.println("합격");
		
		//추후 문장 추가시 적용되지 않기 때문
		
		score = 80;
		System.out.printf("25번째 줄, score:%d %n",score);
	
		// printf 어떻게 쓰는겨 계속 오류나...
		//    public PrintStream printf(String format, Object ... args) { return format(format, args);    }
		
		
		score = 65;
		if(score > 70)
			System.out.printf("score:70점미만은 불합격, 내 점수는? %d ", score); // 이렇게 되면 score < 70 이므로 출력되어선 안된다.
			System.out.println("70점 미만은 불합격"); // 하지만 block에 묶이지 않아서 출력 될 계정 
		
		if(score > 50)	{
			System.out.println("50점 이상은 합격");
			System.out.println("축하축하");
		}
	}

}
