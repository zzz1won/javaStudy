package jiwon_studyAlone;

public class WhileStatementExample_220302_4_17 {

	public static void main(String[] args) {
		// 116p
		System.out.println("4-17.while문 예제1");

		System.out.println("예제 4-12");
		int i = 5;
		//i 가 5일 때를 설정.

		while (i--!=0) {	// 5-- !=0 : 5부터 1씩감소되는 식을 진행, 0과 같지 않을 때 까지! 그 이후는 while문을 벗어납니다.
			System.out.println(i+"-i can do it!!!");
			//후위형이 아직 헷갈리긴한다.ㅠ
		}

		
		System.out.println("예제 4-13");
		int sum = 0;
		int j = 0;
		//j를 1씩 증가시켜서 sum에 계속 더해나간다.
		
		while (sum <=100) {
			System.out.printf("%d - %d%n", j,sum);
			sum += ++j;
		}
		
	}

}
