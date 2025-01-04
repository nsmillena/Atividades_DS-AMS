package com.mycompany.atividade_27_08;
import java.util.Scanner;
public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Opções disponíveis: ");
        System.out.println("1 - BigMac");
        System.out.println("2 - Quarteirão");
        System.out.println("3 - MacChicken");
        System.out.println("4 - Cheddar");
        System.out.println("5 - Cheese Burger");
        
        System.out.println("Digite o numero correspondente a opção desejada: ");
        int opcao = scanner.nextInt();
        
       
        switch(opcao){
            
            case 1:
                System.out.println("BigMac");
                break;
            case 2:
                System.out.println("Quarteirão");
                break;
                 case 3:
                System.out.println("MacChicken");
                break;
            case 4:
                System.out.println("Cheddar");
                break;
            case 5:
                System.out.println("Cheese Burger");
                break;  
            
            
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
