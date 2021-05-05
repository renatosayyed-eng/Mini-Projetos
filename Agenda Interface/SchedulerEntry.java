package q2;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class SchedulerEntry
{
    Calendar insertionDate;
    Boolean blocked;

    public SchedulerEntry(Boolean check)
    {
        blocked = check;
        insertionDate = Calendar.getInstance();
    }

    //Get do insertionDate formatado
    public String getDate()
    {
        SimpleDateFormat sample = new SimpleDateFormat("dd/MM/yyyy");
        String date = sample.format(insertionDate.getTime());
        if(insertionDate.get(Calendar.MINUTE)>=10)
        {
        return String.format(date + " - " + insertionDate.get(Calendar.HOUR_OF_DAY) + ":" + insertionDate.get(Calendar.MINUTE));
        }
        else
        {
        return String.format(date + " - " + insertionDate.get(Calendar.HOUR_OF_DAY) + ":0" + insertionDate.get(Calendar.MINUTE));
        }
    }
    public void setIDate(Calendar dd)
    {
        insertionDate = dd;
    }
    //--------------------//

    //Set & Get do blocked 
    public void setCondition(Boolean condition)
    {
        blocked = condition;
    }
    public Boolean getCondition()
    {
        return blocked;
    }
    //--------------------//
}