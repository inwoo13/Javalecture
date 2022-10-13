package sevenweek;

import java.util.ArrayList;
import java.util.Scanner;

class Word{
	String eng;
	String kor;
	
	public Word() {
		eng="chair";
		kor="����";
	}
	
	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

}

public class WordTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Word> book = new ArrayList<>();
		book.add(new Word("house", "��"));
		book.add(new Word("desk", "å��"));
		int count = 0;
		
		while(true) {
			System.out.println("�˻��� �ܾ �Է��Ͻÿ�. (���� q)");
			String word = sc.next();
			
			if(word.equals("q")) break;
			for(Word c : book) {
				if(c.getEng().equals(word)) {
					System.out.println(word+"->"+c.getKor());
					count = 0;
					break;
				}	
				else count=1;
			}
			if(count == 1) System.out.println("������ ���� �ܾ��Դϴ�.");
		}
		sc.close();
	}
}


