/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-07-09 00:21:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginpg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>JavaByKiran | Log in</title>\r\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("    <!-- Bootstrap 3.3.5 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("    <!-- Ionicons -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("    <!-- Theme style -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/dist/css/AdminLTE.min.css\">\r\n");
      out.write("    <!-- iCheck -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/plugins/iCheck/square/blue.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"hold-transition login-page\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"login-box\">\r\n");
      out.write("    <center>\r\n");
      out.write("        <img src=\"images/jbk.png\" height=\"150px\">\r\n");
      out.write("    </center>  \r\n");
      out.write("      <div class=\"login-logo\">\r\n");
      out.write("        <a href=\"#\"><b>Java By Kiran</b><h4>JAVA | SELENIUM | PYTHON</h4></a>\r\n");
      out.write("      </div><!-- /.login-logo -->\r\n");
      out.write("      <div class=\"login-box-body\">\r\n");
      out.write("        <p class=\"login-box-msg\">Sign in to start your session</p>\r\n");
      out.write("        \r\n");
      out.write("        <form id=\"form\" action=\"login\" method=\"post\">\r\n");
      out.write("          <div class=\"form-group has-feedback\">\r\n");
      out.write("            <input type=\"text\" id=\"email\" class=\"form-control\" name=\"username\" placeholder=\"Email\">\r\n");
      out.write("            <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\r\n");
      out.write("            <div id=\"email_error\" style=\"color:red;\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group has-feedback\">\r\n");
      out.write("            <input type=\"password\" id=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("            <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\r\n");
      out.write("            <div id=\"password_error\" style=\"color:red;\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"col-xs-12\">\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">Sign In</button>\r\n");
      out.write("            </div><!-- /.col -->\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("        <a href=\"pages/examples/register.html\" class=\"text-center\">Register a new membership</a>\r\n");
      out.write("\r\n");
      out.write("      </div><!-- /.login-box-body -->\r\n");
      out.write("    </div><!-- /.login-box -->\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery 2.1.4 -->\r\n");
      out.write("    <script src=\"/resources/plugins/jQuery/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap 3.3.5 -->\r\n");
      out.write("    <script src=\"/resources/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- iCheck -->\r\n");
      out.write("    <script src=\"/resources/plugins/iCheck/icheck.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("      $(\"#form\").submit(function(){\r\n");
      out.write("        var email = $(\"#email\").val();\r\n");
      out.write("        var password = $(\"#password\").val();\r\n");
      out.write("\r\n");
      out.write("        //$(\"#email_error\").text(\"\");\r\n");
      out.write("        //$(\"#password_error\").text(\"\");\r\n");
      out.write("\r\n");
      out.write("        if(email=='' && password==''){\r\n");
      out.write("          $(\"#email_error\").text(\"Please enter email.\");\r\n");
      out.write("          $(\"#password_error\").text(\"Please enter password.\");\r\n");
      out.write("          return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if(email!='' && password==''){\r\n");
      out.write("          if(!validateEmail(email)){\r\n");
      out.write("            $(\"#email_error\").text(\"Please enter valid email.\");\r\n");
      out.write("          }else{\r\n");
      out.write("            if(email!='admin@gmail.com'){\r\n");
      out.write("              $(\"#email_error\").text(\"Please enter email as admin@gmail.com\");\r\n");
      out.write("            }else{\r\n");
      out.write("              $(\"#email_error\").text(\"\");              \r\n");
      out.write("            }            \r\n");
      out.write("          }\r\n");
      out.write("          $(\"#password_error\").text(\"Please enter password.\");\r\n");
      out.write("\r\n");
      out.write("          return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if(email=='' && password!=''){\r\n");
      out.write("          if(password!='admin'){      \r\n");
      out.write("            $(\"#password_error\").text(\"Please enter password admin\");\r\n");
      out.write("          }else{\r\n");
      out.write("            $(\"#password_error\").text(\"\");\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          $(\"#email_error\").text(\"Please enter email\");\r\n");
      out.write("          return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var bol = true;\r\n");
      out.write("\r\n");
      out.write("        if(email!='' && password!=''){\r\n");
      out.write("          if(password!='admin'){      \r\n");
      out.write("            $(\"#password_error\").text(\"Please enter password admin\");\r\n");
      out.write("            bol = false;\r\n");
      out.write("          }else{\r\n");
      out.write("            $(\"#password_error\").text(\"\");\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          if(email!='admin@gmail.com'){\r\n");
      out.write("            $(\"#email_error\").text(\"Please enter email as admin@gmail.com\");\r\n");
      out.write("            bol = false;\r\n");
      out.write("          }else{\r\n");
      out.write("            $(\"#email_error\").text(\"\"); \r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          return bol;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      $(function () {\r\n");
      out.write("        $('input').iCheck({\r\n");
      out.write("          checkboxClass: 'icheckbox_square-blue',\r\n");
      out.write("          radioClass: 'iradio_square-blue',\r\n");
      out.write("          increaseArea: '20%' // optional\r\n");
      out.write("        });\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      function validateEmail($email) {\r\n");
      out.write("        var emailReg = /^([\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4})?$/;\r\n");
      out.write("        return emailReg.test( $email );\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
