package jiwon_studyAlone;

public class javaStudy_220228_1 {

	public static void main(String[] args) {
		// 90p
		
		System.out.println("3-16.논리 부정 연산자!");
		
		System.out.println("피연산자가 true 이면 false를, false라면 true를 반환하는 것.");
		/* tv의 전원버튼이라고 생각하면 된다.
		 * 논리 부정 연산자 '!'가 주로 사용 되는 곳은 조건문과 반복문의 조건식이며 이 연산자를 잘 사용하면 조건식이 보다 이해하기 쉬워진다.
		 * 예를들어 문자 ch는 소문자가 아니다 라는 조건을 a처럼 쓰기보다 b처럼 부정 연산자 '!' 를 사용하는 쪽이 알기 쉽다.
		 */
		
		System.out.println("a: ch < 'a' || ch > 'z'");
		System.out.println("b: !('a' <= ch && ch <= 'z')");
		
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n",b);
		System.out.printf("!b=%b%n",!b);
		System.out.printf("!!b=%b%n",!!b);
		System.out.printf("!!!b=%b%n",!!!b);
		System.out.println();
		
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z');
		System.out.printf("!('a' <= ch && ch<='z')=%b%n",!('a' <= ch && ch<='z'));
		System.out.printf("('a' <= ch && ch<='z')=%b%n",('a' <= ch && ch<='z'));
		
		System.out.println("단항 연산자는 결합 방향이 오른쪽에서 왼쪽이므로 피연산자와 가까운 것부터 먼저 연산된다.");
		

	}

}
