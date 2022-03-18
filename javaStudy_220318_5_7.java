package jiwon_studyAlone;

import java.util.Arrays;

public class javaStudy_220318_5_7 {

	public static void main(String[] args) {
		// 136p
		System.out.println("5-07.배열의 출력 예제");
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[10]{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a','b','c','d'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i+1; //1~10의 숫자를 순서대로 배열에 넣는다.
		}

	 
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1; //+1했으니 0부터가 아닌 1~10의 값을 배열에 저장.
		}
		
		// 배열에 저장된 값 출력.
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2)); //Array에 import 랜덤값 저장한거라서 값이 달라집니당 
		System.out.println(Arrays.toString(iArr3)); //Array에 import
		System.out.println(Arrays.toString(chArr)); //Array에 import 
		System.out.println(iArr3); // 주소값이므로 달라질 수 있습니다.
		System.out.println(chArr);
		
	}

}
