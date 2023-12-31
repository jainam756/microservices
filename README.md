# Microservices Project Overview

This repository contains a collection of microservices designed to illustrate a distributed architecture utilizing various technologies within the Spring Cloud ecosystem.

## Services Included

1. **Order Service**
2. **Inventory Service**
3. **Product Service**
4. **Notification Service**

## Key Features

### Service Communication
- **Synchronous Communication:** Order service interacts synchronously with Inventory service.
- **Asynchronous Communication:** Leveraging Kafka, Order service communicates asynchronously with Notification service for event-based communication.

### Service Discovery
- Utilizes Spring Cloud Netflix Eureka for service discovery, enabling dynamic service registration and lookup.

### Distributed Tracing
- Implemented distributed tracing using Zipkin Docker image, offering visibility into the entire microservices system.

### Security
- Keycloak integration is employed for securing the microservices, ensuring secure authentication and authorization.

### API Gateway
- Implementation of an API Gateway using Spring Cloud, providing a unified entry point for various microservices.

### Circuit Breaker
- Circuit breaker pattern applied between Order Service and Inventory Service, enhancing system resilience.

## Setup and Usage

### Dependencies
- **Spring Cloud Netflix Eureka**
- **Apache Kafka**
- **Zipkin Docker Image**
- **Keycloak**

### Local Deployment
1.Run mvn clean verify -DskipTests by going inside each folder to build the applications.
2.After that run mvn spring-boot:run by going inside each folder to start the applications.

