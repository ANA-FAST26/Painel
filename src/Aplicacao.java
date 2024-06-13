import javax.swing.*;
public class Aplicacao extends JFrame {
    private Tela1 tela1;

    public Aplicacao(){
        super();
        tela1 = new Tela1();
        JPanel painel = tela1.getPainel();
        add(painel);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Para fechar o programa
        setVisible(true);
    }
    }
