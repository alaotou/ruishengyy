<%@ page import="cn.ruishengyy.dao.BaseDao" %><%--
  Created by IntelliJ IDEA.
  User: 老头
  Date: 2020/10/21
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    BaseDao a = new BaseDao();
    out.print(a.hashCode());
  %>
  </body>
</html>
