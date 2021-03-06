package m1_this_volanieKonstruktorov;

public class ThisUsage {
	int a, b;
	
	//inicializacie clenov roznymi hodnotami
	ThisUsage(int i, int j) {
		a=i;
		b=j;
	}
	
	//inicializacie clenov rovnakou hodnotou
	ThisUsage(int i) {
		a=i;
		b=i;
	}
	
	//priradenie hodnoty 0 obom clenom
	ThisUsage() {
		a=0;
		b=0;
	}
}
