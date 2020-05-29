package funcionario;

import java.util.Locale;
import java.util.Scanner;

public class funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		String nome,nome1,nome2;
		char sn;
		int hrstrabalhadas,hrstrabalhadas1,hrstrabalhadas2, opcao,totalhoras=0;
		double vlrhora,valortotal=0, total=0;
		
	
			
		
	
		do {
	
			System.out.print("Nome: ");
			nome=sc.next();
			System.out.print("Horas Trabalhadas: ");
			hrstrabalhadas=sc.nextInt();
			System.out.print("Valor por hora: ");
			vlrhora=sc.nextDouble();
			System.out.print("Digitar outro (S/N)? ");
			sn=sc.next().charAt(0);


			if (hrstrabalhadas<0) {
				System.out.print("Valor de horas trabalhadas não pode ser negativo, Tente novamente: ");
				hrstrabalhadas=sc.nextInt();
			}
			else if (vlrhora<0) {
				System.out.print("O valor por hora trabalhada não pode ser negativo, tente novamente: ");
				vlrhora=sc.nextDouble();
				
			}
			
			
			totalhoras=hrstrabalhadas+totalhoras;
			
			valortotal=vlrhora*hrstrabalhadas;
			
			total=valortotal+total;
			
			
		} while(sn== 's'|| sn=='S') ;
		
		
		
		do {
			

		
		System.out.println("");
		System.out.println("MENU");
		System.out.println("1 - Total de horas trabalhadas ");
		System.out.println("2 - Custo total ");
		System.out.println("3 - Nome da pessoa que ganhou mais");
		System.out.println("4 - Sair ");		
		System.out.println("Digite uma opção: ");	
		opcao=sc.nextInt();
		System.out.println("");
		
		if (opcao==1) {
		  System.out.printf("Total de horas = %.2f%n " , totalhoras );
		  
			
		}
		
		else if (opcao==2) { 
			
			System.out.printf("Custo total = %.2f%n ", total);
			
		}
	
		
		
		} while (opcao!=4);
		
		
	}

}
