package jiwon_studyAlone;

public class javaStudy_220319_5_8 {

	public static void main(String[] args) {
		// 137p
		
		System.out.println("5-08.배열의 활용(1)-총합과 평균");
		System.out.println("예제 5-2: 총합과 평균, 배열의 모든 요소를 더해서 총합과 평균을 구한다.");

		int sum =0;//총합을 더하기 위한 변수
		float average = 0f; //평균을 저장하기 위한 편수
		
		int[] score = {100, 88, 100, 100,90};
		
		for (int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		
		average = sum / (float)score.length; //계산 결과를 float타입으로 얻으려 형변환
		
		System.out.println("총합: "+sum);
		System.out.println("평균: "+average);

		
		//for문을 이용해서 배열에 저장된 값을 모두 더한 결과를 배열의 개수로 나누어서 평균을 구하는 예제.
		//평균을 구하기 위해 전체 합을 배열의 길이인 score.length 로 나누었다.
		
		//이 때 int타입과 int타입간의 연산은 int타입으로 나오기때문에 정확한 값이 나오지 않으므로 score.length를 float타입으로 변환해 나눗셈을 진행했다.
	}

}
