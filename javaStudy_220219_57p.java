package jiwon_studyAlone;

public class javaStudy_220219_57p {

	public static void main(String[] args) {
		//오늘도 힘내기! 주말이니까 더 열심히 보자.
		
		System.out.println("56p_2-10 기본형과 참조형");
		/*
		 * 우리가 주로 사용하는 값(data)의 종류(type)는 크게 '문자'와 '숫자'로 나눌 수 있으며, 숫자는 다시 '정수와 실수'로 나눌 수 있다.
		 * 기본형: 실제 값(data)을 저장
		 * 	논리형 boolean, 문자형 char,  정수형 byte, short, int, long,  실수형 double, float
		 * 참조형: 어떤 값이 저장되어 있는 주소(memory address)를 값으로 갖는다.
		 * */
		
		
		System.out.println("57p_2-11 기본형의 종류와 범위");
		/* 기본형에는 모두 8개의 타입(자료형)이 있다. 정수형 중에는 int가 기본. 실수는 double이 기본이다.
		 * 앗 기본적인 내용이다.
		 * 
		 *  */
		
		System.out.println("58p_2-12 printf 를 이용한 출력");	
		// System.out.printf("age:%d", age);
		System.out.printf("age:%d", 14);
		System.out.printf("age:14");
		System.out.println("지시자를 이용해 변수의 값을 여러가지 형식으로 변환하여 출력한다. 어떻게 보면 model의 name값과 vlaue값 느낌.");
		
		
		System.out.println("59p_2-13 printf 를 이용한 출력 예제");
		String url = "www.codechobo.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1 );
		System.out.println("실수형 값의 출력에 사용되는 지시자는 %f, %e, %g가 있는데 %f가 주로 쓰이고 %e는 지수형태로 출력시, %g는 값을 간략하게 표현할 때 사용한다.");
		System.out.println("%f 는 기본적으로 소수점 아래 6자리까지만 출력한다.");
		//신기하당!!!
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2 );
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3 );
		System.out.printf("d=%f%n",d);
		System.out.printf("d=%14.10f%n",d);
		System.out.println("전체 14자리 중 소수점 아래 10자리");
		System.out.println("앞의 빈자리는 공백으로, 뒤의 빈자리는 0으로 채운다.");
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n",url); //문자열의 길이만큼 출력공간을 확보
		System.out.printf("[%20s]%n",url); //최소 20글자 출력공간 확보(우측정렬)
		System.out.printf("[%-20s]%n",url); //최소 20글자 출력공간 확보(좌측정렬)
		System.out.printf("[%.8s]%n",url); //왼쪽에서 8글자만 출력
		
		System.out.println("지시어 추가해서 적어볼 것!");
			
		

	}

}
