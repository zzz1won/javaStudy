package jiwon_studyAlone;

public class javaStudy_220317_5_02 {

	public static void main(String[] args) {
		// 131p
		
		System.out.println("5-02.배열의 선언과 생성");
		System.out.println("배열을 선언하는 방법은 간단하다. 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 대괄호[]를 붙이면 된다.");
		System.out.println("배열을 '선언'한 다음에는 배열을 생성해야한다. 배열을 선언하는 것은, 단지 생성 된 배열을 다루기 위한 참조변수를 위한 공간이 만들어질 뿐이고,\n배열을 '생성'해야만 값을 저장할 수 있는 공간이 만들어진다.");
		System.out.println("여타 다른 생성자를 만들 때 처럼 'new'를 적어주며 배열의 타입과 길이를 지정해주면 된다.");
		
		//타입[] 변수이름; //배열을 선언(배열을 다루기 위한 참조변수 선언)
		//변수이름 = new 타입[길이];
		
		System.out.println("\n길이가 5인 int 배열");
		int[] score; //int type의 배열을 다루기 위한 참조변수 score 선언
		score = new int[5]; //int type의 값 5개를 저장할 수 있는 배열 생성
		
		System.out.println("\n간단히 한 줄로 쓰는 방법");
		System.out.println("타입[] 변수이름 = new 타입[길이];");
		int[] score1 = new int[5];
		
		
		System.out.println("5-03.배열의 인덱스");
		//인덱스는 배열의 요소마다 붙여진 일련번호...
		System.out.println("index의 범위는 0부터 '배열길이-1'까지");
		//예를들어 길이가 5인 배열은 모두 5개의 요소(저장공간)를 갖게되며 인덱스의 범위는 0부터 4까지 5가 된다.
		
		System.out.println("\n배열에 값을 저장하고 읽어오는 방법은 변수와 같다. 단지 변수이름 대신 '배열이름[인덱스]'를 사용한다는 점만 다르다.");
		score1[3] = 100; //배열 score1의 4번째 요소에 100을 저장한다.
		System.out.println("score1[3]="+score1[3]);
		int value = score1[3]; //배열 score의 4번째 요소 값을 읽어 value에 저장...? 그냥 데이터를 저장하는 거라고 생각하면 되겠다.
		
		System.out.println("배열을 for문으로 변경해서 사용도 가능하다. 상수 대신 변수나 수식도 사용할 수 있음.");
		for (int i=0; i<=3; i++) {
			score[i] = i *10;
			System.out.println("score[i]="+score[i]);
		}
	
	}

}
