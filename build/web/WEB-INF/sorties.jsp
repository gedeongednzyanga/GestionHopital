<%-- 
    Document   : stock
    Created on : 24 juin 2020, 14:35:46
    Author     : GEDEON
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <title>Gestion Hopital | Sortie Médicament</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/assets/css/bootstrap.min.css"/>" />
        <link rel="stylesheet" href="<c:url value="/assets/css/bootstrap-responsive.min.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/uniform.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/colorpicker.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/datepicker.css"/> " />
        <link rel="stylesheet" href="<c:url value="/assets/css/select2.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/matrix-style.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/matrix-media.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/bootstrap-wysihtml5.css" />" />
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
            <li> <a href="<c:url value="/Achat" />"><i class="icon icon-shopping-cart"></i> <span>Achats</span></a> </li>
            <li><a href="<c:url value="/Sorties" />"><i class="icon icon-check"></i> <span>Sorties</span></a></li>
            <li><a href="<c:url value="/Services" />"><i class="icon icon-hospital"></i> <span>Services</span></a></li>
            <li><a href="<c:url value="/Fournisseur" />"><i class="icon icon-group"></i> <span>Fournisseurs</span></a></li>
             <li><a href="<c:url value="/Utilisateurs" />"><i class="icon icon-user"></i> <span>Utilisateurs</span></a></li>
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
                <a href="#" class="current">Sorties</a> </div>
                <div class="row-fluid">
                    <div class="span4">
                        <h1>Sorties en Stock</h1>
                    </div>
                    
                </div>                  
        </div>
        <div class="container-fluid">
            <hr>
            <div class="row-fluid">
                    <div class="span6">
                        <div class="widget-box">
                            <div class="widget-title"> <span class="icon"> <i class="icon-user"></i> </span>
                              <h5>Services</h5>
                            </div>
                            <div class="widget-content"> 
                                 <form action="<c:url value="/Sorties" />" method="POST" class="">
                                    <input type="hidden" name="id" id="id" value="0" />
                                    <input type="hidden" name="utilisateur" id="utilisateur" value="<c:out value="${sessionScope.sessionUtilisateur.nom} ${sessionScope.sessionUtilisateur.prenom}" />" />
                                    <div class="row-fluid">
                                        <div class="span7">
                                            <div class="control-group">
                                                <label class="control-label"><b>Service</b></label>
                                                <div class="controls">
                                                    <select  name="service" id="service" required="" class="span11">
                                                        <c:forEach var="service" items="${services}">
                                                            <option value="<c:out value="${service.id}" />"> <c:out value="${service.designation}" /> </option>
                                                        </c:forEach>
                                                    </select>
                                                </div> 
                                            </div>
                                        </div>
                                        <div class="span5">
                                            <div class="control-group">
                                                <label class="control-label"><b>Date Sorties</b></label>
                                                <div class="controls">
                                                    <input type="date" name="datesorties" id="datesorties" required="" data-date="01-02-2013" data-date-format="dd-mm-yyyy" value="01-02-2013" class="datepicker span11">
                                                </div>
                                            </div>
                                            <div class="pull-left">
                                                <button type="submit" class="btn btn-success btn-small" name="factureRec" value="btnSave">Enregistrer</button>
                                                <button type="submit" name="factureRec" class="btn btn-info btn-small">Modifier</button>
                                            </div>
                                        </div>
                                    </div>    
                                </form>
                            </div>         
                        </div>
                         <div class="widget-box">
                            <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                                <h5>Détail Sortie/Ajouter Produit</h5>
                            </div>
                            <div class="widget-content nopadding">
                                <form action="<c:url value="/Sorties" />" method="POST" class="form-horizontal">
                                    <div class="control-group">
                                        <input type="hidden" name="id" id="id" value="0" />
                                        <input type="hidden" name="serviceid" value="<c:out value="${sessionScope.sessionService.id}" />" />
                                        <label class="control-label" for="souscategorie">Produit :</label>
                                        <div class="controls">
                                            <select id="produit" class="span11" name="produit" required="">
                                                <c:forEach var="produit" items="${listeProduit}">
                                                    <option value="<c:out value="${produit.id}" />"> <c:out value="${produit.designation} ${produit.dosage} (${produit.sousCategorie['designation']})" /> 
                                                    </option>                                                                                                           
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="designation">Quantité :</label>
                                        <div class="controls">
                                            <input type="number" required="" class="span11" id="quantite" value="<c:out value="${sortiess.quantite}" />" name="quantite" autocomplete="off" placeholder="Quantité" />
                                            <br><span style="color: red"><c:out value="${sortieSForm.erreurs['quantite']}" /></span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="stockAlert">Reste Stock :</label>
                                        <div class="controls">
                                            <input type="number" readonly="" class="span11" value="<c:out default="0" value="${produit.stockAlert}" />" id="stockAlert" autocomplete="off" name="stockAlert" placeholder="Stock Alert" />
                                            <br><span style="color: red"><c:out value="${produitForm.erreurs['stockAlert']}" /></span>
                                        </div>
                                    </div>
                                    <div class="form-actions ">
                                        <button type="submit" name="btnSaveSS" value="saveSS" class="btn btn-success btn-small"><i class="icon-ok"></i> Ajouter</button> 
                                        <button type="submit" name="btnSave" value="update" class="btn btn-info btn-small"><i class="icon-edit"></i> Modifier</button>
                                        <a href="<c:url value="/Terminer" />" class="btn btn-warning btn-small"><i class="icon-edit"></i> Terminer</a>
                                    </div>
                                </form>
                            </div>
                        </div>              
                    </div>
                   <div class="span6">
                       <div style="height: 37.5em; overflow-y: scroll;">
                           <div class="widget-box">
                             <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
                                 <h5>Panier du Service : <c:out value="${sessionScope.sessionService.designation}" /> </h5>
                                  <a href="<c:url value="/Facture" />" class="btn btn-success btn-small pull-right">Facture</a>
                             </div>
                             <div class="widget-content nopadding">
                                 <table class="table table-bordered table-striped">
                                     <thead>
                                         <tr>
                                             <th>#</th>
                                             <th style="display: none;">Compteur</th>
                                             <th>Désignation</th>
                                             <th>Quantité</th>
                                             <th>Prix Unitaire</th>
                                             <th>Prix Total</th>
                                             <th>Action</th>
                                         </tr>
                                     </thead>
                                     <tbody>
                                         <c:forEach var="panierService" items="${panierService}">
                                             <tr>
                                                 <td> <c:out value="${panierService.compt}" /> </td>
                                                 <td style="display: none;"> <c:out value="${panierService.id}" /> </td>
                                                 <td> <c:out value="${panierService.produit['designation']} ${panierService.produit['dosage']}" /> </td>
                                                 <td> <c:out value="${panierService.quantite}" /> </td>
                                                 <td> <c:out value="${panierService.prixVenteU}" /> </td>
                                                 <td> <c:out value="${panierService.prixVenteU * panierService.quantite}" /> </td>
                                                 <td class="taskOptions">      
                                                    <a href="<c:url value="/Sorties?id=${panierService.id}&produit=${panierService.produit['id']}&quantite=${panierService.quantite}&serviceid=${sessionScope.sessionService.id}" />" class="tip-top" data-original-title="Supprimer"><i class="icon-remove"></i></a>
                                                </td>
                                             </tr>
                                         </c:forEach>
                                         <tr>
                                             <td>#</td>
                                             <td colspan="4"> <b>Total à payer</b> </td>
                                             <td colspan="2"><b>12900</b></td>
                                         </tr>
                                     </tbody>
                                 </table>
                             </div>
                         </div>
                       </div>
                     </div>                                  
                </div>
            <div class="row-fluid">
                <div class="span12">
                    <div class="widget-box">
                        <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
                            <h5>Liste Médicaments</h5>
                            <span class="label  label-info"><i class="icon icon-refresh"> </i></span>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table" id="table_produit">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th style="display:none">Id</th>
                                        <th>Facture</th>
                                        <th>Service</th>
                                        <th>Médicament</th>
                                        <th>Quantité</th>
                                        <th>Prix Unitaire</th>
                                        <th>Prix Total</th>
                                        <th>Date Sortie</th>
                                        <th>Date Enreg.</th>
                                        <th>Eneg./Modif. par</th>
                                       
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="sortie" items="${sortieStock}" >
                                        <tr class="gradeX">
                                            <td> <c:out value="${sortie.compt}" /> </td>
                                            <td style="display:none"> <c:out value="${sortie.id}" /> </td>
                                            <td> <a href="<c:url value="/Facture?facture=${sortie.facture}&ds=${sortie.dateSortie}&de=${sortie.dateenreg}&s=${sortie.service['designation']}" />"><c:out value="${sortie.facture}" /></a> </td>
                                            <td> <c:out value="${sortie.service['designation']}" /> </td>
                                            <td> <c:out value="${sortie.produit['designation']}" /> </td>
                                            <td><c:out value="${sortie.quantite}" /></td>
                                            <td> <c:out value="${sortie.prixVenteU}" /> </td>
                                            <td> <c:out value="${sortie.prixtotal}" /> </td>
                                            <td> <c:out value="${sortie.dateSortie}" /> </td>
                                            <td> <c:out value="${sortie.dateenreg}" /> </td> 
                                            <td> <c:out value="${sortie.usersession}" /> </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
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
    <script src="<c:url value="/assets/js/jquery.ui.custom.js"/>"></script>
    <script src="<c:url value="/assets/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/assets/js/jquery.uniform.js"/>"></script>
    <script src="<c:url value="/assets/js/select2.min.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.dataTables.min.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.tables.js" />"></script>
    <script src="<c:url value="/assets/js/monScript.js" />"></script>
</body>
</html>
