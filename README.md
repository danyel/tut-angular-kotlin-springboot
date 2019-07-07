# tut-angular-kotlin-springboot

## What will be explained in the tutorial

A maven tutorial for a spring boot jar application written in kotlin for backend and angular for frontend.

2 maven modules:
- backend: kotlin sources
- frontend: angular source compiled to a jar (META-INF/resources)

Maven build cycle: frontend, backend

## How to run the application

There a 2 ways (Angular and backend separate) or just the fat jar

##### Angular and backend

Run in terminals

- npm run start
- mvn clean install && mvn -f backend/pom.xml spring-boot:run

Open browser and go to http://localhost:4200

##### Fat jar
Run in terminal 

- mvn clean install && mvn -f backend/pom.xml spring-boot:run

Open browser and go to http://localhost:8080