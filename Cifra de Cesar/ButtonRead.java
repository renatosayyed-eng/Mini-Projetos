import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ButtonRead implements ActionListener{
    String file;
    String texto;
    JTextArea field;
    String res;
    public ButtonRead(JTextArea f){
        field = f;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            res = "";
            file = JOptionPane.showInputDialog("Informe o diretório do arquivo de entrada:");
            FileReader r = new FileReader(file);
            BufferedReader br = new BufferedReader(r);
            String linha = br.readLine();
            while (linha!=null){
                res = res+linha;
                res = res+" ";
                linha = br.readLine();
            }
            field.setText(res);
            br.close();
            r.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}