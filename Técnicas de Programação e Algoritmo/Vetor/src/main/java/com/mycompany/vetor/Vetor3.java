package com.mycompany.vetor;
import java.util.Arrays;
import java.util.Random;

public class Vetor3 {
    public static void main(String[] args) {
        
        int[] numeros = new int[50];
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }

        Arrays.sort(numeros);

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + i + ": " + numeros[i]);
        }
    }
}

