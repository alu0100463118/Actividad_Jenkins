package com.LDH.Practica;

import java.util.Scanner;

/**
 * Clase principal del programa. En ella estan contenidos los metodos necesarios para calcular la distancia entre dos palabras.
 * @author: Joshua García Expósito
 * @version: 1.0
 * @see <a Practica alojada en: href = "https://github.com/alu0100463118/Actividad_Jenkins.git" /> </a>
 */

public class App {
	
	/**
	 * Método principal del programa. En él se piden las dos palabras y se llama al método que calcula la distancia entre ambas.
	 */
	
    public static void main( String[] args ) {
        System.out.println( "Programa para ver la distancia entre dos palabras" );
        System.out.println();
        
        // Declaración de un obejto de tipo Scanner para la entrada por teclado
        
        Scanner entradaEscaner = new Scanner (System.in);
        int distancia = 0;
        
        // Pedimos las dos palabras a comparar
        
        System.out.println( "Introduce la primera palabra" );
		String primeraPalabra = entradaEscaner.next();
        System.out.println();
        System.out.println( "Introduce la segunda palabra" );
        String segundaPalabra = entradaEscaner.next();
        System.out.println();
        
        distancia = calcularDistancia(primeraPalabra, segundaPalabra);

        System.out.println("La distancia entre la palabra " + primeraPalabra + " y la palabra " + segundaPalabra + " es " + distancia);
        entradaEscaner.close();
    }
    
    /**
     * Metodo que calcula la distancia entre dos palabras.
     * @param primeraPalabra, segundaPalabra. Palabras que vamos a comparar.
     * @return Número entero igual a la distancia entre las palabras que le pasamos.
     */
    
    public static int calcularDistancia (String primeraPalabra, String segundaPalabra) {
    	int distancia, comparar = 0;
    	
    	// Miramos que palabra es más pequeña para saber hasta donde tenemos que comparar las palabras
    	
    	if (primeraPalabra.length() < segundaPalabra.length()) {
        	comparar = primeraPalabra.length();
        }
        else {
        	comparar = segundaPalabra.length();
        }
        
    	// Si una palabra es más pequeña que otra, sumamos la diferencia de tamaño a la distancia entre las palabras
    	
        distancia = Math.abs(primeraPalabra.length() - segundaPalabra.length());
        
        // Si las letras en la posición "i" son diferentes, sumamos 1 a la distancia entre las palabras
        
        for (int i = 0; i < comparar; i++) {
        	if (primeraPalabra.charAt(i) != segundaPalabra.charAt(i)) {
 				distancia++;
 			}
 		}
        
        // Devolvemos la distancia entre las dos palabras
        
    	return distancia;
    }
}
