package calculando; //pacote da classe
//importando
import javax.swing.*; //componentes gráficos
import java.awt.*; //estilos
import java.awt.event.*; //eventos

//define a classe e importa a janela gráfica do seu "pai" JFrame
public class CalculandoBhaskara extends JFrame {
    //declara os componentes gráficos da aplicação com tipo e nome
    JLabel titulotela, rotulo1, rotulo2, rotulo3, exibir;
    JTextField texto1, texto2, texto3;
    JButton calcular;

    //construtor da classe que recebe o parâmetro titulo em String
    public CalculandoBhaskara(String titulo) {
        super(titulo); //passa o título da janela

        Container tela = getContentPane(); //obtém o conteúdo da janela
        setLayout(null); //permite a posição absoluta dos componentes
        setResizable(false); //impede a redimensionalização da janela
        tela.setBackground(Color.pink); //define a cor de fundo da janela

        //cria os rótulos de texto que serão exibidos na interface
        titulotela = new JLabel("Calculadora de Bhaskara: ");
        rotulo1 = new JLabel("Digite o valor de a: ");
        rotulo2 = new JLabel("Digite o valor de b: ");
        rotulo3 = new JLabel("Digite o valor de c: ");

        //cria os campos de texto onde o usuário pode digitar e especifica o número máximo de caracteres
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);

        exibir = new JLabel(""); //cria um rótulo vazio para exibir o resultado da operação

        calcular = new JButton("Calcular"); //cria um botão com o texto "Calcular"
        calcular.setFocusPainted(false); //remove a borda foco do botão quando pressionado

        //define a posição e tamanho dos componentes (x, y, largura e altura)
        titulotela.setBounds(50, 20, 150, 30);
        rotulo1.setBounds(50, 60, 120, 20);
        rotulo2.setBounds(50, 100, 120, 20);
        rotulo3.setBounds(50, 140, 120, 20);

        texto1.setBounds(180, 60, 150, 20);
        texto2.setBounds(180, 100, 150, 20);
        texto3.setBounds(180, 140, 150, 20);

        exibir.setBounds(50, 190, 400, 20);

        calcular.setBounds(50, 220, 100, 20);

        //adiciona um ouvinte de evento para o botão que será atividao quando este for pressionado
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try { //tenta
                    //converte a String digitada para int
                    int a = Integer.parseInt(texto1.getText());
                    int b = Integer.parseInt(texto2.getText());
                    int c = Integer.parseInt(texto3.getText());

                    int delta = b * b - 4 * a * c; //cálculo delta

                    //cálculo das raízes
                    if (delta > 0) {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        exibir.setVisible(true);
                        exibir.setText("As raízes são: x1 = " + x1 + ", x2 = " + x2);
                    } else if (delta == 0) {
                        double x = -b / (2 * a);
                        exibir.setVisible(true);
                        exibir.setText("A única raiz é: x = " + x);
                    } else {
                        exibir.setVisible(true);
                        exibir.setText("Não há raízes reais!");
                    }
                  //tratamento de erros 
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
        tela.add(rotulo3);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(calcular);
        tela.add(titulotela);

        setSize(500, 300); //define o tamanho da janela
        setVisible(true); //define a visibilidade da janela como verdaeira
    }

    //método de execução
    public static void main(String[] args) { 
        CalculandoBhaskara app = new CalculandoBhaskara("Calculadora"); //criação de instância (objeto) da classe, define o título da janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define o comportamento ao fechar a janela (finaliza a execução)
    }
}
