package application;

import java.util.Locale;
import java.util.Scanner;
public class bar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		int cerveja,espetinho,refri;
		System.out.println("Sexo: ");
		sexo=sc.next().charAt(0);
		System.out.println("Quantidade de Cervejas: ");
		cerveja = sc.nextInt();
		System.out.println("Quantidade de Refrigerantes: ");
		refri = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		espetinho = sc.nextInt();
		
		
		
		
		
		
		
		sc.close();
	}

}
