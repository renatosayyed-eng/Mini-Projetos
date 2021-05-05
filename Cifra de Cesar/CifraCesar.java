import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;
import javax.swing.JFormattedTextField;

public class CifraCesar{
    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setTitle("Cifra de Cesar");
        frame.setSize(335,280);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0,0, 26,1));
        JFormattedTextField tf = ((JSpinner.DefaultEditor) spinner.getEditor()).getTextField();
        tf.setEditable(false);
        JTextArea catchTexto = new JTextArea(3,20); 
        JTextArea showText = new JTextArea(3,20);
        showText.setEditable(false);
        JButton button_cript = new JButton("Criptografar");
        ButtonCript actionCript = new ButtonCript(catchTexto,spinner,showText);
        button_cript.addActionListener(actionCript);
        JButton button_decript = new JButton("Decriptografar");
        ButtonDecript actionDecript = new ButtonDecript(catchTexto,spinner,showText);
        button_decript.addActionListener(actionDecript);
        JTextField mensagem = new JTextField();
        mensagem.setText("Mensagem");
        mensagem.setEditable(false);
        JTextField mensagem2 = new JTextField();
        mensagem2.setText("Mensagem (De)Codificada");
        mensagem2.setEditable(false);
        JButton save = new JButton("Salvar em arquivo");
        ButtonSave actionSave = new ButtonSave(catchTexto);
        save.addActionListener(actionSave);
        JButton saveResult = new JButton("Salvar em arquivo");
        ButtonSaveRes actionSaveRes = new ButtonSaveRes(showText);
        saveResult.addActionListener(actionSaveRes);
        JButton open = new JButton("Abrir arquivo");
        ButtonRead actionRead = new ButtonRead(catchTexto);
        open.addActionListener(actionRead);

        panel.add(mensagem);
        panel.add(save);
        panel.add(open);
        panel.add(spinner);
        panel.add(catchTexto);
        panel.add(button_cript);
        panel.add(button_decript);
        panel.add(mensagem2);
        panel.add(saveResult);
        panel.add(showText);

        frame.add(panel);
        frame.setVisible(true);
    }
}