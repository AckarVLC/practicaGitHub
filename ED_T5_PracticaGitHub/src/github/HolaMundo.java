package github;

import java.util.Scanner;

public class HolaMundo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Elige del 1 al 4:");
		int eleccion = tec.nextInt();
		switch (eleccion) {
		case 1:
			System.out.println("Number one");
			break;
		case 2:
			System.out.println("Number two");
			break;
		case 3:
			System.out.println("Number three");
			break;
		case 4:
			System.out.println("Number four");
			break;
		default:
			System.out.println("Hola mundo!!!");
			break;
		}
	}
}
