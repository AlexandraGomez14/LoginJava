package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("            <div class=\"container py-5\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <h2 class=\"text-center text-white mb-4\">Bootstrap 4 Login Form</h2>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 mx-auto\">\n");
      out.write("\n");
      out.write("                                <!-- form card login -->\n");
      out.write("                                <div class=\"card rounded-0\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <h3 class=\"mb-0\">Login</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <form class=\"form\" role=\"form\" autocomplete=\"off\" novalidate=\"\" method=\"POST\" action=\"LoginController\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"uname1\">Username</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control form-control-lg rounded-0\" name=\"txtUser\" required=\"\">\n");
      out.write("                                                <div class=\"invalid-feedback\">Oops, you missed this one.</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Password</label>\n");
      out.write("                                                <input type=\"password\" class=\"form-control form-control-lg rounded-0\" name=\"txtPass\" required=\"\">\n");
      out.write("                                                <div class=\"invalid-feedback\">Enter your password too!</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div>\n");
      out.write("                                                <label class=\"custom-control custom-checkbox\">\n");
      out.write("                                                    <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                                                    <span class=\"custom-control-indicator\"></span>\n");
      out.write("                                                </label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-success btn-lg float-right\" name=\"btnIniciar\">Iniciar Sesion</button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--/card-block-->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /form card login -->\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!--/row-->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!--/col-->\n");
      out.write("                </div>\n");
      out.write("                <!--/row-->\n");
      out.write("            </div>\n");
      out.write("            <!--/container-->\n");
      out.write("            \n");
      out.write("            ");

                HttpSession sesion = request.getSession();
                int nivel = 0;
                if(request.getAttribute("nivel") != null){
                    nivel = (Integer)request.getAttribute("nivel");
                    if(nivel == 1){
                        sesion.setAttribute("nombre", request.getAttribute("nivel"));
                        sesion.setAttribute("nivel", nivel);
                        response.sendRedirect("Dashboard.jsp");
                    }
                }
            
      out.write("\n");
      out.write("                    \n");
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
