# Home Security System

## Overview
This project implements a **Home Security System** using object-oriented principles and a layered architectural approach. The system is designed to manage security devices such as cameras, door locks, alarms, and motion sensors. It facilitates interaction between a user and the security devices through a hub and controller, ensuring modularity and scalability.

---

## Architecture
The system follows the **Layered Architecture** pattern and incorporates elements of **Component-Based Architecture**.

### Layered Architecture
The code is divided into the following layers:

1. **Presentation Layer**: 
   - Includes the `User` class, which acts as the system's entry point for external commands.

2. **Application Layer**: 
   - The `SecurityController` processes commands, connects devices, and triggers alarms.

3. **Domain Layer**: 
   - Contains core business logic for devices (`SecurityDevice`, `Camera`, `DoorLock`, etc.).

4. **Infrastructure Layer** (optional for future extensions): 
   - Could include database connections or APIs for device state storage.

### Component-Based Architecture
Each class (e.g., `Camera`, `DoorLock`, `MotionSensor`, `Alarm`) represents a self-contained, reusable component. These components are easy to extend and integrate, ensuring a high degree of modularity.

---

## Principles of Software Engineering
The system adheres to several **SOLID principles** for maintainability and scalability:

1. **Single Responsibility Principle (SRP)**:
   - Each class has a specific responsibility (e.g., `User` for interactions, `SecurityController` for processing commands).

2. **Open-Closed Principle (OCP)**:
   - The system is open to extension but closed to modification. New devices can be added by extending the `SecurityDevice` class.

3. **Liskov Substitution Principle (LSP)**:
   - Subclasses like `Camera` and `DoorLock` can be used interchangeably with their parent class, `SecurityDevice`.

4. **Dependency Inversion Principle (DIP)**:
   - High-level modules depend on abstractions, not implementations, allowing flexibility and easy testing.

5. **Interface Segregation Principle (ISP)**:
   - Classes implement only the methods they require, avoiding unnecessary functionality.

6. **Encapsulation**:
   - Private fields with public getters and setters protect the internal state of objects.

---

## Folder Structure

The project is organized as follows:


### Explanation of Folders
1. **presentation**: Contains classes handling user interactions (e.g., `User`).
2. **application**: Includes `SecurityController` for processing commands and managing devices.
3. **domain**: Houses the core logic for devices such as `SecurityDevice`, `Camera`, and `DoorLock`.
4. **infrastructure**: Reserved for future additions like database or API integration.
5. **hub**: Contains the `Hub` class for relaying commands to security devices.

---

## How to Run
1. Clone the repository:
   ```bash
   git clone <[repository-url](https://github.com/Muzamil995/sdalabfinal/)>
   cd HomeSecuritySystem
javac src/main/**/*.java

java src/main/presentation/User
