package jiwon_studyAlone;

public class javaStudy_220226_1 {

	public static void main(String[] args) {
		// 어제는 자전거를 재미있게 탔다. 이거 쓰고 자소서 쓰고!!! 코드도 다시 돌려보고!!! 강의도 듣자!!! 파이팅111!!!!!!
		
		System.out.println("3.11 Math.round() 반올림하기");
		// 83p
		
		/*
		 * 반올림을 하려면 Math.round() 를 사용하면 된다.
		 * 이 메서드는 소수점 첫째 자리에서 반올림 한 결과를 정수로 반환한다.
		 */
		long result = Math.round(4.52);
		// result에는 5가 저장된다.
		System.out.println(result);	//5
		
		//만일 소수점 첫째자리가 아닌 다른 자리에서 반올림을 하려면 10의 n 제곱으로 적절히 곱하고 나누어야한다.
		System.out.println("예제 3-11");
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println("shortPi: "+shortPi);
		//이 결과 값은 22번줄에서 pi의 값을 소수점 넷째자리인 5에서 반올림을 하여 3.142가 출력 된 것.
		
		/* 과정
		 * Math.round(pi * 1000) / 1000.0
		 * Math.round(3.141592 * 1000) / 1000.0
		 * Math.round(3141.592) / 1000.0
		 * 3142 / 1000.0
		 * 3.142
		 */

		
		// 그러나 30줄에서 1000.0 이 아니라 1000 으로 나눴더라면 int와 int의 연산결과라고 판단되어 답은 3이 나왔을 것이다.
		
		System.out.println("pi: "+pi);
		double shortPiPi = Math.round(pi*1000) / 1000;
		System.out.println("shortPiPi: "+shortPiPi);
	}

}
