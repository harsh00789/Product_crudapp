<html>
<head>
<%@include file="base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>

<body>
<div class="container  mt-3">
<div class="row">
<div class="col-md-20">
<h1 class="text-center md-3">Welcome to Product App</h1>

<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">S.No</th>
      <th scope="col">Product Name</th>
      <th scope="col">Product Description</th>
      <th scope="col">Product Price</th>
      <th scope="col" style="width: 120px">Action</th>
    </tr>
  </thead>
  <tbody>
 <c:forEach items="${product }" var="p">
    <tr>
      <th scope="row">${p.id}</th>
      <td>${p.name }</td>
      <td>${p.description }</td>
      <td> &#x20B9;${p.price }</td>
       <td><a class="btn" href="delete/${p.id}"><i class="fas fa-trash text-danger" style="font-size: 25px"></i></a>
        <a class="btn" href="update/${p.id}"><i class="fas fa-pencil-alt"></i></a></td>
    </tr>
    
    </c:forEach>
  </tbody>
</table>

<div class="container text-center">
<a href="addProduct" class="  mt-3 btn btn-outline-success">Add Product</a>

</div>


</div>
</div>
</div>


</body>
</html>
