package analise_formacao_vaga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char resposta;
	
     System.out.print("Nome do candidato:");
     	String nome = sc.nextLine();
     	
     	System.out.print("Grau de escolaridade:");
     	String grauEscolaridade = sc.nextLine();
     	
     	System.out.print("Forma��o:");
     	String formacao = sc.nextLine();
     	
     	System.out.print("Pretens�o salarial:");
     	double pretensaoSalarial = sc.nextDouble();
     	
  if(formacao.equals("AN�LISE DE SISTEMAS") && grauEscolaridade.equals("SUPERIOR COMPLETO") &&  pretensaoSalarial <= 6000) {
    		System.out.println("Inscri��o recebida.");
} else if  (!formacao.equals("AN�LISE DE SISTEMAS") || !grauEscolaridade.equals("SUPERIOR COMPLETO")) {
    System.out.println("N�o preenche os pr�-requisitos para a vaga.");	
}
  else if (pretensaoSalarial > 6000) {
		System.out.println("A faixa salarial da vaga est� entre 5000 e 6000. Aceita continuar o processo?");
		sc.nextLine();
		resposta = sc.next().charAt(0);
	if (resposta == 'S') {	
		 System.out.println("Inscri��o recebida.");
			}else {
				System.out.println("Agradecemos a disponibilidade - inscri��o interrompida.");
			} 
		}
	}
}