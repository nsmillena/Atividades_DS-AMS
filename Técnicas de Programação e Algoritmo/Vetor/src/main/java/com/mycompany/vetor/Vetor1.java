package com.mycompany.vetor;
import java.util.Arrays;
public class Vetor1{
    public static void main(String[] args) {
        // Criar um vetor com 15 nomes
        String[] nomes = {
            "Alice", "Melena", "Beatriz", "Renan", "Lorenzo",
            "Gabriel", "Rodrigo", "Igor", "Juliana", "Luan",
            "Millena", "Felipe", "Olivia", "Higor", "Renata"
        };

        // Ordenar os nomes em ordem crescente
        Arrays.sort(nomes);

        // Exibir os nomes indexados
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + i + ": " + nomes[i]);
        }
    }
}


