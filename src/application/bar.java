package application;

import java.util.Locale;
import java.util.Scanner;
public class bar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		int cerveja,espetinho,refri;
		double ingresso,consumo,cover,total;
		
		System.out.println("Sexo: ");
		sexo=sc.next().charAt(0);
		System.out.println("Quantidade de Cervejas: ");
		cerveja = sc.nextInt();
		System.out.println("Quantidade de Refrigerantes: ");
		refri = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		espetinho = sc.nextInt();
		
		// CALCULOS
		if(sexo=='F') {
			ingresso = 8.0;
		}
		else {
			ingresso = 10.0;
		}
		
		consumo = cerveja * 5.0 + refri * 3.0 + espetinho * 7.0;
		
		if(consumo>30) {
			cover = 0.0;
		}
		else{
			cover = 4.0;
		}
		total=ingresso + consumo + cover;
		
		// RELATORIO
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		if(cover==0.0) {
			System.out.println("Isento do Couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f%n", cover);
		}
		System.out.printf("Ingresso = R$ %.2f%n", ingresso);
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
		
		sc.close();
	}

}
