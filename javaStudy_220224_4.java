package jiwon_studyAlone;

public class javaStudy_220224_4 {

	public static void main(String[] args) {
		// 80p
		
		System.out.println("3-10 산술 변환");
		
		// 이항 연산자는 두 피연산자의 타입이 일치해야 연산이 가능하므로, 피연산자의 타입이 서로 다르다면 연산 전에 형변환 연산자로 타입을 일치시켜야 한다.
		// 이처럼 연산 전에 피연산자 타입의 일치를 위해 자동 형변환 되는 것을 산술변환 또는 일반 산술변환이라 하며 이 변환은 이항 연산에서만 아니라 단항 연산에서도 일어난다.
		
		System.out.println("산술 변환 규칙");
		System.out.println("1. 두 피연산자의 타입을 같게 일치시킨다.(기존보다 큰 타입으로 일치)");
		System.out.println("long + int -> long + long -> long");
		System.out.println("float + int -> int + int -> int");
		System.out.println("double + float -> double + double -> double");
		
		System.out.println("----");
		System.out.println("2. 피연산자의 타입이 int보다 작은 타입이라면 int로 변환된다, 사용자가 시키는게 아니라 자동으로 변환한다!");
		System.out.println("byte + short -> int + int -> int");
		System.out.println("char + short -> int + int -> int");
		
		
		System.out.println("예제 3-7");
		System.out.println("여기서 한 가지 주목 할 점은, 연산결과의 타입인데 연산결과의 타입은 피연산자의 타입과 일치한다.");
		System.out.println("5 / 2 = "+(5/2) );
		System.out.println("고로 정확한 답을 구하기 위해서는 피연산자의 타입을 float와 같은 실수형으로 바꾸어줘야한다.");
		System.out.println("5/(float)2 = "+(5/(float)2));
		
		
		//81p
		/*
		byte a = 10;
		byte b = 20;
		byte c = a + b;
		System.out.println(c);
		*/
		System.out.println("byte + byte 는 int로 변경되므로 int형 4 byte가 된다.");
			//4 byte의 값을 1 byte의 변수에 형변환 없이 저장하려고하여 34번째 줄에서 에러가 난다.
		
		System.out.println("예제 3-8");
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a*b);
		System.out.println(c);
		
		
		
		//82p
		int aa = 1_000_000;
		int bb = 2_000_000;
		long cc = aa * bb;
		System.out.println(cc);
		
		//식 a*b를 담는 변수 c의 자료형이 long 타입이기 때문에 저장공간이 충분하여 2000000000000 이 출력될 것 같지만 int 와 int의 연산결과는 int 타입이므로 결과가 cc 처럼 나온다. (오버플로우)
		// 올바른 결과를 얻으려면 변수a 또는 b의 타입을 long으로 형변환해줘야 한다.
		
		long aaa = 1_000_000 * 1_000_000;
		long bbb = 1_000_000 * 1_000_000L;
		System.out.println("aaa="+aaa);
		System.out.println("bbb="+bbb);
	}

}
