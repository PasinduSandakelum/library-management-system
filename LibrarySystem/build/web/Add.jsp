<%-- 
    Document   : Add
    Created on : Aug 7, 2018, 12:38:00 PM
    Author     : pasindu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="BookServlet" method="get">
            <input type="text" name="bookId" value="" />
            <input type="text" name="title" value="" />
            <input type="text" name="author" value="" />
            <input type="text" name="yearOfprint" value="" />
            <input type="text" name="lastPrintYear" value="" />
            <input type="text" name="isbnNo" value="" />
            <input type="text" name="noOfPages" value="" />
            <select name="subClassification">
                <option>SoftwareEngineering</option>
                <option>Computer Engineering</option>
            </select>
            
            <input type="submit" value="Add" />
        </form>
    </body>
</html>
