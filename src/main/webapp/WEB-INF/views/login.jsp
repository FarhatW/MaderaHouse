<%--
  Created by IntelliJ IDEA.
  User: Gamer
  Date: 11/01/2017
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
        <title>Login</title>
        <!-- Material Design fonts -->
        <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700">
        <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/icon?family=Material+Icons">

        <link rel="stylesheet" href="<c:url value="../resources/CSS/main.css" />" />
        <link rel="stylesheet" href="<c:url value="../resources/CSS/style.css" />" />
        <link rel="stylesheet" href="<c:url value="../resources/CSS/bootstrap.min.css" />" />

        <script src="<c:url value="../resources/js/jquery-3.1.1.min.js" />" ></script>

    <script>
        $.material.init();
    </script>

    </head>
    <body>
    <header style="height: 200px; background-color: #6e6356">
        <h1 style="color: #fff; padding-top:150px; margin:0" class="text-center">MADERA</h1>
    </header>
    <section class="container">

        <p class="text-center" style="color: #6e6356; margin: 25px 0">Création de devis pour maison modulaire</p>

        <form name='loginForm'
              action="<c:url value='/j_spring_security_check' />" method='POST'>
            <div class="input col-xs-8 col-xs-offset-2 col-sm-4 col-sm-offset-4 form-group" style="margin-top:25px">

                <div class="form-group">
                <p>Identifiant : </p>
                <input type="email" class="form-control" id=mail" placeholder="<spring:message code='label.mail'/>" name='mail' style="width:100%">
                </div>

                <div class="form-group">
                <p style="margin-top:20px">Mot de passe  : </p>
                    <input type="password" class="form-control" name='mpd' id="mpd"
                           placeholder="<spring:message code='label.mpd'/>" style="width:100%">

                </div>
                <c:if test="${not empty error}">
                    <div class="alert alert-warning">${error}</div>
                </c:if>
                <c:if test="${not empty msg}">
                    <div class="alert alert-info">${msg}</div>
                </c:if>
                <button type="submit" class="pull-right btn connexion" style="margin-top : 20px;" id="submit"><spring:message
                        code='btn.connect'/></button>
            </div>

            <div>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            </div>
        </form>
    </section>
    </body>
</html>
