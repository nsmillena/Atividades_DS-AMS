package com.mycompany.atividade_27_08;

import java.util.Scanner;
public class Atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite o horário de início do seu turno de trabalho: ");
        double hora = scanner.nextDouble(); 
        
        if (5 <= hora && hora <= 13) {
            System.out.println("O seu turno é de manhã");
        }
        else if (13 < hora && hora <= 21) {
            System.out.println("O seu turno é de tarde");
        }
        else if ((21 < hora && hora <= 24) || (0 <= hora && hora < 5)) {
            System.out.println("O seu turno é de noite:");
        } else {
            System.out.println("Horário inválido.");
        }
        
    }
}
