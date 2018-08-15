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
        <header>		
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="navigation">
                    <div class="container">					
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse.collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <div class="navbar-brand">
                                <a href="index.html"><h1><span>Library</span>System</h1></a>
                            </div>
                        </div>

                        <div class="navbar-collapse collapse">							
                            <div class="menu">
                                <ul class="nav nav-tabs" role="tablist">
                                    <li class="dropdown">
                                        <a id="dLabel" role="button" class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown" href="index.html">
                                            <span class="glyphicon glyphicon-home">&nbsp;Home</span>
                                        </a>
                                    </li>
                                    <li class="dropdown">
                                        <a id="dLabel" role="button" class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown" href="book.html">
                                            Books<span class="caret"></span>
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a tabindex="-1" href="AddBook.jsp">Add Books</a></li>
                                            <li><a tabindex="-1" href="SearchBook.jsp">Search Books</a></li>
                                        </ul>
                                    </li>
                                    <li class="dropdown">
                                        <a id="dLabel" role="button" class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown" href="classification.html">
                                            Classifications<span class="caret"></span>
                                        </a>
                                        <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">

                                            <li class="dropdown-submenu">
                                                <a class="test" tabindex="-1" href="#">Main Classification</a>
                                                <ul class="dropdown-menu">
                                                    <li><a tabindex="-1" href="AddMainClass.jsp">Add Main</a></li>
                                                    <li><a tabindex="-1" href="SearchMainClassification.jsp">Search Main</a></li>
                                                </ul>
                                            </li>
                                            <li class="divider"></li>
                                            <li class="dropdown-submenu">
                                                <a class="test" tabindex="-1" href="#">Sub Classification</a>
                                                <ul class="dropdown-menu">
                                                    <li><a tabindex="-1" href="AddSubClass.jsp">Add Sub</a></li>
                                                    <li><a tabindex="-1" href="SearchSubClassification.jsp">Search Sub</a></li>
                                                </ul>
                                            </li>
                                        </ul>

                                    </li>
                                </ul>
                            </div>
                        </div>						
                    </div>
                </div>	
            </nav>		
        </header>	

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
                <div class="col-sm-8 col-sm-offset-2">

                    <div class="panel panel-default">
<!--                        <div class="panel-heading">
                            <h3 class="panel-title">Search Main Classifications</h3>
                        </div>-->
                        <div class="panel-body">
                            <form id="addForm" method="get" class="form-horizontal" action="SearchMain">
                                <div class="form-group">
                                    <!--<label class="col-sm-4 control-label" for="mainClassification">Search : </label>-->
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Search" name="mainClassification" id="mainClassification">
                                    </div>
                                    <div class="col-sm-2">
                                        <button type="submit" class="btn btn-md"><span class="glyphicon glyphicon-search"></span></button>
                                    </div>
                                </div>
                            </form>

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
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>

                        </div>
                    </div>
                </div>
            </div>
        </div>
</body>
</html>
