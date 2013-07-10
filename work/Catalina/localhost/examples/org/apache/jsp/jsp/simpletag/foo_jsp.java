package org.apache.jsp.jsp.simpletag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class foo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/example-taglib.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005feg_005ffoo_0026_005fatt3_005fatt2_005fatt1;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005feg_005flog;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005feg_005flog_0026_005ftoBrowser;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005feg_005ffoo_0026_005fatt3_005fatt2_005fatt1 = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005feg_005flog = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005feg_005flog_0026_005ftoBrowser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005feg_005ffoo_0026_005fatt3_005fatt2_005fatt1.release();
    _005fjspx_005ftagPool_005feg_005flog.release();
    _005fjspx_005ftagPool_005feg_005flog_0026_005ftoBrowser.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<!--\n");
      out.write(" Licensed to the Apache Software Foundation (ASF) under one or more\n");
      out.write("  contributor license agreements.  See the NOTICE file distributed with\n");
      out.write("  this work for additional information regarding copyright ownership.\n");
      out.write("  The ASF licenses this file to You under the Apache License, Version 2.0\n");
      out.write("  (the \"License\"); you may not use this file except in compliance with\n");
      out.write("  the License.  You may obtain a copy of the License at\n");
      out.write("\n");
      out.write("      http://www.apache.org/licenses/LICENSE-2.0\n");
      out.write("\n");
      out.write("  Unless required by applicable law or agreed to in writing, software\n");
      out.write("  distributed under the License is distributed on an \"AS IS\" BASIS,\n");
      out.write("  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n");
      out.write("  See the License for the specific language governing permissions and\n");
      out.write("  limitations under the License.\n");
      out.write("-->\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("Radio stations that rock:\n");
      out.write("\n");
      out.write("<ul>\n");
      //  eg:foo
      examples.FooTag _jspx_th_eg_005ffoo_005f0 = (examples.FooTag) _005fjspx_005ftagPool_005feg_005ffoo_0026_005fatt3_005fatt2_005fatt1.get(examples.FooTag.class);
      _jspx_th_eg_005ffoo_005f0.setPageContext(_jspx_page_context);
      _jspx_th_eg_005ffoo_005f0.setParent(null);
      // /jsp/simpletag/foo.jsp(24,0) name = att1 type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_eg_005ffoo_005f0.setAtt1("98.5");
      // /jsp/simpletag/foo.jsp(24,0) name = att2 type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_eg_005ffoo_005f0.setAtt2("92.3");
      // /jsp/simpletag/foo.jsp(24,0) name = att3 type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_eg_005ffoo_005f0.setAtt3("107.7");
      int _jspx_eval_eg_005ffoo_005f0 = _jspx_th_eg_005ffoo_005f0.doStartTag();
      if (_jspx_eval_eg_005ffoo_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        String member = null;
        if (_jspx_eval_eg_005ffoo_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_eg_005ffoo_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_eg_005ffoo_005f0.doInitBody();
        }
        member = (String) _jspx_page_context.findAttribute("member");
        do {
          out.write("\n");
          out.write("<li>");
          out.print( member );
          out.write("</li>\n");
          int evalDoAfterBody = _jspx_th_eg_005ffoo_005f0.doAfterBody();
          member = (String) _jspx_page_context.findAttribute("member");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_eg_005ffoo_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_eg_005ffoo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005feg_005ffoo_0026_005fatt3_005fatt2_005fatt1.reuse(_jspx_th_eg_005ffoo_005f0);
        return;
      }
      _005fjspx_005ftagPool_005feg_005ffoo_0026_005fatt3_005fatt2_005fatt1.reuse(_jspx_th_eg_005ffoo_005f0);
      out.write("\n");
      out.write("</ul>\n");
      out.write("\n");
      if (_jspx_meth_eg_005flog_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_eg_005flog_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_eg_005flog_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  eg:log
    examples.LogTag _jspx_th_eg_005flog_005f0 = (examples.LogTag) _005fjspx_005ftagPool_005feg_005flog.get(examples.LogTag.class);
    _jspx_th_eg_005flog_005f0.setPageContext(_jspx_page_context);
    _jspx_th_eg_005flog_005f0.setParent(null);
    int _jspx_eval_eg_005flog_005f0 = _jspx_th_eg_005flog_005f0.doStartTag();
    if (_jspx_eval_eg_005flog_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_eg_005flog_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_eg_005flog_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_eg_005flog_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("Did you see me on the stderr window?\n");
        int evalDoAfterBody = _jspx_th_eg_005flog_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_eg_005flog_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_eg_005flog_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005feg_005flog.reuse(_jspx_th_eg_005flog_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005feg_005flog.reuse(_jspx_th_eg_005flog_005f0);
    return false;
  }

  private boolean _jspx_meth_eg_005flog_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  eg:log
    examples.LogTag _jspx_th_eg_005flog_005f1 = (examples.LogTag) _005fjspx_005ftagPool_005feg_005flog_0026_005ftoBrowser.get(examples.LogTag.class);
    _jspx_th_eg_005flog_005f1.setPageContext(_jspx_page_context);
    _jspx_th_eg_005flog_005f1.setParent(null);
    // /jsp/simpletag/foo.jsp(33,0) name = toBrowser type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_eg_005flog_005f1.setToBrowser("true");
    int _jspx_eval_eg_005flog_005f1 = _jspx_th_eg_005flog_005f1.doStartTag();
    if (_jspx_eval_eg_005flog_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_eg_005flog_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_eg_005flog_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_eg_005flog_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("Did you see me on the browser window as well?\n");
        int evalDoAfterBody = _jspx_th_eg_005flog_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_eg_005flog_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_eg_005flog_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005feg_005flog_0026_005ftoBrowser.reuse(_jspx_th_eg_005flog_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005feg_005flog_0026_005ftoBrowser.reuse(_jspx_th_eg_005flog_005f1);
    return false;
  }
}
