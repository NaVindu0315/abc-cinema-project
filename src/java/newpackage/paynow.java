package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dbcon.values;
import dbcon.userdetails;

/**
 *
 * @author NaVindu69;
 */
@WebServlet(urlPatterns = {"/paynow"})
public class paynow extends HttpServlet {

  public static String name;
  public static String email;
  public static String theator;
  public static String film;
  public static String time;
  public static String date;
  public static String nic;
  
                 



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out = response.getWriter();
        name = request.getParameter("name");
        email = request.getParameter("email");
        theator = request.getParameter("theators");
        film = request.getParameter("movies");
       time = request.getParameter("Time");
        date = request.getParameter("dte");
       nic = request.getParameter("nic");
      // values val = new values();
       //userdetails ud = new userdetails(name,email,film,theator,time,date,nic);
       //val.setpayment(name, email, nic, theator, time, date, nic);
      /* out.println(val.getname());
       out.println(val.getemail());
       out.println(val.getfilm());
       out.println(val.getdate());
       out.println(val.gettheator());
       out.println(val.getnic());*/
      response.sendRedirect("sheetbokking.jsp");
       
    }


}
