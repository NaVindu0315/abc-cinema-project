package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import dbcon.values;
import java.sql.Connection;

public final class recipt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("%>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <title>Receiept</title>\n");
      out.write("          <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0%;\n");
      out.write("                padding: 0%;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: #1E1717;\n");
      out.write("                max-width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*logo*/\n");
      out.write("            .logo{\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #F10000;\n");
      out.write("                letter-spacing: 0.5em;\n");
      out.write("                text-align: left;\n");
      out.write("                margin-left: 690px;\n");
      out.write("            }\n");
      out.write("            .logo span{\n");
      out.write("                font-size: 40px;\n");
      out.write("                color: #fff;\n");
      out.write("                margin-left: 10px;\n");
      out.write("                padding-bottom: 20%;\n");
      out.write("           }\n");
      out.write("             header{\n");
      out.write("                height: 85px;\n");
      out.write("                width: 100%;\n");
      out.write("                z-index: 100000;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #000;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("            /*table*/\n");
      out.write("            table{\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                width: 31%;\n");
      out.write("                font-family: monospace;\n");
      out.write("                text-align: left;\n");
      out.write("                color: #fff;\n");
      out.write("                letter-spacing: 1.5px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                margin-top: 120px;\n");
      out.write("            }\n");
      out.write("            table tr:nth-child(even){\n");
      out.write("                background-image: linear-gradient(to right, #D2050C, 2% ,#1E1717);\n");
      out.write("            }\n");
      out.write("            table tr:nth-child(odd){\n");
      out.write("                background-image: linear-gradient(to left, #D2050C, 2% ,#1E1717);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            table th{\n");
      out.write("                width: 62%;\n");
      out.write("                height: 68px;\n");
      out.write("                padding: 18px;\n");
      out.write("                border: none;\n");
      out.write("                text-indent: 10px;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            table td{\n");
      out.write("                height: 68px;\n");
      out.write("                padding: 21px;\n");
      out.write("                border: none;\n");
      out.write("                text-indent: 9px;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*buttons*/\n");
      out.write("           .btn_cnt{\n");
      out.write("                height: 40px;\n");
      out.write("                width: 130px;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                border: 1px solid #000;\n");
      out.write("                display: inline;\n");
      out.write("                padding: 5px 8px;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: green;\n");
      out.write("                margin-top: 22px;\n");
      out.write("                margin-left: 850px;\n");
      out.write("            }\n");
      out.write("            .btn_cnt a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("           .btn_bck{\n");
      out.write("                height: 40px;\n");
      out.write("                width: 130px;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                border: 1px solid #000;\n");
      out.write("                display: inline;\n");
      out.write("                padding: 5px 8px;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: darkgray;\n");
      out.write("                margin-top: 22px;\n");
      out.write("                margin-left: 20px;\n");
      out.write("            }\n");
      out.write("            .btn_bck a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .price{\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write(".btn{\n");
      out.write("    position: absolute;\n");
      out.write("    font-family: \"Roboto\", sams-serif;\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    background: #f11017;\n");
      out.write("    width: 160px;\n");
      out.write("    padding: 20px ;\n");
      out.write("    right: 580px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    color: #ffffff;\n");
      out.write("    border-radius: 30px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    box-shadow: 0 0 10px rgba(255, 255, 255, 0.1);\n");
      out.write("    bottom: -20px;\n");
      out.write("    margin-bottom: 50px;\n");
      out.write("}\n");
      out.write(".btn2{\n");
      out.write("    position: absolute;\n");
      out.write("    font-family: \"Roboto\", sams-serif;\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    background: #f11017;\n");
      out.write("    width: 160px;\n");
      out.write("    padding: 20px ;\n");
      out.write("    right: 800px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    color: #ffffff;\n");
      out.write("    border-radius: 30px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    box-shadow: 0 0 10px rgba(255, 255, 255, 0.1);\n");
      out.write("    bottom: -20px;\n");
      out.write("    margin-bottom: 50px;\n");
      out.write("}\n");
      out.write(".btn2:hover{\n");
      out.write("    background-color: black;\n");
      out.write("                color: white;\n");
      out.write("                transition: 0.5s;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transform: scale(1.2);\n");
      out.write("                box-shadow: 2px 2px 2px black;\n");
      out.write("}\n");
      out.write(".btn:hover{\n");
      out.write("    background-color: black;\n");
      out.write("                color: white;\n");
      out.write("                transition: 0.5s;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transform: scale(1.2);\n");
      out.write("                box-shadow: 2px 2px 2px black;\n");
      out.write("}\n");
      out.write(".backimg img{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    opacity: 20%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("          <header>\n");
      out.write("            <div class=\"menu\"></div>\n");
      out.write("            <div class=\"logo\"> <span>ABC</span> <br>CINEMA </div>\n");
      out.write("          </header>\n");
      out.write("\n");
      out.write("           <body>\n");
      out.write("               ");

                   values val = new values();
                   
      out.write("\n");
      out.write("               <script>\n");
      out.write("                  let pat = localStorage.getItem('totalpay');\n");
      out.write("                  //alert(pat);\n");
      out.write("                  </script>\n");
      out.write("            \n");
      out.write("              <div class=\"pagewrapper\"></div>\n");
      out.write("              \n");
      out.write("              <form action=\"emailcontroller\" method=\"post\">\n");
      out.write("             <table>\n");
      out.write("                  <tr>\n");
      out.write("                     <th>USER NAME :</th>\n");
      out.write("                     <th><div class=\"usernm\">");

      out.write("</div></th>\n");
      out.write("                  </tr>\n");
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                      <td>E-MAIL :</td>\n");
      out.write("                      <td><div class=\"mail\">");
out.print(val.getemail());
      out.write("</div></td>\n");
      out.write("                  </tr>\n");
      out.write("  \n");
      out.write("                  <tr>\n");
      out.write("                      <td>DATE :</td>\n");
      out.write("                      <td><div class=\"date\">");
out.print(val.getdate());
      out.write("</div></td>\n");
      out.write("                  </tr>\n");
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                      <td>THEATER :</td>\n");
      out.write("                      <td><div class=\"theater\">");
out.print(val.gettheator());
      out.write("</div></td>\n");
      out.write("                  </tr>\n");
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                      <td>SHOE-TIME :</td>\n");
      out.write("                      <td><div class=\"time\">");
out.print(val.gettime());
      out.write("</div></td>\n");
      out.write("                  </tr>\n");
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                      <td>NO. OF FULL TICKETS :</td>\n");
      out.write("                      <td><div class=\"full\"> ");
out.print(val.getfull());
      out.write(" </div></td>\n");
      out.write("                  </tr>\n");
      out.write("                \n");
      out.write("                  <tr>\n");
      out.write("                      <td>NO. OF HALF TICKETS :</td>\n");
      out.write("                      <td><div class=\"half\"> ");
out.print(val.gethalf());
      out.write(" </div></td>\n");
      out.write("                  </tr>\n");
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                      <td>TOTAL :</td>\n");
      out.write("                      <td><div class=\"price\">");
out.print(val.gettotal());
      out.write("</div></td>\n");
      out.write("                  </tr>\n");
      out.write("             </table>\n");
      out.write("                  <input type=\"submit\" value=\"Proceed\"class=\"btn\">\n");
      out.write("              </form>\n");
      out.write("          <!--      <div btn_row>\n");
      out.write("                    <a href=\"#\" class=\"btn\">Continue</a>\n");
      out.write("                </div>\n");
      out.write("          -->\n");
      out.write("              <div btn_row>\n");
      out.write("                    <a href=\"sheetbokking.jsp\" class=\"btn2\">Cancel</a> \n");
      out.write("              </div> \n");
      out.write("                \n");
      out.write("            </body>\n");
      out.write("     </head>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
