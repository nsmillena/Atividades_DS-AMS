
package com.mycompany.atividade3107;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
    
        double max_kg=100, multa_kg=8, quantidade_kg=0;
        
        quantidade_kg = Double.parseDouble(JOptionPane.showInputDialog("Olá! Quantos kg de peixe você pescou?"));
        
        double excesso = quantidade_kg - max_kg;
        double multa = excesso * multa_kg;
        
        if (excesso > 0) {
        JOptionPane.showMessageDialog(null,"Você possui uma quantidade de peixes maior que a permitida, ultrapassando-a em " + excesso + "kg. A multa a ser paga por isso é de " + multa);
        }
        else {
            JOptionPane.showMessageDialog(null, "A quantidade de peixe que você possui está dentro do limite de kg permitido, não há uma multa a ser paga.");
        }
    }
    
}
