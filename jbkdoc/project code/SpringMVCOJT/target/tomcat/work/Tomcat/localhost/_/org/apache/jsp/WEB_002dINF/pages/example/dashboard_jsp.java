/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-07-09 00:31:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>JavaByKiran | Dashboard</title>\r\n");
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
      out.write("    <!-- AdminLTE Skins. Choose a skin from the css/skins\r\n");
      out.write("         folder instead of downloading all of them to reduce the load. -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/dist/css/skins/_all-skins.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"hold-transition skin-blue sidebar-mini\">\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("      <header class=\"main-header\">\r\n");
      out.write("        <!-- Logo -->\r\n");
      out.write("        <a href=\"dashboard.html\" class=\"logo\">\r\n");
      out.write("          <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("          <span class=\"logo-mini\"><b>JBK</b></span>\r\n");
      out.write("          <!-- logo for regular state and mobile devices -->\r\n");
      out.write("          <span class=\"logo-lg\"><b>Java By Kiran</b></span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <!-- Header Navbar: style can be found in header.less -->\r\n");
      out.write("        <nav class=\"navbar navbar-static-top\" role=\"navigation\">\r\n");
      out.write("          <!-- Sidebar toggle button-->\r\n");
      out.write("          <div class=\"navbar-custom-menu\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("              <!-- Messages: style can be found in dropdown.less-->\r\n");
      out.write("              <!-- User Account: style can be found in dropdown.less -->\r\n");
      out.write("              <li class=\"dropdown user user-menu\">\r\n");
      out.write("                <a href=\"logout.html\" class=\"\">LOGOUT</a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </header>\r\n");
      out.write("      <!-- Left side column. contains the logo and sidebar -->\r\n");
      out.write("      <aside class=\"main-sidebar\">\r\n");
      out.write("        <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("        <section class=\"sidebar\">\r\n");
      out.write("          <!-- Sidebar user panel -->\r\n");
      out.write("          <div class=\"user-panel\">\r\n");
      out.write("            <div class=\"pull-left image\">\r\n");
      out.write("              <img src=\"/resources/dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"pull-left info\">\r\n");
      out.write("              <p>Kiran</p>\r\n");
      out.write("              <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- sidebar menu: : style can be found in sidebar.less -->\r\n");
      out.write("          <ul class=\"sidebar-menu\">\r\n");
      out.write("            <li class=\"header\">MAIN NAVIGATION</li>\r\n");
      out.write("            <li class=\"active treeview\"><a href=\"dashboard.html\">\r\n");
      out.write("            <i class=\"fa fa-dashboard\"></i> <span>Dashboard</span></a></li>\r\n");
      out.write("            <li><a href=\"users.html\"><i class=\"fa fa-user\"></i> <span>Users</span></a></li>\r\n");
      out.write("            <li><a href=\"operators.html\"><i class=\"fa fa-retweet\"></i> <span>Operators</span></a></li>\r\n");
      out.write("            <li class=\"treeview\"><a href=\"links.html\"><i class=\"fa fa-external-link\"></i> <span>     Useful Links</span></a></li>\r\n");
      out.write("            <li class=\"treeview\"><a href=\"downloads.html\">\r\n");
      out.write("            <i class=\"fa fa-download\"></i> <span>Downloads</span></a></li>\r\n");
      out.write("            <li><a href=\"logout.html\"><i class=\"fa fa-power-off\"></i> <span>Logout</span></a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- /.sidebar -->\r\n");
      out.write("      </aside>\r\n");
      out.write("\r\n");
      out.write("      <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("      <div class=\"content-wrapper\">\r\n");
      out.write("        <!-- Content Header (Page header) -->\r\n");
      out.write("        <section class=\"content-header\">\r\n");
      out.write("          <h1>\r\n");
      out.write("            Dashboard\r\n");
      out.write("            <small>Courses Offered</small>\r\n");
      out.write("          </h1>\r\n");
      out.write("          <ol class=\"breadcrumb\">\r\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\r\n");
      out.write("            <li class=\"active\">Dashboard</li>\r\n");
      out.write("          </ol>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- Main content -->\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("          <!-- Small boxes (Stat box) -->\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("              <!-- small box -->\r\n");
      out.write("              <div class=\"small-box bg-aqua\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                  <h3>Selenium</h3>\r\n");
      out.write("                  <p>Automation Testing</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icon\">\r\n");
      out.write("                  <i class=\"ion ion-bag\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"../pdf/selenium-testing-syllabus-jbk.pdf\" class=\"small-box-footer\" target=\"_blank\">More info <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div><!-- ./col -->\r\n");
      out.write("            <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("              <!-- small box -->\r\n");
      out.write("              <div class=\"small-box bg-green\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                  <h3>Java / J2EE</h3>\r\n");
      out.write("                  <p>Software Development</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icon\">\r\n");
      out.write("                  <i class=\"ion ion-stats-bars\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"../pdf/java-j2ee-syllabus-jbk.pdf\" class=\"small-box-footer\" target=\"_blank\">More info <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div><!-- ./col -->\r\n");
      out.write("            <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("              <!-- small box -->\r\n");
      out.write("              <div class=\"small-box bg-yellow\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                  <h3>Python</h3>\r\n");
      out.write("                  <p>Data Science</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icon\">\r\n");
      out.write("                  <i class=\"ion ion-person-add\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"../pdf/python-syllabus.pdf\" class=\"small-box-footer\" target=\"_blank\">More info <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div><!-- ./col -->\r\n");
      out.write("            <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("              <!-- small box -->\r\n");
      out.write("              <div class=\"small-box bg-red\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                  <h3>Php</h3>\r\n");
      out.write("                  <p>Web Development</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icon\">\r\n");
      out.write("                  <i class=\"ion ion-pie-graph\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"#\" class=\"small-box-footer\" target=\"_blank\">More info <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div><!-- ./col -->\r\n");
      out.write("          </div><!-- /.row -->\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("        </section><!-- /.content -->\r\n");
      out.write("\r\n");
      out.write("      </div><!-- /.content-wrapper -->\r\n");
      out.write("      <footer class=\"main-footer\">\r\n");
      out.write("        <div class=\"pull-right hidden-xs\">\r\n");
      out.write("          <b>Design for Selenium Automation Test</b> V 2.3.0\r\n");
      out.write("        </div>\r\n");
      out.write("        <strong>Copyright &copy; 2005-2019 <a href=\"https://www.javabykiran.com/\" target=\"_blank\">JavaByKiran</a>.</strong> All rights reserved.\r\n");
      out.write("      </footer>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("      <!-- Add the sidebar's background. This div must be placed\r\n");
      out.write("           immediately after the control sidebar -->\r\n");
      out.write("      <div class=\"control-sidebar-bg\"></div>\r\n");
      out.write("    </div><!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery 2.1.4 -->\r\n");
      out.write("    <script src=\"/resources/plugins/jQuery/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("    <!-- jQuery UI 1.11.4 -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\r\n");
      out.write("    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\r\n");
      out.write("    <script>\r\n");
      out.write("      $.widget.bridge('uibutton', $.ui.button);\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- Bootstrap 3.3.5 -->\r\n");
      out.write("    <script src=\"/resources/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Morris.js charts -->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\r\n");
      out.write("    <script src=\"/resources/plugins/morris/morris.min.js\"></script>\r\n");
      out.write("    <!-- Sparkline -->\r\n");
      out.write("    <script src=\"/resources/plugins/sparkline/jquery.sparkline.min.js\"></script>\r\n");
      out.write("    <!-- jvectormap -->\r\n");
      out.write("    <script src=\"/resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\r\n");
      out.write("    <script src=\"/resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("    <!-- jQuery Knob Chart -->\r\n");
      out.write("    <script src=\"/resources/plugins/knob/jquery.knob.js\"></script>\r\n");
      out.write("    <!-- daterangepicker -->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"/resources/plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("    <!-- datepicker -->\r\n");
      out.write("    <script src=\"/resources/plugins/datepicker/bootstrap-datepicker.js\"></script>\r\n");
      out.write("    <!-- Bootstrap WYSIHTML5 -->\r\n");
      out.write("    <script src=\"/resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\r\n");
      out.write("    <!-- Slimscroll -->\r\n");
      out.write("    <script src=\"/resources/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("    <!-- FastClick -->\r\n");
      out.write("    <script src=\"/resources/plugins/fastclick/fastclick.min.js\"></script>\r\n");
      out.write("    <!-- AdminLTE App -->\r\n");
      out.write("    <script src=\"/resources/dist/js/app.min.js\"></script>\r\n");
      out.write("    <!-- AdminLTE dashboard demo (This is only for demo purposes) -->\r\n");
      out.write("    <script src=\"/resources/dist/js/pages/dashboard.js\"></script>\r\n");
      out.write("    <!-- AdminLTE for demo purposes -->\r\n");
      out.write("    <script src=\"/resources/dist/js/demo.js\"></script>\r\n");
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