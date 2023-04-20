package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.prodArray;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		prodArray[] produto = new prodArray[n];
		
		for (int i =0; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			produto[i] = new prodArray(nome, preco);
		}
		double soma = 0.0;
		for (int i =0; i<n; i++) {
			soma += produto[i].getPrice();
		}
		double media = soma / n;
		
		System.out.println(media);
		sc.close();
	}

}
