package jiwon_studyAlone;

public class javaStudy_220222_2 {

	public static void main(String[] args) {
		// 0222-연장!
		
		//연산자의 결합규칙
		//우선순위가 같다고 해서 아무거나 먼저 처리하는 것은 아니고, 나름의 규칙을 갖고있다. 그게 연산자의 결합규칙이다.
		
		System.out.println("3+4-5=");
		System.out.println("3+4-5="+(3+4-5));
		System.out.println("연산자의 결합규칙이 왼쪽에서 오른쪽인 경우");
		
		int x, y;
		System.out.println("x=y=3");
		System.out.println("x=y=3의 값:"+(x= y=3));
		System.out.println("연산자의 결합규칙이 오른쪽에서 왼쪽인 경우");
		//y=3이 먼저 수행 된 후 y=x 가 되므로 최종 값은 x=3, 즉 3이다.
		System.out.println("대입연산자는 우변의 값을 좌변에 저장하고, 저장 된 값을 연산결과로 반환한다. 그래서 y=3의 연산결과가 3이 되는 것.");
		
		System.out.println("------------------------");
		System.out.println("1. 산술 > 비교 > 논리 > 대입. 대입 연산자는 제일 마지막에 수행된다. ");
		System.out.println("2. 단항(1) > 이항(2) > 삼항(3). 단항 연산자의 우선순위가 이항 연산자보다 높다.");
		System.out.println("3. 단항 연산자와 대입 연산자를 제외한 모든 연산의 진행방식은 왼쪽에서 오른쪽으로 향한다.");
		System.out.println("------------------------");
		
		System.out.println("예제 3-1");
		
		x= y= 3; //y에 3이 저장 된 후, x에 3이 저장된다.
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		

	}

}
