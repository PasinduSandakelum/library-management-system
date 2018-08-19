<%-- 
    Document   : SearchMainClassification
    Created on : Aug 10, 2018, 9:08:03 PM
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
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/dropdown.css" rel="stylesheet" />
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
                    <li>AddBook</li>	
                </div>		
            </div>	
        </div>

        <div class="container" style="color: #33334d">
            <div class="row">
                <div class="col-sm-10 col-sm-offset-2">

                    <div class="panel panel-default">
                        <!--                        <div class="panel-heading">
                                                    <h3 class="panel-title">Search Main Classifications</h3>
                                                </div>-->
                        <div class="panel-body">
                            <form id="addForm" method="get" class="form-horizontal" action="SearchMain">
                                <div class="form-group">
                                    <div class="col-sm-3">             
                                        <select name="selection" class="form-control" id="selection">  
                                            <option>Select</option>        
                                            <option value="mainId">Main ID</option>        
                                            <option value="mainClassificationName">Name</option>             
                                        </select>         
                                    </div>
                                    <!--<label class="col-sm-4 control-label" for="mainClassification">Search : </label>-->
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Search" name="mainClassification" id="mainClassification">
                                    </div>

                                    <div class="col-sm-2">
                                        <button type="submit" class="btn btn-md" name="type" value="search"><span class="glyphicon glyphicon-search"></span></button>
                                    </div>
                                    <div class="col-sm-2">
                                        <a href="SearchMain?type=all"><span class="btn btn-md" ><span class="glyphicon glyphicon-search"></span>View All</span></a>
                                    </div>
                                </div>
                            </form>
                            <div class="form-group">
                                <div class="col-sm-6 col-sm-offset-4">
                                    ${error} 
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container" style="color: #33334d">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Main Classification Details</h3>
                        </div>
                        <div class="panel-body">
                            <table class="table table-striped table-responsive-md ">
                                <thead>
                                    <tr>
                                        <th>Main ID</th>
                                        <th>Main Classification Name</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${mainClassifications}" var="b">
                                        <tr>
                                            <td>${b.getMid()}</td>
                                            <td>${b.getMname()}</td>  
                                            <td>
                                                <a href=""><span class="glyphicon glyphicon-pencil"></span></a>                                    
                                                &nbsp;
                                                <a href="DeleteMain?mainId=${b.getMid()}"><span class="glyphicon glyphicon-trash"></span></a>

                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    <jsp:include page="Footer.jsp"/>
    </body>
</html>
