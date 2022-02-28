package jiwon_studyAlone;

public class javaStudy_220228_2 {

	public static void main(String[] args) {
		// 91p
		System.out.println("3-17. 조건연산자");
		
		/* 조건 연산자는 조건식, 식1, 식2 모두 세 개의 피연산자를 필요로 하는 삼항 연산자이며, 삼항 연산자는 조건 연산자 하나뿐이다.
		 * 
		 * 조건 연산자는 첫 번째 피연산자인 조건식의 평가 결과에 따라 다른 결과를 반환한다.
		 * 조건식의 평가 결과가 true이면 식 1이, false이면 식2가 연산결과가 된다.
		 * 가독성을 높이기 위해 조건식을 괄호()로 둘러싸는 경우가 많지만 필수는 아니다.
		 */
		
		// result = (x>y) ? x: y;  x가 y보다 크면, result = true. x이다.
		System.out.println("조건 연산자는 조건문인 if문으로 바꿔 쓸 수 있으며, if문 대신 조건 연산자를 사용하면 코드를 보다 간단히 할 수 있다.");
		System.out.print("result = (x>y) ? x: y; 는");
		System.out.println("\t if( x>y) { result = x; }\n else { result = y; }");

		// 조건 연산자의 식1과 식2, 이 두 피연산자의 타입이 다른 경우, 이항 연산자처럼 산술변환이 발생한다.
		// 적어볼것~!
		
		System.out.println("예제 3-17");
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x= 10;
		y= -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		signX = x > 0 ? '+' : ( x == 0? ' ' : '-');
		signY = y > 0 ? '+' : ( y == 0? ' ' : '-');
		signZ = z > 0 ? '+' : ( z == 0? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
		
		
		
	
		
		
		

	}

}
