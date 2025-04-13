package calculando; //pacote da classe
//importando
import javax.swing.*; // componentes gráficos
import java.awt.*; // estilos
import java.awt.event.*; // eventos

//define a classe e importa a janela gráfica do seu "pai" JFrame
public class CalculandoPitagoras extends JFrame {
    //declara os componentes gráficos da aplicação com tipo e nome
    JLabel titulotela, rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton calcular;

    //construtor da classe que recebe o parâmetro titulo em String
    public CalculandoPitagoras(String titulo) {
        super(titulo); //passa o título da janela

        Container tela = getContentPane(); //obtém o conteúdo da janela
        setLayout(null); //permite a posição absoluta dos componentes
        setResizable(false); //impede a redimensionalização da janela
        tela.setBackground(Color.pink); //define a cor de fundo da janela

        //cria os rótulos de texto que serão exibidos na interface
        titulotela = new JLabel("Calculadora de Pitagoras: ");
        rotulo1 = new JLabel("Digite o valor de a: ");
        rotulo2 = new JLabel("Digite o valor de b: ");
        
        //cria os campos de texto onde o usuário pode digitar e especifica o número máximo de caracteres
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        exibir = new JLabel(""); //cria um rótulo vazio para exibir o resultado da operação
        exibir.setVisible(false); //remove a borda foco do botão quando pressionado

        calcular = new JButton("Calcular");
        calcular.setFocusPainted(false);

        //define a posição e tamanho dos componentes (x, y, largura e altura)
        titulotela.setBounds(50, 20, 150, 30);
        rotulo1.setBounds(50, 60, 120, 20);
        rotulo2.setBounds(50, 100, 120, 20);
        
        texto1.setBounds(180, 60, 150, 20);
        texto2.setBounds(180, 100, 150, 20);

        exibir.setBounds(50, 190, 400, 20);

        calcular.setBounds(50, 220, 100, 20);

        //adiciona um ouvinte de evento para o botão que será atividao quando este for pressionado
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try { //tenta
                    //converte a String digitada para int
                    double a = Double.parseDouble(texto1.getText());
                    double b = Double.parseDouble(texto2.getText());
                    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); //cálculo
                    
                    exibir.setText("Hipotenusa: " + String.format("%.2f", c));
                    exibir.setVisible(true); 
                } catch (NumberFormatException ex) { //se o usuário não digitar número válidos para a conversão de String para int
                    exibir.setVisible(true);
                    exibir.setText("Erro: Entrada inválida!");
                }
            }
        });

        //adiciona os componentes à tela
        tela.add(exibir);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(calcular);
        tela.add(titulotela);

        setSize(500, 300); //define o tamanho da janela
        setVisible(true); //define a visibilidade da janela como verdaeira
    }

    //método de execução
    public static void main(String[] args) {
        CalculandoPitagoras app = new CalculandoPitagoras("Calculadora"); //criação de instância (objeto) da classe, define o título da janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define o comportamento ao fechar a janela (finaliza a execução)
    }
}
