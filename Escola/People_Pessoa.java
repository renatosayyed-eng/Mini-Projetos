public abstract class People_Pessoa implements Comparable<People_Pessoa>{
    private String nome;

    public People_Pessoa(String s){ nome = s; }

    public String getNome(){ return nome; }

    public int compareTo(People_Pessoa p){
        if((this.getNome()).compareTo(p.getNome()) < 0){
            return -1;
        }
        if((this.getNome()).compareTo(p.getNome()) > 0){
            return 1;
        }
        return 0;
    }

    public abstract String toString();
}