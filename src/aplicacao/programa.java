package aplicacao;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int opcao;
		double largura,altura, area, perimetro;
		
		
		
		
		
		System.out.print("Gigite a largura do retângulo: ");
		largura = sc.nextDouble();
		
		while (largura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
		largura = sc.nextDouble();
		System.out.println("  ");
		}
		
		System.out.print("Digite a altura do retângulo: ");
		altura = sc.nextDouble();
		System.out.println("  ");
		
		while (altura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
		altura = sc.nextDouble();
		
		}
		
		System.out.println("MENU: ");
		System.out.println("1- Mostrar area ");
		System.out.println("2- Mostrar perimetro ");
		System.out.println("3- Sair ");
		System.out.print("Digite uma opcao: ");
		opcao = sc.nextInt();
		
		
		while(opcao != 3) {
			
			if (opcao == 1) {
				area = (altura * largura);
				System.out.println("  ");
				System.out.printf("AREA = %.2f%n ", area);
				System.out.println("  ");
				System.out.print("Digite uma opcao: ");
				opcao = sc.nextInt();
				}
			
			else if (opcao == 2) {
				 perimetro = (altura * 2 + largura * 2); 
				 System.out.println("  ");
					System.out.printf("PERIMETRO = %.2f%n ", perimetro);
					System.out.println("  ");
					System.out.print("Digite uma opcao: ");
					opcao = sc.nextInt();
					}
			
			else  {
				 System.out.println("  ");
				 System.out.printf("OPCAO INVALIDA %n");
				 System.out.println("  ");
				 System.out.print("Digite uma opcao: ");
				 opcao = sc.nextInt();
			}
			
			
		}
		
		
			 System.out.println("  ");
			System.out.printf("FIM DO PROGRAMA!");
			sc.close();
		
		
	}

}
