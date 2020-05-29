package funcionario;

import java.util.Locale;
import java.util.Scanner;

public class funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		String nome,nome1,nome2;
		char sn;
		int hrstrabalhadas,hrstrabalhadas1,hrstrabalhadas2, opcao,totalhoras;
		double vlrhora;
		
	
			
		
	
		do {
	
			System.out.print("Nome: ");
			nome=sc.next();
			System.out.print("Horas Trabalhadas: ");
			hrstrabalhadas=sc.nextInt();
			System.out.print("Valor por hora: ");
			vlrhora=sc.nextDouble();
			System.out.print("Digitar outro (S/N)? ");
			sn=sc.next().charAt(0);
			
			if (hrstrabalhadas < 0) {
				System.out.println("As Horas Trabalhadas não podem ser negativas, tente novamente:");
				hrstrabalhadas=sc.nextInt();
				
			}
			else if (vlrhora < 0 ) {
				System.out.println("O valor por hora não pode ser negativo, tente novamente");
				vlrhora=sc.nextDouble();
				
				
			} 

			
		} while(sn== 's'|| sn=='S') ;
		
		
		
		
		
	}

}
