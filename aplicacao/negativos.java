package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print(" quantos numeros quer digitar : ");
		int n = sc.nextInt();

		int numero[] = new int[n];

		for (int i = 0; i < numero.length; i++) {
			System.out.print("digite um numero : ");
			numero[i] = sc.nextInt();
		}

		System.out.println("numeros negativos: ");
		for (int i = 0; i < numero.length; i++) {

			if (numero[i] < 0) {

				System.out.println(numero[i]);

			}
		}
		sc.close();
	}

}
