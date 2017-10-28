<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- /*following  Script is not loading */ -->
<script src="${contextRoot}/webResources/Scripts/angular.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-app="myApp">
<div class="pro-w" ng-controller="theController">
<script >
var app=angular.module('myApp',[]);
app.controller('theController',["$scope","$window","$http",function($scope,$window,$http){
	$scope.ProductList=function(){
		$window.alert("Succefully tested");
	/* Script is not working */
	/*  $http({
		url:"/Medicose/en/ctlCat/read",
		method:"get",
		params:{}
	}).then(function(result){
		$scope.llist=result.data;
	$window.alert("Succefull : "+result.status+" , Data is"+result.data)},
			function(result){$window.alert("Failure")}); */ 
	}
}]);
</script>
									<div  >
										<table>
										<tr ng-repeat="product in result">
											<td>{{product.catId}}</td>
										</tr>
										</table>
									</div>
									<c:forEach begin="1" end="6" var="i">
									
									<div  class="pro-cnt">

										<p class="fs15 blue">
											<a href="Apcalis-tadalafil-jelly.html"
												title="Apcalis Oral Jelly">Apcalis Oral Jelly</a>
										</p>

										<p class="fs12 weight300 gray3 lht-16 pt8 h30">
${i}
											Manufactured by: ${Name}<br>
											category Id :${result[i].catId}, Category Name:${result[i].catName} <br>
											
											<!-- for list Allread() method-->
											<%-- 
											category Id : Category Name <br>
											<c:forEach var="i" begin="0" end="6">
											<c:out value="${result[i].catId}" />, 
											<c:out value="${result[i].catName}"/><br>
											</c:forEach> --%>
											

										</p>

										
										<p class="btn1 mt15">
											<button ng-click="ProductList()">Click Here</button>
										</p>

									</div>
									
									</c:forEach>


								</div>
</body>
</html>