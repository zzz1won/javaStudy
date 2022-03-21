package jiwon_studyAlone;

public class javaStudy_220321_5_9 {

	public static void main(String[] args) {
		// 138p
		
		System.out.println("5-9.배열의 활용(2)-최대값과 최소값\n예제5-3");
		
		int[] score = {79,88,91,33,100,55,95};
		
		int max =score[0]; //배열의 첫번째 값으로 최대값을 초기화
		int min =score[0]; //배열의 첫번째 값으로 최소값을 초기화
		
		for(int i=1; i<score.length; i++) { //배열의 두번째 값부터 읽기위해 i를 1로 설정.
			if(score[i]>max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		

	}

}
