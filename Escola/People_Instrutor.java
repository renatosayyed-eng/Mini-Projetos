public class People_Instrutor extends People_Pessoa{
    private long código;
     
     public People_Instrutor(String s, long l){ super(s); código = l; }

     public long getCódigo(){ return código; }

     public String toString(){ return String.format(getNome() +" | Código => " + getCódigo() + " | Instrutor"); }
}