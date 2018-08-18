<%-- 
    Document   : Header
    Created on : Aug 18, 2018, 1:13:44 PM
    Author     : Pasindu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

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
                                        <a id="dLabel" role="button" class="btn btn-secondary dropdown-toggle" type="button" href="book.html" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            Books<span class="caret"></span>
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a tabindex="-1" href="FillMain">Add Books</a></li>
                                            <li><a tabindex="-1" href="SearchBook.jsp">Search Books</a></li>
                                        </ul>
                                    </li>
                                    <li class="dropdown">
                                        <div class="btn-group">
                                            <a type="button" class="btn btn-danger" href="book.html">Home</a>
                                        </div>
                                    </li>
                                    <li class="dropdown">
                                        <li class="btn-group">
                                            <a type="button" class="btn btn-danger" href="book.html">Book</a>
                                            <a type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <span class="caret"></span>
                                            </a>
                                            <ul class="dropdown-menu">
                                                <li><a tabindex="-1" class="dropdown-item" href="AddBook.jsp">Add Book</a></li>
                                                <div class="dropdown-divider"></div>
                                                <li><a tabindex="-1" class="dropdown-item" href="SearchBook.jsp">Search Book</a></li>

                                            </ul>
                                        </li>
                                    </li>
                                    <li class="dropdown">
                                        <div class="btn-group">
                                            <a type="button" class="btn btn-danger" href="book.html">Classification</a>
                                            <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <span class="caret"></span>
                                            </button>
                                            <div class="dropdown-menu">
                                                <a class="dropdown-item" href="AddBook.jsp">Add Book</a>
                                                <div class="dropdown-divider"></div>
                                                <a class="dropdown-item" href="SearchBook.jsp">Search Book</a>

                                            </div>
                                        </div>
                                    </li>
                                    
                                    <li class="dropdown">
                                        <a id="dLabel" role="button" class="btn btn-secondary dropdown-toggle" type="button" data-toggle="dropdown" href="classification.html" aria-haspopup="true" aria-expanded="false">
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
    </body>
</html>
