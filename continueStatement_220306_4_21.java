package jiwon_studyAlone;

public class continueStatement_220306_4_21 {

	public static void main(String[] args) {
		// 120p
		
		System.out.println("4-21.continue문");
		
		System.out.println("continue문은 반복문 내에서만 사용될 수 있으며, 반복이 진행되는 도중에 continue문을 만나면\n반복문의 끝으로 이동하여 다음 반복으로 넘어간다.\n"
				+ "for문의 경우 증감식으로 이동하며 while문과 do-while문의 경우 조건식으로 이동한다.");

		
		for(int i=0; i<= 10; i++) {
			if (i%3==0)	
				continue;
				System.out.println(i);
		}
		
		
		// 왜 if에 괄호를 안쓸까?
	}

}
