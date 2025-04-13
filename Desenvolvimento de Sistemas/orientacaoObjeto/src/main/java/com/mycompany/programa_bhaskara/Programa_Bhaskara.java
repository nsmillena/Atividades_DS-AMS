package com.mycompany.programa_bhaskara; //onde a classe "programa_bhaskara está localizada"
import javax.swing.JOptionPane; //importa a classe "JOptionPane" do pacote "javax.swing" para fornecer uma interface gráfica para mostrar as caixas de diálogo

public class Programa_Bhaskara { //define a classe pública "Programa_bhaskara" que será executada

    public static void main(String[] args) { //define o método main, ponto de entrada chamado quando o programa é executado
        
        double a=0, b=0, c=0, delta=0, x1=0, x2=0, x=0; //declara variáveis do tipo double 
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c:"));
        //Double.parseDouble() converte a string digitada pelo usuário em um número tipo double
        //JOptinPaneshowInputDialog() exibe uma caixa de diálogo para o usuário digitar um valor e o retorna em string
        
        delta = b * b - 4 * a *c; //calcula o valor de delta
        
        if (delta > 0) { //se delta for maior que zero
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Delta = " + delta);
            JOptionPane.showMessageDialog(null, "x1 = " + x1);
            JOptionPane.showMessageDialog(null, "x2 = " + x2);
            //calcula x1 e x2 e exibe uma mensagem ao usuário com o valor de delta, x1 e x2
        }
        
        else if (delta == 0) { //se delta for igual a zero
            x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "Delta = " + delta);
            JOptionPane.showMessageDialog(null, "x = " + x);
            //calcula x e exibe uma mensagem ao usuário com o valor de delta e x
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Delta = " + delta);
            JOptionPane.showMessageDialog(null, "Não existem raízes reais.");
            //exibe uma mensagem ao usuário com o valor de delta e informa que não existem raízes reais
        }
    }
}