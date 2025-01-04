package com.mycompany.array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Vintenomes {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
      String[] nomes = new String[20];

        System.out.println("Digite 20 nomes:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }
        
        Arrays.sort(nomes, Collections.reverseOrder());

        System.out.println("\nNomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}