package exemplos;

import java.util.Scanner;

class CadastroAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("Digite o seu sobrenome:");
		String sobrenome = sc.nextLine();
		
		System.out.println("Digite a sua idade:");
		int idade = sc.nextInt();
		
		System.out.println("Digite a sua turma:");
		String turma = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Digite o seu periodo escolar:");
		String periodo = sc.nextLine();
		
		System.out.println("Digite o seu CPF:");
		String cpf = sc.nextLine();
		
		System.out.println("Digite o logradouro:");
		String logradouro = sc.nextLine();
		
		System.out.println("Digite o CEP:");
		String cep = sc.nextLine();
		
		System.out.println("Digite o telefone sem DDD:");
		String telefone = sc.nextLine();
		
		System.out.println("Digite o seu RG:");
		String rg = sc.nextLine();
		
		
		System.out.println("Nome do Aluno(a): " + nome);
		
		System.out.println("Sobrenome do Aluno(a): " + sobrenome);
		
		System.out.println("Idade do Aluno(a): " + idade);
		
		System.out.println("O Aluno(a) estuda na turma: " + turma);
		
		System.out.println("Periodo do Aluno(a): " + periodo);
		
		System.out.println("O numero do CPF do Aluno(a): " + cpf);
		
		System.out.println("O nome do logradouro do Aluno(a): " + logradouro);
		
		System.out.println("O numero do CEP do Aluno(a): " + cep);
		
		System.out.println("O numero do telefone do Aluno(a) sem DDD: " + telefone);
		
		System.out.println("RG do Aluno(a): " + rg);
		
		
		sc.close();
	}

}
