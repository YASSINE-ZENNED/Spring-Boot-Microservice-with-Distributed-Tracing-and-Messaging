# Spring-Boot Microservice with Distributed Tracing and Messaging
This project demonstrates a Spring Boot microservice architecture utilizing various technologies for distributed tracing, messaging, databases, and deployment environments.


# Microservices
![logo](https://github.com/YASSINE-ZENNED/Spring-Boot-Microservice-with-Distributed-Tracing-and-Messaging/assets/52501790/4e33b664-e65f-44f3-9ae6-f0be3bde1552)

# kubernetes

![Capture d'écran 2024-02-22 210453](https://github.com/YASSINE-ZENNED/Micro-SpringBoot/assets/52501790/a1106ca2-b362-4fef-b4cc-fe8f8b56680a)


# Technologies Used
Spring Boot: Framework for building microservices.

Zipkin: Distributed tracing system for monitoring service interactions.

Sleuth: Spring Cloud project for integrating Zipkin with Spring Boot applications.

RabbitMQ: Message broker for asynchronous communication between services.

PostgreSQL (PgAdmin): Relational database management system.

Spring Profiles: Feature for managing environment-specific configurations.

Docker: Containerization platform for packaging and deploying applications.

Kubernetes: Container orchestration platform for managing deployments across clusters.

# Functionality (Example)


A user submits a request through an API Gateway.
The API Gateway routes the request to a service responsible for processing the request logic.
The processing service interacts with a database to retrieve or update data.
During processing, messages might be sent to other services using RabbitMQ for asynchronous communication.
Zipkin tracks the entire request flow across services for debugging and performance analysis.
# Deployment Environments
This project can be deployed to three environments:

Local Development: Run the microservice directly on your development machine.

Docker: Package the application as a Docker image for containerized deployment.

Kubernetes: Deploy the Docker image to a Kubernetes cluster for scalable orchestration.

