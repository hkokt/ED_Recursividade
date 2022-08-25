package controller;

public class Metodos {

	public int soma(int array[], int size) {
		int n = 0;
		if (size == 0) {
			return n;
		}else {
			int ultima = size - 1;
			n = array[ultima]; 
			size = size - 1;
		return n + soma(array , size);	
		}
			
	}
	
	public String converte(int decimal ,String binario) { 
		String bin = "";
			if (decimal <= 0){
				return bin;
				
			}else {

				int divprox = decimal / 2;
				int resto = decimal % 2;
				bin = String.valueOf(resto);
				
		return converte(divprox, bin) + bin; 		
		}

	}

	public double somafracao(double n) {
			if(n == 1) {
				return 1;
			}
		return 1/n + somafracao(n-1);
		}
	
	public int contador(int n, int conta) {
		if (n==0) {
			return 0;
		}else if (n%10 == conta){
			return contador(n/10, conta) + 1 ;
		}
		return contador(n, conta);
	}
}
	


