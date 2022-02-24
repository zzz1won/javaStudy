package jiwon_studyAlone;

public class javaStudy_220224_3 {

	public static void main(String[] args) {
		// 79p
		
		System.out.println("3-09.사칙 연산자");
		//사칙 연산자는 아마도 프로그래밍에 가장 많이 사용되는 연산자일 것이다.
		 System.out.println("곱셈x, 나눗셈/, 나머지% 연산자가 덧셈+, 뺄셈- 연산자보다 우선 순위가 높다.");
		 System.out.println("나누는 수로는 0을 사용할 수 없다.");
		 
		 int a = 10;
		 int b = 4;
		 System.out.printf("%d + %d = %d%n", a, b, a+b);
		 System.out.printf("%d - %d = %d%n", a, b, a-b);
		 System.out.printf("%d * %d = %d%n", a, b, a*b);
		 System.out.printf("%d / %d = %d%n", a, b, a/b);
		 System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);
	
	
		 // 두 변수 a와 b에 각각 10과 4를 저장하여 사친연산을 수행하고 결과를 출력하는 예제이다.
		 // 10과 4를 나눈 결과가 2.5가 아니라 2가 된 이유는 int에서 소수점 이하는 구현되지 않기에 버려진 것이다. 반올림도 적용하지 않는다.
		 System.out.println("올바른 연산 결과를 얻기 위해서는 두 피연산자 중 한 쪽을 실수형으로 형변환을 해야한다.");
	}
	

}
