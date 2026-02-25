# Banking System

A simple Java-based banking system demonstrating core object-oriented programming concepts including encapsulation, composition, and basic banking operations.

## 🏦 Overview

This project implements a basic banking system with two main classes: `Customer` and `BankAccount`. It showcases fundamental banking operations such as creating accounts, depositing funds, withdrawing money, and linking customers to their bank accounts.

## 📋 Features

- **Customer Management**: Create and manage customer profiles with personal details
- **Account Operations**: 
  - Deposit funds
  - Withdraw funds (with balance verification)
  - Check account balance
- **Customer-Account Association**: Link customers to their bank accounts
- **Account Comparison**: Compare accounts by account number
- **Detailed Information Display**: Print formatted customer and account details

## 🏗️ Class Structure

### BankAccount Class
- **Attributes**: accountNumber, balance, dateOpened
- **Methods**: 
  - `deposit(amount)`: Add funds to account
  - `withdraw(amount)`: Remove funds (returns success/failure)
  - `getBalance()`: Check current balance
  - `equals()`: Compare accounts by account number
  - `toString()`: Display account details

### Customer Class
- **Attributes**: customerID, name, email, telephone, account
- **Methods**:
  - `setAccount()`: Assign bank account to customer
  - `hasAccount()`: Check if customer has an account
  - `getTotalBalance()`: Get customer's account balance
  - `toString()`: Display customer details

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ, VS Code) or command line

### Installation

1. Clone the repository
```bash
git clone https://github.com/yourusername/banking-system.git
Navigate to the project directory

bash
cd banking-system
Compile the Java files

bash
javac *.java
Run the driver program

bash
java BankDriver
