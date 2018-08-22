<%-- 
    Document   : AddSubClass
    Created on : Aug 10, 2018, 8:48:22 AM
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
        <title>Add Sub Classifications</title>

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
        <jsp:include page="Header.jsp"/>

        <div id="breadcrumb">
            <div class="container">	
                <div class="breadcrumb">							
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="classification.jsp">Classification</a></li>		
                    <li><a href="SubClassification.jsp">Sub Classification</a></li>	
                    <li>Add Sub Classification</li>	
                </div>		
            </div>	
        </div>

        <div class="container" style="color: #33334d">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2">
                    ${error}
                </div>
            </div>
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Sub classification details</h3>
                        </div>
                        <div class="panel-body">
                            <form id="addForm" method="get" class="form-horizontal" action="AddSub">
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="mainClassification">Main Classification:</label>
                                    <div class="col-sm-5">             
                                        <select name="mainId" class="form-control" id="mainId" onchange="changeSub(this.form);" value="${mainId}" required>  
                                            <option value="">Select</option>  
                                            <!--<option>Engineering</option>-->  
                                            <c:forEach var="item" items="${mainClassifications}">
                                                <option value="${item.getMid()}" <c:if test="${item.getMid() eq mainId}" >Selected="true"</c:if>>${item.getMname()}</option>
                                            </c:forEach>
                                        </select>         
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="subId">Sub ID :</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter Sub Classification ID" name="subId" id="subId" required>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="subClassification">Sub Classification :</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter Sub Classification Name" id="subClassification" name="subClassification" required>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <div class="col-sm-9 col-sm-offset-4">
                                        <button type="submit" class="btn btn-primary" name="Add" value="Add">Add</button>
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
