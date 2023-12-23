package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.org.apache.bcel.internal.generic.Select;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import dbcon.DBConnection;


/**
 *
 * @author NaVindu69;
 */
@WebServlet(urlPatterns = {"/comment"})
public class comment extends HttpServlet {



   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
       // out.print("working");
       //assigning to variables
       String name= request.getParameter("name");
       String film = request.getParameter("film");
       String theator = request.getParameter("theators");
       String comment = request.getParameter("commentera");
     //  out.print(name+film+"\n"+theator+comment);
     
     PreparedStatement pst = null;
     Connection conn = null;
     
     try
     {
         String qry ="INSERT INTO comments VALUES (?,?,?,?)";
         conn =DBConnection.initializeDatabase();
         pst = conn.prepareStatement(qry);
         pst.setString(1, name);
         pst.setString(2, film);
         pst.setString(3, theator);
         pst.setString(4, comment);
         
         pst.executeUpdate();
         pst.close();
         conn.close();
         response.sendRedirect("index.jsp");
     }
     catch(Exception e)
     {
         out.print(e);
     }
    }


}
