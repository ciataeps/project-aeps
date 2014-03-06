<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <link rel="icon" type="image/ico" href="favicon.ico">
        <title>AEPS</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width"> 							
        <link rel="stylesheet" href="scripts/css/bootstrap/bootstrap-responsive.min.css">
        <link rel="stylesheet" href="scripts/css/generals/justified-nav.css">
        <!-- <link rel="stylesheet" href="scripts/css/bootstrap-theme.min.css"> -->
        <link rel="stylesheet" href="scripts/css/generals/style.css">
        <link rel="stylesheet" href="scripts/css/generals/responsive.css">
        <link rel="stylesheet" href="scripts/css/generals/responsiveslides.css" />	
        <link rel="stylesheet" href="scripts/js/jquery/jquery-ui/themes/base/jquery.ui.all.css" />
        <link rel="stylesheet" href="scripts/js/jquery/jquery-ui/themes/base/jquery-ui.css" />
        <link rel="stylesheet" href="scripts/css/generals/beoro.css">        
        <script type="text/javascript" src="scripts/js/generals/functions.js"></script>		
        <sj:head jqueryui="false"/>
        <sb:head includeScripts="true" includeScriptsValidation="true"/>
        <link rel="stylesheet" href="scripts/css/generals/main.css">
        <script type="text/javascript" src="scripts/js/jquery/jquery.maskedinput.js"></script>
        <script type="text/javascript" src="scripts/js/jquery/jquery.numeric.js"></script>
        <script type="text/javascript" src="scripts/js/jquery/jquery.blockUI.js"></script>
        <script type="text/javascript" src="scripts/js/jquery/jquery-ui/ui/jquery-ui.js"></script>	
        <script type="text/javascript" src="scripts/js/jquery/jquery-ui/ui/jquery.ui.dialog.js"></script>
        <script type="text/javascript" src="scripts/js/colorbox/jquery.colorbox.min.js"></script>
        <link rel="stylesheet" href="scripts/css/colorbox/colorbox.css"/>
        <style>
            body {
                padding-top: 50px;
                padding-bottom: 20px;
            }
        </style>				
        <script src="scripts/js/generals/responsiveslides.js"></script>
    </head>
    <body>
        <div id="divMessage"></div>
        <div id="dialog-form"></div>
        <div class="header">
            <%@ include file="header-private.jsp" %>
        </div>
        <div class="body" id="divBodyLayout">
            <%@ include file="dashboard.jsp" %>
        </div>
        <div class="footer">
            <%@ include file="footer.jsp" %>
        </div>
        <script>
            var actionName   = '<%= session.getAttribute("action") %>';
            activeOption('ulOptionsMenu', actionName+'Cls');
            if (actionName!='' && actionName!='dashboard') {
                showInfoPage(''+actionName+'.action', 'divBodyLayout');                       
            }
        </script>
    </body>
</html>
