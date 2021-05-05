package q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class File {
    LinkedList<Appointment> encontros;
    LinkedList<Task> tarefas;
    LinkedList<Memo> memorandos;
    
    public File(LinkedList<Appointment> a, LinkedList<Task> t, LinkedList<Memo> m)
    {
        encontros = a;
        tarefas = t;
        memorandos = m;
    }
    
    public void write()
    {
    try {
        FileWriter fw = new FileWriter("Agenda.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Encontros");
        for(Appointment a:encontros)
        {
            pw.println(a.toStringWrite());
        }
        pw.println("Tarefas");
        for(Task t:tarefas)
        {
            pw.println(t.toStringWrite());
        }
        pw.println("Memorandos");
        for(Memo m:memorandos)
        {
            pw.println(m.toString());
        }
        pw.flush();
        pw.close();
        fw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public String readEncontros()
    {
        String w = "";
        try {
            FileReader fr = new FileReader("Agenda.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();
            linha = br.readLine();
            while (!linha.matches("Tarefas")){
                w = w+linha;
                w = w+"\n";
                linha = br.readLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return w;
    }
    public String readTarefas()
    {
     String w = "";
        try {
            FileReader fr = new FileReader("Agenda.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();
            while (!linha.matches("Tarefas")){
                linha = br.readLine();
            }
            linha = br.readLine();
            while(!linha.matches("Memorandos"))
            {
               w = w+linha;
                w = w+"\n";
                linha = br.readLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return w;   
    }
    
    public String readMemorandos(){
        String w = "";
        try {
            FileReader fr = new FileReader("Agenda.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();
            while (!linha.matches("Memorandos")){
                linha = br.readLine();
            }
            linha = br.readLine();
            while(linha != null)
            {
               w = w+linha;
                w = w+"\n";
                linha = br.readLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return w;   
    }
}