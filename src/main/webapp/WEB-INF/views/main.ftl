<#assign c=JspTaglibs["http://java.sun.com/jsp/jstl/core"]>
<!DOCTYPE html>
<html class="html">
<head>
    <meta charset="UTF-8">
    <link href="<@c.url value="/resources/css/main.css" />" rel="stylesheet" media="screen"/>
    <script type="text/javascript" src="<@c.url value="/resources/js/lib/jquery-2.1.4.min.js"/>"></script>
    <script type="text/javascript" src="<@c.url value="/resources/js/main.js"/>"></script>
    <script type="text/javascript">
        var $applicationRoot = '/';
        var $host = document.location.protocol + '//' + document.location.host;
        var $hostRoot = document.location.protocol + '//' + document.location.host + $applicationRoot;
    </script>
</head>
<body class="container">
<div id="central">
    <div id="centralContainer">
        <div class="text">CALCULATOR 1.0</div>
        <div>
            <div class="formzone">
                <input class="formNumber" id="firstdigit" type="number" maxlength="8"
                       required placeholder="FIRST">

                <div class="operationSelection" id="operatorSubmit">+</div>
                <input class="formNumber" id="secondigit" type="number" maxlength="8"
                       required placeholder="SECOND">
                <input type="submit" class="buttonForm" value="=" id="operatorSubmit" onclick="clickForm()">

                <div class="result"></div>
            </div>
            <div>
                <div class="operationButton">+</div>
                <div class="operationButton">-</div>
                <div class="operationButton">*</div>
                <div class="operationButton">/</div>
            </div>
        </div>
    </div>
</div>
</body>
</html>