public class ContactPerson{
    private String description;
    Name nome;
    Address endereco;
    Phone telefone;
    Email email;

    ContactPerson(Name n, Address a, Phone p, Email e){
        nome = new Name(n.getFirstName(),n.getMiddleName(),n.getLastName());
        endereco = new Address(a.getStreet(),a.getNumber(),a.getCity(),a.getState(),a.getCEP());
        telefone = new Phone(p.getNumber(),p.getArea());
        email = new Email(e.getUser(), e.getDomain());
    }

    public void setDescription(String d){
        description = d;
    }
    public String getDescription(){
        return description;
    }
    public String getNome(){
        return nome.toString();
    }
    public String getAddress(){
        return endereco.toString();
    }
    public String getTelefone(){
        return telefone.toString();
    }
    public String getNumero(){
        return telefone.getNumber();
    }
    public String getEmail(){
        return email.toString();
    }
    public String toString(){
        return String.format("%s %s %s %s => %s", nome.toString(), endereco.toString(), telefone.toString(), email.toString(), getDescription());
    }

}