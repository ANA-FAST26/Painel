import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela1 {
    private JPanel painel;
    private JTextField campo;
    private JButton botaoInicio;
    private JButton botaoConfirma;
    private JButton botaoLimpar;
    private JTextArea area;

    public JPanel getPainel(){
        return painel;
    }

    public Tela1() {
        botaoInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = campo.getText();
                area.append(texto+"\n");
            }
        });
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campo.setText("");
                area.setText("");

            }
        });
        botaoConfirma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
  }

