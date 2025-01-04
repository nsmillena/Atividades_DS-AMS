package com.mycompany.atividade_27_08;
import java.util.Scanner;
public class Atv5 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
         
        if(9 <= media){
            System.out.println("Com media: " +media+ ", A, você foi aprovado.");
        }
        else if(7 <= media && media < 9){
            System.out.println("Com media: " +media+ ", B, você foi aprovado.");
        }
        else if(5 <= media && media < 7){
            System.out.println("Com media: " +media+ ", C, você foi aprovado.");
        }
        else if(2.5 <= media && media < 5){
            System.out.println("Com media: " +media+ ", D, você foi reprovado.");
        }
        else {
            System.out.println("Com media: " +media+ ", E, você foi reprovado.");
        }
        
    }
}
