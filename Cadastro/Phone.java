public class Phone{
    private String number;
    private String area;

    Phone(String n, String a){
        number = n;
        area = a;
    }

    public String getNumber(){
        return number;
    }
    public String getArea(){
        return area;
    }
    public String toString(){
        return String.format("|(%s) %s|", area, number);
    }
}