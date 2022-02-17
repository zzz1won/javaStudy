package jiwon_studyAlone;

public class javaStudy_220217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 220217. 아니 제발 열심히하자~! 기본이라도 !!!
		
		System.out.println("54p_2-08 문자열 결합");
		System.out.println("숫자 뿐만 아니라 두 문자열을 합칠 때에도 덧셈기호를 사용할 수 있다.");
		
		String name = "Ji" + "Won";
		String str = name + 8.0;
		
		System.out.println("name: "+name);
		System.out.println("str: "+str);
		
		/*
		 * 문자열 + any type -> 문자열 + 문자열 -> 문자열 
		 * any type + 문자열 -> 문자열 + 문자열 -> 문자열
		 * 
		 * any Type 어떤 유형...
		 */
	
		System.out.println("예를 들어 "+ 7+ "+'7'"+ "을 계산한다면?");
		System.out.println(7+ "7");
		
		// 덧셈 연산자는 왼쪽에서 오른쪽의 방향으로 연산을 수행하기 때문에 결합 순서에 따라 결과가 달라진다는 것에 주의하자!
		// 숫자를 문자열로 별환 할 때에는 아무것도 쓰여있지 않은 "" 더블쿼터를 더해주면 된다.
		
		System.out.println("name"+name);
		System.out.println("str"+str);
		System.out.println("7+' '= "+7+" ");
		System.out.println("' '+7= "+" "+7);
		System.out.println("7+''= "+7+"");
		System.out.println("''+7= "+""+7);
		System.out.println("''+''= "+""+"");
		System.out.println("7+7+''= "+7+7+"");
		System.out.println(7+7+""+" 39번줄... 앞에 글자가 있어서 String으로 인식했나?");
		System.out.println("''+7+7= "+""+7+7);
	}

}
