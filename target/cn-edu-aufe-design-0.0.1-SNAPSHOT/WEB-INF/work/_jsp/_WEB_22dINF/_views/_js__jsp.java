/*
 * JSP generated by Resin Professional 4.0.39 (built Tue, 01 Apr 2014 09:46:53 PDT)
 */

package _jsp._WEB_22dINF._views;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _js__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html;charset=UTF-8");

    out.write(_jsp_string0, 0, _jsp_string0.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string1, 0, _jsp_string1.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string2, 0, _jsp_string2.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string3, 0, _jsp_string3.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string4, 0, _jsp_string4.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string5, 0, _jsp_string5.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string6, 0, _jsp_string6.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string7, 0, _jsp_string7.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string8, 0, _jsp_string8.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string9, 0, _jsp_string9.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string10, 0, _jsp_string10.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string11, 0, _jsp_string11.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string12, 0, _jsp_string12.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string13, 0, _jsp_string13.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string14, 0, _jsp_string14.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string15, 0, _jsp_string15.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string16, 0, _jsp_string16.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string17, 0, _jsp_string17.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != 6205146603351083403L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/views/js.jsp"), -3929668446483300445L, false);
    _caucho_depends.add(depend);
  }

  final static class TagState {

    void release()
    {
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
      _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${ctx}");
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }
  private static com.caucho.el.Expr _caucho_expr_0;

  private final static char []_jsp_string14;
  private final static char []_jsp_string12;
  private final static char []_jsp_string2;
  private final static char []_jsp_string5;
  private final static char []_jsp_string13;
  private final static char []_jsp_string1;
  private final static char []_jsp_string15;
  private final static char []_jsp_string6;
  private final static char []_jsp_string0;
  private final static char []_jsp_string3;
  private final static char []_jsp_string4;
  private final static char []_jsp_string16;
  private final static char []_jsp_string17;
  private final static char []_jsp_string11;
  private final static char []_jsp_string10;
  private final static char []_jsp_string7;
  private final static char []_jsp_string8;
  private final static char []_jsp_string9;
  static {
    _jsp_string14 = "/js/plugin/msie-fix/jquery.mb.browser.min.js\"></script>\n<!-- FastClick: For mobile devices: you can disable this in app.js -->\n<script src=\"".toCharArray();
    _jsp_string12 = "/js/plugin/select2/select2.min.js\"></script>\n<!-- JQUERY UI + Bootstrap Slider -->\n<script src=\"".toCharArray();
    _jsp_string2 = "/js/libs/jquery-ui-1.10.3.min.js\"><\\/script>');\n  }\n</script>\n<!-- IMPORTANT: APP CONFIG -->\n<script src=\"".toCharArray();
    _jsp_string5 = "/js/bootstrap/bootstrap.min.js\"></script>\n<!-- CUSTOM NOTIFICATION -->\n<script src=\"".toCharArray();
    _jsp_string13 = "/js/plugin/bootstrap-slider/bootstrap-slider.min.js\"></script>\n<!-- browser msie issue fix -->\n<script src=\"".toCharArray();
    _jsp_string1 = "/js/libs/jquery-2.0.2.min.js\"><\\/script>');\n  }\n</script>\n<script>\n  if (!window.jQuery.ui) {\n    document.write('<script src=\"".toCharArray();
    _jsp_string15 = "/js/plugin/fastclick/fastclick.min.js\"></script>\n<!-- Demo purpose only -->\n<script src=\"".toCharArray();
    _jsp_string6 = "/js/notification/SmartNotification.min.js\"></script>\n<!-- JARVIS WIDGETS -->\n<script src=\"".toCharArray();
    _jsp_string0 = "\n<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices) -->\n\n<script>\n  if (!window.jQuery) {\n    document.write('<script src=\"".toCharArray();
    _jsp_string3 = "/js/app.config.js\"></script>\n<!-- JS TOUCH : include this plugin for mobile drag / drop touch events-->\n<script src=\"".toCharArray();
    _jsp_string4 = "/js/plugin/jquery-touch/jquery.ui.touch-punch.min.js\"></script>\n<!-- BOOTSTRAP JS -->\n<script src=\"".toCharArray();
    _jsp_string16 = "/js/demo.min.js\"></script>\n<!-- MAIN APP JS FILE -->\n<script src=\"".toCharArray();
    _jsp_string17 = "/js/app.min.js\"></script>\n<!-- ENHANCEMENT PLUGINS : NOT A REQUIREMENT -->".toCharArray();
    _jsp_string11 = "/js/plugin/masked-input/jquery.maskedinput.min.js\"></script>\n<!-- JQUERY SELECT2 INPUT -->\n<script src=\"".toCharArray();
    _jsp_string10 = "/js/plugin/jquery-validate/jquery.validate.min.js\"></script>\n<!-- JQUERY MASKED INPUT -->\n<script src=\"".toCharArray();
    _jsp_string7 = "/js/smartwidgets/jarvis.widget.min.js\"></script>\n<!-- EASY PIE CHARTS -->\n<script src=\"".toCharArray();
    _jsp_string8 = "/js/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js\"></script>\n<!-- SPARKLINES -->\n<script src=\"".toCharArray();
    _jsp_string9 = "/js/plugin/sparkline/jquery.sparkline.min.js\"></script>\n<!-- JQUERY VALIDATE -->\n<script src=\"".toCharArray();
  }
}
