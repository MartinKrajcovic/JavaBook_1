package a5_polia;
/**
 * Tato trieda ukazuje inicializaciu a pristupovanie k dvojrozmernym poliam.
 */
public class TwoDimensionalArray {
	
	public static void main(String[] argus) {
		
		double[][] runStatistics = new double[5][2];
		System.out.println(runStatistics.length);
		
		runStatistics[0][0] = 0.03;
		runStatistics[0][1] = 14.22;
		runStatistics[0][2] = 44;		//miesto pre tento prvok neexistuje -> (zakomentuj)
		
		runStatistics[1][0] = 0.04;
		runStatistics[4][1] = 11.99;
		
		System.out.println();
		System.out.println(runStatistics[4][0]);
		System.out.println(runStatistics[4][1]);
		
	}
}
