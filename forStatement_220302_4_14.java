package jiwon_studyAlone;

public class forStatement_220302_4_14 {

	public static void main(String[] args) {
		// 112p
		
		System.out.println("4-14. for문 예제");
			
		System.out.println("예제 4-9");
			for(int i = 1; i<=5; i++) {
				System.out.println("i값 출력:"+i);
			}
			
			for(int i=1; i<=5; i++) 
				System.out.print(i);
			
			// 한줄이라서 괄호 생략했음.
		
			System.out.println("조건식이 false가 되는 때에 for문을 벗어납니다잉");
		System.out.println("\n예제 4-10");
		int sum = 0;
			for (int i = 1; i <=5; i++) {
				sum += i;
				System.out.printf("1부터 %2d까지의 합:%2d%n", i, sum);
			}
		
	}

}
