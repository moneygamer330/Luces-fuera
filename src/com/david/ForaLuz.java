package com.david;

import java.util.Scanner;

public class ForaLuz {
	boolean[][] tablero;
	Scanner scanner;
	
	public ForaLuz(int c) {
		tablero = new boolean[c][c];
		scanner = new Scanner(System.in);
		mostrarMenu();
	}
	
	public void mostrarMenu() {
		System.out.println("FORA LUZ");
		System.out.println("Longiud del tablero: " + tablero.length);
		System.out.println("CREADO POR QUIQUE, OSCAR, LUIS, FERNANDO, DAVID");
		System.out.println("1 - Empezar juego");
		System.out.println("2 - Salir del juego");
	}
	
	public void mostrarTablero() {
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print((tablero[x][y] ? "1" : "0") + " ");
			}
			System.out.println();
		}
	}
	
	public void empezarJuego() {
		
	}
	
	public void reiniciarJuego() {
		
	}
	
	public void salirJuego() {
		
	}

	public void solicitarCoordenadas() {
		int x = 0;
		int y = 0;
		System.out.println("Ingresa las coodenadas en X.");
		x=scanner.nextInt();
		
		System.out.println("Ingresa las coodenadas en Y.");
		y=scanner.nextInt();
	}
}
