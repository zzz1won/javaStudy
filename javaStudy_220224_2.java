package jiwon_studyAlone;

public class javaStudy_220224_2 {

	public static void main(String[] args) {
		// 78p
		
		System.out.println("3-08.자동 형변환");
		/* 요즘 자주 쓴다! 220224 
		 * 서로 다른 타입간의 대입이나 연산을 할 때, 먼저 형변환으로 타입을 일치시키는 것이 원칙이지만
		 * 경우에 따라 편의상의 이유로 형변환을 생략할 수 있다.
		 * 형변환이 이루어지지 않는 것은 아니고 컴파일러가 생략된 형변환을 추가해준다. 
		 */
		
		System.out.println("예를들어");
		System.out.print("float f = 1234;");
		System.out.println("의 경우, float f = (float) 1234; 에서 (float)가 생략된것으로 볼 수 있다.");
		
		// 생략이 가능한 이유는, 우변의 값을 float가 받는데에 아무런 문제가 없기 때문이다.
		System.out.println("변수가 저장할 수 있는 값의 범위보다 더 큰 값을 저장하려는 경우에는 형변환을 생략시 에러가 발생한다.");
		System.out.print("byte b = 1000; 는 실행이 되지 않는다. \t");
		System.out.println("byte는 -128~127 의 값만 수용 가능하기 때문이다.");
		
		//하지만 형변환을 해주는 경우라도 (byte)type은 -128~127 내의 값만 수용하기때문에 저장되는 값은 온전하지는 않다.
		byte b = (byte)1000;
		
		System.out.println("byte b = (byte)1000= "+b);
		//1000이 아니라 -24가 나온다.값이 손실 됨.
		
		System.out.println("기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환 된다.");
		//표현범위가 좁은 타입에서 넓은 타입으로 형변환하는 경우에는 값 손실이 없으므로 두 타입 중 표현범위가 더 넓은 쪽으로 형변환합니다.
		System.out.println("작은타입에서 큰 타입으로 변환하는 것은 형변환 연산자를 사용하지 않아도 자동 형변환이 된다.");
	}

}
