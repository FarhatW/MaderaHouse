<%--
  Created by IntelliJ IDEA.
  User: Gamer
  Date: 08/01/2017
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="sec"
          uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello</title>
    <link rel="stylesheet" href="<c:url value="../resources/CSS/main.css" />" />
    <link rel="stylesheet" href="<c:url value="../resources/CSS/bootstrap.min.css" />" />
</head>
<body>
<section class="container">

    <div class="col-xs-3 col-xs-offset-2">
        <img class="img-responsive" src="logo.png">
    </div>
    <div class="col-xs-3 col-xs-offset-2">
        <p class="pull-right" style="color: #6e6356; margin-top: 60px">
            <c:if test="${pageContext.request.userPrincipal.name != null}">
            Bonjour M. ${pageContext.request.userPrincipal.name},<br/>
            <a href="javascript:formSubmit()"> Deconnexion</a>
            </c:if>
        </p>
        <c:url value="/j_spring_security_logout" var="logoutUrl" />
        <form action="${logoutUrl}" method="post" id="logoutForm">
            <input type="hidden" name="${_csrf.parameterName}"
                   value="${_csrf.token}" />
        </form>
        <script>
            function formSubmit() {
                document.getElementById("logoutForm").submit();
            }
        </script>


    </div>

    <div class="col-xs-8 col-xs-offset-2" style="margin-top:75px">
        <a href="">
            <button type="button" class="btn btn-secondary btn-lg btn-block" style="height:100px; background-color:#fff; border: 1px solid #000; box-shadow: 8px 8px 12px #aaa;">Creer un devis </button>
        </a>
    </div>

    <div class="col-xs-8 col-xs-offset-2" style="margin-top:100px">
        <a href="EditDevis.html">
            <button type="button" class="btn btn-secondary btn-lg btn-block" style="height:100px; background-color:#fff; border: 1px solid #000; box-shadow: 8px 8px 12px #aaa;">Suivre / Modifier un devis </button>
        </a>
    </div>
</section>

</body>
</html>