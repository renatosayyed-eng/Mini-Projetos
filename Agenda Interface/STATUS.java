package q2;

public enum STATUS
{
    TODO("TO-DO"),
    DOING("DOING"),
    DONE("DONE");

    private String description;

    private STATUS(String d)
    {
        description = d;
    }

    //Set & Get do description
    public void setDescription(String d)
    { 
        description = d;
    }
    public String getDescription()
    { 
        return description; 
    }
    //--------------------//
}