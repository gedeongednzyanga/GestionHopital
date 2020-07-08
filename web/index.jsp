<%-- 
    Document   : index
    Created on : 24 juin 2020, 20:29:14
    Author     : GEDEON
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="<c:url value="/Login" /> ">Login here</a>
        <a href="<c:url value="/pageTest" />">Test Page</a>
        <br>
        <br>
        <h1>Test Connection</h1>
        <sql:setDataSource 
            var="myDs"
            driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/gestion_hopital"
            user="root"
            password=""
        />
        <sql:query var="listeCate" dataSource="${myDs}">
            SELECT * FROM get_categorie
        </sql:query>
            <div align="center">
                <table border="1" cellpadding="5">
                    <caption><h3>Liste Categories</h3></caption>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Designation</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="categorie" items="${listeCate.rows}">
                            <tr>
                                <td><c:out value="${categorie.cat_id}" /></td>
                                <td><c:out value="${categorie.cat_designation}" /></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            
    </body>
</html>
