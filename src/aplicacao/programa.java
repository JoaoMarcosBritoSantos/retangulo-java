package aplicacao;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double largura;
		
		System.out.print("Gigite a largura do retângulo: ");
		largura = sc.nextDouble();
		
		while (largura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
		largura = sc.nextDouble();
		}
		
		
		
		sc.close();
	}

}
