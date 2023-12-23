package srvltpkg;

import newpackage.paynow;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import dbcon.DBConnection;
import dbcon.values;
import dbcon.userdetails;
import newpackage.paynow;


@WebServlet(name = "Config_Booking", urlPatterns = {"/Config_Booking"})
public class Config_Booking extends HttpServlet {

public static int full_tickets;
public static int kid_tickets;
public static double total_price;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
   // out.print(paynow.name);
       // paynow pw = new paynow();
        out.println();
        out.println();
        out.println();
        out.println();
        out.println();
        out.println();
        out.println();
        out.println();
        out.println();
        out.println();
   /*     values val = new values();
       //  String  finaluname = ;
        String finaluemail = val.getemail();
        String finalufilm =val.getfilm();
        String finalutheator=val.gettheator();
        String finaludate =val.getdate();
        String finalunic =val.getnic();
        String finalutime=val.finalgettime(); 
        */
         full_tickets = Integer.parseInt(request.getParameter("full_tickets"));
         kid_tickets = Integer.parseInt(request.getParameter("kid_tickets"));
         total_price = full_tickets * 8 + kid_tickets * 5;
        /*  out.println(paynow.name);
        out.println(paynow.email);
        out.println(paynow.theator);
        out.println(paynow.film);
        out.println(paynow.time);
        out.println(paynow.date);
        out.println(paynow.nic);
        out.println(Config_Booking.full_tickets);
        out.println(Config_Booking.kid_tickets);
        out.println(Config_Booking.total_price);*/
        //@author NaVindu69
       // out.print(total_price);
        
      //  val.setticketdetails(finaluname, finaluemail, finalufilm, finalutheator, finaludate, finalunic, finalutime, full_tickets, kid_tickets, total_price);*/
        /*out.println(val.gettotal());
        out.println(val.getfull());
        out.println(val.gethalf());**/
      
        
      //  response.sendRedirect("recipt.jsp");
      /*  out.println(val.finalgetname());
        out.println(val.finalgetemail());
        out.println(val.finalgetfilm());
        out.println(val.finalgettheator());
        out.println(val.finalgettime());
        out.println(val.finalgetdate());
        out.println(val.getfull());
        out.println(val.gethalf());
        out.print(val.gettotal());*/
        response.sendRedirect ("recipt.jsp");
        
       /* 
        Connection conn = null;
        PreparedStatement pst = null;
        
        try {
            String insrtQry = "INSERT INTO payment VALUES (?, ?, ?)";
            
            conn = DBConnection.initializeDatabase();
            pst = conn.prepareStatement(insrtQry);
            
            pst.setInt(1, full_tickets);
            pst.setInt(2, kid_tickets);
            pst.setDouble(3, total_price);
            
            pst.executeUpdate();
            
            pst.close();
            conn.close();
            
            out.print("Inserted data into the database successfully!");
        } catch (Exception e) {
            out.print(e);
        }*/
        
    }


}
