package jiwon_studyAlone;

import java.io.PrintStream;

public class block_220301_4_03 {

	public static void main(String[] args) {
		// 100p ð¦¾ðð¤
		
		System.out.println("4-03. ë¸ë­ {} ");
		
		System.out.println("ë¬¸ì¥ì íëì ë¨ìë¡ ë¬¶ì ë ì¬ì©, } ë¤ìì ì¸ë¯¸ì½ë¡ ì ë¶ì´ì§ ìëë¤.");
		int score = 75;
		if(score > 60)	{
			System.out.println("í©ê²©");
		}
		
		System.out.println("ë¸ë­ë´ì ë¬¸ì¥ì´ í ì¤ ì¼ ë, ê´í¸ë¥¼ ìëµí  ì ìì§ë§ ê°ë¥íë©´ ìëµíì§ ìê³  ì¬ì©íë ê²ì´ ë°ëì§íë¤.");		
		if(score > 70)
			System.out.println("í©ê²©");
		
		//ì¶í ë¬¸ì¥ ì¶ê°ì ì ì©ëì§ ìê¸° ëë¬¸
		
		score = 80;
		System.out.printf("25ë²ì§¸ ì¤, score:%d %n",score);
	
		// printf ì´ë»ê² ì°ëê²¨ ê³ì ì¤ë¥ë...
		//    public PrintStream printf(String format, Object ... args) { return format(format, args);    }
		
		
		score = 65;
		if(score > 70)
			System.out.printf("score:70ì ë¯¸ë§ì ë¶í©ê²©, ë´ ì ìë? %d ", score); // ì´ë ê² ëë©´ score < 70 ì´ë¯ë¡ ì¶ë ¥ëì´ì  ìëë¤.
			System.out.println("70ì  ë¯¸ë§ì ë¶í©ê²©"); // íì§ë§ blockì ë¬¶ì´ì§ ììì ì¶ë ¥ ë  ê³ì  
		
		if(score > 50)	{
			System.out.println("50ì  ì´ìì í©ê²©");
			System.out.println("ì¶íì¶í");
		}
	}

}
