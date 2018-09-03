package testes;

import java.util.Scanner;

import negocio.Aluno;

public class TesteAluno {

	public static void main(String[] args) {		
	Scanner ler = new Scanner(System.in);	
	
		
		Aluno maria = new Aluno();
		Aluno joao = new Aluno();
	
		System.out.printf("informe o nome do primeiro aluno: ");
		maria.nome = ler.next();

		System.out.printf("informe a idade: ");
		maria.idade = ler.nextInt();
		
		System.out.printf("informe a mensalidade: ");
		maria.mensalidade = ler.nextFloat();
		
		System.out.printf("Seu sexo é masculino:  ");
		maria.masculino = ler.nextBoolean();
		
		maria.exibir();
		
						
		System.out.printf("\ninforme o nome do segundo aluno : ");
		joao.nome = ler.next();
		
		System.out.printf("informe a idade: ");
		joao.idade = ler.nextInt();
		
		System.out.printf("informe a mensalidade: ");
		joao.mensalidade = ler.nextFloat();
		
		System.out.printf("Seu sexo é masculino: ");
		joao.masculino = ler.nextBoolean();
		
		joao.exibir();
		
		//%s
		//%d
		//%f
					
//			System.out.printf("%s %s \nque tem %d anos \npaga R$:%.2f",
//						(maria.masculino ? "O aluno" : "A aluna"),
//						maria.nome,
//						maria.idade,
//						maria.mensalidade);
//			System.out.printf("\nO nascimento de leandro é: %d",
//					(ANO_ATUAL -maria.idade));
			
		
			System.out.printf("%s é o aluno mais velho",
				(joao.idade >= maria.idade ? joao.nome : maria.nome)
				);	
			System.out.printf("\n %s é o aluno que paga mais mensalidade",
					(maria.mensalidade >= joao.mensalidade ? maria.nome : joao.nome));
	}
}
