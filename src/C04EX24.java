/**
 	Programa exemplo para c�lculo de tabuada de um valor num�rico qualquer
 	fornecido a partir do teclado para opera��o em modo console.
 */

import java.io.*;
import java.util.Scanner;


public class C04EX24 {
	
	public static void main(String args[]) {
		
			int N, I, R;
			Scanner s = new Scanner (System.in);
		
			System.out.println();
			System.out.println("Programa:TABUADA");
			System.out.println();
			System.out.print("Entre um valor inteiro para o calculo:");
			N = s.nextInt();
		
			System.out.println();
			
			/**
		 	O Trecho de c�digo seguinte � responsavel pela apresenta��o
		 	Da tabuada de um valor num�rico qualquer.
			 */
		
			for (I = 1; I <= 10; I++) {
			// C�lculo da tabuada propriamente dito
				
			R = N * I;
			// Apresenta��o da tabuada no formato:N X I = R
			System.out.printf("%3d x %2d = %3d\n" , N, I, R);
				
				
		}
		 
	}

}
