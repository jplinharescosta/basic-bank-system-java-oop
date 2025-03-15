# Basic Bank System

The **Basic Bank System** is a simple banking application developed in **Java** using Object-Oriented Programming (OOP) principles. It allows users to create accounts, perform transactions, and manage their finances.

## Features

- **Account Management**: Create and manage bank accounts with unique account numbers and holder information.
- **Transactions**: Perform deposits, withdrawals, and transfers between accounts.
- **Balance Inquiry**: Check the current balance of any account.
- **Transaction History**: View a log of all transactions performed.

## Project Structure

The project is organized as follows:

- **.vscode/**: Contains Visual Studio Code configurations.
- **bin/**: Directory where compiled `.class` files are stored.
- **src/**: Contains the source code of the application.
  - **Main.java**: The main entry point of the application.
  - **Account.java**: Defines the `Account` class with attributes and methods related to a bank account.
  - **Transaction.java**: Defines the `Transaction` class to handle various types of transactions.
- **README.md**: This file, providing an overview of the project.

## Technologies Used

- **Java**: The primary programming language used for development.
- **Visual Studio Code**: The code editor utilized for writing and managing the codebase.

## How to Run the Project

1. **Clone the repository:**

   ```bash
   git clone https://github.com/jplinharescosta/basic-bank-system-java-oop.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd basic-bank-system-java-oop
   ```

3. **Compile the source code:**

   ```bash
   javac -d bin src/*.java
   ```

4. **Run the application:**

   ```bash
   java -cp bin Main
   ```

## Contributions

Contributions are welcome! Feel free to open issues or pull requests for improvements, bug fixes, or new features.

## License

This project is licensed under the [MIT License](LICENSE).

