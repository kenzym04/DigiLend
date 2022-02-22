<%-- 
    Document   : registered
    Author     : ken
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registered!</title>
        <link href="resources/css/style2.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <header>
            DigiLend App
        </header>
        
        <nav>
            <a href="index">Home</a><br/>
        </nav>
        
        <section style="float:none;">
            <div class="notice center">
                ${pcode}            
            </div>
            <p><Strong>Above is your pass code. Kindly save it or memorize and then click 'Home' 
                    to log in.<Strong>
            </p>
        </section>
        
        <footer>
            Copyright © ken|2022
        </footer>
    </body>
</html>
