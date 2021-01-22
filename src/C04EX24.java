/**
 	Programa exemplo para cálculo de tabuada de um valor numérico qualquer
 	fornecido a partir do teclado para operação em modo console.
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
		 	O Trecho de código seguinte é responsavel pela apresentação
		 	Da tabuada de um valor numérico qualquer.
			 */
		
			for (I = 1; I <= 10; I++) {
			// Cálculo da tabuada propriamente dito
				
			R = N * I;
			// Apresentação da tabuada no formato:N X I = R
			System.out.printf("%3d x %2d = %3d\n" , N, I, R);
				
				
		}
		 
	}

}
