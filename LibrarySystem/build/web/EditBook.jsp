<%-- 
    Document   : AddBook
    Created on : Jul 29, 2018, 11:16:45 AM
    Author     : pasindu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@page import="java.sql.*" %>
<%@page import="com.pacage.data.*" %>
<%@page import="com.pacage.model.*" %>
<%@page import="java.util.ArrayList" %>--%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Add Books</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/animate.css">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/dropdown.css" rel="stylesheet" />
        <link href="css/style.css" rel="stylesheet" />	
        <link href="css/bootstrap-datepicker3.css" rel="stylesheet" id="bootstrap-css">
        <!--<script type="text/javascript" src="js/bootstrap-datepicker.min.js"></script>-->
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
        <script src="js/jquery.js"></script>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/validator.js"></script>
        <script src="js/validator.min.js"></script>

        
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
<c:forEach items="${bookEdit}" var="b">
        <div class="container" style="color: #33334d">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Update Books</h3>
                        </div>
                        <div class="panel-body">
                            <form id="addForm" method="get" class="form-horizontal" action="GetUpdate">

                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="bookId">Book ID : </label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter book ID" name="bookId" id="bookId" value=${b.getBook().getBookId()} readonly/>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="title">Title:</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter book title" id="title" name="title" value="${b.getBook().getTitle()}">
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="author">Author:</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter book author" name="author" id="author" value="${b.getBook().getAuthor()}">
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="mainClassificationId">Main Classification:</label>
                                    <div class="col-sm-5">             
                                        <select name="mainClassificationId" class="form-control" id="mainClassificationId" onChange="">  
                                            <option>Select</option>  
                                            <option value="M01">Engineering</option>  
                                            
                                        </select>

                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="subClassificationId">Sub Classification:</label>
                                    <div class="col-sm-5"> 

                                        <select name="subClassificationId" class="form-control" id="subClassificationId">  
                                            <option>Select</option>
                                            <option value="S01">Software Engineering</option>
                                            <option value="S02">Computer Engineering</option>
                                           
                                        </select>         
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="yearOfPrint">Year of Printed:</label>

                                    <div class='input-group date' id='datepicker1' class="col-sm-5">
                                        <input type='text' class="form-control" name="yearOfPrint" id="yearOfPrint" value="${b.getBook().getYearOfPrint()}"/>
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="lastPrintYear">Last Printed Year:</label>
                                    <div class='input-group date' id='datepicker2' class="col-sm-5">
                                        <input type='text' class="form-control" name="lastPrintYear" id="lastPrintYear" value="${b.getBook().getLastPrintYear()}"/>
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="isbnNo">ISBN No:</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter ISBN number" name="isbnNo" id="isbnNo" value="${b.getBook().getIsbnNo()}">
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="noOfPages">No of Pages:</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter number of pages" name="noOfPages" id="noOfPages" value="${b.getBook().getNoOfPages()}"/>
                                    </div>

                                </div>

                                <div class="form-group">
                                    <div class="col-sm-9 col-sm-offset-4">
                                        <button type="submit" class="btn btn-primary" name="Update" value="UpdateBook">Update</button>
                                        
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-6 col-sm-offset-4">
                                        ${error} 
                                    </div>
                                </div>
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>
     </c:forEach>
        <script type="text/javascript" src="js/bootstrap-datepicker.min.js"></script>
        <script>
                                            $(function () {
                                                $('#datepicker1').datepicker({
                                                    format: "yyyy",
                                                    autoclose: true,
                                                    viewMode: "years",
                                                    minViewMode: "years",
                                                    todayHighlight: true,
                                                    showOtherMonths: true,
                                                    selectOtherMonths: true,
                                                    autoclose: true,
                                                    changeMonth: false,
                                                    changeYear: true,
                                                    orientation: "button"
                                                }).on('changeYear', function (e) {

                                                });
                                                $('#datepicker2').datepicker({
                                                    format: "yyyy",
                                                    autoclose: true,
                                                    viewMode: "years",
                                                    minViewMode: "years",
                                                    todayHighlight: true,
                                                    showOtherMonths: true,
                                                    selectOtherMonths: true,
                                                    autoclose: true,
                                                    changeMonth: false,
                                                    changeYear: true,
                                                    orientation: "button"
                                                }).on('changeYear', function (e) {

                                                });
                                            });
        </script>
    </body>
</html>