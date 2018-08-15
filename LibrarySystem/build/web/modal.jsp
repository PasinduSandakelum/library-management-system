<%-- 
    Document   : AddMainClass
    Created on : Aug 9, 2018, 10:04:41 PM
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
        <title>Add Main Classifications</title>

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
    <body style="color:black;">
        <p>Click the button to alert the innerHTML of the tr element with id="myRow" in the table.</p>

        <table class="table table-striped table-responsive-md " id="bookTable">
            
                <tr data-val='1' id="1">
                    <td>1<td>
                    <td>a<td>
                    <td>b<td>
                    <td>c<td>
                    <td>d<td>
                    <td>e<td>
                    <td>f<td>
                    <td>g<td>
                    <td>h<td>
                        <!--<a href=""</a>-->
                        <div class="text-center">
                            <a href="" class="btn btn-default btn-rounded mb-4" data-toggle="modal" data-target="#modalLoginForm" onclick="myFunction()"><span class="glyphicon glyphicon-pencil"></span></a>
                        </div>
                        <!--<a href="" class="btn btn-default btn-rounded mb-4" data-toggle="modal" data-target="#modalLoginForm" onclick="myFunction()" id" value=""><span class="glyphicon glyphicon-pencil"></span></a>-->

                    </td>
                </tr>
                <tr data-val='2' id="2">
                    <td>2<td>
                    <td>a<td>
                    <td>b<td>
                    <td>c<td>
                    <td>d<td>
                    <td>e<td>
                    <td>f<td>
                    <td>g<td>
                    <td>h<td>
                        <!--<a href=""</a>-->
                        <div class="text-center">
                            <a href=""  data-toggle="modal" data-target="#modalLoginForm" onclick="myFunction()"><span class="glyphicon glyphicon-pencil"></span></a>
                        </div>
                        <!--<a href="" class="btn btn-default btn-rounded mb-4" data-toggle="modal" data-target="#modalLoginForm" onclick="myFunction()" id" value=""><span class="glyphicon glyphicon-pencil"></span></a>-->

                    </td>
                </tr>
            
        </table>
        <br> 

        

        <div id="n" style="">
            <div class="modal fade" id="modalLoginForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg" role="document">
                    <div class="modal-content">
                        <div class="modal-header text-center">
                            <h4 class="modal-title w-100 font-weight-bold">Sign in</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body sm-10">
                            <div class="container" style="color: #33334d">
                                <div class="row">
                                    <div class="col-sm-8 ">

                                        <div class="panel panel-default">
                                            <div class="panel-heading">
                                                <h3 class="panel-title">Add Books</h3>
                                            </div>
                                            <div class="panel-body">
                                                <form id="addForm" method="get" class="form-horizontal" action="">

                                                    <div class="form-group">
                                                        <label class="col-sm-4 control-label" for="bookId">Book ID : </label>
                                                        <div class="col-sm-5">
                                                            <input type="text" class="form-control" placeholder="Enter book ID" name="bookId" id="bookId">
                                                        </div>

                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-sm-4 control-label" for="title">Title:</label>
                                                        <div class="col-sm-5">
                                                            <input type="text" class="form-control" placeholder="Enter book title" id="title" name="title">
                                                        </div>

                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-sm-4 control-label" for="author">Author:</label>
                                                        <div class="col-sm-5">
                                                            <input type="text" class="form-control" placeholder="Enter book author" name="author" id="author">
                                                        </div>

                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-sm-4 control-label" for="mainClassification">Main Classification:</label>
                                                        <div class="col-sm-5">             
                                                            <select name="mainClassificationId" class="form-control" id="mainClassification" onChange="changeSub(this.form);">  
                                                                <option>Select</option>  
                                                                <option>Engineering</option>  
                                                                <c:forEach var="item" items="${mainClassifications}">
                                                                    <option value="${item.getMid()}" <c:if test="${item.getMid() eq mainClassificationId}" >Selected="true"</c:if>>${item.getMname()}</option>
                                                                </c:forEach>
                                                            </select>

                                                        </div>
                                                    </div>

                                                    <div class="form-group">
                                                        <label class="col-sm-4 control-label" for="subClassification">Sub Classification:</label>
                                                        <div class="col-sm-5"> 

                                                            <select name="subClassification" class="form-control" id="subClassification">  
                                                                <option>Select</option>
                                                                <c:forEach var="item" items="${subClassifications}">
                                                                    <option value="${item.getSid()}"> ${item.getSname()}</option>
                                                                </c:forEach>
                                                            </select>         
                                                        </div>
                                                    </div>

                                                    <div class="form-group">
                                                        <label class="col-sm-4 control-label" for="yearOfPrint">Year of Printed:</label>

                                                        <div class='input-group date' id='datepicker1' class="col-sm-5">
                                                            <input type='text' class="form-control" name="yearOfPrint" id="yearOfPrint"/>
                                                            <span class="input-group-addon">
                                                                <span class="glyphicon glyphicon-calendar"></span>
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-sm-4 control-label" for="lastPrintYear">Last Printed Year:</label>
                                                        <div class='input-group date' id='datepicker2' class="col-sm-5">
                                                            <input type='text' class="form-control" name="lastPrintYear" id="lastPrintYear"/>
                                                            <span class="input-group-addon">
                                                                <span class="glyphicon glyphicon-calendar"></span>
                                                            </span>
                                                        </div>

                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-sm-4 control-label" for="isbnNo">ISBN No:</label>
                                                        <div class="col-sm-5">
                                                            <input type="text" class="form-control" placeholder="Enter ISBN number" name="isbnNo" id="isbnNo">
                                                        </div>

                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-sm-4 control-label" for="noOfPages">No of Pages:</label>
                                                        <div class="col-sm-5">
                                                            <input type="text" class="form-control" placeholder="Enter number of pages" name="noOfPages" id="noOfPages">
                                                        </div>

                                                    </div>

                                                    <div class="form-group">
                                                        <div class="col-sm-9 col-sm-offset-4">
                                                            <button type="submit" class="btn btn-primary" name="Add" value="Add">Update</button>
                                                        </div>
                                                    </div>

                                                </form>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>

                    </div>
                </div>
            </div>
        </div>
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
        <script>

            function myFunction() {
                var y;
                $('tr').click(function () {
                    //alert($(this).data('val'));
                    y = $(this).data('val');
                    //alert(y);
                    var x = document.getElementById("bookTable").rows.namedItem(y).cells[0].innerHTML;
                    var x1 = document.getElementById("bookTable").rows.namedItem(y).cells[2].innerHTML;
                    var x2 = document.getElementById("bookTable").rows.namedItem(y).cells[4].innerHTML;
                    var x3 = document.getElementById("bookTable").rows.namedItem(y).cells[6].innerHTML;
                    var x4 = document.getElementById("bookTable").rows.namedItem(y).cells[8].innerHTML;
                    var x5 = document.getElementById("bookTable").rows.namedItem(y).cells[10].innerHTML;
                    var x6 = document.getElementById("bookTable").rows.namedItem(y).cells[12].innerHTML;
                    var x7 = document.getElementById("bookTable").rows.namedItem(y).cells[14].innerHTML;
                    var x8 = document.getElementById("bookTable").rows.namedItem(y).cells[16].innerHTML;
                    //var x = document.getElementById("myTable").rows.namedItem("myRow").cells[0].innerHTML;
                    //document.getElementById("bookId").value = y;
                    //alert(x+" "+x1+" "+x2+" "+x3+" "+x4+" "+x5+" "+x6+" "+x7+" "+x8);
                    document.getElementById("bookId").value = x;
                    document.getElementById("title").value = x1;
                    document.getElementById("author").value = x2;
                    //document.getElementById("mainClassification").value = x3;
                   // document.getElementById("subClassification").value = x4;
                    document.getElementById("yearOfPrint").value = x5;
                    document.getElementById("lastPrintYear").value = x6;
                    document.getElementById("isbnNo").value = x7;
                    document.getElementById("noOfPages").value = x8;
                    
                });

            }
        </script>

    </body>
</html>
