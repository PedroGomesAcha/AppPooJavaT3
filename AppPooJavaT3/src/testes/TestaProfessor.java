package testes;

import java.util.Scanner;

import negocio.Professor;

public class TestaProfessor {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
			Professor leandro = new Professor();
			
			
			System.out.printf("Informe o seu nome: ");		
			leandro.nome = ler.nextLine();		
			
			System.out.printf("Informe a sua matr�cula: ");		
			leandro.matricula = ler.nextInt();		
			
			float salario;
			System.out.printf("Informe o seu sal�rio: ");		
			leandro.salario = ler.nextFloat();		
	
			System.out.printf("Informe se � um professor tempor�rio: ");		
			leandro.temporario = ler.nextBoolean();
			

			System.out.printf("Informe sua experiencia como professor(em meses): ");
			leandro.meses = ler.nextInt();
			
			System.out.printf("Informe o valor de seu bonus (em reais): ");
			leandro.bonus = ler.nextDouble();
			
			
			System.out.printf("Informe sua gratifica��o: ");		
			leandro.gratificacao = ler.nextFloat();		
			
			System.out.printf("Informe sua quantidade de disciplinas: ");		
			leandro.qtdeDisciplinas = ler.nextInt();		
			
			System.out.printf("Informe o valor do seu desconto(em reais): " );		
			leandro.desconto= ler.nextFloat();		
			
			double salarioB = ((leandro.salario + leandro.bonus + leandro.gratificacao - leandro.desconto) + leandro.meses * 50 + leandro.qtdeDisciplinas * 100);
			

			
			
//			System.out.println("Nome: " + leandro.nome);
//			System.out.println("Matr�cula: " + leandro.matricula);
//			System.out.println("Sal�rio: " + leandro.salario + " reais");
//			System.out.println("Tempor�rio? " + (leandro.temporario ? "Sim" : "N�o"));
//			System.out.println("Quantidade de meses: "+ leandro.meses+ " meses");
//			System.out.println("Valor do bonus: "+ leandro.bonus + " reais");
//			System.out.println("Gratifica��o: "+leandro.gratificacao);
//			System.out.println("Quantidade de disciplinas:"+ leandro.qtdeDisciplinas);
//			System.out.println("Valor do desconto R$: "+ leandro.desconto +" reais");
//			System.out.println("Sal�rio bruto R$: "+salarioB + " reais");
			System.out.printf("O professor %s que tem matr�cula %d � %s, pois ganha R$: %.2f",
					leandro.nome,
					leandro.matricula,
					(salarioB >= 10000 ? "rico" : "pobre"),
					salarioB
					);
	}
	
}
