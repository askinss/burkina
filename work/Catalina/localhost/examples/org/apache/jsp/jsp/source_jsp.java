package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class source_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/example-taglib.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005feg_005fShowSource_0026_005fjspFile_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005feg_005fShowSource_0026_005fjspFile_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005feg_005fShowSource_0026_005fjspFile_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      //  eg:ShowSource
      examples.ShowSource _jspx_th_eg_005fShowSource_005f0 = (examples.ShowSource) _005fjspx_005ftagPool_005feg_005fShowSource_0026_005fjspFile_005fnobody.get(examples.ShowSource.class);
      _jspx_th_eg_005fShowSource_005f0.setPageContext(_jspx_page_context);
      _jspx_th_eg_005fShowSource_005f0.setParent(null);
      // /jsp/source.jsp(20,0) name = jspFile type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_eg_005fShowSource_005f0.setJspFile( util.HTMLFilter.filter(request.getQueryString()) );
      int _jspx_eval_eg_005fShowSource_005f0 = _jspx_th_eg_005fShowSource_005f0.doStartTag();
      if (_jspx_th_eg_005fShowSource_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005feg_005fShowSource_0026_005fjspFile_005fnobody.reuse(_jspx_th_eg_005fShowSource_005f0);
        return;
      }
      _005fjspx_005ftagPool_005feg_005fShowSource_0026_005fjspFile_005fnobody.reuse(_jspx_th_eg_005fShowSource_005f0);
      out.write('\n');
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
}
