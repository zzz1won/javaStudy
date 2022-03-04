package jiwon_studyAlone;

public class breakStatement_220304_4_20 {

	public static void main(String[] args) {
		// 119p
		System.out.println("4-20 break문");
		
		int sum = 0;
		int i = 0;
		
		while(true)	{
			if(sum > 100)
				break;
			++i;
			sum += i;	
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);
		
		

	}

}
