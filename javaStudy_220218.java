package jiwon_studyAlone;

public class javaStudy_220218 {

	public static void main(String[] args) {
		// 파이팅!!!
		System.out.println("55p_2-09 두 변수의 값 바꾸기");
		
		// 두 변수 x와 y에 저장된 값을 바꾸려면 어떻게 해야 할까?
		int x = 10;
		int y = 20;
		
		// 단순히 x의 값을 y에 저장하고, y의 값을 x에 저장해서는 원하는 답을 얻을 수 없다.
		// 두 컵에 답긴 내용물을 바꾸려면 빈 컵이 필요한 것 처럼, 값을 임시로 저장할 변수가 하나 더 필요하다.
		
		int tmp; //임시로 값을 저장하기 위한 변수, 빈 컵의 역할
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("tmp: "+tmp);
		
		int x1 = 10, y1= 5;
		System.out.println("x1="+x1);
		System.out.println("y1="+y1);
		
		int tmp1 = x1;
		x1 = y1;
		y1 = tmp1;
		
		System.out.println("x1="+x1);
		System.out.println("y1="+y1);
	}

}
