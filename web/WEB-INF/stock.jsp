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
         <title>Gestion Hopital | Stock Médicament</title>
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
                        class="text">Welcome User</span><b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="#"><i class="icon-user"></i> My Profile</a></li>
                    <li class="divider"></li>
                    <li><a href="#"><i class="icon-check"></i> My Tasks</a></li>
                    <li class="divider"></li>
                    <li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
                </ul>
            </li>
            <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Messages</span> <span
                        class="label label-important">5</span> <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a class="sAdd" title="" href="#"><i class="icon-plus"></i> new message</a></li>
                    <li class="divider"></li>
                    <li><a class="sInbox" title="" href="#"><i class="icon-envelope"></i> inbox</a></li>
                    <li class="divider"></li>
                    <li><a class="sOutbox" title="" href="#"><i class="icon-arrow-up"></i> outbox</a></li>
                    <li class="divider"></li>
                    <li><a class="sTrash" title="" href="#"><i class="icon-trash"></i> trash</a></li>
                </ul>
            </li>
            <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">Settings</span></a></li>
            <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span
                        class="text">Logout</span></a></li>
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
               <li class="active"><a href="index.html"><i class="icon icon-home"></i> <span>Dashboard</span></a> </li>
               <li class="submenu"> <a href="#"><i class="icon icon-medkit"></i> <span>Médicaments</span> <span
                           class="label label-important">4</span></a>
                   <ul>
                       <li><a href="<c:url value="/Stock" />">Stock</a></li>
                       <li><a href="<c:url value="/Achat" />">Achats</a></li>
                       <li><a href="<c:url value="/Sorties" />">Sorties</a></li>
                       <li><a href="<c:url value="/Fournisseur" />">Fournisseurs</a></li>
                   </ul>
               </li>
               <li class="submenu"> <a href="#"><i class="icon icon-user"></i> <span>Malades</span> <span class="label label-important">4</span></a>
                   <ul>
                       <li><a href="<c:url value="/Patient" />">Nouveau Malade</a></li>
                       <li><a href="achat.html">Malade Interné</a></li>
                       <li><a href="sortie.html">Sorties</a></li>
                       <li><a href="fournisseur.html">Fournisseurs</a></li>
                   </ul>
               </li>
               <li> <a href="charts.html"><i class="icon icon-signal"></i> <span>Charts &amp; graphs</span></a> </li>
               <li> <a href="widgets.html"><i class="icon icon-inbox"></i> <span>Widgets</span></a> </li>
               <li><a href="tables.html"><i class="icon icon-th"></i> <span>Tables</span></a></li>
               <li><a href="grid.html"><i class="icon icon-fullscreen"></i> <span>Full width</span></a></li>
               <li class="submenu"> <a href="#"><i class="icon icon-th-list"></i> <span>Forms</span> <span
                           class="label label-important">3</span></a>
                   <ul>
                       <li><a href="form-common.html">Basic Form</a></li>
                       <li><a href="form-validation.html">Form with Validation</a></li>
                       <li><a href="form-wizard.html">Form with Wizard</a></li>
                   </ul>
               </li>
               <li><a href="buttons.html"><i class="icon icon-tint"></i> <span>Buttons &amp; icons</span></a></li>
               <li><a href="interface.html"><i class="icon icon-pencil"></i> <span>Eelements</span></a></li>
               <li class="submenu"> <a href="#"><i class="icon icon-file"></i> <span>Addons</span> <span
                           class="label label-important">5</span></a>
                   <ul>
                       <li><a href="index2.html">Dashboard2</a></li>
                       <li><a href="gallery.html">Gallery</a></li>
                       <li><a href="calendar.html">Calendar</a></li>
                       <li><a href="invoice.html">Invoice</a></li>
                       <li><a href="chat.html">Chat option</a></li>
                   </ul>
               </li>
               <li class="submenu"> <a href="#"><i class="icon icon-info-sign"></i> <span>Error</span> <span
                           class="label label-important">4</span></a>
                   <ul>
                       <li><a href="error403.html">Error 403</a></li>
                       <li><a href="error404.html">Error 404</a></li>
                       <li><a href="error405.html">Error 405</a></li>
                       <li><a href="error500.html">Error 500</a></li>
                   </ul>
               </li>
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
                <a href="#" class="current">Stock</a> </div>
                <div class="row-fluid">
                    <div class="span4">
                        <h1>Stock</h1>
                    </div>
                    <div class="span8">
                        <div class="row-fluid">
                            <div class="span4">
                                <div class="list-header">
                                    <ul class="unstyled">
                                        <li>Alert Stock : <span class="badge badge-important">200 Produits</span> </li>
                                        <li>Produit envoi d'expiration : <span class="badge badge-warning">230 Produits</span></li>
                                        <li>Produits expirés : <span class="badge badge-inverse">200 Produits</span></li>
                                    </ul>
                                </div>
                            </div>
                             <div class="span8">
                                 <div class="list-header">
                                     <span>Produits <span class="btn btn-mini btn-success" >Fiche de Stock</span> <br></span>
                                     <li>Dernier entrée en Stock : <c:out value="${approvisionnement.quantite}" /> produits le <time><c:out value="${approvisionnement.date}" /> </time> </li>
                                    <li>Dernier sortie en Stock : 240 produits le <time>23-06-2020 </time></li>
    
                                 </div>
                                 
                            </div>
                        </div>
                    </div>
                </div>
        </div>
        <div class="container-fluid">
            <hr>
            <div class="row-fluid">
                <div class="span6">
                    <div class="widget-box">
                        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                            <h5>Nouveau Produit</h5>
                        </div>
                        <div class="widget-content nopadding">
                            <form action="<c:url value="/Stock" />" method="POST" class="form-horizontal">
                                <div class="control-group">
                                    <label class="control-label" for="designation">Désignation :</label>
                                    <div class="controls">
                                        <input type="hidden" name="id" id="id" value="0" />
                                        <input type="hidden" name="utilisateur" value="<c:out value="${sessionScope.sessionUtilisateur.nom} ${sessionScope.sessionUtilisateur.prenom}" />" />
                                        <input type="text" class="span11" id="designation" value="<c:out value="${produit.designation}" />" name="designation" autocomplete="off" placeholder="Désignation Produit" />
                                        <br><span style="color: red"><c:out value="${produitForm.erreurs['designation']}" /></span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="dosage">Dosage :</label>
                                    <div class="controls">
                                        <input type="text" class="span11" id="dosage" value="<c:out value="${produit.dosage}" />" autocomplete="off" name="dosage" placeholder="Dosage Produit" />
                                        <br><span style="color: red"><c:out value="${produitForm.erreurs['dosage']}" /></span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="prixVenteU">P.V Unitaire :</label>
                                    <div class="controls">
                                        <div class="input-append">
                                            <input type="number" placeholder="5.000" value="<c:out default="0.0" value="${produit.prixVenteU}" />" id="prixVenteU" name="prixVenteU" class="span11" />
                                            <span class="add-on">Fc</span> 
                                        </div>
                                        <br> <span style="color:red"><c:out value="${produitForm.erreurs['prixVenteU']}" /></span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="stockAlert">Stock d'Alerte :</label>
                                    <div class="controls">
                                        <input type="number" class="span11" value="<c:out default="0" value="${produit.stockAlert}" />" id="stockAlert" autocomplete="off" name="stockAlert" placeholder="Stock Alert" />
                                        <br><span style="color: red"><c:out value="${produitForm.erreurs['stockAlert']}" /></span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="souscategorie">Type de Produit :</label>
                                    <div class="controls">
                                        <select id="souscategorie" name="souscategorie" required="">
                                            <c:forEach var="souscategorie" items="${listeSousCategorie}">
                                               
                                                <option value="<c:out value="${souscategorie.id}" />"> <c:out value="${souscategorie.designation}" /> 
                                                    (<c:out value="${souscategorie.categorie['designation']}" /> ) </option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-actions ">
                                    <button type="submit" name="btnSave" value="save" class="btn btn-success"><i class="icon-ok"></i> Enregistrer</button> 
                                    <button type="submit" name="btnSave" value="update" class="btn btn-info"><i class="icon-edit"></i> Modifier</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="span6">
                    <div class="widget-box">
                        <div class="widget-title">
                          <ul class="nav nav-tabs">
                            <li class="active"><a data-toggle="tab" href="#tab1">Produit</a></li>
                            <li><a data-toggle="tab" href="#tab2">Catégorie</a></li>
                            <li><a data-toggle="tab" href="#tab3">Sous-Catégorie</a></li>
                          </ul>
                        </div>
                        <div class="widget-content tab-content">
                            <div id="tab1" class="tab-pane active">
                                <div style="height: 290px">
                                    <p>And is full of waffle to It has multiple paragraphs and is full of waffle to pad out the comment. Usually, you just wish these sorts of comments would come to an end.multiple paragraphs and is full of waffle to pad out
                                        the comment.And is full of waffle to It has multiple paragraphs and is full of waffle to pad out the comment. 
                                    </p>
                                    <img src="<c:url value="/assets/img/demo/1.jpg" />" alt="demo-image" />
                                </div>
                            </div>
                            <div id="tab2" class="tab-pane">
                                <div style="height: 290px">
                                    <form action="<c:url value="/Categories" />" method="POST" class="form-horizontal"> 
                                        <div class="control-group">
                                            <label class="control-label" for="designationc">Catégorie :</label>
                                            <div class="controls">
                                                <input type="hidden" name="id" id="idc" value="0" />
                                                <input type="text" class="span11" value="<c:out value="${Categorie.designation}" />" autocomplete="off" id="designationc" name="designation" placeholder="Désignation Catégorie" />             
                                                <br><span style="color: red"><c:out value="${CategorieForm.erreurs['designation']}" /></span>
                                            </div>
                                        </div>
                                        <div class="control-group">
                                            <div class="controls">
                                                <button type="submit" name="btnSave" value="save" class="btn btn-success btn-small">Enregistrer</button>   
                                                <button type="submit" name="btnSave" value="update" class="btn btn-info btn-small">Modifier</button>  
                                                <button type="button" data-target="#myModal" data-toggle="modal" class="btn btn-warning btn-small">Voir Plus</button>  
                                            </div>
                                        </div>                             
                                    </form>  
                                    <div class="widget-box">  
                                        <div class="widget-content nopadding">
                                            <table class="table table-striped table-bordered" id="table_categories2">
                                                <thead>
                                                    <tr>
                                                        <th>#</th>
                                                        <th class="identify">Id</th>
                                                        <th>Désignation</th>
                                                        <th>Statut</th>
                                                        <th>Options</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach var="categorie" begin="0" end="3" step="1" items="${listeCategorie}">
                                                        <tr>
                                                            <td> <c:out value="${categorie.compteur}" /> </td>
                                                            <td class="identify"> <c:out value="${categorie.id}" /> </td>
                                                            <td><c:out value="${categorie.designation}" /> </td>
                                                            <td class="taskStatus"><span class="done">Ok</span></td>
                                                            <td class="taskOptions"><a href="#" class="tip-top" onclick="returnDataCategorie2()" data-original-title="Update"><i class="icon-ok"></i></a> 
                                                                <a href="<c:url value="/Categories?id=${categorie.id}" />" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a>
                                                            </td>
                                                        </tr>
                                                    </c:forEach>                 
                                                </tbody> 
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div id="tab3" class="tab-pane">
                                <div style="height: 290px">
                                    <form action="<c:url value="/SousCategories" />" method="POST" class="form-horizontal">
                                      <div class="control-group">
                                          <label class="control-label" for="desigation">Sous-Catégorie :</label>
                                          <div class="controls">
                                              <input type="hidden" name="idcat" id="idcat" value="0" />
                                              <input type="text" class="span11" id="designationsc" autocomplete="off" value="<c:out value="${souscategorie.designation}"/>" name="designation" placeholder="Désignation Sous-Catégorie" /><br>
                                              <span style="color: red"> <c:out value="${sousCategorieForm.erreurs['designation']}" /> </span>
                                          </div>
                                      </div>
                                        <div class="control-group">
                                            <label class="control-label" for="type">Catégorie : </label>
                                            <div class="controls" id="type" name="type">
                                                <select name="categorie" id="categorie">
                                                    <c:forEach var="categorie" items="${listeCategorie}">
                                                        <option value="<c:out value="${categorie.id}"/> "> <c:out value="${categorie.designation}" /> </option>
                                                    </c:forEach>
                                                </select><br>
                                                <span style="color: red"> <c:out value="${sousCategorieForm.erreurs['categorie']}" /> </span>
                                            </div>
                                        </div>
                                        <div class="control-group">
                                            <div class="controls">
                                                <button type="submit" name="btnSave" value="save" class="btn btn-success btn-small">Enregistrer</button>
                                                <button type="submit" name="btnSave" value="update" class="btn btn-info btn-small">Modifier</button>
                                                <button type="button" data-target="#myModal2" data-toggle="modal" class="btn btn-warning btn-small">Voir Plus</button> 
                                            </div>
                                        </div>                             
                                    </form>
                                    <div class="widget-box">                   
                                        <div class="widget-content nopadding">
                                            <table class="table table-striped table-bordered" id="table_scategories">
                                                <thead>
                                                  <tr>
                                                    <th>#</th>
                                                    <th class="identify">Id</th>
                                                    <th>Catégorie</th>
                                                    <th>Sous-Catégorie</th>
                                                    <th>Opts</th>
                                                  </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach var="souscategorie" begin="0" end="1" step="1" items="${listeSousCategorie}">
                                                        <tr>
                                                            <td> <c:out value="${souscategorie.compteur}" /> </td>
                                                            <td class="identify"> <c:out value="${souscategorie.id}" /> </td>
                                                            <td class="taskDesc"><c:out value="${souscategorie.categorie['designation']}" /> </td>
                                                            <td class="taskStatus"><span class="in-progress"><c:out value="${souscategorie.designation}" /></span></td>
                                                            <td class="taskOptions"><a href="#" class="tip-top" onclick="returnDataSoucategorie()" data-original-title="Update"><i class="icon-ok"></i></a> 
                                                                <a href="<c:url value="/SousCategories?id=${souscategorie.id}" />" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a>
                                                            </td>
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
                    <div id="myModal" class="modal fade">
                        <div class="modal-header">
                          <button data-dismiss="modal" class="close" type="button">×</button>
                          <h3>Catégories</h3>
                        </div>
                        <div class="modal-body">
                            <div class="row-fluid">
                                <div class="spam12">
                                    <table class="table table-striped table-bordered" id="table_categories">
                                        <thead>
                                            <tr>
                                                <th>#</th>
                                                <th class="identify">Id</th>
                                                <th>Désignation</th>
                                                <th>Statut</th>
                                                <th>Options</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="categorie" items="${listeCategorie}">
                                                <tr>
                                                    <td> <c:out value="${categorie.compteur}" /> </td>
                                                    <td class="identify"> <c:out value="${categorie.id}" /> </td>
                                                    <td><c:out value="${categorie.designation}" /></td>
                                                    <td class="taskStatus"><span class="done">Ok</span></td>
                                                    <td class="taskOptions"><a  class="tip-top" data-dismiss="modal" onclick="returnDataCategorie()" data-original-title="Update"><i class="icon-ok"></i></a> 
                                                        <a href="<c:url value="/Categories?id=${categorie.id}" />" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a>
                                                    </td>
                                                </tr>
                                            </c:forEach>                 
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div id="myModal2" class="modal fade">
                        <div class="modal-header">
                            <button data-dismiss="modal" class="close" type="button">×</button>
                            <h3>Sous-Catégories</h3>
                        </div>
                        <div class="modal-body">
                            <div class="row-fluid">
                                <div class="spam12">
                                    <table class="table table-striped table-bordered" id="table_scategories2">
                                        <thead>
                                          <tr>
                                              <th class="identify">#</th>
                                            <th>Id</th>
                                            <th>Catégorie</th>
                                            <th>Sous-Catégorie</th>
                                            <th>Opts</th>
                                          </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="souscategorie"  items="${listeSousCategorie}">
                                                <tr>
                                                    <td> <c:out value="${souscategorie.compteur}" /> </td>
                                                    <td class="identify"> <c:out value="${souscategorie.id}" /> </td>
                                                    <td class="taskDesc"><c:out value="${souscategorie.categorie['designation']}" /> </td>
                                                    <td class="taskStatus"><span class="in-progress"><c:out value="${souscategorie.designation}" /></span></td>
                                                    <td class="taskOptions"><a href="#" class="tip-top" data-dismiss="modal" onclick="returnDataSoucategorie2()" data-original-title="Update"><i class="icon-ok"></i></a> 
                                                        <a href="<c:url value="/SousCategories?id=${souscategorie.id}" />" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a>
                                                    </td>
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
                                        <th>Désignation</th>
                                        <th>Dosage</th>
                                        <th>Forme</th>
                                        <th>Catégorie</th>
                                        <th>Stock Alert</th>
                                        <th>En Stock</th>
                                        <th>Prix U. vente</th>
                                        <th>Valeur en Stock</th>
                                        <th>Eneg./Modif. par</th>
                                        <th>Actions</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="produit" items="${listeProduit}" >
                                        <tr class="gradeX">
                                            <td> <c:out value="${produit.compteur}" /> </td>
                                            <td style="display:none"> <c:out value="${produit.id}" /> </td>
                                            <td> <c:out value="${produit.designation}" /> </td>
                                            <td><c:out value="${produit.dosage}" /></td>
                                            <td> <c:out value="${produit.sousCategorie['designation']}" /> </td>
                                            <td> <c:out value="${produit.categorie['designation']}" /> </td>
                                            <td> <c:out value="${produit.stockAlert}" /> </td>
                                            <td> <c:out value="${produit.stock}" /> </td>
                                            <td class="center"> <c:out value="${produit.prixVenteU}" /> </td>
                                            <td> <c:out value="${produit.prixVenteT}" /> </td>
                                            <td> <c:out value="${produit.utilisateur}" /> </td>
                                            <td class="taskOptions">
                                                <a href="#" class="tip-top" onclick="retunDataProduct()" data-original-title="Modifier"><i class="icon-ok"></i></a> 
                                                <a href="<c:url value="/Stock?id=${produit.id}" />" class="tip-top" data-original-title="Supprimer"><i class="icon-remove"></i></a>
                                            </td>
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
