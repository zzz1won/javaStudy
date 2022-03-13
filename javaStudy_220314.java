package jiwon_studyAlone;

public class javaStudy_220314 {

	public static void main(String[] args) {
		// 125p 연습문제 풀어보기

		System.out.println("4-2. 1부터 20까지 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.");
		// 필요한 것: 반복문, 조건문 , sum

		int sum = 0, i = 0;

		for (i = 0; i <= 20; i++) {
			if (i % 2 != 0 && i%3!=0) {
				System.out.println("i: " + i);
				sum+=i;
				System.out.println("sum: " + sum);
			}
		}
		System.out.println("합계: "+sum);

		
		System.out.println("\n4-3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+((1+2+3+...+10)의 결과를 계산하세요.");
		int sum1=0;
		for(int j=1; j<=10; j++) {//횟수
			System.out.println("j:"+j);
			for(int k=1; k<=j; k++) {//실제 계산에 필요한 값
				System.out.println("k:"+k);
				sum1+=k;
			}
		}
		System.out.println("sum:"+sum1);
	
	}

	
		
}
