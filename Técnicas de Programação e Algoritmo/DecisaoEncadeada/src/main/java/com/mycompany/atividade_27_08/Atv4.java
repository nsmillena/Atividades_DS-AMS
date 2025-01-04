package com.mycompany.atividade_27_08;
import java.util.Scanner;
public class Atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um número de 1 a 12: ");
        int numero = scanner.nextInt();
        
        switch(numero){
            case 1:
                System.out.println("O mês correspondente a esse número é: Janeiro");
                break;
            case 2:
                System.out.println("O mês correspondente a esse número é: Fevereiro");
                break;
            case 3:
                System.out.println("O mês correspondente a esse número é: Março");
                break;
            case 4:
                System.out.println("O mês correspondente a esse número é: Abril");
                break;
            case 5:
                System.out.println("O meês correspondente a esse número é: Maio");
                break;
            case 6:
                System.out.println("O mês correspondente a esse número é: Junho");
                break;
            case 7:
                System.out.println("O mes correspondente a esse número é: Julho");
                break;
            case 8:
                System.out.println("O mês correspondente a esse número  é: Agosto");
                break;
            case 9:
                System.out.println("O mes correspondente a esse número é: Setembro");
                break;
            case 10:
                System.out.println("O mês correspondente a esse número é: Outubro");
                break;
            case 11:
                System.out.println("O mês correspondente a esse número é: Novembro");
                break;
            case 12:
                System.out.println("O mês correspondente a esse número é: Dezembro");
                break;
            default:
                System.out.println("Esse número não está dentro do intervalo permitido.");
                break;
        }
    }
}
