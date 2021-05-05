package q2;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Task extends SchedulerEntry
{
   String shortDescription;
   Calendar deadline = Calendar.getInstance();
   STATUS status;

   public Task(String sd, String split[], String hour[], Boolean check,String sta)
   {    
      super(check);
      if(sta.matches("TO-DO"))
      {
          status = STATUS.TODO;
      }
      if(sta.matches("DOING"))
      {
          status = STATUS.DOING;
      }
       if(sta.matches("DONE"))
      {
          status = STATUS.DONE;
      }
      shortDescription = sd;
      deadline.set(Calendar.DAY_OF_MONTH, Integer.parseInt(split[0]));
      deadline.set(Calendar.MONTH, Integer.parseInt(split[1])-1);
      deadline.set(Calendar.YEAR, Integer.parseInt(split[2]));
      deadline.set(Calendar.HOUR_OF_DAY,Integer.parseInt(hour[0]));
      deadline.set(Calendar.MINUTE,Integer.parseInt(hour[1]));
   }

   //Set & Get do deadline formatado
   public void setDeadline(Calendar c)
   {
      deadline = c;
   }
   public String getDeadLine()
   {
       SimpleDateFormat sample = new SimpleDateFormat("dd/MM/yyyy");
       String date = sample.format(deadline.getTime());
       if(deadline.get(Calendar.MINUTE)>=10)
       {
       return String.format(date + " - " + deadline.get(Calendar.HOUR_OF_DAY) + ":" + deadline.get(Calendar.MINUTE));
       }
       else
       {
       return String.format(date + " - " + deadline.get(Calendar.HOUR_OF_DAY) + ":0" + deadline.get(Calendar.MINUTE));
       }
   }
   //--------------------//

   //Set & Get do shortDescription
   public void setShortDescription(String sd)
   {
       shortDescription = sd;
   }
   public String getShortDescription()
   {
       return shortDescription;
   }
   //--------------------//

   //Set & Get do status
   public void setStatus(String s)
   {
       status.setDescription(s);
   }
   public String getStatus()
   {
       return status.getDescription();
   }
   //--------------------//

   //ToString da classe
   public String toStringShow()
   {
       return String.format(getShortDescription() + "\nData de inserção: " + getDate() + " | Data de entrega: " + getDeadLine() + "\nStatus: " + getStatus() + " | Bloqueado: " + getCondition());
   }
   public String toStringWrite()
   {
       return String.format(getShortDescription() + "|" + getDate() + "|" + getDeadLine() + "|" + getStatus() + "|" + getCondition());
   }
   //--------------------//  
}