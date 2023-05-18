import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloSwing extends JFrame {
    public JButton botaoMensagem;
    public JPanel painelPrincipal;
    private JTextField txtMensagem;


    public HelloSwing() {
    botaoMensagem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(botaoMensagem,txtMensagem.getText());
        }
    });
}
}
