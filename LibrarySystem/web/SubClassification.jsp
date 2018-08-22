<%-- 
    Document   : SubClassification
    Created on : Aug 21, 2018, 1:04:54 PM
    Author     : pasindu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sub Classification</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/animate.css">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/dropdown.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" />	
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div id="breadcrumb">
            <div class="container">	
                <div class="breadcrumb">							
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="classification.jsp">Classification</a></li>		
                    <li>Sub Classification</li>		
                </div>		
            </div>	
        </div>

        <section id="main-slider" class="no-margin">
            <div class="carousel slide">      
                <div class="carousel-inner">
                    <div class="item active" style="background-image: url(images/slider/bg1.jpg); height: 560px;">
                        <div class="container">
                            <div class="row slide-margin">
                                <div class="col-sm-6">
                                    <div class="carousel-content">
                                        <h2 class="animation animated-item-1">Book Sub Classification <span>Section</span></h2>
                                        <p class="animation animated-item-2">Search for classifications and do editing here..</p>
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
                                <a href="FillMain?page=sub">
                                    <div class="col-md-3">
                                        <div class="hi-icon-wrap hi-icon-effect wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms" >
                                            <i class="fa fa-plus-circle"></i>	
                                            <h2>Add</h2>
                                            <p>Go Add sub classification page here...</p>
                                        </div>
                                    </div>
                                </a>
                                <a href="SearchSubClassification.jsp">
                                    <div class="col-md-3">
                                        <div class="hi-icon-wrap hi-icon-effect wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms" >
                                            <i class="fa fa-location-arrow"></i>	
                                            <h2>Search</h2>
                                            <p>Go search sub classification page here...</p>
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
