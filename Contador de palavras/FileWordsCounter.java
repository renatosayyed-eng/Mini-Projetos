import java.util.LinkedList;

public class FileWordsCounter {
 String texto;
 
 public FileWordsCounter(String t){
     texto = t;
 }

 public void count(){
     LinkedList<String> words = new LinkedList<String>();
     String split[] = texto.split(" ");
     String palavras[] = new String[split.length];
     for(int i=0; i<palavras.length;i++){
         palavras[i] = " ";
     }
        int z=0;
     for(int i = 0; i < split.length;i++){
         for(int j = 0; j < i; j++){
            if(palavras[j].equals(split[i])){
                z = 2;
            }
        }
        if(z!=2){
            palavras[i] = split[i];
        }
        z = 0;
     }
     for(int i = 0; i < palavras.length; i++){
        if(palavras[i].equals(" ")){}
        else{
            words.add(palavras[i]);
        }
     }
     System.out.println("Palavra | #");
     System.out.println("---------------------");
     int j = 0;
     int l = 0;
     for(String c : words){
         for(int i = 0; i < split.length; i++){
             if(c.equals(split[i])){
                j ++;
             }
         }
         System.out.println(c + " | " + j);
         l +=j;
         j = 0;
     }
     System.out.println("---------------------");
     System.out.println("Total de Palavras : " + l);
 }
}