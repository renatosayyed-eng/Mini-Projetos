import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextArea;
import java.awt.event.ActionEvent;

public class ButtonSaveRes implements ActionListener{

    JTextArea t;
    
    public ButtonSaveRes(JTextArea texto){
        t = texto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        FileWriter fw;
        fw = new FileWriter("(De)Criptografado_CifraCesar.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(t.getText());
        pw.flush();
        pw.close();
        fw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}