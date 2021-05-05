public class Address{
    private String street;
    private String number;
    private String city;
    private String state;
    private String postalCode;
    
    Address(String str,String n,String c,String sta,String pc){
        street = str;
        number = n;
        city = c;
        state = sta;
        postalCode = pc;
    }

    public String getStreet(){
        return street;
    }
    public String getNumber(){
        return number;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getCEP(){
        return postalCode;
    }
    public String toString(){
        return String.format(" |%s, %s / %s - %s / %s| ", street,number,city,state,postalCode);
    }
}