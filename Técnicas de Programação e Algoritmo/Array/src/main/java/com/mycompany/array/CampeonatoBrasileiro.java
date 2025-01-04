package com.mycompany.array;
public class CampeonatoBrasileiro {
    public static void main(String[] args) {
        // Nomes dos times e seus pontos
        String[] times = {
            "Botafogo", "Palmeiras", "Grêmio", "Flamengo", "Fluminense",
            "Bragantino", "Athletico-PR", "Fortaleza", "São Paulo", "Cruzeiro",
            "Internacional", "Atlético-MG", "Cuiabá", "Corinthians", "Goiás",
            "Bahia", "Santos", "Vasco da Gama", "Coritiba", "America-MG"
        };
        
        int[] pontos = {
            50, 48, 45, 44, 42,
            40, 39, 38, 36, 35,
            34, 33, 32, 31, 30,
            29, 28, 27, 26, 25
        };

        // Saída da tabela de classificação
        System.out.println("Tabela de Classificação do Campeonato Brasileiro:");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < times.length; i++) {
            System.out.printf("%dº %s - %d pontos%n", i + 1, times[i], pontos[i]);
        }
        System.out.println("-----------------------------------------------");
    }
}

