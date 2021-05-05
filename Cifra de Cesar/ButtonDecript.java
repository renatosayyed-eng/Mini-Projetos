import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

public class ButtonDecript implements ActionListener{
    JTextArea t;
    JTextArea r;
    int chave;
    JSpinner s;
    String caracteres[];
    String resultado;
    LinkedList<String> letras = new LinkedList<String>();

    ButtonDecript(JTextArea text, JSpinner spinner, JTextArea result)
    {
        t = text;
        s = spinner;
        r = result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(t.getText().isEmpty()){
            r.setText("");
        }
        else{
        letras.clear();
        resultado = "";
        chave = (Integer)s.getValue();
        String texto = t.getText();
        caracteres = texto.split("");
        int j;
        char aux;
        for(int i=0; i<caracteres.length; i++){
            j = caracteres[i].charAt(0);
            if(j>=65 && j<=90){  
                j -= chave;
                if(j<65)j += 26;
            }
            if(j>=97 && j<=122){
                j -= chave;
                if(j<97)j += 26;
            }
            aux = (char)j;
            letras.add(""+aux);
        }
        for(String s : letras)
        {
            resultado = resultado+s;
        }
        r.setText(resultado);
        }
    }
}