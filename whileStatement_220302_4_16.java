package jiwon_studyAlone;

public class whileStatement_220302_4_16 {

	public static void main(String[] args) {
		// 115p
		
		System.out.println("4-16 while문");
		System.out.println("while문은 구조가 단순한 편이다, for문보다는. 블럭{}만으로 이루어져있고 조건이 거짓이 될 때까지 {}문장을 반복한다.");
		// 식을... 잘못 쓰지않게... 조심...^^
		
		int a = 0;
		while (a < 10)	{
			System.out.printf("a가 10보다 작을 때: %d%n",a);
			a++;
		}
		System.out.println("while문은 먼저 조건을 평가해서 조건식이 거짓이면 문장 전체를 벗어나고 참이면 블럭을 수행...\n 1. 조건식이 참이면 {}블럭 안으로 들어간다.\n 1-1.거짓이면 while문을 벗어난다. \n 2.블럭{}의 문장을 수행하고 다시 조건식으로 돌아간다.\n");
		
		System.out.println("\nfor문과 while문의 비교");
		//1부터 10까지의 정수를 순서대로 나타내는 식
		
		for(int i = 1; i <=10; i++) {
			System.out.print(i+"\t");
		}System.out.println();
		
		int j = 1;
		while (j <= 10) {
			System.out.print(j+"\t");
			j++;
		}
		
		//조금 더 간결한것은 for문이라고한다.

	}

}
