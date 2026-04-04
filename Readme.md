# LLD Practice 🏗️

A collection of **Low-Level Design (LLD)** implementations in Java — covering real-world system design problems and core design patterns. Built for interview preparation and to practice clean, extensible object-oriented design.

---

## 📂 Repository Structure

```
LLD-Practice/
├── ATM/
├── ParkingSpot/
├── MovieTicketBooking/
├── TicTacToe/
├── strategyDesignPattern/
├── factoryDesignPattern/
├── BuilderDesignPattern/
└── decoratorDesignPattern/
```

---

## 🔧 System Design Problems

### 🏧 ATM
A simulation of an ATM machine supporting:
- Card insertion, PIN validation, and authentication
- Balance enquiry, cash withdrawal, and deposit
- State-based design using the **State Pattern**
- Clean separation of account, card, and transaction entities

### 🚗 Parking Spot System
A multi-level parking lot system supporting:
- Multiple vehicle types (Car, Bike, Truck)
- Dynamic spot allocation and release
- Entry/exit ticket generation
- Designed using **Strategy Pattern** for pricing and **Factory Pattern** for spot creation

### 🎬 Movie Ticket Booking
A booking system modelled after platforms like BookMyShow:
- Theatre, screen, and show management
- Seat selection and reservation with concurrency in mind
- Booking and payment flow
- Demonstrates **single responsibility** and **open/closed** principles

### ❌⭕ TicTacToe
A two-player TicTacToe game with:
- Configurable board size
- Pluggable player types (Human / Bot)
- Win condition validation
- Clean game loop design

---

## 🧩 Design Patterns

### 🔄 Strategy Pattern
Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
> **Example:** Payment strategy — CreditCard, UPI, NetBanking can be swapped at runtime without changing the client.

### 🏭 Factory Pattern
Provides an interface for creating objects without specifying their concrete classes.
> **Example:** Vehicle factory — creates Car, Bike, or Truck based on input type.

### 🏗️ Builder Pattern
Separates the construction of a complex object from its representation.
> **Example:** Building a customizable `User` or `Order` object step by step without telescoping constructors.

### 🎨 Decorator Pattern
Attaches additional responsibilities to an object dynamically without subclassing.
> **Example:** Adding toppings to a base Pizza — each topping wraps the previous object and adds to its cost/description.

---

## 🛠️ Tech Stack

- **Language:** Java
- **Concepts:** SOLID Principles, OOP, Design Patterns, Clean Architecture
- **Tools:** IntelliJ IDEA / VS Code

---

## 🧠 Key Concepts Covered

| Concept | Where Used |
|---|---|
| SOLID Principles | All modules |
| State Pattern | ATM |
| Strategy Pattern | Parking, Strategy module |
| Factory Pattern | Parking, Factory module |
| Builder Pattern | Builder module |
| Decorator Pattern | Decorator module |
| Encapsulation & Abstraction | All modules |
| Composition over Inheritance | Movie Booking, TicTacToe |

---

## 🚀 How to Run

1. Clone the repository
```bash
git clone https://github.com/BusyinCoding/LLD-Practice.git
```

2. Open in IntelliJ IDEA or any Java IDE

3. Navigate to the module you want to run and execute the `Main.java` file

---

## 👩‍💻 About

Built and maintained by **Japleen Kaur** — Senior Software Engineer with 4 years of experience in backend development and distributed systems.

- 🔗 [LinkedIn](https://www.linkedin.com/in/japleen-kaur-a35588192/)
- 💻 [LeetCode](https://leetcode.com/u/JapleenKaur/)

---

> ⭐ If you find this helpful, feel free to star the repo!
