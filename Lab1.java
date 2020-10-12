public class Lab1 {

	public static double Random_11_14() {	
		return Math.random() * (14 + 11) - 11;
	}
	
	public static void main(String[] args){ 
		final int f = 9;
		final int p = 18;
		int s = 3;
		long[] d = new long[f];
		double[] x = new double[p];
		double[][] k = new double[f][p];

		for (int i = 0; i < f; i++){
			d[i] = s;
			s += 2;	
		}
		
		for (int i = 0; i < p; i++){
			x[i] = Random_11_14();
		}
	
		for (int i = 0; i < f; i++){
			for (int j = 0; j < p; j++) {
				if (d[i] == 17){
					k[i][j] = Math.log(Math.abs( 0.75 + x[j]));
				}
				else if ((d[i] == 5) || (d[i] == 9) || (d[i] == 11) || (d[i] == 15)){
					k[i][j] = Math.atan(Math.exp(Math.cbrt(-Math.abs(x[j]))));
				}
				else  k[i][j] = Math.log(Math.pow(Math.exp(Math.tan(Math.pow(x[j] + 1,3))) / 2,2));
					System.out.printf("%.2f ", k[i][j]);
			}
			System.out.println();
		}
		
	}
}
