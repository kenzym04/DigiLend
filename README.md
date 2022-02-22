# Simple  Application

## About the Project
--------------------
DigiLend is a basic loan management microservice created using Java EE, the Spring Framework, AngularJS,and Hibernate.

## It Supports:
---------------
1. Java and J2EE - http://www.oracle.com/technetwork/java/javaee/overview/index.html
2. Run on Jetty - https://en.wikipedia.org/wiki/Jetty_%28web_server%29
3. Mysql
4. Hibernate for data management - http://hibernate.org/orm/
5. Spring Framework - http://projects.spring.io/spring-framework/
6. AngularJS

## The application has a simple AngularJS web app that reads and writes data to an API. It serves the following objectives:

1. Manage loans records
2. Manage customer records

## It supports the following functions:

1. Once the user has cleared servicing the loan, the loan is closed immediately

2. User should be ab;e to service loan i.e. make loan repayment

3. Customer

- Allow customer to register with name and automatically get a code
- Allow customer to login with code
- Allow a logged in customer to see all loans with an active status
- Allow a logged in customer to select a loan and service the loan
- Allow a logged in customer to select a loan and update the repayment
- Allow a logged in customer to select a loan and delete a repayment

4. Loan Officer

- Allow loan officer to login with a pass_code
- Allow a logged in loan officer to view all customers
- Allow a logged in loan officer to select a customer and create a new loan, the loan ID is an automatic generated number

5. Data structure used;
	** loan_officer - {officer_name, officer_id_no}**
	** customer - {cust_name, cust_id_no}**
	** loan - {loan_no,loan_status_id,officer_id_no,cust_id_no, loan_amt}**
	** repayments - {loan_no, amt_repaid,date_repaid}**

6. Assume data for loan officer doesn't change - {"officer_name":"John Doe","officer_id_no":"1234"}

7. Assume loan status of [{"loan_status_id":"1","loan_status_name":"Active"},{"loan_status_id":"2","loan_status_name""Closed"}]  


*There is only one loan officer in the database, and has a passcode: 01010101*

Also, there are two customers in the sample database, and the pass_code for one of them is: 12345678

The details of the above users or the second customer are available in the sql file in the
database-sample folder.


## How to build and run
-----------------------
1. Create database with sample data by running database-sample/loan_db.sql

2. To connect to your MySQL database go to src/main/resources/hibernate.cfg.xml and replace
the hibernate.connection.password property with your root password.

3. The necessary libraries (if not available) should be downloaded via maven. Follow your IDE of choice process of adding/installiong libraries.

4. Build with dependencies.

5. Run with the server of your choice e.g. Glasfish, Tomcat etc. 

## Completed specifications for the project
-------------------------------------------

1.	A lending microservice has been designed

2.	A backend RESTful APIs for lending service has been developed with below items 

	a) Provides an interface for customers to login and apply for a loan through a web application interface
	b) Provides admin (loan officer) can login, view applied loans and approve

3.	An interface for lending service with at least items 1 a) & b) above implemented

4.	Output
	- The solution design for the lending microservice
	- A working prototype of the lending microservice with the user interface and APIs
	- Codebase on a versioning tool i.e. Github

5. Minimum test coverage

	- Manual testing completed 100%
	- API testing completed via postman 100%

## Uncompleted specifications
-----------------------------

	- Though automation testing framework with TestNG has been setup successfully, due to the deadline i.e. time constraint, I haven't written the automation scripts. If am allowed, I can complete.

