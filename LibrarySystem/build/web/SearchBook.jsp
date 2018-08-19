<%-- 
    Document   : SearchBook
    Created on : Aug 8, 2018, 11:40:30 AM
    Author     : pasindu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Company-HTML Bootstrap theme</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/animate.css">
        <link href="css/dropdown.css" rel="stylesheet" />
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" />		
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>
    <body>
<jsp:include page="Header.jsp"/>

        <div id="breadcrumb">
            <div class="container">	
                <div class="breadcrumb">							
                    <li><a href="index.html">Home</a></li>
                    <li><a href="book.html">Books</a></li>		
                    <li>Search Books</li>	
                </div>		
            </div>	
        </div>

        <div class="container" style = "color:#33334d">
            <div class="row">

                <form action="SearchBook" method="get">
                    <div class="form-group">
                        <div class="col-sm-2">
                            <label for="sname">Search : </label>
                        </div>
                        <div class="col-sm-4">             
                            <select name="selection" class="form-control" id="selection">  
                                <option>Select</option>        
                                <option>bookId</option>        
                                <option>title</option>        
                                <option>author</option>        
                                <option>mainClassification</option>        
                                <option>subClassification</option>        
                            </select>         
                        </div>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="Search" name="sname" id="sname">
                        </div>
                        <div class="col-sm-2">
                            <button type="submit" class="btn btn-md"><span class="glyphicon glyphicon-search"></span></button>                        </div>
                    </div>
                </form>
            </div>
            <div class="row">
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

                        <c:forEach items="${books}" var="b">
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
                                <td>
                                    <a href="Edit?type=edit&bookId=${b.getBook().getBookId()}" value="asas"><span class="glyphicon glyphicon-pencil"></span></a>                                    
                                    &nbsp;
                                    <a href="DeleteBook?bookId=${b.getBook().getBookId()}&selection=<%=request.getParameter("selection")%>&sname=<%=request.getParameter("sname")%>" onclick="deleteRow(this)"><span class="glyphicon glyphicon-trash"></span></a>

                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>
        <jsp:include page="Footer.jsp"/>
    </body>
</html>