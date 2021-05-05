import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner str = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo:");
        String file = str.nextLine();
        Read texto = new Read(file);
        String text = texto.lerTxt();
        String replace = text.replaceAll("\n"," ");
        text = replace.replaceAll("\\."," ");
        replace = text.replaceAll("\\!"," ");
        text = replace.replaceAll("\\,"," ");
        replace = text.replaceAll("\\;", " ");
        text = replace.replaceAll("\\(", " ");
        replace = text.replaceAll("\\)", " ");
        text = replace.replaceAll("\\[", " ");
        replace = text.replaceAll("\\]"," ");
        text = replace.replaceAll("\\{", " ");
        replace = text.replaceAll("\\}", " ");
        text = replace.replaceAll("\\\'", " ");
        replace = text.replaceAll("\\\"", " ");
        text = replace.replaceAll("\\-", " ");
        replace = replace.replaceAll("\\    ", " ");
        text = replace.replaceAll("\\   ", " ");
        replace = text.replaceAll("\\  ", " ");

        FileWordsCounter f = new FileWordsCounter(replace);
        f.count();

        str.close();
    }
}