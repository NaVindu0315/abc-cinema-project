
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcon;



/**
 *
 * @author NaVindu69;
 */
public class values {
    
       String  uname ;
        String uemail;
        String ufilm ;
        String utheator;
        String udate ;
        String unic ;
        String utime;
        double total;
        int fullticket;
        int halfticket;
        
       String  finaluname ;
        String finaluemail;
        String finalufilm ;
        String finalutheator;
        String finaludate ;
        String finalunic ;
        String finalutime;
        
    
    public void setpayment(String name, String email, String film, String theator, String time, String date, String nic)
    {
          this.uname = name;
         uemail = email;
         ufilm = film;
         utheator = theator;
         utime= time;
        udate = date;
         unic = nic;
         
    }
    public String getname()
    {
        return uname;
    }
    public String getemail()
    {
        return uemail;
    }
    public String getfilm()
    {
        return ufilm;
    }
    public String gettheator()
    {
        return utheator;
    }
    public String getdate()
    {
        return udate;
    }
    
    public String getnic()
    {
        return unic;
    }
    public String gettime()
    {
        return utime;
    }
    
    public void setticketdetails(String finaluname, String finaluemail, String finalufim, String finalutheator, String finaludate, String finalunic, String finalutime, int full_tickets, int kid_tickets, double total_price)
    {
        this.finaluname = finaluname;
        this.finaluemail = finaluemail;
        this.finalufilm = finalufim;
        this.finalutheator = finalutheator;
        this.finaludate = finaludate;
        this.finalunic =finalunic;
        this.finalutime = finalutime;
        total=  total_price;
        fullticket  = full_tickets ;
        halfticket = kid_tickets ;
    }
   public double gettotal()
   {
       return total;
   }
   public int getfull()
   {
       return fullticket;
   }
   public  int gethalf()
   {
       return halfticket;
   }
   
    public String finalgetname()
    {
        return finaluname;
    }
    public String finalgetemail()
    {
        return finaluemail;
    }
    public String finalgetfilm()
    {
        return finalufilm;
    }
    public String finalgettheator()
    {
        return finalutheator;
    }
    public String finalgetdate()
    {
        return finaludate;
    }
    
    public String finalgetnic()
    {
        return finalunic;
    }
    public String finalgettime()
    {
        return finalutime;
    }
    
}
