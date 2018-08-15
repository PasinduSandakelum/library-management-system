<%-- 
    Document   : AddSubClass
    Created on : Aug 10, 2018, 8:48:22 AM
    Author     : pasindu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Add Main Classifications</title>

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

        <div class="container" style="color: #33334d">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Add Sub Classifications</h3>
                        </div>
                        <div class="panel-body">
                            <form id="addForm" method="get" class="form-horizontal" action="AddSub">
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="mainClassification">Main Classification:</label>
                                    <div class="col-sm-5">             
                                        <select name="mainClassification" class="form-control" id="mainClassification">  
                                            <option>Select</option>
                                            <%
                                                try {

                                                    String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
                                                    String DB_URL = "jdbc:mysql://localhost:3306/library_system?useSSL=false";

                                                    String USER = "root";
                                                    String PASS = "1234";

                                                    Class.forName(JDBC_DRIVER);
                                                    Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                                                    String sql = "SELECT * FROM main_classification";
                                                    PreparedStatement pst = con.prepareStatement(sql);
                                                    ResultSet rs = pst.executeQuery();
                                                    while (rs.next()) {
                                            %>
                                            <option><%=rs.getString("mainClassificationName")%></option> 

                                            <%
                                                    }
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                    out.println("Error " + e.getMessage());
                                                }
                                            %>

                                            <!--                                            <option>Engineering</option>        -->
                                        </select>         
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="mainId">Sub ID :</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter Sub Classification ID" name="mainId" id="mainId">
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="mainClassificaton">Sub Classification :</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter Sub Classification Name" id="mainClassificaton" name="subClassificaton">
                                    </div>

                                </div>
                                <div class="form-group">
                                    <div class="col-sm-9 col-sm-offset-4">
                                        <button type="submit" class="btn btn-primary" name="Add" value="Add">Add</button>
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

    </body>
</html>
