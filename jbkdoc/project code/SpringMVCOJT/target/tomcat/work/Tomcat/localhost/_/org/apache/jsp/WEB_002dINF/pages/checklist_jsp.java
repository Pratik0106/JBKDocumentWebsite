/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-08-31 23:52:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.jbk.entity.Student;
import java.util.List;

public final class checklist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("   <!-- script src=\"/resources/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/resources/static/bootstrap/js/jquery-3.5.1.min.js\">\r\n");
      out.write("   </script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/resources/static/plugins/jQuery/jQuery-2.1.4.min.js\">\r\n");
      out.write("   </script> -->\r\n");
      out.write("   \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("function checkAll()\r\n");
      out.write("{\r\n");
      out.write("    var parent=document.getElementById(\"parentcheck\");\r\n");
      out.write("    var input=document.getElementsByTagName(\"input\");\r\n");
      out.write("\r\n");
      out.write("     //var parent=document.formid.parencheck;\r\n");
      out.write("     //var input=document.formid.input;\r\n");
      out.write("    if(parent.checked === true)\r\n");
      out.write("    {\r\n");
      out.write("    \t for(var i=0;i< input.length;i++)\r\n");
      out.write(" \t     {\r\n");
      out.write(" \t   \t\t\tif(input[i].type==\"checkbox\" && input[i].id==\"sid\" && input[i].checked==false)\r\n");
      out.write(" \t \t   \t\t\t{\r\n");
      out.write(" \t \t   \t\t\t\tinput[i].checked=true;\r\n");
      out.write(" \t \t   \t\t\t}\r\n");
      out.write(" \t     }\r\n");
      out.write("     }\r\n");
      out.write("    else if(parent.checked === false)\r\n");
      out.write("    {\r\n");
      out.write("    \t for(var i=0;i< input.length;i++)\r\n");
      out.write(" \t     {\r\n");
      out.write(" \t   \t\t\tif(input[i].type==\"checkbox\" && input[i].id==\"sid\" && input[i].checked==true)\r\n");
      out.write(" \t \t   \t\t\t{\r\n");
      out.write(" \t \t   \t\t\t\tinput[i].checked=false;\r\n");
      out.write(" \t \t   \t\t\t}\r\n");
      out.write(" \t     }\r\n");
      out.write("     }\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<a href=\"add_user\">Add user</a>\r\n");
      out.write("<h2>Userlist</h2>\r\n");
 List<Student> listuser=(List<Student>)request.getAttribute("list"); 
      out.write('\r');
      out.write('\n');
String msg=(String)request.getAttribute("msg"); 
      out.write('\r');
      out.write('\n');
if(msg!=null) 
{ 
      out.write('\r');
      out.write('\n');
      out.write('	');
 out.println(msg); 
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n");
      out.write("<div >\r\n");
      out.write("<p id=\"msg\"></p>\r\n");
      out.write("</div><div>\r\n");
      out.write("<p id=\"value\"></p>\r\n");
      out.write("</div>\r\n");
      out.write("<form name=\"formid\" id=\"formid\" action=\"#\" method=\"post\">\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th><input type=\"checkbox\" onclick=\"checkAll()\" id=\"parentcheck\" name=\"parentcheck\" /></th>\r\n");
      out.write("<th>Sr. No</th>\r\n");
      out.write("<th>Name</th>\r\n");
      out.write("<th>Address</th>\r\n");
      out.write("<th>Contact</th>\r\n");
      out.write("<th>Username</th>\r\n");
      out.write("<th>Course</th>\r\n");
      out.write("<th>Status</th>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 for(Student student:listuser)
	{
	
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><input type=\"checkbox\" id=\"sid\" name=\"sid\" value=\"");
out.println(student.getSid());  
      out.write("\" checked  onclick=\"return limitfun()\"/></td>\r\n");
      out.write("\r\n");
      out.write("<td>");
out.println(student.getSid()); 
      out.write("</td>\r\n");
      out.write("<td>");
out.println(student.getName()); 
      out.write("</td>\r\n");
      out.write("<td>");
out.println(student.getAddress()); 
      out.write("</td>\r\n");
      out.write("<td>");
out.println(student.getContact()); 
      out.write("</td>\r\n");
      out.write("<td>");
out.println(student.getUsername()); 
      out.write("</td>\r\n");
      out.write("<td>");
out.println(student.getSubject().getSubName()); 
      out.write("</td>\r\n");
      out.write("<td>");
out.println(student.getStatus()); 
      out.write("</td>\r\n");
      out.write("<!--  td><a href=\"delete?sid=");
//=student.getSid() 
      out.write("\">Delete</a></td>\r\n");
      out.write("<td><a href=\"edit?sid=");
//=student.getSid()  onclick="formid.action='deleteuser';" 
      out.write("\">Edit</a></td>-->\r\n");
      out.write("</tr>\r\n");
} 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<input type=\"submit\" value=\"Delete\" onclick=\"formid.action='deletestudent';\">\r\n");
      out.write("<input type=\"submit\" value=\"Suspend\" onclick=\"formid.action='suspendstudent';\">\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("<!--script>\r\n");
      out.write("\r\n");
      out.write("$(\"#parentcheck\").change(function()\r\n");
      out.write("{\r\n");
      out.write("\t$(\"$sid\").prop(\"checked\",$(this).prop(\"checked\"))\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\t)\r\n");
      out.write("</script-->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function limitfun()\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tvar x=document.getElementsByName('sid');\r\n");
      out.write("\tvar newvar=0;\r\n");
      out.write("\tvar count;\r\n");
      out.write("\tfor(count=0;count<x.length;count++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(x[count].checked == true)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tnewvar= newvar + 1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\tif(newvar<1)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById('value').innerHTML=\"Please select at least 2 checkbox\";\r\n");
      out.write("\t\t\tdocument.getElementById('value').style.color=\"red\";\r\n");
      out.write("\t\t\t// alert(\"Please select at least 2 checkboxes\")\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\telse if(newvar >=1)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\tdocument.getElementById('value').innerHTML=\"You can perform operation now..\";\r\n");
      out.write("\t\tdocument.getElementById('value').style.color=\"blue\";\r\n");
      out.write("\t\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
