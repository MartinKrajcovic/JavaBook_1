package d1_enum;

import java.util.Random;

class Otazka {
	Random r = new Random();
	
	Odpovede ask() {
		int prob = (int) (100*r.nextDouble());
		
		if(prob < 15)
			return Odpovede.MOZNO;
		else if(prob < 30)
			return Odpovede.NIE;
		else if(prob < 60)
			return Odpovede.ANO;
		else if(prob < 75)
			return Odpovede.NESKOR;
		else if(prob < 98)
			return Odpovede.SKORO;
		else
			return Odpovede.NIKDY;
	}
}

public class SpytajSa {
	static void odpoved(Odpovede result) {
		switch(result) {
		case NIE:
			System.out.println("nie");
			break;
		case ANO:
			System.out.println("ano");
			break;
		case MOZNO:
			System.out.println("mozno");
			break;
		case NESKOR:
			System.out.println("neskor");
			break;
		case SKORO:
			System.out.println("skoro");
			break;
		case NIKDY:
			System.out.println("nikdy");
			break;
		}
	}
	
	public static void main(String[] args) {
		Otazka question = new Otazka();
		odpoved(question.ask());
		odpoved(question.ask());
		odpoved(question.ask());
		odpoved(question.ask());
	}
}

