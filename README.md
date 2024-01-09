# Welcome to Movement App Repository
To Get Started
1. Make sure docker is installed (https://docs.docker.com/get-docker/)
2. Clone the repository
3. Run command `docker-compose up` from the root directory
4. Wait for around 3 to 4 minutes for all the containers to start
5. Navigate to `http://localhost:3000` to view the app

# Tech Stack
* Database: Postgres 14.10
* Backend: Spring Boot Java
* Frontend: Next JS (React + TS + Tailwind CSS)


# Description
The app allows you to view analytical data around movement of animals across multiple farms. There are 2 tabs on the page, the first one shows analytical data about animal movement
and the second one shows the whole movement table

# Tech Description
To store the database I used Postgres SQL. It is a very popular and scalable database system which is very simple to use and is open source. Moreover I took the liberty to break 
down the data into multiple tables to make the backend easily extensible and scalable. For the backend app, I used Spring Boot Java to connect with the database and process data
for the frontend. For the frontend I made use of NextJS powered by typescript. NextJS has a simpler file structure and requires less boiler plate code to create good frontend. NextJS
underneath is simple react. I used Tailwind CSS to easily manage CSS in my project. The 3 micoservices are encapsulated within a docker-compose enviornment, which can be started 
using a simple `docker-compose up` file

# Missed Features
Some features which I was not able to implement
1. Filtering of movement table on frontend
2. Graph or Map to show movement across farms

# Cleanup
To clean up resources
1. Press `CMD + C` on MAC or `Ctrl + C` on Windows or Linux on the terminal where docker-compose is running
2. Wait for containers to stop
3. Use command `docker system prune` to remove all stopped containers and dangling containers
