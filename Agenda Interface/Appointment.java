package q2;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Appointment extends SchedulerEntry
{
    String persons;
    String meetingPlace;
    Calendar appointmentDate = Calendar.getInstance();

    public Appointment(String p, String mp, String split[], String hour[], Boolean check)
    {
        super(check);
        persons = p;
        meetingPlace = mp;
        appointmentDate.set(Calendar.DAY_OF_MONTH, Integer.parseInt(split[0]));
        appointmentDate.set(Calendar.MONTH, Integer.parseInt(split[1])-1);
        appointmentDate.set(Calendar.YEAR, Integer.parseInt(split[2]));
        appointmentDate.set(Calendar.HOUR_OF_DAY,Integer.parseInt(hour[0]));
        appointmentDate.set(Calendar.MINUTE,Integer.parseInt(hour[1]));
    }

    //Set & Get MeetingPlace
    public void setMeetingPlace(String mp)
    {
        meetingPlace = mp;
    }
    public String getMeetingPlace()
    {
        return meetingPlace;
    }
    //--------------------//

    //Set's & Get appointmentDate
    public void setAppointmentDateH(int h, int m)
    {
        appointmentDate.set(Calendar.HOUR_OF_DAY, h);
        appointmentDate.set(Calendar.MINUTE, m);
    }
    public void setAppointmentDateD(int d, int m, int a)
    {
        appointmentDate.set(Calendar.DAY_OF_MONTH, d);
        appointmentDate.set(Calendar.MONTH, m-1);
        appointmentDate.set(Calendar.YEAR, a);
    }
    public String getAppointmentDate()
    {
        SimpleDateFormat sample = new SimpleDateFormat("dd/MM/yyyy");
        String date = sample.format(appointmentDate.getTime());
        if(appointmentDate.get(Calendar.MINUTE)>=10)
        {
        return String.format(date + " - " + appointmentDate.get(Calendar.HOUR_OF_DAY) + ":" + appointmentDate.get(Calendar.MINUTE));
        }
        else
        {
        return String.format(date + " - " + appointmentDate.get(Calendar.HOUR_OF_DAY) + ":0" + appointmentDate.get(Calendar.MINUTE));
        }
    }
    //--------------------//

    //Set & Get persons
    public void setPersons(String p)
    {
        persons = p;
    }
    public String getPersons()
    {
        return persons;
    }
    //--------------------//

    //ToString da classe
   public String toStringShow()
   {
       return String.format(getPersons() + "\nData de inserção: " + getDate() + " | Data do encontro: " + getAppointmentDate() + "\nLocal do encontro: " + getMeetingPlace());
   }
   public String toStringWrite()
   {
    return String.format(getPersons() + "|" + getDate() + "|" + getAppointmentDate() + "|" + getMeetingPlace(), "|" +getCondition());}
   //--------------------// 
}