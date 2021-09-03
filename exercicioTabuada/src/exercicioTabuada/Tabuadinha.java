package exercicioTabuada;

import java.util.Scanner;

public class Tabuadinha {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int numeroMultiplicado ;
		int valorMaximo = 9 ;
		int contador = 0 ;
		
		System.out.println("Qual o multiplicando: ");
		numeroMultiplicado = leitor.nextInt();
		
		System.out.println("Qual o multiplicador: ");
		valorMaximo = leitor.nextInt();
				
		while(contador <= valorMaximo) {			
				contador++;
				
				int vezes = numeroMultiplicado * contador;
				System.out.println(numeroMultiplicado +"x"+ contador + " : " + vezes);
		}
		
		

	}

}
