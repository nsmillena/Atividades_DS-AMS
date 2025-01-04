package com.mycompany.atividade3107;

import javax.swing.JOptionPane;

public class Atividade3107 {

    public static void main(String[] args) {
        
        double nota1=0, nota2=0, nota3=0, nota4=0,nota5=0, media=0;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota:"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3ª nota:"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4ª nota:"));
        nota5 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 5ª nota:"));
        
        media=(nota1+nota2+nota3+nota4+nota5)/5;
        
        if (media>=5)
        {
            JOptionPane.showMessageDialog(null, "A sua média foi " + media + ", você foi aprovado.");
            
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "A sua média foi " + media + ", você foi reprovado.");

    }
}
}