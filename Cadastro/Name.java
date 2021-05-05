public class Name{
    private String firstName;
    private String middleName;
    private String lastName;

    Name(String fn, String mn,String ln){
        firstName = fn;
        middleName = mn;
        lastName = ln;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public String toString(){
        return String.format("|%s %s %s|", firstName, middleName, lastName);
    }
}