package jiwon_studyAlone;

public class javaStudy_220226_2 {

	public static void main(String[] args) {
		// 84p
		
		System.out.println("3-11. 나머지 연산자");
// 나머지 연산자는 왼쪽의 피연산자를 오른쪽 피연산자로 나누고 난 나머지 값을 결과로 반환한다.
// 나누는 수(오른쪽 피연산자)로 0을 사용할 ㅅ ㅜ없고, 피연산자로는 정수와 실수를 허용한다.
		System.out.println("나머지 연산자는 주로 짝수, 홀수, 배수 검사등에 주로 사용된다.");

	System.out.println("예제 3-12");
	
	int x = 10;
	int y = 8;
	
	System.out.printf("%d을 %d로 나누면, %n", x,y);
	System.out.printf("몫은 %d이고, 나머지는 %d입니다.", x/y, x%y);
	
	
	System.out.println("예제 3-13");
	System.out.println("-10%8: "+(-10%8));
	System.out.println("10%-8: "+(10%-8));
	System.out.println("-10%-8: "+(-10%-8));
	
	//수포자는 너무 괴로웁다, 하지만 남궁성 개발자님의 친절 설명
	System.out.println("그냥 피연산자의 부호를 모두 무시하고, 나머지 연산ㅇ르 한 결과에 왼쪽 피연산자(나눠지는 수)의 부호를 붙이면 된다.");
	//아하!
	
	}


}
