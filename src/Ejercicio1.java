package arrayList2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		do {
			System.out.println("Introduce un número [0 para salir]");
			x = entrada.nextInt();
			numeros.add(x);
		} while (x != 0);
		numeros.remove(numeros.size() - 1);
		System.out.println(calcularSuma(numeros));
		System.out.println(calcularMedia(numeros));
		System.out.println(esCapicua(numeros));
//		for(int num: numeros) {
//			System.out.println(num);
//		}
	}
	
	public static int calcularSuma(ArrayList<Integer> lista) {
		int suma = 0;
		for(int num: lista) {
		suma = suma + num;
		}
		return suma;
	}
	public static double calcularMedia(ArrayList<Integer> lista) {
		double suma = 0;
		double media = 0.0;
		for(int num: lista) {
		suma = suma + num;
		}
		media = suma / lista.size();
		return media;
	}
	public static boolean esCapicua(ArrayList<Integer> lista) {
		boolean esCapicua = true;
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) != lista.get(lista.size() - i - 1)) {
				esCapicua = false;
			}
		}
		return esCapicua;
	}
}
