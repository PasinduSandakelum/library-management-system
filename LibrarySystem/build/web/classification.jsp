<%-- 
    Document   : classification
    Created on : Aug 19, 2018, 8:57:55 AM
    Author     : Pasindu
--%>

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
	<link href="css/dropdown.css" rel="stylesheet">
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
				<li>Classifications</li>			
			</div>		
		</div>	
	</div>
	
	<div class="classifications">
		<div class="container">
			<h3>Company Services</h3>
			<hr>
			<div class="col-md-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms">
				<img src="images/4.jpg" class="img-responsive">
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus interdum erat 
				libero, pulvinar tincidunt leo consectetur eget. Curabitur lacinia pellentesque
				libero, pulvinar tincidunt leo consectetur eget. Curabitur lacinia pellentesque
				libero, pulvinar tincidunt leo consectetur eget. Curabitur lacinia pellentesque</p>
			</div>
			
			<div class="col-md-6 wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms">
				<div class="media">
					<ul>
						<li>
							<div class="media-left">
								<i class="fa fa-plus-circle"></i>						
							</div>
							<div class="media-body">
								<h4 class="media-heading">Add</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus interdum erat 
								libero, pulvinar tincidunt leo consectetur eget.</p>
							</div>
						</li>
						<li>
							<div class="media-left">
								<i class="fa fa-book"></i>						
							</div>
							<div class="media-body">
								<h4 class="media-heading">Responsive Design</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus interdum erat 
								libero, pulvinar tincidunt leo consectetur eget.</p>
							</div>
						</li>
						<li>
							<div class="media-left">
								<i class="fa fa-rocket"></i>						
							</div>
							<div class="media-body">
								<h4 class="media-heading">Bootstrap Themes</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus interdum erat 
								libero, pulvinar tincidunt leo consectetur eget.</p>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>	
	
	<div class="sub-classifications">
		<div class="container">
			<div class="col-md-6">
				<div class="media">
					<ul>
						<li>
							<div class="media-left">
								<i class="fa fa-pencil"></i>						
							</div>
							<div class="media-body">
								<h4 class="media-heading">Landing Page</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus interdum erat 
								libero, pulvinar tincidunt leo consectetur eget.</p>
							</div>
						</li>
						<li>
							<div class="media-left">
								<i class="fa fa-book"></i>						
							</div>
							<div class="media-body">
								<h4 class="media-heading">Training</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus interdum erat 
								libero, pulvinar tincidunt leo consectetur eget.</p>
							</div>
						</li>
						<li>
							<div class="media-left">
								<i class="fa fa-rocket"></i>						
							</div>
							<div class="media-body">
								<h4 class="media-heading">Logo Design</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus interdum erat 
								libero, pulvinar tincidunt leo consectetur eget.</p>
							</div>
						</li>
					</ul>
				</div>
			</div>
						
			<div class="col-md-6">
				<img src="images/4.jpg" class="img-responsive">
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus interdum erat 
				libero, pulvinar tincidunt leo consectetur eget. Curabitur lacinia pellentesque
				libero, pulvinar tincidunt leo consectetur eget. Curabitur lacinia pellentesque
				libero, pulvinar tincidunt leo consectetur eget. Curabitur lacinia pellentesque</p>
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
