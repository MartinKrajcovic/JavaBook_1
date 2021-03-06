package h1_applety;
//importy potrebnych kniznic
import java.applet.Applet;
import java.awt.Graphics;

/*
 <applet code="Applet2" width=200 height=60>
 </applet>
 */
public class Applet2 extends Applet {	//dedenie od triedy Applet
	
	//metoda paint s parametrom Graphic
	@Override
	public void paint(Graphics g) {
		
		//V okne Javy plati, ze horny, lavy roh ma suradnice 0,0 (x a y suradnice).
		g.drawString("Toto je text appletu.", 20, 20);
	}
	
	/*
	 * Na zaciatku tohto kodu je komentar s HTML znackou appletu, ktory sa ma spustit.
	 * Tato znacka urcuje ze nas program je applet, ktory sa ma spustit pomocou appletViewera
	 * s danymi rozmermi okna.
	 */
}
