<%-- 
    Document   : test1
    Created on : Aug 12, 2018, 8:13:09 AM
    Author     : pasindu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    <table class="table table-striped table-responsive-md " id="bookTable">
                    <thead>
                        <tr>
                            <th>Book ID</th>
                            <th>Title</th>
                            <th>Author</th>
                            <th>Main Classification</th>
                            <th>Sub Classification</th>
                            <th>Year of printed</th>
                            <th>Last printed year</th>
                            <th>ISBN No</th>
                            <th># pages</th>
                        </tr>
                    </thead>
                    <tbody>
                        
                        <c:forEach items="${bookEdit}" var="b">
                            <tr>
                                <td>${b.getBook().getBookId()}</td>
                                <td>${b.getBook().getTitle()}</td>
                                <td>${b.getBook().getAuthor()}</td>
                                <td>${b.getMain().getMname()}</td>
                                <td>${b.getSub().getSname()}</td>
                                <td>${b.getBook().getYearOfPrint()}</td>
                                <td>${b.getBook().getLastPrintYear()}</td>
                                <td>${b.getBook().getIsbnNo()}</td>
                                <td>${b.getBook().getNoOfPages()}</td> 
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
<!--        <table>
            <thead>
                <tr>
                    <td>Main Classification</td>
                    <td>Sub Classification</td>
                </tr>
            </thead>
            <tbody>

            </tbody>
        </table>-->
    </body>
</html>
