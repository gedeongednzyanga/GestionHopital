<%-- 
    Document   : service
    Created on : 12 août 2020, 07:02:42
    Author     : GEDEON
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>Gestion Hopital | Services</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="<c:url value="/assets/css/bootstrap.min.css"/>" />
        <link rel="stylesheet" href="<c:url value="/assets/css/bootstrap-responsive.min.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/colorpicker.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/datepicker.css"/>" />
        <link rel="stylesheet" href="<c:url value="/assets/css/uniform.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/select2.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/matrix-style.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/matrix-media.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/bootstrap-wysihtml5.css" />" />
        <link href="<c:url value="/assets/font-awesome/css/font-awesome.css" />" rel="stylesheet" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
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

    <!--close-left-menu-stats-sidebar-->

        <div id="content">
            <div id="content-header">
                <div id="breadcrumb"> <a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i>
                        Home</a> <a href="#" class="tip-bottom">Services</a> </div>
                <div class="row-fluid">
                    <div class="span4">
                        <h1>Services</h1>
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
                                     <li>Dernier entrée en Stock : 3000 produits le <time>23-06-2020 </time> </li>
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
                            <div class="widget-content"> 
                                <p>
                                    <img src="<c:url value="/assets/img/demo/patient2.jpg" />" class="img-rounded" />
                                </p>
                            </div>         
                        </div>                     
                    </div>
                    <div class="span6">
                        <div class="widget-box">
                            <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                                <h5>Détail Service</h5>
                            </div>
                            <div class="widget-content nopadding">
                                <form action="<c:url value="/Achat" />" method="POST" class="form-horizontal">
                                    <div class="control-group">
                                        <input type="hidden" name="id" id="id" value="0" />
                                        <label class="control-label">Désignation :</label>
                                        <div class="controls">
                                            <input type="text" autocomplete="off" class="span11" name="designation" value="<c:out value="${approvisionnement.quantite}" />" required="" id="designation" placeholder="Désignation" />
                                            <span style="color: red" > <c:out value="${approvForm.erreurs['quantite']}"/> </span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Détail Service :</label>
                                        <div class="controls">
                                            <textarea required="" name="detail" placeholder="Détail Service" id="detail" class="span11"></textarea>
                                             <span style="color: red" > <c:out value="${approvForm.erreurs['prix']}"/> </span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <input type="hidden" name="id" id="id" value="0" />
                                        <label class="control-label">Résponsabe :</label>
                                        <div class="controls">
                                            <input type="text" autocomplete="off" class="span11" name="responsable" value="<c:out value="${approvisionnement.quantite}" />" required="" id="responsable" placeholder="Résponsabe" />
                                            <span style="color: red" > <c:out value="${approvForm.erreurs['quantite']}"/> </span>
                                        </div>
                                    </div>
                                    <div class="form-actions">
                                        <button type="submit" class="btn btn-success btn-small" name="btn" value="btnApprovisionnement">Enregistrer</button>
                                        <button type="submit" class="btn btn-warning btn-small">Terminer</button>
                                    </div>
                                </form>
                            </div>
                        </div>                         
                    </div>                                      
                </div>
                 <div class="row-fluid">
                     <div class="spam12">
                         <div class="widget-box">
                            <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                                <h5>Liste Approvisionnements</h5>
                                <span class="label  label-info"><i class="icon icon-refresh"> </i></span>
                            </div>
                            <div class="widget-content nopadding">
                                <table class="table table-bordered data-table">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Produit</th>
                                        <th>Quantité</th>
                                        <th>Prix unitaire</th>
                                        <th>Prix Total</th>
                                        <th>Fabriqué le</th>
                                        <th>Expiré le</th>
                                        <th>Fournisseur</th>
                                        <th>Date achat</th>
                                        <th>Enregistré par</th>
                                        <th>Options</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="achats" items="${listeAchat}">
                                        <tr class="gradeX">
                                            <td> <c:out value="${achats.compteur}" /> </td>
                                            <td style="display: none"> <c:out value="${achats.id}" /> </td>
                                            <td> <c:out value="${achats.produit['designation']}" /> </td>
                                            <td> <c:out value="${achats.quantite}" /> </td>
                                            <td class="center"> <c:out value="${achats.prixAchatU}" /> </td>
                                            <td class="center"> <c:out value="${achats.quantite * achats.prixAchatU}" /> </td>
                                            <td> <c:out value="${achats.dateFabrication}" /> </td>
                                            <td> <c:out value="${achats.dateExpiration}" /> </td>
                                            <td> <c:out value="${achats.fournisseur['nom']} ${achats.fournisseur['prenom']}" /> </td>
                                            <td> <c:out value="${achats.dateApprov}" /> </td>
                                            <td> <c:out value="${achats.userSession} le ${achats.dateEnreg}" /> </td>
                                             <td class="taskOptions"><a href="#" class="tip-top" data-original-title="Update"><i class="icon-ok"></i></a> <a href="#" class="tip-top" data-original-title="Delete"><i class="icon-remove"></i></a></td>
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
        <script src="<c:url value="/assets/js/bootstrap-colorpicker.js"/>"></script>
        <script src="<c:url value="/assets/js/bootstrap-datepicker.js"/>"></script>
        <script src="<c:url value="/assets/js/jquery.toggle.buttons.js"/>"></script>
        <script src="<c:url value="/assets/js/masked.js"/>"></script>
        <script src="<c:url value="/assets/js/jquery.uniform.js"/>"></script>
        <script src="<c:url value="/assets/js/select2.min.js"/>"></script>
        <script src="<c:url value="/assets/js/matrix.js"/>"></script>
        <script src="<c:url value="/assets/js/matrix.form_common.js"/>"></script>
        <script src="<c:url value="/assets/js/wysihtml5-0.3.0.js"/>"></script>
        <script src="<c:url value="/assets/js/jquery.peity.min.js"/>"></script>
        <script src="<c:url value="/assets/js/bootstrap-wysihtml5.js"/>"></script>
       
        <script>
            $('.textarea_editor').wysihtml5();
        </script>
    </body>
</html>