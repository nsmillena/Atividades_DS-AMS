package com.mycompany.atividade_27_08;
import java.util.Scanner;
public class Atv7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro dia: ");
        int dia1 = scanner.nextInt();
        System.out.println("Digite o primeiro mês: ");
        int mes1 = scanner.nextInt();
        System.out.println("Digite o primeiro ano: ");
        int ano1 = scanner.nextInt();
       
        System.out.println("Digite o segundo dia: ");
        int dia2 = scanner.nextInt();
        System.out.println("Digite o segundo mês: ");
        int mes2 = scanner.nextInt();
        System.out.println("Digite o segundo ano: ");
        int ano2 = scanner.nextInt();
        
        if (ano1 < ano2 || (ano1 == ano2 && mes1 < mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 < dia2)) {
            System.out.println(dia1 + "/" + mes1 + "/" + ano1);
            System.out.println(dia2 + "/" + mes2 + "/" + ano2);
        } else {
            System.out.println(dia2 + "/" + mes2 + "/" + ano2);
            System.out.println(dia1 + "/" + mes1 + "/" + ano1);
        }
    }
}
