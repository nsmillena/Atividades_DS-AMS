package com.mycompany.atividade_27_08;
import java.util.Scanner;
public class Atv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite a idade do nadador: ");
        int idade = scanner.nextInt();
        
        if(5 <= idade && idade <= 7){
            System.out.println("Infantil A");
        }
        else if(8 <= idade && idade <= 10){
            System.out.println("Infantil B");
        }
         else if(11 <= idade && idade <= 13){
            System.out.println("Juvenil A");
        }
        else if(14 <= idade && idade <= 17){
            System.out.println("Juvenil B");
        }
        else if(18 <= idade){
            System.out.println("Senior");
        }
        else{
            System.out.println("A idade fornecida não está dentro do permitido.");
        }
    }
}
