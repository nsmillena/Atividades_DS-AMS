package com.mycompany.vetor;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Vetor4 {
    public static void main(String[] args) {
       
        Integer[] numeros = new Integer[50]; 
        Random rand = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100); 
        }

        
        Arrays.sort(numeros, Collections.reverseOrder());

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + i + ": " + numeros[i]);
        }
    }
}

