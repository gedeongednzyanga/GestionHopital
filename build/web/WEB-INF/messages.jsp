<%-- 
    Document   : messages
    Created on : 27 août 2020, 07:07:05
    Author     : GEDEON
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion Hopital | Chat</title>
        <link rel="stylesheet" href="<c:url value="/assets/css/bootstrap.min.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/bootstrap-responsive.min.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/fullcalendar.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/matrix-style.css" />" />
        <link rel="stylesheet" href="<c:url value="/assets/css/matrix-media.css" />" />
        <link href="<c:url value="/assets/font-awesome/css/font-awesome.css" />" rel="stylesheet" />
        <link rel="stylesheet" href="<c:url value="/assets/css/jquery.gritter.css" />" />
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
    <!--close-top-Header-menu-->
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
    <!--sidebar-menu-->

    <!--main-container-part-->
    <div id="content">
        <!--breadcrumbs-->
        <div id="content-header">
            <div id="breadcrumb"> <a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i>
                    Home</a></div>
        </div>
        <!--End-breadcrumbs-->

        <!--Action boxes-->
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="widget-box">
                    <div class="widget-title bg_lg"><span class="icon"><i class="icon-signal"></i></span>
                        <h5>Site Analytics</h5>
                    </div>
                    <div class="widget-content">
                        <div class="row-fluid">
                            <div class="span9">
                                <div class="chart"></div>
                            </div>
                            <div class="span3">
                                <ul class="site-stats">
                                    <li class="bg_lh"><i class="icon-user"></i> <strong>2540</strong> <small>Total
                                            Users</small></li>
                                    <li class="bg_lh"><i class="icon-plus"></i> <strong>120</strong> <small>New Users
                                        </small></li>
                                    <li class="bg_lh"><i class="icon-shopping-cart"></i> <strong>656</strong>
                                        <small>Total Shop</small></li>
                                    <li class="bg_lh"><i class="icon-tag"></i> <strong>9540</strong> <small>Total
                                            Orders</small></li>
                                    <li class="bg_lh"><i class="icon-repeat"></i> <strong>10</strong> <small>Pending
                                            Orders</small></li>
                                    <li class="bg_lh"><i class="icon-globe"></i> <strong>8540</strong> <small>Online
                                            Orders</small></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--End-Chart-box-->
            <hr />
            <div class="row-fluid">
                <div class="span12">
                    <div class="widget-box widget-chat">
                        <div class="widget-title bg_lb"> <span class="icon"> <i class="icon-comment"></i> </span>
                            <h5>Chat Option</h5>
                        </div>
                        <div class="widget-content nopadding collapse in" id="collapseG4">
                            <div class="chat-users panel-right2">
                                <div class="panel-title">
                                    <h5>Users en ligne</h5>
                                </div>
                                <div class="panel-content nopadding">
                                    <ul class="contact-list">
                                        <li id="user-Alex" class="online">
                                            <a href=""><img alt="" src="<c:url value="/assets/img/demo/av1.jpg" />" /> <span>Alex</span></a>
                                        </li>
                                        <li id="user-Linda">
                                            <a href=""><img alt="" src="img/demo/av2.jpg" />
                                                <span>Linda</span></a>
                                        </li>
                                        <li id="user-John" class="online new">
                                            <a href=""><img alt="" src="img/demo/av3.jpg" /> <span>John</span></a><span class="msg-count badge badge-info">3</span></li>
                                        <li id="user-Mark" class="online">
                                            <a href=""><img alt="" src="img/demo/av4.jpg" /> <span>Mark</span></a>
                                        </li>
                                        <li id="user-Maxi" class="online">
                                            <a href=""><img alt="" src="img/demo/av5.jpg" /> <span>Maxi</span></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="chat-content panel-left2">
                                <div class="chat-messages" id="chat-messages">
                                    <div id="chat-messages-inner"></div>
                                </div>
                                <div class="chat-message well">
                                    <button class="btn btn-success">Send</button>
                                    <span class="input-box">
                                        <input type="text" name="msg-box" id="msg-box" />
                                    </span> </div>
                            </div>
                        </div>
                    </div>
                    
                </div>
            </div>
        </div>
    </div>

    <!--end-main-container-part-->

    <!--Footer-part-->

    <div class="row-fluid">
        <div id="footer" class="span12"> 2013 &copy; Matrix Admin. Brought to you by <a href="http://themedesigner.in">Themedesigner.in</a> </div>
    </div>

    <!--end-Footer-part-->

    <script src="<c:url value="/assets/js/excanvas.min.js" />"></script>
    <script src="<c:url value="assets/js/jquery.min.js"/>"></script>
    <script src="<c:url value="assets/js/jquery.ui.custom.js" />"></script>
    <script src="<c:url value="/assets/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.flot.min.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.flot.resize.min.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.peity.min.js" />"></script>
    <script src="<c:url value="/assets/js/fullcalendar.min.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.dashboard.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.gritter.min.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.interface.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.chat.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.validate.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.form_validation.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.wizard.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.uniform.js" />"></script>
    <script src="<c:url value="/assets/js/select2.min.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.popover.js" />"></script>
    <script src="<c:url value="/assets/js/jquery.dataTables.min.js" />"></script>
    <script src="<c:url value="/assets/js/matrix.tables.js" />"></script>
    
    <script type="text/javascript">
        // This function is called from the pop-up menus to transfer to
        // a different page. Ignore if the value returned is a null string:
        function goPage(newURL) {

            // if url is empty, skip the menu dividers and reset the menu selection to default
            if (newURL != "") {

                // if url is "-", it is this page -- reset the menu:
                if (newURL == "-") {
                    resetMenu();
                }
                // else, send page to designated URL            
                else {
                    document.location.href = newURL;
                }
            }
        }

        // resets the menu selection upon entry to this page:
        function resetMenu() {
            document.gomenu.selector.selectedIndex = 2;
        }
    </script>
</body>
</html>
