public class Email{
    private String user;
    private String domain;
    
    Email(String u, String d){
        user = u;
        domain = d;
    }

    public String getUser(){
        return user;
    }
    public String getDomain(){
        return domain;
    }
    public String toString(){
        return String.format(" |%s@%s|",user, domain); 
    }
}