<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="fr">
<head>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<c:url value="../resources/CSS/style.css" />"/>
    <link rel="stylesheet" href="<c:url value="../resources/CSS/bootstrap.min.css" />"/>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.2/angular.min.js"></script>
    <!-- <script src="js/bootstrap.min.js"></script> -->
</head>
<body>
<section class="container">

    <div class="col-xs-3 col-xs-offset-2">
        <img class="img-responsive" src="logo.png">
    </div>
    <div class="col-xs-3 col-xs-offset-2">
        <p class="pull-right" style="color: #6e6356; margin-top: 60px">Bonjour ${user.getlastName()}, <br/> <a href="index.html">Déconnexion</a>
        </p>
    </div>

    <div class="input col-xs-8 col-xs-offset-2 col-sm-4 col-sm-offset-4 form-group"
         style="margin-top:25px;margin-bottom:50px">

        <p>Choix client : </p>
        <select class="form-control">
            <c:forEach var="client" items="${clients}">
                <option value="${client}">${client.getlastName()} ${client.getfirstName()}</option>
            </c:forEach>
        </select>

    </div>

    <div class="input col-xs-8 col-xs-offset-2 col-sm-4 col-sm-offset-4 form-group"
         style="margin-top:25px;margin-bottom:50px">

        <p>Editer le devis : </p>
        <select class="form-control">
            <option value="13587459">13587459</option>
            <option value="47856954">47856954</option>
            <option value="87452314">87452314</option>
            <option value="25478963">25478963</option>
        </select>

    </div>
    <div class="blocEdition">
        <div class="col-xs-12">
            <div class="col-xs-4">
                <p>Prénom</p>
                <input type="text" class="form-control" value="julien">
            </div>
            <div class="col-xs-4">
                <p> Nom</p>
                <input type="text" class="form-control" value="Caselli">
            </div>

            <div class="col-xs-4">
                <p>téléphone</p>
                <input type="text" class="form-control" value="0620805348">
            </div>

        </div>

        <div class="col-xs-12">
            <div class="col-xs-4">
                <p>Adresse</p>
                <input type="text" class="form-control" value="22 rue de la mouline">
            </div>
            <div class="col-xs-4">
                <p>Code Postal</p>
                <input type="text" class="form-control" value="33440">
            </div>
            <div class="col-xs-4">
                <p>Ville</p>
                <input type="text" class="form-control" value="Ambares-et-lagrave">
            </div>
        </div>
        <div class="col-xs-12">
            <div class="col-xs-4">
                <p>Pays</p>
                <input type="text" class="form-control" value="France">
            </div>
            <div class="col-xs-4">
                <p>Email</p>
                <input type="text" class="form-control" value="julien.caselli@gmail.com">
            </div>
            <div class="col-xs-4">
                <p>Modifier les devis</p>
                <button type="button" class="btn btn-secondary btn-lg btn-block">Modifier</button>
            </div>
        </div>
        <div class="col-xs-12">
            <div class="col-xs-4">
                <p>Etat du devis</p>
                <input type="text" class="form-control" value="en attente Commercial"
                       style="color:red; border-color:red;">
            </div>
        </div>
    </div>
</section>
</body>
</html>