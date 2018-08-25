<form id="editForm" method="get" class="form-horizontal" action="GetUpdate">
                                <input type="hidden" name="type" value="update"/>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="bookId">Book ID : </label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter book ID" name="bookId" id="bookId" value="${bookIdEdit}" readonly/>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="title">Title:</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter book title" id="title" name="title" value="${titleEdit}" required>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="author">Author:</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter book author" name="author" id="author" value="${authorEdit}" required>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="mainClassificationId">Main Classification:</label>
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
                                    <label class="col-sm-4 control-label" for="subClassificationId">Sub Classification:</label>
                                    <div class="col-sm-5"> 

                                        <select name="subClassificationId" class="form-control" id="subClassificationId" value="${subId}" required>  
                                            <option value="">Select</option>
                                            <c:forEach  items="${subClassifications}" var="item">
                                                <option value="${item.getSid()}" <c:if test="${item.getSid() eq subId}" >Selected="true"</c:if>> ${item.getSname()}</option>
                                            </c:forEach>
                                        </select>         
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="yearOfPrint">Year of Printed:</label>

                                    <div class='input-group date' id='datepicker1' class="col-sm-5">
                                        <input type='text' class="form-control" name="yearOfPrint" id="yearOfPrint" value="${yearOfPrintEdit}" required/>
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="lastPrintYear">Last Printed Year:</label>
                                    <div class='input-group date' id='datepicker2' class="col-sm-5">
                                        <input type='text' class="form-control" name="lastPrintYear" id="lastPrintYear" value="${lastPrintYearEdit}" required/>
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="isbnNo">ISBN No:</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter ISBN number" name="isbnNo" id="isbnNo" value="${isbnNoEdit}" required/>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-4 control-label" for="noOfPages">No of Pages:</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" placeholder="Enter number of pages" name="noOfPages" id="noOfPages" value="${noOfPagesEdit}" min="0" pattern="[0-9]+" title="Enter + Numbers Only" required/>
                                    </div>

                                </div>

                                <div class="form-group">
                                    <div class="col-sm-9 col-sm-offset-4">
                                        <button type="submit" class="btn btn-primary" name="" value="">Update</button>
                                        
                                    </div>
                                </div>
                                    
                            </form>