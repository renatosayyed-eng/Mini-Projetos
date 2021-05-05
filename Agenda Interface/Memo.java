package q2;

public class Memo extends SchedulerEntry{
    String texto;

    public Memo(String t, Boolean check) 
    {
        super(check);
        texto = t;
    }

    //Set e get do texto
    public void setTexto(String t)
    {
        texto = t;
    }
    public String getTexto()
    {
        return texto;
    }
    //--------------------//

    //ToString da classe
   public String toString()
   {
       return String.format(getTexto()+"|"+getCondition());
   }
   //--------------------//  
}