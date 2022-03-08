package jiwon_studyAlone;

public class javaStudy_220308_4_23 {

	public static void main(String[] args) {
		// 122p
		System.out.println("4-23.이름 붙은 반복문\n");
		// 이게 뭐지
		System.out.println("break문은 근접한 단 하나의 반복문만 벗어날 수 있기에, 여러개의 반복문이 중첩된 경우 break문으로 중첩 반복문을 완전히 벗어날 수 없다.\n이때는 중첩 반복문 앞에 이름을 붙이고 break문과 continue문에 이름을 지정해줌으로써\n하나 이상의 반복문을 벗어나거나 반복을 건너뛸 수 있다.");
		
		//for문에 Loop1 이라는 이름을 붙인다.

		Loop1 : for (int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5) 
					break Loop1;
				/*
				 * break; continue Loop1; continue;
				 */					System.out.println(i+"x"+j+"="+i*j);
				}// end of for i
				System.out.println();
			}//end of Loop1
		}

	}


