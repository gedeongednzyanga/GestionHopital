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

    <div id="sidebar"> <a href="#" class="visible-phone"><i class="icon icon-th"></i>Tables</a>
        <ul>
            <li><a href="index.html"><i class="icon icon-home"></i> <span>Dashboard</span></a> </li>
            <li><a href="charts.html"><i class="icon icon-signal"></i> <span>Charts &amp; graphs</span></a> </li>
            <li><a href="widgets.html"><i class="icon icon-inbox"></i> <span>Widgets</span></a> </li>
            <li class="active"><a href="tables.html"><i class="icon icon-th"></i> <span>Tables</span></a></li>
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
                <a href="#" class="current">Fournisseurs</a> </div>
            <h1>Fournisseurs</h1>
        </div>
        <div class="container-fluid">
            <hr>
            <div class="row-fluid">
                <div class="span5">
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
                                        <input type="text" name="nom" value="<c:out value="${fournisseur.nom}" />" class="span11" placeholder="First name" />
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['nom']}" /> </span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Prénom :</label>
                                    <div class="controls">
                                        <input type="text" name="prenom" value="<c:out value="${fournisseur.prenom}" />" class="span11" placeholder="Last name" />
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['prenom']}" /> </span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Téléphone :</label>
                                    <div class="controls">
                                        <input type="text" name="telephone" value="<c:out value="${fournisseur.telephone}" />" class="span11" placeholder="Enter Phone  Number" />
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['telephone']}" /> </span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">E-mail :</label>
                                    <div class="controls">
                                        <input type="text" name="mail" value="<c:out value="${fournisseur.mail}" />" class="span11" placeholder="Enter E-mail" />
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['mail']}" /> </span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Site web :</label>
                                    <div class="controls">
                                        <input type="text" name="web" value="<c:out value="${fournisseur.siteWeb}"/>" class="span11" placeholder="Site web" />
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['web']}" /> </span>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Maison/Pharmacie :</label>
                                    <div class="controls">
                                        <input type="text"  name="maison" class="span11" />
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">Adresse :</label>
                                    <div class="controls">
                                        <textarea name="adresse" class="span11"> <c:out value="${fournisseur.adresse}" /> </textarea>
                                        <span style="color:red"> <c:out value="${fournisseurForm.erreurs['adresse']}" /> </span>
                                    </div>
                                </div>
                                <div class="form-actions">
                                    <button type="submit" class="btn btn-success"><i class="icon-ok"></i>
                                        Enregistrer</button>
                                    <button type="submit" class="btn btn-info"><i class="icon-edit"></i>
                                        Modifier</button>
                                </div>
                            </form>
                        </div>
                    </div>

                </div>
                <div class="span7">
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
