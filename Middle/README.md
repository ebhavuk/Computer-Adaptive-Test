# XebiaCAT
<b>The project is an API written in Java using Spring framework for the following architecture for Computer Adaptive Test for Xebia.</b>
<br>
![alt tag](https://github.com/6amogh7/XebiaCAT/blob/master/architecture.png)
<br><br>
<h1>Instructions to use:</h1></br>
Download and extract the zip in your workspace.<br>
Open eclipse or STS and import the project.<br>
![alt tag](https://github.com/6amogh7/XebiaCAT/blob/master/import.png)<br>
<b>Configuration:</b><br>
update the database parameters in the src/main/resources/database/database.properties<br>
jdbc.driver=your databace driver , by default="com.mysql.jdbc.Driver"<br>
jdbc.url= path to your database Example="jdbc:mysql://localhost:3306/cat"<br>
jdbc.username= username of your database, by defalut= "root"<br>
jdbc.password= password of your database, leave blank if no password is there<br>
<br>
![alt tag](https://github.com/6amogh7/XebiaCAT/blob/master/config.png)<br>
<b>To run the project:</b><br>
Right click on the project, select "Run As"<br>
Select "Run on Server"<br>
Select a server(Tomcat,Pivotal tc,JBOSS, etc.)<br>
and deploy the application on the server.<br>

By default the first page(index) of the API will run.<br>
To run a particular service, use it's REST path with the contract values specified.
<br><br>
<b>for Signup:</b> serverpath/xebia/signup/{name}/{username}/{email}/{organisation}/{password}<br>
<b>for Login Verification:</b> serverpath/xebia/getpassword/{username}<br>
<b>for entering a new question:</b> serverpath/xebia//insertques/{question}/{questionlevel}/{option1}/{option2}/{option3}/{option4}/{answer}/{category}<br>

