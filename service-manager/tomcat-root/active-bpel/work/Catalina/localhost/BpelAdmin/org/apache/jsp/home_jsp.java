package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.activebpel.rt.util.*;
import org.activebpel.rt.bpel.server.engine.*;
import org.activebpel.rt.bpel.server.admin.*;
import javax.xml.namespace.QName;
import java.text.*;
import org.activebpel.rt.bpel.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/META-INF/aetags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fae_005fRequestEncoding_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fae_005fIfParamMatches_0026_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fae_005fDateFormatter_0026_005fproperty_005fpatternKey_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fae_005fIfTrue_0026_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fae_005fIfFalse_0026_005fproperty_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fae_005fRequestEncoding_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fae_005fIfParamMatches_0026_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fae_005fDateFormatter_0026_005fproperty_005fpatternKey_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fae_005fIfTrue_0026_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fae_005fIfFalse_0026_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fae_005fRequestEncoding_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fae_005fIfParamMatches_0026_005fvalue_005fproperty.release();
    _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fae_005fDateFormatter_0026_005fproperty_005fpatternKey_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fae_005fIfTrue_0026_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fae_005fIfFalse_0026_005fproperty_005fname.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("   ");
      if (_jspx_meth_ae_005fRequestEncoding_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("   ");
      org.activebpel.rt.bpeladmin.war.web.AeEngineStatusBean statusBean = null;
      synchronized (_jspx_page_context) {
        statusBean = (org.activebpel.rt.bpeladmin.war.web.AeEngineStatusBean) _jspx_page_context.getAttribute("statusBean", PageContext.PAGE_SCOPE);
        if (statusBean == null){
          statusBean = new org.activebpel.rt.bpeladmin.war.web.AeEngineStatusBean();
          _jspx_page_context.setAttribute("statusBean", statusBean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("   ");
      if (_jspx_meth_ae_005fIfParamMatches_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   ");
      if (_jspx_meth_ae_005fIfParamMatches_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header_head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body> \r\n");
      out.write("\r\n");
      out.write("   <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\">\r\n");
      out.write("      <tr>\r\n");
      out.write("      \r\n");
      out.write("         <td valign=\"top\" width=\"20%\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header_nav.jsp", out, false);
      out.write("\r\n");
      out.write("         </td>\r\n");
      out.write("   \r\n");
      out.write("         <!-- spacer between nav and main -->\r\n");
      out.write("         <td width=\"3%\"></td>\r\n");
      out.write("\r\n");
      out.write("         <td valign=\"top\">\r\n");
      out.write("            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"left\">\r\n");
      out.write("               <tr>\r\n");
      out.write("                  <th colspan=\"3\" class=\"pageHeaders\" align=\"left\" nowrap=\"true\">");
      if (_jspx_meth_ae_005fGetResource_005f0(_jspx_page_context))
        return;
      out.write("</th>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr height=\"1\">\r\n");
      out.write("                 <td height=\"1\" colspan=\"3\" class=\"gridLines\"></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td class=\"labelHeaders\" align=\"left\" nowrap=\"true\" width=\"20%\">&nbsp;");
      if (_jspx_meth_ae_005fGetResource_005f1(_jspx_page_context))
        return;
      out.write("&nbsp;</td>\r\n");
      out.write("                 <td align=\"left\" colspan=\"2\">");
      if (_jspx_meth_ae_005fDateFormatter_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr height=\"1\">\r\n");
      out.write("                 <td colspan=\"3\" height=\"1\" class=\"tabular\"></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td class=\"labelHeaders\" align=\"left\" nowrap=\"true\" width=\"20%\">&nbsp;");
      if (_jspx_meth_ae_005fGetResource_005f2(_jspx_page_context))
        return;
      out.write("&nbsp;</td>\r\n");
      out.write("                 <td align=\"left\" colspan=\"2\">");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.activebpel.rt.bpeladmin.war.web.AeEngineStatusBean)_jspx_page_context.findAttribute("statusBean")).getDeployedProcessesSize())));
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr height=\"1\">\r\n");
      out.write("                 <td colspan=\"3\" height=\"1\" class=\"tabular\"></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td class=\"labelHeaders\" align=\"left\" nowrap=\"true\" width=\"20%\">&nbsp;");
      if (_jspx_meth_ae_005fGetResource_005f3(_jspx_page_context))
        return;
      out.write("&nbsp;</td>\r\n");
      out.write("                 <td align=\"left\" colspan=\"2\">");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.activebpel.rt.bpeladmin.war.web.AeEngineStatusBean)_jspx_page_context.findAttribute("statusBean")).getEngineDescription())));
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr height=\"1\">\r\n");
      out.write("                 <td colspan=\"3\" height=\"1\" class=\"tabular\"></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td class=\"labelHeaders\" align=\"left\" nowrap=\"true\" width=\"20%\">&nbsp;");
      if (_jspx_meth_ae_005fGetResource_005f4(_jspx_page_context))
        return;
      out.write("&nbsp;</td>\r\n");
      out.write("                 <td align=\"left\" colspan=\"2\">");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.activebpel.rt.bpeladmin.war.web.AeEngineStatusBean)_jspx_page_context.findAttribute("statusBean")).getEngineStatus())));
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr height=\"1\">\r\n");
      out.write("                 <td colspan=\"3\" height=\"1\" class=\"tabular\"></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td class=\"labelHeaders\" align=\"left\" nowrap=\"true\" width=\"20%\">&nbsp;");
      if (_jspx_meth_ae_005fGetResource_005f5(_jspx_page_context))
        return;
      out.write("&nbsp;</td>\r\n");
      out.write("                 <td align=\"left\" colspan=\"2\">");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.activebpel.rt.bpeladmin.war.web.AeEngineStatusBean)_jspx_page_context.findAttribute("statusBean")).getEngineVersion())));
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr height=\"1\">\r\n");
      out.write("                 <td height=\"1\" colspan=\"3\" class=\"gridLines\"></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               \r\n");
      out.write("               <tr height=\"10\">\r\n");
      out.write("                 <td align=\"left\" height=\"10\" colspan=\"3\"></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               \r\n");
      out.write("               <!-- Start and stop form -->\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td align=\"right\" colspan=\"3\">\r\n");
      out.write("\t\t            <form name=\"start\" method=\"post\" action=\"home.jsp\">\r\n");
      out.write("\t\t\t\t\t   ");
      if (_jspx_meth_ae_005fIfTrue_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t   ");
      if (_jspx_meth_ae_005fIfFalse_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t            </form>\r\n");
      out.write("                 </td>\r\n");
      out.write("               </tr>\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("         </td>\r\n");
      out.write("   \r\n");
      out.write("         <!-- main and right margin       -->\r\n");
      out.write("         <td width=\"3%\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("   <br> \r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_ae_005fRequestEncoding_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:RequestEncoding
    org.activebpel.rt.war.tags.AeRequestEncodingTag _jspx_th_ae_005fRequestEncoding_005f0 = (org.activebpel.rt.war.tags.AeRequestEncodingTag) _005fjspx_005ftagPool_005fae_005fRequestEncoding_0026_005fvalue_005fnobody.get(org.activebpel.rt.war.tags.AeRequestEncodingTag.class);
    _jspx_th_ae_005fRequestEncoding_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fRequestEncoding_005f0.setParent(null);
    // /home.jsp(9,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fRequestEncoding_005f0.setValue("UTF-8");
    int _jspx_eval_ae_005fRequestEncoding_005f0 = _jspx_th_ae_005fRequestEncoding_005f0.doStartTag();
    if (_jspx_th_ae_005fRequestEncoding_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fRequestEncoding_0026_005fvalue_005fnobody.reuse(_jspx_th_ae_005fRequestEncoding_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fRequestEncoding_0026_005fvalue_005fnobody.reuse(_jspx_th_ae_005fRequestEncoding_005f0);
    return false;
  }

  private boolean _jspx_meth_ae_005fIfParamMatches_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    //  ae:IfParamMatches
    org.activebpel.rt.war.tags.AeIfParamMatchesTag _jspx_th_ae_005fIfParamMatches_005f0 = (org.activebpel.rt.war.tags.AeIfParamMatchesTag) _005fjspx_005ftagPool_005fae_005fIfParamMatches_0026_005fvalue_005fproperty.get(org.activebpel.rt.war.tags.AeIfParamMatchesTag.class);
    _jspx_th_ae_005fIfParamMatches_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fIfParamMatches_005f0.setParent(null);
    // /home.jsp(13,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fIfParamMatches_005f0.setProperty("action");
    // /home.jsp(13,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fIfParamMatches_005f0.setValue("start");
    int _jspx_eval_ae_005fIfParamMatches_005f0 = _jspx_th_ae_005fIfParamMatches_005f0.doStartTag();
    if (_jspx_eval_ae_005fIfParamMatches_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ae_005fIfParamMatches_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ae_005fIfParamMatches_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ae_005fIfParamMatches_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      ");
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("statusBean"), "start", "true", null, null, false);
        out.write("\r\n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_ae_005fIfParamMatches_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ae_005fIfParamMatches_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ae_005fIfParamMatches_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fIfParamMatches_0026_005fvalue_005fproperty.reuse(_jspx_th_ae_005fIfParamMatches_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fIfParamMatches_0026_005fvalue_005fproperty.reuse(_jspx_th_ae_005fIfParamMatches_005f0);
    return false;
  }

  private boolean _jspx_meth_ae_005fIfParamMatches_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    //  ae:IfParamMatches
    org.activebpel.rt.war.tags.AeIfParamMatchesTag _jspx_th_ae_005fIfParamMatches_005f1 = (org.activebpel.rt.war.tags.AeIfParamMatchesTag) _005fjspx_005ftagPool_005fae_005fIfParamMatches_0026_005fvalue_005fproperty.get(org.activebpel.rt.war.tags.AeIfParamMatchesTag.class);
    _jspx_th_ae_005fIfParamMatches_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fIfParamMatches_005f1.setParent(null);
    // /home.jsp(16,3) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fIfParamMatches_005f1.setProperty("action");
    // /home.jsp(16,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fIfParamMatches_005f1.setValue("stop");
    int _jspx_eval_ae_005fIfParamMatches_005f1 = _jspx_th_ae_005fIfParamMatches_005f1.doStartTag();
    if (_jspx_eval_ae_005fIfParamMatches_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ae_005fIfParamMatches_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ae_005fIfParamMatches_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ae_005fIfParamMatches_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      ");
        org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("statusBean"), "stop", "true", null, null, false);
        out.write("\r\n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_ae_005fIfParamMatches_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ae_005fIfParamMatches_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ae_005fIfParamMatches_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fIfParamMatches_0026_005fvalue_005fproperty.reuse(_jspx_th_ae_005fIfParamMatches_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fIfParamMatches_0026_005fvalue_005fproperty.reuse(_jspx_th_ae_005fIfParamMatches_005f1);
    return false;
  }

  private boolean _jspx_meth_ae_005fGetResource_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:GetResource
    org.activebpel.rt.war.tags.AeGetResourceTag _jspx_th_ae_005fGetResource_005f0 = (org.activebpel.rt.war.tags.AeGetResourceTag) _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.get(org.activebpel.rt.war.tags.AeGetResourceTag.class);
    _jspx_th_ae_005fGetResource_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fGetResource_005f0.setParent(null);
    // /home.jsp(38,81) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fGetResource_005f0.setName("home");
    int _jspx_eval_ae_005fGetResource_005f0 = _jspx_th_ae_005fGetResource_005f0.doStartTag();
    if (_jspx_th_ae_005fGetResource_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f0);
    return false;
  }

  private boolean _jspx_meth_ae_005fGetResource_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:GetResource
    org.activebpel.rt.war.tags.AeGetResourceTag _jspx_th_ae_005fGetResource_005f1 = (org.activebpel.rt.war.tags.AeGetResourceTag) _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.get(org.activebpel.rt.war.tags.AeGetResourceTag.class);
    _jspx_th_ae_005fGetResource_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fGetResource_005f1.setParent(null);
    // /home.jsp(44,87) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fGetResource_005f1.setName("date_started");
    int _jspx_eval_ae_005fGetResource_005f1 = _jspx_th_ae_005fGetResource_005f1.doStartTag();
    if (_jspx_th_ae_005fGetResource_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f1);
    return false;
  }

  private boolean _jspx_meth_ae_005fDateFormatter_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:DateFormatter
    org.activebpel.rt.war.tags.AePropertyDateFormatterTag _jspx_th_ae_005fDateFormatter_005f0 = (org.activebpel.rt.war.tags.AePropertyDateFormatterTag) _005fjspx_005ftagPool_005fae_005fDateFormatter_0026_005fproperty_005fpatternKey_005fname_005fnobody.get(org.activebpel.rt.war.tags.AePropertyDateFormatterTag.class);
    _jspx_th_ae_005fDateFormatter_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fDateFormatter_005f0.setParent(null);
    // /home.jsp(45,46) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fDateFormatter_005f0.setName("statusBean");
    // /home.jsp(45,46) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fDateFormatter_005f0.setProperty("startDate");
    // /home.jsp(45,46) name = patternKey type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fDateFormatter_005f0.setPatternKey("date_time_pattern");
    int _jspx_eval_ae_005fDateFormatter_005f0 = _jspx_th_ae_005fDateFormatter_005f0.doStartTag();
    if (_jspx_th_ae_005fDateFormatter_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fDateFormatter_0026_005fproperty_005fpatternKey_005fname_005fnobody.reuse(_jspx_th_ae_005fDateFormatter_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fDateFormatter_0026_005fproperty_005fpatternKey_005fname_005fnobody.reuse(_jspx_th_ae_005fDateFormatter_005f0);
    return false;
  }

  private boolean _jspx_meth_ae_005fGetResource_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:GetResource
    org.activebpel.rt.war.tags.AeGetResourceTag _jspx_th_ae_005fGetResource_005f2 = (org.activebpel.rt.war.tags.AeGetResourceTag) _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.get(org.activebpel.rt.war.tags.AeGetResourceTag.class);
    _jspx_th_ae_005fGetResource_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fGetResource_005f2.setParent(null);
    // /home.jsp(51,87) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fGetResource_005f2.setName("deployed_processes_colon");
    int _jspx_eval_ae_005fGetResource_005f2 = _jspx_th_ae_005fGetResource_005f2.doStartTag();
    if (_jspx_th_ae_005fGetResource_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f2);
    return false;
  }

  private boolean _jspx_meth_ae_005fGetResource_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:GetResource
    org.activebpel.rt.war.tags.AeGetResourceTag _jspx_th_ae_005fGetResource_005f3 = (org.activebpel.rt.war.tags.AeGetResourceTag) _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.get(org.activebpel.rt.war.tags.AeGetResourceTag.class);
    _jspx_th_ae_005fGetResource_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fGetResource_005f3.setParent(null);
    // /home.jsp(58,87) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fGetResource_005f3.setName("description");
    int _jspx_eval_ae_005fGetResource_005f3 = _jspx_th_ae_005fGetResource_005f3.doStartTag();
    if (_jspx_th_ae_005fGetResource_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f3);
    return false;
  }

  private boolean _jspx_meth_ae_005fGetResource_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:GetResource
    org.activebpel.rt.war.tags.AeGetResourceTag _jspx_th_ae_005fGetResource_005f4 = (org.activebpel.rt.war.tags.AeGetResourceTag) _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.get(org.activebpel.rt.war.tags.AeGetResourceTag.class);
    _jspx_th_ae_005fGetResource_005f4.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fGetResource_005f4.setParent(null);
    // /home.jsp(65,87) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fGetResource_005f4.setName("status_colon");
    int _jspx_eval_ae_005fGetResource_005f4 = _jspx_th_ae_005fGetResource_005f4.doStartTag();
    if (_jspx_th_ae_005fGetResource_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f4);
    return false;
  }

  private boolean _jspx_meth_ae_005fGetResource_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:GetResource
    org.activebpel.rt.war.tags.AeGetResourceTag _jspx_th_ae_005fGetResource_005f5 = (org.activebpel.rt.war.tags.AeGetResourceTag) _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.get(org.activebpel.rt.war.tags.AeGetResourceTag.class);
    _jspx_th_ae_005fGetResource_005f5.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fGetResource_005f5.setParent(null);
    // /home.jsp(72,87) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fGetResource_005f5.setName("version_colon");
    int _jspx_eval_ae_005fGetResource_005f5 = _jspx_th_ae_005fGetResource_005f5.doStartTag();
    if (_jspx_th_ae_005fGetResource_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f5);
    return false;
  }

  private boolean _jspx_meth_ae_005fIfTrue_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:IfTrue
    org.activebpel.rt.war.tags.AeIfTrueTag _jspx_th_ae_005fIfTrue_005f0 = (org.activebpel.rt.war.tags.AeIfTrueTag) _005fjspx_005ftagPool_005fae_005fIfTrue_0026_005fproperty_005fname.get(org.activebpel.rt.war.tags.AeIfTrueTag.class);
    _jspx_th_ae_005fIfTrue_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fIfTrue_005f0.setParent(null);
    // /home.jsp(87,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fIfTrue_005f0.setName("statusBean");
    // /home.jsp(87,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fIfTrue_005f0.setProperty("engineRunning");
    int _jspx_eval_ae_005fIfTrue_005f0 = _jspx_th_ae_005fIfTrue_005f0.doStartTag();
    if (_jspx_eval_ae_005fIfTrue_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ae_005fIfTrue_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ae_005fIfTrue_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ae_005fIfTrue_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t            <input type=\"hidden\" name=\"action\" value=\"stop\" />\r\n");
        out.write("\t\t\t\t            <input type=\"Submit\" name=\"Stop\" value='");
        if (_jspx_meth_ae_005fGetResource_005f6(_jspx_th_ae_005fIfTrue_005f0, _jspx_page_context))
          return true;
        out.write("' />\r\n");
        out.write("\t\t\t\t\t   ");
        int evalDoAfterBody = _jspx_th_ae_005fIfTrue_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ae_005fIfTrue_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ae_005fIfTrue_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fIfTrue_0026_005fproperty_005fname.reuse(_jspx_th_ae_005fIfTrue_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fIfTrue_0026_005fproperty_005fname.reuse(_jspx_th_ae_005fIfTrue_005f0);
    return false;
  }

  private boolean _jspx_meth_ae_005fGetResource_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_ae_005fIfTrue_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:GetResource
    org.activebpel.rt.war.tags.AeGetResourceTag _jspx_th_ae_005fGetResource_005f6 = (org.activebpel.rt.war.tags.AeGetResourceTag) _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.get(org.activebpel.rt.war.tags.AeGetResourceTag.class);
    _jspx_th_ae_005fGetResource_005f6.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fGetResource_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ae_005fIfTrue_005f0);
    // /home.jsp(89,56) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fGetResource_005f6.setName("stop_engine");
    int _jspx_eval_ae_005fGetResource_005f6 = _jspx_th_ae_005fGetResource_005f6.doStartTag();
    if (_jspx_th_ae_005fGetResource_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f6);
    return false;
  }

  private boolean _jspx_meth_ae_005fIfFalse_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:IfFalse
    org.activebpel.rt.war.tags.AeIfFalseTag _jspx_th_ae_005fIfFalse_005f0 = (org.activebpel.rt.war.tags.AeIfFalseTag) _005fjspx_005ftagPool_005fae_005fIfFalse_0026_005fproperty_005fname.get(org.activebpel.rt.war.tags.AeIfFalseTag.class);
    _jspx_th_ae_005fIfFalse_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fIfFalse_005f0.setParent(null);
    // /home.jsp(91,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fIfFalse_005f0.setName("statusBean");
    // /home.jsp(91,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fIfFalse_005f0.setProperty("engineRunning");
    int _jspx_eval_ae_005fIfFalse_005f0 = _jspx_th_ae_005fIfFalse_005f0.doStartTag();
    if (_jspx_eval_ae_005fIfFalse_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ae_005fIfFalse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ae_005fIfFalse_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ae_005fIfFalse_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t            <input type=\"hidden\" name=\"action\" value=\"start\" />\r\n");
        out.write("\t\t\t\t            <input type=\"Submit\" name=\"Start\" value='");
        if (_jspx_meth_ae_005fGetResource_005f7(_jspx_th_ae_005fIfFalse_005f0, _jspx_page_context))
          return true;
        out.write("' />\r\n");
        out.write("\t\t\t\t\t   ");
        int evalDoAfterBody = _jspx_th_ae_005fIfFalse_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ae_005fIfFalse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ae_005fIfFalse_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fIfFalse_0026_005fproperty_005fname.reuse(_jspx_th_ae_005fIfFalse_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fIfFalse_0026_005fproperty_005fname.reuse(_jspx_th_ae_005fIfFalse_005f0);
    return false;
  }

  private boolean _jspx_meth_ae_005fGetResource_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_ae_005fIfFalse_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ae:GetResource
    org.activebpel.rt.war.tags.AeGetResourceTag _jspx_th_ae_005fGetResource_005f7 = (org.activebpel.rt.war.tags.AeGetResourceTag) _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.get(org.activebpel.rt.war.tags.AeGetResourceTag.class);
    _jspx_th_ae_005fGetResource_005f7.setPageContext(_jspx_page_context);
    _jspx_th_ae_005fGetResource_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ae_005fIfFalse_005f0);
    // /home.jsp(93,57) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ae_005fGetResource_005f7.setName("start_engine");
    int _jspx_eval_ae_005fGetResource_005f7 = _jspx_th_ae_005fGetResource_005f7.doStartTag();
    if (_jspx_th_ae_005fGetResource_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fae_005fGetResource_0026_005fname_005fnobody.reuse(_jspx_th_ae_005fGetResource_005f7);
    return false;
  }
}
