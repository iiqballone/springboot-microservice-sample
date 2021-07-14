# springboot-microservice-sample
This project has few microservices with seperate databases, It uses docker compose to bootstrap all the services

To run these services try these steps
1- Go to springboot-microservice-sample folder and open commandline
2- execute this command bash buildDockerImage.sh
3- execute this coomand now, docker-compose up
4- this will run all the services , you can check the Eureka server at http://localhost:8761/
5- You can open the local MYSQL cleint and connect the database, user name is root and password is also root.
6- You can add some data
7- Open the postman and do the api call to product-service.
