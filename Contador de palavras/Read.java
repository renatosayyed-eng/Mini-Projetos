import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read{
    String file;
    String res;

    public Read(String file){
        this.file = file;
    }

    public String lerTxt(){
        try {
            res = "";
            FileReader r = new FileReader(file);
            BufferedReader br = new BufferedReader(r);
            String linha = br.readLine();
            while (linha!=null){
                res = res+linha;
                res = res+"\n";
                linha = br.readLine();
            }
            br.close();
            r.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return res;
    }
}