package jiwon_studyAlone;

public class Math_random_220302_4_12 {

	public static void main(String[] args) {
		// 109p
		
		System.out.println("4-12. 임의의 정수 만들기 Math.random()");
		
		System.out.println("임의의 수(난수)를 얻기 위해서는 Math.random()을 사용한다.");
		System.out.println("이 메서드는 0.0과 1.0 사이의 범위에 속하는 하나의 double 값을 반환한다.");
		System.out.println("0.0은 범위에 포함되고 1.0은 포함되지 않는다~");

		System.out.println("0.0 <= Math.random() < 1.0");
		
		// -------------------

		// 만일 1과 3사이의 정수를 구한다면, notion에 적어보자~
		
		// -------------------
		
		int num = 0;
		
		for (int i = 1; i <= 5; i++) {
			num = (int)(Math.random()*6)-1;
			System.out.println(num);
		}
		
		 
	
	
	}

}
