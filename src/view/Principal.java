package view;

import controller.Metodos;

public class Principal {
	public static void main(String [] args) {
		
		Metodos met = new Metodos();
		somatoria(met);
		binario(met);
		chamasomafrac(met);
		contaquantos(met);
	}
		
			public static void somatoria(Metodos met) {	
				int [] array = {1,2,3};
				int size = array.length;
				int somavet = met.soma(array,size);
				System.out.println("soma dos números de 1 à N: " + somavet);
			}

			public static void binario(Metodos met) {
				int decimal = 100;
				String binario = "";
				String result = met.converte(decimal, binario);
				System.out.println("decimal: "+decimal + " em binario: " + result);
			}
	
			
			public static void chamasomafrac(Metodos met) {
				double num = 2;
				double somafrac = met.somafracao(num);
				System.out.println("Somatória de 1/n até 1: "+somafrac);
			}
			
			public static void contaquantos(Metodos met) {
				int num = 999999;
				int nquant = 9;
				int result=0;
				
				if (num>=10 && num<=999999) {
					result = met.contador(num, nquant);
					System.out.println("o número aparece: "+result+" vezes");
				}else {
					System.out.println("entrada inválida");
				}
				
			}
}

	

