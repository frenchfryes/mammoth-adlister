<%--
  Created by IntelliJ IDEA.
  User: frenchfryes
  Date: 6/7/17
  Time: 11:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%

    if (request.getMethod().equalsIgnoreCase("post")) {
        String username  = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("profile.jsp");
        }
    }
%>
