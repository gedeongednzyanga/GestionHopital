<%-- 
    Document   : login
    Created on : 24 juin 2020, 13:09:31
    Author     : GEDEON
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion Hopital | Login</title>
        <link rel="icon" href="<c:url value="/assets/icon-img/favicon.ico" />">
        <link href="<c:url value="/assets/css/bootstrap.min.css" />" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="/assets/css/bootstrap-responsive.min.css"/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="/assets/css/matrix-login.css" />" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="/assets/font-awesome/css/font-awesome.css" />" rel="stylesheet" type="text/css"/>
        
    </head>
   
   <body>
    <div id="loginbox">
        <form id="loginform" class="form-vertical" action="<c:url value="/Login" />" method="POST">
            <div class="control-group normal_text">
                <h3><img src="<c:url value="/assets/icon-img/logo_medi.png" />" alt="Logo" /></h3>
            </div>
            <div class="control-group">
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_lg"><i class="icon-user"> </i></span><input type="text" value="<c:out value="${utilisateur.nomUtilisateur}" />" name="user_name" autocomplete="off" placeholder="Nom d'utilisateur" />
                   
                    </div>
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_ly"><i class="icon-lock"></i></span><input type="password" value="<c:out value="${utilisateur.motdePasse}" />" name="mot_passe" placeholder="Mot de passe" />
                        <br><span style="color: #ffffff"><c:out value="${connexionForm.resultat}" /></span>
                    </div>
                </div>
               
            </div>
            <div class="form-actions">
                <span class="pull-left"><a href="#" class="flip-link btn btn-info" id="to-recover">Mot de passe oublié ?</a></span>
                <span class="pull-right"><button type="submit" class="btn btn-success">Connexion</button></span>
            </div>
        </form>
        <form id="recoverform" action="#" class="form-vertical">
            <p class="normal_text">Entrer d'abord votre nom d'utilisateur et nous vous enverons les instructions pour retrouver votre mot de passe.</p>

            <div class="controls">
                <div class="main_input_box">
                    <span class="add-on bg_lo"><i class="icon-envelope"></i></span><input type="text" placeholder="Nom d'utilisateur" />
                </div>
            </div>

            <div class="form-actions">
                <span class="pull-left"><a href="#" class="flip-link btn btn-success" id="to-login">&laquo; Retour</a></span>
                <span class="pull-right"><a class="btn btn-info"/>Reecover</a></span>
            </div>
        </form>
    </div>

    <script src="<c:url value="/assets/js/jquery.min.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.login.js" />"></script>
</body>
</html>
