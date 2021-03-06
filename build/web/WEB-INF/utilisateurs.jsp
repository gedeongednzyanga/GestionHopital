<%-- 
    Document   : utilisateurs
    Created on : 27 août 2020, 16:40:44
    Author     : GEDEON
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <title>Gestion Hopital | Users</title>
        <link rel="icon" href="<c:url value="/assets/icon-img/favicon.ico" />">
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

    <!--close-left-menu-stats-sidebar-->

        <div id="content">
            <div id="content-header">
                <div id="breadcrumb"> <a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i>
                        Home</a> <a href="#" class="tip-bottom">Utilisateurs</a> </div>
                <div class="row-fluid">
                    <div class="span12">
                        <h1>Utilisateurs</h1>
                    </div>
                    
                </div>
            </div>
            <div class="container-fluid">
                <hr>
                <div class="row-fluid">                   
                    <div class="span6">
                        <div class="widget-box">
                            <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                                <h5>Utilisateur</h5>
                            </div>
                            <div class="widget-content nopadding">
                                <form action="<c:url value="/Utilisateurs" />" method="POST" class="form-horizontal">
                                    <div class="control-group">
                                        <input type="hidden" name="id" id="id" value="0" />
                                        <label class="control-label"> Compte :</label>
                                        <div class="controls">
                                            <select name="compte" class="span11"> 
                                                <option value="Administrateur"> Administrateur </option>
                                                <option value="Administrateur"> Utilisateur </option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Nom :</label>
                                        <div class="controls">
                                            <input type="text" autocomplete="off" class="span11" name="nom" value="<c:out value="${user.nom}" />" required="" id="nom" placeholder="Nom" />
                                            <br><span style="color: red" > <c:out value="${userform.erreurs['nom']}"/> </span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Prénom :</label>
                                        <div class="controls">
                                            <input type="text" autocomplete="off" class="span11" name="prenom" value="<c:out value="${user.prenom}" />" required="" id="prenom" placeholder="Prénom" />
                                            <br><span style="color: red" > <c:out value="${userform.erreurs['prenom']}"/> </span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Nom d'utilisateur :</label>
                                        <div class="controls">
                                            <input type="text" autocomplete="off" class="span11" name="username" value="<c:out value="${user.nomUtilisateur}" />" required="" id="username" placeholder="Nom d'utilisateur" />
                                            <br><span style="color: red" > <c:out value="${userform.erreurs['username']}"/> </span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Mot de passe :</label>
                                        <div class="controls">
                                            <input type="password" autocomplete="off" class="span11" name="motpass" value="<c:out value="${user.motdePasse}" />" required="" id="motpass" placeholder="Mot de passe" />
                                            <br><span style="color: red" > <c:out value="${userform.erreurs['motpass']}"/> </span>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Profil Utilisateur :</label>
                                        <div class="controls">
                                          <input type="file" />
                                        </div>
                                    </div>
                                     <div class="form-actions">
                                        <button type="submit" class="btn btn-success btn-small" name="btnSave" value="save">Enregistrer</button>
                                        <button type="submit" name="btnSave" value="update" class="btn btn-info btn-small">Modifier</button>
                                        <span class="${empty userform.erreurs ? 'successok' : 'erreur'}">
                                            ${userform.resultat}
                                        </span>
                                    </div>
                                 </form>
                            </div>
                        </div>                         
                    </div> 
                    <div class="span6">
                        <div class="widget-box">
                            <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                                <h5>Autorisations</h5>
                            </div>
                            <div class="widget-content nopadding">
                                <form action="<c:url value="/Utilisateurs" />" method="POST" class="form-horizontal">
                                    <div class="control-group">
                                        <img src="<c:url value="/assets/img/avatar.png" />" id="profil" />
                                        <div class="controls" id="identite">
                                            <label id="noms"> Gédéon Nzyanga</label>
                                            <label id="usernames">gedeon@</label> 
                                            <label id="comptes">Administrateur</label>  
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">Actions : </label>
                                        <div class="controls">
                                          <label>
                                            <input type="checkbox" name="denregistre" />
                                            Enregistrer</label>
                                          <label>
                                            <input type="checkbox" name="dmodifier" />
                                            Modifier</label>
                                          <label>
                                            <input type="checkbox" name="dsupprimer" />
                                            Supprimer</label>
                                         <label>
                                            <input type="checkbox" name="radios" />
                                            Imprimer</label>
                                        </div>
                                    </div>

                                    <div class="control-group">
                                        <input type="hidden" name="id" id="id" value="0" />
                                        <label class="control-label"> Accès à :</label>
                                        <div class="controls">
                                            <select name="produit" class="span11"> 
                                                <option value="Acceuil"> Acceuil </option>
                                                <option value="Achat"> Achat </option>
                                                <option value="Fournisseur"> Fournisseur </option>
                                                <option value="Service"> Service </option>
                                                <option value="Stock"> Stock </option>
                                                <option value="Sortie"> Sortie </option>
                                                <option value="Toutes les pages"> All pages </option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-actions">
                                        <button type="submit" class="btn btn-success btn-small" name="btnSave" value="save">Enregistrer</button>
                                        <button type="submit" name="btnSave" value="update" class="btn btn-info btn-small">Modifier</button>
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
                                <h5>Liste Utilisateurs</h5>
                                <span class="label  label-info"><i class="icon icon-refresh"> </i></span>
                            </div>
                            <div class="widget-content nopadding">
                                <table class="table table-bordered data-table" id="table_utilisateur">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th style="display:none">Id</th>
                                        <th>Nom</th>
                                        <th>Prénom</th>
                                        <th>Compte</th>
                                        <th>Nom d'utilisateur</th>
                                        <th style="display:none">Mot de passe</th>
                                        <th>Accès à</th>
                                        <th>Atorisations</th>
                                        <th>Options</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="utilisateur" items="${listeUtilisateur}">
                                        <tr class="gradeX">
                                            <td> <c:out value="${utilisateur.compt}" /> </td>
                                            <td style="display:none"> <c:out value="${utilisateur.id}" /> </td>
                                            <td> <c:out value="${utilisateur.nom}" /> </td>
                                            <td> <c:out value="${utilisateur.prenom}" /> </td>
                                            <td> <c:out value="${utilisateur.compte}" /> </td>
                                            <td class="center"> <c:out value="${utilisateur.nomUtilisateur}" /> </td>
                                            <td  style="display:none"> <c:out value="${utilisateur.motdePasse}" /> </td>
                                           
                                            <td> <c:out value="${utilisateur.page}" /> </td>
                                            
                                            <td> <c:out value="${utilisateur.dSave}, ${utilisateur.dUpdate}, ${utilisateur.dDelete}" /> </td>
                                            <td class="taskOptions">
                                                <a href="#" onclick="returnDataUtilisateur()" class="tip-top" data-original-title="Modifier"><i class="icon-edit"></i></a>
                                                <a href="<c:url value="/Utilisateurs?id=${utilisateur.id}" />" class="tip-top" data-original-title="Supprimer"><i class="icon-remove"></i></a>
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
        <script src="<c:url value="/assets/js/jquery.ui.custom.js" />"></script>
        <script src="<c:url value="/assets/js/bootstrap.min.js" />"></script>
        <script src="<c:url value="/assets/js/monScript.js" />"></script>
        <script src="<c:url value="/assets/js/jquery.uniform.js" />"></script>
        <script src="<c:url value="/assets/js/select2.min.js" />"></script>
        <script src="<c:url value="/assets/js/jquery.dataTables.min.js" />"></script>
        <script src="<c:url value="/assets/js/matrix.js" />"></script>
        <script src="<c:url value="/assets/js/matrix.tables.js" />"></script>
        <script>
            $('.textarea_editor').wysihtml5();
        </script>
    </body>
</html>