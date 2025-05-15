# EDA Proof of Concept – In-Memory Event Handling with Spring Boot
This project demonstrates a simple implementation of **Event-Driven Architecture (EDA)** using **Spring Boot’s in-memory event publishing system**. It focuses on illustrating core EDA principles—**loose coupling**, **separation of concerns**, and **extensibility**—without requiring any external infrastructure like message brokers.
---
## Use Case
The app simulates a basic scenario where:
- A `UserSessionManager` component emits events when a user logs in or logs out.
- A `LoggerService` listens for these events and records them independently.
  This setup reflects real-world use cases like authentication logging, auditing, or notification systems in a decoupled manner.
---
## Technologies Used
- Java 17+
- Spring Boot 3.x
- Spring ApplicationEventPublisher / @EventListener
- JUnit 5
- Lombok
- Maven
---
## How It Works
### Components:
- **UserSessionManager**
    - Publishes `UserLoggedInEvent` and `UserLoggedOutEvent` via `ApplicationEventPublisher`.
- **LoggerService**
    - Uses `@EventListener` to listen to login/logout events and logs them internally.
---
## Example Flow
1. `UserSessionManager.login("Jay")` triggers a `UserLoggedInEvent`.
2. `LoggerService` receives the event and logs it.
3. `UserSessionManager.logout("Jay")` triggers a `UserLoggedOutEvent`.
4. `LoggerService` logs the logout event independently.
---
## How to Run Locally
1. **Clone the repository:**
```bash
git clone https://github.com/your-org/eda-poc.git
cd eda-poc
./mvnw clean install
./mvnw spring-boot:run
./mvnw test

