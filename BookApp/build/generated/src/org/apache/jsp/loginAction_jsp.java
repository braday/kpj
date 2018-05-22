package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import book.wsd.*;
import java.util.*;

public final class loginAction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 String filePath = application.getRealPath("WEB-INF/users.xml");
      out.write("\n");
      out.write("        ");
      book.wsd.UserApplication userApp = null;
      synchronized (application) {
        userApp = (book.wsd.UserApplication) _jspx_page_context.getAttribute("userApp", PageContext.APPLICATION_SCOPE);
        if (userApp == null){
          userApp = new book.wsd.UserApplication();
          _jspx_page_context.setAttribute("userApp", userApp, PageContext.APPLICATION_SCOPE);
          out.write("\n");
          out.write("            ");
          org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("userApp"), "filePath",
filePath);
          out.write("\n");
          out.write("        ");
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("        ");

            // preset from users.xml
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String redirectURL = "index.jsp";

            String message = "";

            Users users = userApp.getUsers();
            User user = users.login(email, password);

// The email and password are correct
            if (user != null) {
                session.setAttribute("user", user);
                //response.sendRedirect(redirectURL);

      out.write("\n");
      out.write("        <fieldset>\n");
      out.write("            <p>Login successful. Click <a href=\"index.jsp\"> here</a> to return to the main page.</p>\n");
      out.write("            <p>email: ");
      out.print( email);
      out.write("</p>\n");
      out.write("            <p>password: ");
      out.print(password);
      out.write("</p>\n");
      out.write("            ");
 } else {
      out.write("\n");
      out.write("            <p>");
      out.print(message);
      out.write("</p>\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>login.jsp</legend>\n");
      out.write("                <h1>Login</h1>\n");
      out.write("                <form method=\"POST\" action=\"login.jsp\">\n");
      out.write("                    <table>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><label for=\"email\">Email</label></td>\n");
      out.write("                                <td><input name=\"email\" type=\"text\" value=\"");
      out.print(email);
      out.write("\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><label for=\"password\">Password</label></td>\n");
      out.write("                                <td><input name=\"password\" type=\"password\" value=\"");
      out.print(password);
      out.write("></td>\n");
      out.write("                        <span class=\"error\">");
      out.print(message);
      out.write("</span>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr><td><input type=\"submit\" value=\"Login\"></td></tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </fieldset>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </fieldset>\n");
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
