package jiwon_studyAlone;

public class javaStudy_220222_4 {

	public static void main(String[] args) {
		// 76p
		

		System.out.println("3-06 부호연산자");
		// 부호연산자 '-'는 피연산자의 부호를 반대로 변경한 결과를 반환한다. 피연산자가 음수면 양수, 양수면 음수가 연산의 결과가 된다.
		// 부호연산자는 boolean 형과 char형을 제외한 기본형에만 사용할 수 있다. 기호는 같아도 피연산자의 개수가 달라서 덧셈 뺄셈과 구별가능.
		
		System.out.println("-----------------------------");
		System.out.println("예제 3-4");
		int i = -10;
		i = +i;
		System.out.println(i); //-10
		// i가 -10일때 +(-10)을 i에 다시 대입했으므로 변화없이 i = -10
		
		
		i = -10;
		i = -i;
		System.out.println(i); //10
		// i가 -10일 때 -(-10)을 i에 대입했으므로 -+- = + 양수처리되어 i=10
	

	}

}
