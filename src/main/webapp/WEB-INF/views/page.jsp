<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>


 


<head>
<script src="${contextRoot}/webResources/Scripts/angular.js"></script>
<meta charset="utf-8">

<meta name="format-detection" content="telephone=no">

<meta name="viewport"
	content="width=device-width, minimum-scale=1.0, maximum-scale=1.0">

<!-- <meta name="google-site-verification"
	content="-ssC5AaDwt7NokcH4-5PAzg-bEJ3hvNblisnp26puZs" />
 -->


<title>Online Pharmacy Store : ${title}</title>

<meta name="keywords"
	content="Best Online Pharmacy, Pharmacy Online, Trusted Online Pharmacy, Online Pharmacy USA, Safe Online Pharmacy, Reliable Online Pharmacy, Internet Pharmacy, Order Prescription Online, Online Pharmacy, Online Chemist, Prescription Drugs." />

<meta name="description"
	content="AllMedsDeal is a trusted leading USA online Pharmacy store ? AllMedsDeal is one of Trusted Online Pharmacy in USA. Order Prescription Online from Online Chemist." />
<link rel="canonical" href="index.html" />
<%-- <spring:url value="/webResources/css/main.css" var="mainCss" />
 	
 
 
 <spring:url value="/webResources/js/jquery.1.10.2.min.js" var="jqueryJs" />
	<spring:url value="/webResources/js/main.js" var="mainJs" />
	
	<spring:url value="/webResources/css/layout-dr.css" var="main1Css" />
	<spring:url value="/webResources/css/layout-dr-responsive.css" var="main2Css" />

	<link href="${main1Css}" rel="stylesheet" />
	<link href="${main2Css}" rel="stylesheet" />
	 --%>
    <%-- <script src="${jqueryJs}"></script>
    <script src="${mainJs}"></script> --%>
<%-- <spring:url value="/webResources" var="/webResources" /> --%>

<link href="<c:url value="/webResources/css/layout-dr.css" />" rel="stylesheet">
<link href="<c:url value="/webResources/css/layout-dr-responsive.css" />" rel="stylesheet">
<script src="<c:url value="/webResources/Scripts/script.int.dg.js" /> </script>

<script	src="<c:url value="/webResources/Scripts/jquery-3.2.1.min.js" /></script>




<style type="text/css" media="screen">
<!--
@import url("${contextRoot}/webResources/fancybox/jquery.fancybox.css");

@import url("${contextRoot}/webResources/css/fluid_dg.css");
-->
</style>

<!--[if lt IE 9]>

    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>

    <script src="http://ie7-js.googlecode.com/svn/version/2.1(beta4)/IE9.js"></script>

    <![endif]-->



<script>

	(function(i, s, o, g, r, a, m) {

		i['GoogleAnalyticsObject'] = r;

		i[r] = i[r] || function() {

			(i[r].q = i[r].q || []).push(arguments)

		}, i[r].l = 1 * new Date();

		a = s.createElement(o),

		m = s.getElementsByTagName(o)[0];

		a.async = 1;

		a.src = g;

		m.parentNode.insertBefore(a, m)

	})(window, document, 'script', '../../www.google-analytics.com/analytics.js', 'ga');



	ga('create', 'UA-57270746-1', 'auto');

	ga('send', 'pageview');
</script>

</head>



<body>
	


	<!-- #BeginLibraryItem "/Library/header.lbi" -->
<!-- navBar come here -->
<%@include file="./shared/navBar.jsp" %>



	<c:if test="${userClickHome==true}">
		<%@include file="./home.jsp" %>
	</c:if>
	<c:if test="${userClickGenric==true}">
		<%@include file="./genric.jsp" %>
	</c:if>
	
 <%-- <%@include file="./Test.jsp" %> --%> 
<%-- <%@include file="./Test2.jsp" %> --%>



	<!-- footer section come here  "./views/shared/navBar.jsp" -->
	<%@include file="./shared/footer.jsp" %>
	the value of context root is: ${contextRoot }
	<!-- #EndLibraryItem -->
	<!--footer end-->

	<script type="text/javascript">var Page='home';</script>
	<script type="text/javascript" src="${contextRoot}/webResources/Scripts/script.int.dg.js"></script>

</body>

</html>



