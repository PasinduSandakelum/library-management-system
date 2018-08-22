<%-- 
    Document   : index
    Created on : Aug 19, 2018, 8:54:06 AM
    Author     : Pasindu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Library Management System</title>

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
        <section id="main-slider" class="no-margin">
            <div class="carousel slide">      
                <div class="carousel-inner">
                    <div class="item active" style="background-image: url(images/slider/bg3.jpg); height: 530px;">
                        <div class="container">
                            <div class="row slide-margin">
                                <div class="col-sm-6">
                                    <div class="carousel-content">

                                        <h2 class="animation animated-item-1">Welcome <span>Library System</span></h2>
                                        <p class="animation animated-item-2">This is a online book library with large book stock...</p>
                                        <a class="btn-slide animation animated-item-3" href="#">Read More</a>


                                    </div>
                                </div>
                            </div>
                        </div>
                    </div><!--/.item-->             
                </div><!--/.carousel-inner-->
            </div><!--/.carousel-->
        </section><!--/#main-slider-->
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2">
                    <div class="feature">
                        <div class="container">
                            <div class="text-center">
                                <a href="book.jsp">
                                    <div class="col-md-3">
                                        <div class="hi-icon-wrap hi-icon-effect wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms" >
                                            <i class="fa fa-book"></i>	
                                            <h2>Books</h2>
                                            <p>Add books, Update, Delete and  Search here.</p>
                                        </div>
                                    </div>
                                </a>

                                <a href="classification.jsp">
                                    <div class="col-md-3">
                                        <div class="hi-icon-wrap hi-icon-effect wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms" >
                                            <i class="fa fa-folder-open"></i>	
                                            <h2>Classifications</h2>
                                            <p>View classifications and add, update, delete and search here.</p>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>



        <jsp:include page="Footer.jsp"/>



        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery-2.1.1.min.js"></script>	
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/jquery.isotope.min.js"></script>  
        <script src="js/wow.min.js"></script>
        <script src="js/functions.js"></script>

    </body>
</html>
