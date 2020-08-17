<%-- 
    Document   : fournisseur
    Created on : 6 juil. 2020, 10:16:25
    Author     : GEDEON
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion Hopital | Fournisseurs</title>
        <link rel="stylesheet" href="<c:url value="/assets/css/bootstrap.min.css" />" />
        <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="<c:url value="/assets/css/uniform.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/select2.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/matrix-style.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/matrix-media.css" />" />
        <link href="<c:url value="/assets/font-awesome/css/font-awesome.css" />" rel="stylesheet" />
    </head>
    <body>

    <!--Header-part-->
    <div id="header">
        <h1><a href="dashboard.html">Matrix Admin</a></h1>
    </div>
    <!--close-Header-part-->

    <!--top-Header-menu-->
     <div id="user-nav" class="navbar navbar-inverse">
        <ul class="nav">
            <li class="dropdown" id="profile-messages"><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i> <span
                        class="text"> <c:out value="${sessionScope.sessionUtilisateur.nom} ${sessionScope.sessionUtilisateur.prenom}" /> </span><b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="#"><i class="icon-user"></i> Mon Profil</a></li>
                    <li class="divider"></li>
                    <li><a href="#"><i class="icon-check"></i> My Tasks</a></li>
                    <li class="divider"></li>
                    <li><a href="<c:url value="/Deconnexion" />"><i class="icon-key"></i> Déconnexion</a></li>
                </ul>
            </li>
            <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Messages</span> <span
                        class="label label-important">5</span> <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a class="sAdd" title="" href="#"><i class="icon-plus"></i> Nouveau message</a></li>
                    <li class="divider"></li>
                    <li><a class="sInbox" title="" href="#"><i class="icon-envelope"></i> Boîte de reception</a></li>
                    <li class="divider"></li>
                    <li><a class="sOutbox" title="" href="#"><i class="icon-arrow-up"></i> Brouillon</a></li>
                    <li class="divider"></li>
                    <li><a class="sTrash" title="" href="#"><i class="icon-trash"></i> Messages Supprimées</a></li>
                </ul>
            </li>
            <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">Settings</span></a></li>
            <li class=""><a title="" href="<c:url value="/Deconnexion" />"><i class="icon icon-share-alt"></i> <span
                        class="text">Déconnexion</span></a></li>
        </ul>
    </div>

    <!--start-top-serch-->
    <div id="search">
        <input type="text" placeholder="Rechercher..." />
        <button type="submit" class="tip-bottom" title="Search"><i class="icon-search icon-white"></i></button>
    </div>
    <!--close-top-serch-->

    <!--sidebar-menu-->

     <div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Dashboard</a>
        <ul>
            <li class="active"><a href="<c:url value="/Acceuil" />"><i class="icon icon-home"></i> <span>Acceuil</span></a> </li>
            <li> <a href="<c:url value="/Stock" />"><i class="icon icon-signal"></i> <span>Stock</span></a> </li>
            <li> <a href="<c:url value="/Achat" />"><i class="icon icon-inbox"></i> <span>Achats</span></a> </li>
            <li><a href="<c:url value="/Sorties" />"><i class="icon icon-th"></i> <span>Sorties</span></a></li>
            <li><a href="<c:url value="/Services" />"><i class="icon icon-user"></i> <span>Services</span></a></li>
            <li><a href="<c:url value="/Fournisseur" />"><i class="icon icon-group"></i> <span>Fournisseurs</span></a></li>
 
            <li class="content"> <span>Monthly Bandwidth Transfer</span>
                <div class="progress progress-mini progress-danger active progress-striped">
                    <div style="width: 77%;" class="bar"></div>
                </div>
                <span class="percent">77%</span>
                <div class="stat">21419.94 / 14000 MB</div>
            </li>
            <li class="content"> <span>Disk Space Usage</span>
                <div class="progress progress-mini active progress-striped">
                    <div style="width: 87%;" class="bar"></div>
                </div>
                <span class="percent">87%</span>
                <div class="stat">604.44 / 4000 MB</div>
            </li>
        </ul>
    </div>
    <div id="content">
        <div id="content-header">
            <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a>
                <a href="#" class="tip-bottom">Médicaments</a>
                <a href="#" class="current">Fournisseurs</a> </div>
            <h1>Fournisseurs</h1>
        </div>
        <div class="container-fluid">
            <hr>
            <div class="row-fluid">
                <div class="span6">
                    <div class="widget-box">
                        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                            <h5>Personal-info</h5>
                        </div>
                        <div class="widget-content nopadding">
                            <form action="<c:url value="/Fournisseur" />" method="POST" class="form-horizontal">
                                <div class="control-group">
                                    <label class="control-label">Nom :</label>
                                    <div class="controls">
                                        <input type="hidden" name="id" value="0" />
                                        <input type="text" name="nom" autocomplete="off" value="<c:out value="${fournisseur.nom}" />" class="span11" placeholder="First name" />
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['nom']}" /> </span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Prénom :</label>
                                    <div class="controls">
                                        <input type="text" name="prenom" autocomplete="off" value="<c:out value="${fournisseur.prenom}" />" class="span11" placeholder="Last name" />
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['prenom']}" /> </span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Téléphone :</label>
                                    <div class="controls">
                                        <input type="text" name="telephone" autocomplete="off" value="<c:out value="${fournisseur.telephone}" />" class="span11" placeholder="Enter Phone  Number" />
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['telephone']}" /> </span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">E-mail :</label>
                                    <div class="controls">
                                        <input type="text" name="mail" autocomplete="off" value="<c:out value="${fournisseur.mail}" />" class="span11" placeholder="Enter E-mail" />
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['mail']}" /> </span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Site web :</label>
                                    <div class="controls">
                                        <input type="text" name="web" autocomplete="off" value="<c:out value="${fournisseur.siteWeb}"/>" class="span11" placeholder="Site web" />
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['web']}" /> </span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Référence :</label>
                                    <div class="controls">
                                        <input type="text"  autocomplete="off" name="maison" placeholder="Ex : nom pharmacie" class="span11" />
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Adresse :</label>
                                    <div class="controls">
                                        <textarea name="adresse"  class="span11"> <c:out value="${fournisseur.adresse}" /> </textarea>
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['adresse']}" /> </span>
                                    </div>
                                </div>
                                <div class="form-actions pull-right">
                                    <button type="submit" class="btn btn-success btn-small"><i class="icon-ok"></i>
                                        Enregistrer</button>
                                    <button type="submit" class="btn btn-info btn-small"><i class="icon-edit"></i>
                                        Modifier</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                 <div class="span6">
                     <div class="widget-box">
                         <div class="widget-title">
                             <span class="icon"> <i class="icon-user"></i> </span>
                             <h5>Infos Fournisseur</h5>
                         </div>
                         <div class="widget-content">
                             <div class="row-fluid">
                                 <div class="span5">
                                     <center>
                                         <img src="<c:url value="/assets/img/avatar.png" />" width="150" alt="Spplier Image" />
                                         <h4>Gédéon Nzyanga</h4>
                                     </center>
                                         
                                 </div>
                                 <div class="span7">
                                     <ul class="unstyled">
                                         <li>  <h3> <i class="icon-user"></i> Gédéon Nzyanga </h3></li>
                                         <li><h4><i class="icon-phone"></i> +243997235842 </h4></li>
                                         <li><h4><i class="icon-envelope"></i> gedeonnzyanga@gmail.com </h4></li>
                                         <li><h4> <i class="icon-globe"></i> <a href="">www.barbutoc.com</a> </h4></li>
                                         <li><h4> <i class="icon-twitter"></i> Gédéon Nzyanga </h4></li>
                                     </ul>
                                     
                                 </div>
                             </div>
                         </div>
                     </div>
                </div>
            </div>
            <div class="row-fluid">
                <div class="span12">
                    <div class="widget-box">
                        <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
                            <h5>Fournisseurs</h5>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Nom</th>
                                        <th>Prénom</th>
                                        <th>Téléphone</th>
                                        <th>E-mail</th>
                                        <th>Adresse</th>
                                        <th>Web</th>
                                    </tr>
                                </thead>
                                <tbody
                                    <c:forEach var="fournisseur" items="${listeFournisseur}">
                                        <tr class="gradeX">
                                            <td> <c:out value="${fournisseur.id}" /> </td>
                                            <td> <c:out value="${fournisseur.nom}" /> </td>
                                            <td> <c:out value="${fournisseur.prenom}" /> </td>
                                            <td class="center"> <c:out value="${fournisseur.telephone}" /> </td>
                                            <td class="center"> <c:out value="${fournisseur.mail}" /> </td>
                                            <td class="center"> <c:out value="${fournisseur.adresse}" /> </td>
                                            <td class="center"> <a href="<c:url value="${fournisseur.siteWeb}" />" title="<c:out value="${fournisseur.siteWeb}" />"> <c:out value="${fournisseur.siteWeb}" /></a> </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--Footer-part-->
    <div class="row-fluid">
        <div id="footer" class="span12"> 2013 &copy; Matrix Admin. Brought to you by <a href="http://themedesigner.in">Themedesigner.in</a> </div>
    </div>
    <!--end-Footer-part-->
    <script src="<c:url value="/assets/js/jquery.min.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.ui.custom.js" />"></script>
    <script src="<c:url value="/assets/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.uniform.js" />"></script>
    <script src="<c:url value="/assets/js/select2.min.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.dataTables.min.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.tables.js" />"></script>
</body>
</html>
