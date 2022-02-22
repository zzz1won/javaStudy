package jiwon_studyAlone;

public class javaStudy_220222_3 {
	
	public static void main(String[] args) {
		//0222 추가! 74-76p
		
		System.out.println("3-05 증감연산자 ++와 --");
		// ㅋㅋㅋ 처음에 중감연산자도 이해가 잘 안됐었지... 지금은 그냥 쓰지만... 감회가 새롭다
		
		/*증감연산자는 피연산자에 저장된 값을 1증가, 혹은 1감소 시킨다.
		 * 증감 연산자의 피연산자로는 정수와 실수 모두 사용 가능하지만, 상수는 값을 변경할 수 없으므로 가능하지 않다.
		 * 
		 * 증감연산자는 일반 산술 변환에 의한 자동 형변환이 발생하지 않으며, 연산결과의 타입을 피연산자의 타입과 같다.
		 * */
		
		System.out.println("증감연산자++: 피연산자의 값을 1 증가시킨다.");
		System.out.println("감소연산자--: 피연산자의 값을 1 감소시킨다.");
		
		/*피연산자의 왼쪽에 위치하면 전위형, 오른쪽에 위치하면 후위형이라고 한다.*/
	
		System.out.println("++전위형: 값이 참조되기 전에! 증감시킨다.");
		System.out.println("후위형++: 값이 참조된 이후에! 증감시킨다.");
	
		int i =0, j=0;
		System.out.println("i="+i+", j="+j);
		System.out.println("i++="+(i++));
		System.out.println("++j="+(++j));
		
		System.out.println("i="+i+", j="+j);
		//여기에서 i가 0이 아니라 1이 된 이유는 27번줄이 실행된 이후 후위에 있던 ++ 증감연산자로 인해 1이 추가되었기 때문이다.
		System.out.println("i--="+(i--));
		System.out.println("--j="+(--j));
		
		System.out.println("i="+i+", j="+j);
		
		
		System.out.println("-----------------------------");
		System.out.println("예제 3-2");
		i=5;
		j=0;
		
		j = i++;
		System.out.println("j=i++ 실행후, i="+i+",j="+j);
		
		i= 5;	//결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j= 0;
		
		j = ++i;
		System.out.println("j=++i; 실행 후, i="+(i)+", j="+j);
		
		
		System.out.println("-----------------------------");
		System.out.println("예제 3-3");
		
		i=5; j=5;
		System.out.println(i++);	//i=5 57줄이 실행 된 후 i를 찍으면 i는 6이 나온다.
		System.out.println(++j);	//j=6 57줄 실행 전, 증가하기때문에 j는 6이 나온다.
		
		System.out.println("i="+i+", j="+j);
		
	}
}
