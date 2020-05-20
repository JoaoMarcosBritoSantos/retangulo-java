package aplicacao;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double largura,altura;
		
		System.out.print("Gigite a largura do retângulo: ");
		largura = sc.nextDouble();
		
		while (largura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
		largura = sc.nextDouble();
		}
		
		System.out.print("Digite a altura do retângulo: ");
		altura = sc.nextDouble();
		
		while (altura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
		altura = sc.nextDouble();
		}
		
		
		
		
		sc.close();
	}

}
