package jiwon_studyAlone;

import java.util.Arrays;

public class AnagramTest {

	public static void isAnagram(String a1, String a2) {
		// anagram study
		System.out.println("여고추리반 보다가 시도해보는 애니그램~");
		
		//공백 제거, 이 기능을 통해 띄어쓰기 되는부분은 무시한다.
		a1 = a1.replaceAll("\\p{Z}", "");
		a2 = a2.replaceAll("\\p{Z}", "");
		
		//두 문자열의 길이를 미리 체크
		if(a1.length() != a2.length()) {
			System.out.println("결과: 두 문자열의 길이가 다릅니다.");
			return;
		}
		
		//소문자 변환+배열 변환
		char[] c1 = a1.toLowerCase().toCharArray();
		char[] c2 = a2.toLowerCase().toCharArray();
		
		//Arrays.sort() 오름차순 정렬
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		//String 변환
		String sc1 = new String(c1);
		String sc2 = new String(c2);
		
		//객체 내용을 비교
		if (sc1.equals(sc2)) {
			System.out.println("결과: 애니그램 성공!");
		}	else	{
			System.out.println("결과: 애니그램 실패ㅠ");
		}
		
	}
	
	
	public static void main(String[] args) {
		AnagramTest anagram = new AnagramTest();
		System.out.println(anagram);
		
		//test1
		anagram.isAnagram("Basic", "is ABC");
		//test2
		anagram.isAnagram("Basic", "is ABCD");
		//test3
		anagram.isAnagram("basic", "is abc");
		//test4
		anagram.isAnagram("uWQv", "a zA");
		//test5
		anagram.isAnagram("TABB", "szaz");
	}	

}
