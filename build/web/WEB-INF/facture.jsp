<%-- 
    Document   : facture
    Created on : 1 août 2020, 09:38:38
    Author     : GEDEON
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Gestion Hopital | Facture</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="<c:url value="/assets/css/bootstrap.min.css" />" />
    <link rel="stylesheet" href="<c:url value="/assets/css/bootstrap-responsive.min.css" />" />
    <link rel="stylesheet" href="<c:url value="/assets/css/matrix-style.css" />" />
    <link rel="stylesheet" href="<c:url value="/assets/css/matrix-media.css" />" />
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
        <input type="text" placeholder="Search here..." />
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
            <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#">Sorties</a> <a href="#" class="current">Facture</a> </div>
            <h1>Facture</h1>
        </div>
        <div class="container-fluid">
            <hr>
            <div class="row-fluid">
                <div class="span12">
                    <div class="widget-box">
                        <div class="widget-title"> <span class="icon"> <i class="icon-briefcase"></i> </span>
                            <h5>Centre de Santé Mondo Gusto</h5>
                        </div>
                        <div class="widget-content">
                            <div class="row-fluid">
                                <div class="span6">
                                    <table class="">
                                        <tbody>
                                            <tr>
                                                <td>
                                                    <h4>C.S Mondo Gusto</h4>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>Ville de Goma</td>
                                            </tr>
                                            <tr>
                                                <td>Com. de Karisimbi/Q. Virunga/Av. Mutakato</td>
                                            </tr>
                                            <tr>
                                                <td>Téléphone : +243 997 235 842</td>
                                            </tr>
                                            <tr>
                                                <td>E-mail : csmondogusto@gmail.com</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="span6">
                                    <table class="table table-bordered table-invoice">
                                        <tbody>
                                            <tr>
                                                <tr>
                                                    <td class="width30">Facture ID :</td>
                                                    <td class="width70"><strong>TD-6546</strong></td>
                                                </tr>
                                                <tr>
                                                    <td>Date sortie :</td>
                                                    <td><strong>March 23, 2013</strong></td>
                                                </tr>
                                                <tr>
                                                    <td>Date facturation :</td>
                                                    <td><strong>April 01, 2013</strong></td>
                                                </tr>
                                                <td class="width30">Service concerné :</td>
                                                <td class="width70"><strong>Cliente Company name.</strong> <br> 501 Mafia Street., washington,
                                                    <br> NYNC 3654 <br> Contact No: 123 456-7890 <br> Email: youremail@companyname.com </td>
                                            </tr>
                                        </tbody>

                                    </table>
                                </div>
                            </div>
                            <div class="row-fluid">
                                <div class="span12">
                                    <table class="table table-bordered table-invoice-full">
                                        <thead>
                                            <tr>
                                                <th class="head0">#</th>
                                                <th class="head1">Désignation</th>
                                                <th class="head0 right">Quantité</th>
                                                <th class="head1 right">Prix U.</th>
                                                <th class="head0 right">Montant</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>Firefox</td>
                                                <td>Ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae
                                                </td>
                                                <td class="right">2</td>
                                                <td class="right">$150</td>
                                                <td class="right"><strong>$300</strong></td>
                                            </tr>
                                            <tr>
                                                <td>Chrome Plugin</td>
                                                <td>Tro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt u eos et accusamus et iusto odio dignissimos ducimus deleniti atque</td>
                                                <td class="right">1</td>
                                                <td class="right">$1,200</td>
                                                <td class="right"><strong>$1,2000</strong></td>
                                            </tr>
                                            <tr>
                                                <td>Safari App</td>
                                                <td>Rro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt u expedita distinctio</td>
                                                <td class="right">2</td>
                                                <td class="right">$850</td>
                                                <td class="right"><strong>$1,700</strong></td>
                                            </tr>
                                            <tr>
                                                <td>Opera App</td>
                                                <td>Orro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut</td>
                                                <td class="right">3</td>
                                                <td class="right">$850</td>
                                                <td class="right"><strong>$2,550</strong></td>
                                            </tr>
                                            <tr>
                                                <td>Netscape Template</td>
                                                <td>Vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque</td>
                                                <td class="right">5</td>
                                                <td class="right">$50</td>
                                                <td class="right"><strong>$250</strong></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <table class="table table-bordered table-invoice-full">
                                        <tbody>
                                            <tr>
                                                <td class="msg-invoice" width="85%">
                                                    <h4>Payment method: </h4>
                                                    <a href="#" class="tip-bottom" title="Wire Transfer">Wire transfer</a> | <a href="#" class="tip-bottom" title="Bank account">Bank account #</a> | <a href="#" class="tip-bottom" title="SWIFT code">SWIFT code </a>|
                                                    <a href="#" class="tip-bottom" title="IBAN Billing address">IBAN Billing address </a>
                                                </td>
                                                <td class="right"><strong>Subtotal</strong> <br>
                                                    <strong>Tax (5%)</strong> <br>
                                                    <strong>Discount</strong></td>
                                                <td class="right"><strong>$7,000 <br>
                            $600 <br>
                            $50</strong></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <div class="pull-right">
                                        <h4><span>Amount Due:</span> $7,650.00</h4>
                                        <br>
                                        <a class="btn btn-primary btn-large pull-right" href="">Pay Invoice</a>
                                    </div>
                                </div>
                            </div>
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
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery.ui.custom.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/matrix.js"></script>
</body>
</html>
