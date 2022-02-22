<%-- 
    Document   : officer
    Author     : ken
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html data-ng-app="displayListApp" data-ng-controller="displayListCtrl2">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers</title>
        <link href="resources/css/style2.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <header>
            <h1>DigiLend App</h1>
        </header>
        
        <nav>
            <a href="logout">Logout</a><br/>
        </nav>
        
        <h2>Welcome, {{ name }}!</h2>
        
        <p data-ng-show="notify">{{ msg }}</p>
        
        <section>
            <table>
                <tr><th>ID</th><th>Customer Name</th>
                    <th>Amount</th><th></th>
                </tr>
                <tr data-ng-repeat="user in users"> 
                    <td>{{ user.id }} </td>
                    <td>{{ user.name }} </td>
                    <td><input type="number" name="amt" step="0.01" min="0" data-ng-model="user.amt_owed"/></td>
                    <td><input type="button" value="create loan" data-ng-click="createLoan({{ $index }} )" /></td>
                </tr>
            </table>
        </section>
        
        <footer>
            Copyright © ken|2022
        </footer>
        
        <script src="resources/js/libs/angular.js/angular.js"></script>
        <script src="resources/js/displayListApp.js"></script>
        <script src="resources/js/displayListCtrl2.js"></script>
    </body>
</html>