package jiwon_studyAlone;

import java.util.Arrays;

public class javaStudy_220323_5_10 {

	public static void main(String[] args) {
		// 5-10 배열의 활용
		
		int[] numArr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<=numArr.length; i++) {
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));

	}

}
