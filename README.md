# Lab01
This is all about creating a simple MVC project with basic functionalities using Spring Boot. The following user actions are possible via this Spring application
•	Retrieve a user specified by an attribute or get all users
•	Create a new user to a database
•	Update an existing user of a database
•	Delete an existing user from the database.
To achieve above functionalities, here we use a model User.java, and views are home.jsp and showUser.jsp. Also we have a controller named UserController.java to view these views.
Here, Postman is used as a handy testing tool to test RESTful calls.

Key-points to focus are as comments withing the code.

Sample outputs of RESTful calls:
# To get all Users (GET)
(https://github.com/FathimaShafana/Lab01/blob/main/Screenshots/getAllUsers.PNG?raw=true)

# To get all users as JSON/XML (GET)
(https://github.com/FathimaShafana/Lab01/blob/main/Screenshots/getAllJSON.PNG?raw=true)

# To get a single user by ID (GET)
(https://github.com/FathimaShafana/Lab01/blob/main/Screenshots/GetUserbyID.PNG?raw=true)

# To get a single user by JSON/XML (GET)
(https://github.com/FathimaShafana/Lab01/blob/main/Screenshots/getUserByIDJSON.PNG?raw=true)

# To create a new User (POST)
(https://github.com/FathimaShafana/Lab01/blob/main/Screenshots/PostInfo.PNG?raw=true)

# To create/update one user (PUT)
(https://github.com/FathimaShafana/Lab01/blob/main/Screenshots/putUser.PNG?raw=true)

# To delete one user (DELETE)
(https://github.com/FathimaShafana/Lab01/blob/main/Screenshots/DeleteUser.PNG?raw=true)
