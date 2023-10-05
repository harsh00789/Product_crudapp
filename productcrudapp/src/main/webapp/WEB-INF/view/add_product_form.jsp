<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<%@include file="base.jsp" %>

</head>
<body>

<div class="container">
<div class="row">
<div class="col-md-6 offset-md-3">

<h1 class="text-center mb-3">Fill the Product detail</h1>

<form action="handle-product" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Product Name</label>
    <input type="text " class="form-control" id="name" name="name" aria-describedby="emailHelp" placeholder="Enter product name">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Product Description</label>
    <textarea  class="form-control" rows="5" id="description"  name="description" placeholder="enter description here..."></textarea>
  </div>
  
   <div class="form-group">
    <label for="exampleInputPassword1">Product Price</label>
    <input  class="form-control" rows="5" id="price" name="price" placeholder="enter price here...">
  </div>
  
  
  <div class="text-center mt-3">
  <a href="${pageContext.request.contextPath}" class="btn btn-outline-danger mr-2">back</a>
  <button type="submit" class="btn btn-outline-success ml-2">Add Product</button>

  </div>
  
</form>

</div>

</div>


</div>


</body>
</html>