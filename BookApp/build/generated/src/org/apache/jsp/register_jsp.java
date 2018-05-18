package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import book.wsd.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        String submitted = request.getParameter("submitted");
        String redirectURL = "index.jsp";

        if (submitted != null && submitted.equals("yes")) {

            // Grab all the user input
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String agreeTOS = request.getParameter("tos");
            //Boolean submitted = "yes".equals(request.getParameter("submitted"));
    
      out.write("\n");
      out.write("    ");

        String filePath = application.getRealPath("WEB-INF/users.xml");
      out.write("\n");
      out.write("    ");
      book.wsd.UserApplication bookApp = null;
      synchronized (application) {
        bookApp = (book.wsd.UserApplication) _jspx_page_context.getAttribute("bookApp", PageContext.APPLICATION_SCOPE);
        if (bookApp == null){
          bookApp = new book.wsd.UserApplication();
          _jspx_page_context.setAttribute("bookApp", bookApp, PageContext.APPLICATION_SCOPE);
          out.write("\n");
          out.write("        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("bookApp"), "filePath",
filePath);
          out.write("\n");
          out.write("    ");
        }
      }
      out.write("\n");
      out.write("    ");
Users users = bookApp.getUsers(); 
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
 if (agreeTOS == null) { 
      out.write("\n");
      out.write("        <p>Sorry, you must agree to the Terms of Services or enter correct email.</p>\n");
      out.write("        <p>Click <a href=\"register.jsp\">here</a> to go back.</p>\n");
      out.write("        ");
} else {
      out.write("        \n");
      out.write("            ");

                if (!users.hasSameEmail(email)) {
                response.sendRedirect(redirectURL);
            
      out.write("\n");
      out.write("            <h1>Welcome!</h1>\n");
      out.write("            <p>Welcome,  ");
      out.print(name);
      out.write("!</p>\n");
      out.write("            <p>Your Email is ");
      out.print(email);
      out.write(" </p>\n");
      out.write("            <p>Your Password is ");
      out.print(password);
      out.write(" </p>\n");
      out.write("            ");

                User user = new User(email, name, password);
                session.setAttribute("user", user);
                users.addUser(user);
                bookApp.upadateXML(users, filePath);
            
      out.write("\n");
      out.write("            <p>Click <a href=\"index.jsp\">here</a> to go back.</p>\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            <p>email existed! Click <a href=\"register.jsp\">here</a> to sign up again.</p>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        <h1>Register</h1>\n");
      out.write("        <form action=\"register.jsp\" method=\"POST\">\n");
      out.write("            <input type=\"hidden\" name=\"submitted\" value=\"yes\" />\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Full name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Agree to TOS</td>\n");
      out.write("                    <td> <input type=\"checkbox\" name=\"tos\"></td> \n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"Register\" </td>\n");
      out.write("                </tr>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("\n");
      out.write("</html>");
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
