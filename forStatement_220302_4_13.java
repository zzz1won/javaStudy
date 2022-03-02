package jiwon_studyAlone;

public class forStatement_220302_4_13 {

	public static void main(String[] args) {
		// 110p
		// ✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨
		
		System.out.println("4-13.for문");
		//for문은 정말 잘 알아두자~
				
		//for문은 정말 잘 알아두자~
		
		System.out.println(" 반복문은 어떤 작업이 반복적으로 수행되어야할 때 사용한다. \n"
				+ "반복문의 종류로는 for문, while문, while의 변형인 do-while문이 있다");
		System.out.println("for문과 while문은 구조와 기능이 유사해 변환하여 사용가능하다. \n"
				+ "반복되는 횟수를 알고있을 때는 for문, 그렇지 않을 때 while문을 사용한다.");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("개발짱이 될것이야!");
		}

		System.out.println("\n for (초기화;조건식;증감식){ 조건이 참(true)인 동안 수행 될 문장을 적는다. }\n");
		
		System.out.println("예제 4-8");
		for (int i = 1; i<=3; i++) {//괄호 {} 안의 문장을 3번 반복하는 식.
			System.out.println("Hello");
		}
		
		System.out.println("\n 초기화");
		/* 반복문에 사용될 변수를 초기화하는 부분이며, 처음 한 번만 수행된다.
		 * 보통 변수 하나로 제어하지만 둘 이상의 변수가 필요할 때에는 아래와 같이 콤마를 이용해 구분자로 변수를 초기화시킨다.
		 * 단 변수의 타입이 같아야한다.
		 */
		System.out.println("for (int i=1; i<=3; i++){~}\n int i=1; <-여기가 초기화 부분.\n 변수의 값을 1로 초기화한다. ");
		System.out.println("for (int i=1, j=0; ~) 으로 표현가능");
		
		System.out.println("\n 조건식");
		/* 조건식의 값이 true라면 반복을 계속 하고, false면 반복을 중단하고 for문을 벗어난다.
		 * for의 뜻이 '~하는동안' 이므로 조건식이 '참인 동안' 만 반복한다고 생각하자.
		 */
		System.out.println("for (int i=1; i<=10; i++){} \n일 경우, i<=10을 만족한다면 블럭의 내용을 반복수행한다." );
		// 조건식을 잘못 설정하면 무한반복되거나 블럭{} 내의 문장이 한번도 수행되지 않을 수 있다.
		
		System.out.println("\n 증감식");
		/* 반복문을 제어하는 변수의 값을 증가 또는 감소시키는 식이다. 매번 변하다가 결국 조건식이 false가 되면 for문을 벗어나는 식이다.
		 * 연산자++ 식을 제일 많이 이용하지만 다른 연산자도 사용 가능하다.
		 * 예를들어 ++, --, +=, *= ...
		 */
		System.out.println("i++: i씩 증가");
		System.out.println("i--: i씩 감소");
		System.out.println("i+=2:2씩 증가 ");
		System.out.println("i*=3:3배씩 증가");
		
		System.out.println("\n 증감식도 쉼표를 이용해 두 문장 이상을 하나로 연결해서 쓸 수 있다.");
		for (int i=1, j=10; i<=10; i++,j--) {} //이런 식... 세미콜론으로 초기화, 조건식, 증감식을 구별!
		
		System.out.println("오... 세가지 조건을 모두 생략해도 된다고한다.");
		for(;;) {}	//대신 이 경우 true를 생각하고 진행하기때문에, 안에 if문을 넣어서 특정 조건을 만족시 for문을 빠져나오게 해야한다고 함...
		
	}
	
	
	
}