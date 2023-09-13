package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"admin.css\"  />\n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("       ");
 
     String role=  (String) session.getAttribute("role");
      
if(role==null)
response.sendRedirect("login.html");
  
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("  <div class=\"nav\">\n");
      out.write("\n");
      out.write("    <div id=\"navlist\">\n");
      out.write("    <div id=\"logoitem\"><img id=\"logo\" src=\"logo.png\" alt=\"\"/>IIST</div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"aboutus\"> <a href=\"#\"> AboutUs</a> </div>\n");
      out.write("    <div id=\"contactus\"> <a href=\"#\">ContactUs</a> </div></div>\n");
      out.write("    <div class=\"nav-2\">\n");
      out.write("      <div id=\"btn\"><a href=\"complainBox.jsp\" >ComplainBox</a></div>\n");
      out.write("    <div  id=\"btn\"><a href=\"logout.jsp\" >LogOut</a></div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"attribute\">\n");
      out.write("  <div id=\"student\"><h3> Manage Student</h3>\n");
      out.write("      <div class=\"mg-y\"><form action=\"StudentController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"Add Student\" ></form></div>\n");
      out.write("     <div class=\"mg-y\"><form action=\"StudentController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"Remove Student\" ></form></div>\n");
      out.write("     <div class=\"mg-y\"><form action=\"StudentController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"Update Student\" ></form></div>\n");
      out.write("       \n");
      out.write(" <div class=\"mg-y\"><form action=\"StudentController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"View Individuals Report\" ></form></div>\n");
      out.write("         <div class=\"mg-y\"><form action=\"ViewAllController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"View All Students\" ></form></div>\n");
      out.write("   \n");
      out.write("          </div>\n");
      out.write("  <div id=\"faculty\"><h3> Manage Faculty</h3>\n");
      out.write("         <div class=\"mg-y\"><form action=\"FacultyController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"Add Faculty\" ></form></div>\n");
      out.write("     <div class=\"mg-y\"><form action=\"FacultyController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"Remove Faculty\" ></form></div>\n");
      out.write("      <div class=\"mg-y\"><form action=\"FacultyController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"Update Faculty\" ></form></div>\n");
      out.write("      <div class=\"mg-y\"><form action=\"FacultyController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"View Individuals Report\" ></form></div>\n");
      out.write("      <div class=\"mg-y\"><form action=\"ViewAllController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"View All Faculty's\" ></form></div>\n");
      out.write(" \n");
      out.write("  </div>\n");
      out.write("  <div id=\"hod\"> <h3> Manage HOD</h3>\n");
      out.write("        <div class=\"mg-y\"><form action=\"HodController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"Add HOD\" ></form></div>\n");
      out.write("   <div class=\"mg-y\"><form action=\"HodController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"Remove HOD\" ></form></div>\n");
      out.write("   <div class=\"mg-y\"><form action=\"HodController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"Update HOD\" ></form></div>\n");
      out.write("   <div class=\"mg-y\"><form action=\"HodController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"View Individuals Report\" ></form></div>\n");
      out.write("   <div class=\"mg-y\"><form action=\"ViewAllController\" method=\"post\"  ><input style='  background-color: transparent;\n");
      out.write("    border: none;' name=\"data\" type=\"submit\" value=\"View All HOD's\" ></form></div>\n");
      out.write(" \n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("</div>s\n");
      out.write("\n");
      out.write("  \n");
      out.write(" \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("       \n");
      out.write("    </body>\n");
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
